
package pack.util;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class clspdf {
    
    private Font fuenteBold =new Font(Font.FontFamily.COURIER,10,Font.BOLD);
    private Font fuenteNormal =new Font(Font.FontFamily.COURIER,8,Font.NORMAL);
    private Font fuenteItalic =new Font(Font.FontFamily.COURIER,8,Font.ITALIC);
    
    public void generarpdf(String header,String info, String footer,String rutaImagen,String Salida){
        try {
            Document document=new Document(PageSize.A4, 36,36,10,10);
            PdfWriter.getInstance(document,new FileOutputStream(Salida));
            document.open();
            
            document.add(getHeader(header));
            Image imagen =Image.getInstance(rutaImagen);
            imagen.setAlignment(Element.ALIGN_CENTER);
            document.add(imagen);
            document.add(getInfo(info));
            document.add(getFooter(footer));
            document.close();
            
            
                    
        } catch (Exception e) {
        }
        
    }
    
    private Paragraph getHeader(String texto){
        Paragraph p=new Paragraph();
        Chunk c=new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.setFont(fuenteBold);
        p.add(c);
        return p;
    } 
    private Paragraph getInfo(String texto){
        Paragraph p=new Paragraph();
        Chunk c=new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.setFont(fuenteNormal);
        p.add(c);
        return p;
    }
    private Paragraph getFooter(String texto){
        Paragraph p=new Paragraph();
        Chunk c=new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.setFont(fuenteItalic);
        p.add(c);
        return p;
    }
}
