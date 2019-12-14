
package pack_clases;

public class pedido {
    private String nombreCliente;
    private String orden;
    private int cantidadOrden;
    private double costo;

    public pedido() {
    }

    public pedido(String nombreCliente, String orden, int cantidadOrden, double costo) {
        this.nombreCliente = nombreCliente;
        this.orden = orden;
        this.cantidadOrden = cantidadOrden;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getCantidadOrden() {
        return cantidadOrden;
    }

    public void setCantidadOrden(int cantidadOrden) {
        this.cantidadOrden = cantidadOrden;
    }
    
    public double total(){
    return cantidadOrden * costo;
    }
    
    
}
