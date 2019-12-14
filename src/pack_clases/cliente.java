
package pack_clases;

public class cliente {
     private String nombreCliente;
        
     private int numeroMesa;

    public cliente() {
    }

    public cliente(String nombreCliente, int numeroMesa) {
        this.nombreCliente = nombreCliente;
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
     
     
}