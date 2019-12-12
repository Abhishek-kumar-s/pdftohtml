package com.abhishek.pdftohtml;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.fit.pdfdom.PDFDomTree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.xml.parsers.ParserConfigurationException;

@SpringBootApplication
public class PdftohtmlApplication {

    public static void main(String[] args) throws IOException, ParserConfigurationException {
        SpringApplication.run(PdftohtmlApplication.class, args);
        PDDocument pdf = PDDocument.load(new File("C:\\User\\"));
        Writer output = new PrintWriter("src/output/pdf.html", "utf-8");
        new PDFDomTree().writeText(pdf, output);

        output.close();
    }

}
