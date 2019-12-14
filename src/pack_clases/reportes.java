
package pack_clases;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingbinding.adapters.JTableAdapterProvider;
import pack_mantenimiento.frmManteniminetoEmpleado;*/
import Formularios.frmPrincipal;
public class reportes {
  
    Connection conexion;
    Statement instrucion;

    public reportes() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //Creamos un enlace hacia la base de datos
            conexion = DriverManager.getConnection("jdbc:odbc:prueba", "", "");
            instrucion = conexion.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }

//METODO PARA EXPORTAR A PDF UN REPORTE   

    public void resportesPDF(String ruta, String archi) {
        /*try {
            String rutaInforme = ruta;
            JasperPrint informe = JasperFillManager.fillReport(rutaInforme, null, conexion);
            JasperExportManager.exportReportToPdfFile(informe, archi);

            JasperViewer ventanavisor = new JasperViewer(informe, false);
            ventanavisor.setTitle("INFORME");
            ventanavisor.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL EXPORTAR DOCUMENTO");
        }*/
          
}

}
