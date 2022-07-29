package com.trading;

import net.sf.jasperreports.engine.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

class EmailConfirmationParser implements ConfirmationParser {

    private static final Logger LOG = LoggerFactory.getLogger(EmailConfirmationParser.class);

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter
            .ofPattern("MMM d yyyy", Locale.US);

    private final JasperReport jasperReport;

    public EmailConfirmationParser() throws JRException {
        InputStream resourceAsStream = EmailConfirmationParser.class
                .getClassLoader().getResourceAsStream("Conf