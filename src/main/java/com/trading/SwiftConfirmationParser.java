
package com.trading;

import com.prowidesoftware.swift.model.field.*;
import com.prowidesoftware.swift.model.mt.mt5xx.MT518;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class SwiftConfirmationParser implements ConfirmationParser {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final String UNIT_NUMBER = "UNIT";

    @Override
    public Optional<Confirmation> parse(Confirmation confirmation) {
        MT518 mt518 = new MT518();
        mt518.setSender("FOOSEDR0AXXX");
        mt518.setReceiver("FOORECV0XXXX");

        mt518.append(sequenceA());
        mt518.append(sequenceB(confirmation));

        byte[] data = mt518.message().getBytes(StandardCharsets.UTF_8);

        confirmation.setContent(data);
        confirmation.setConfirmationType(Confirmation.SWIFT);

        return Optional.of(confirmation);
    }

    private static MT518.SequenceB sequenceB(Confirmation confirmation) {

        return MT518.SequenceB.newInstance(
                tradeDate(confirmation).asTag(),
                price(confirmation).asTag(),
                Field22A.tag(buySellTag(confirmation)),
                currency(confirmation).asTag(),
                quantity(confirmation).asTag(),