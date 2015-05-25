import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.util.PDFTextStripper;

import java.io.*;
import java.util.List;

/**
 * Created by ljcp on 5/25/15.
 */
public class TestReadLinePdf {

    public static void  main(String [] args) {

        try {

            File pdfFile = new File("/Users/ljcp/Desktop/test.pdf");
            PDDocument pdDocument = PDDocument.load(pdfFile);


            List allPages = pdDocument.getDocumentCatalog().getAllPages();
            for (int i = 0; i < allPages.size(); i++) {
                int pageNum = i + 1;
                PDPage page = (PDPage) allPages.get(i);



            }

            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage(1);
            stripper.setEndPage(1);
            String text = stripper.getText(pdDocument).replaceAll("visiblespace", " ");

            String[] lines = text.split("\n");
            System.out.print(lines.length);

        } catch(Exception e){
            System.out.print(e);
        }
    }
}
