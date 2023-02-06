package com.trading;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import org.junit.Test;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class PdfConfirmationGenerationIntegrationTest {

    @Test
    public void pdf_confirmation_should_be_easily_generated_from_jrxml_template() throws Exception {
        InputStream resourceAsStream = PdfConfirmationGenerationIntegrationTest.class.getClassLoader().getResourceAsStream("Confirmation.jrxml");

        assert resourceAsStream != null;
        JasperReport jasperReport = JasperCompileManager.compileReport(resourceAsStream);

        byte[] data = JasperRunManager.runReportToPdf(jasperReport, parameters(), new JREmptyDataSource());

        assertThat(