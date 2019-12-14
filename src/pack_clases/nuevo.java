package pack_clases;

public class nuevo {

    private String Nombre;
    
    private String hamburguesas;
    private String bebidas;
    private String postres;
    private String papas_complementos;
    private String Pollo_crujiente;
    private String enaladas;

    private int cantidad_hamburguea;
    private int cant_bebidas;
    private int cantidad_postres;
    private int cantidad_papas;
    private int cant_pollo;

    private int cant_ensaladas;

    public nuevo() {
    }

    public nuevo(String Nombre, String hamburguesas, String bebidas, String postres, String papas_complementos, String Pollo_crujiente, String enaladas, String cajita_feliz, int cantidad_hamburguea, int cant_bebidas, int cantidad_postres, int cantidad_papas, int cant_pollo, int cant_cajafeliz, int cant_ensaladas) {
        this.Nombre = Nombre;
        this.hamburguesas = hamburguesas;
        this.bebidas = bebidas;
        this.postres = postres;
        this.papas_complementos = papas_complementos;
        this.Pollo_crujiente = Pollo_crujiente;
        this.enaladas = enaladas;

        this.cantidad_hamburguea = cantidad_hamburguea;
        this.cant_bebidas = cant_bebidas;
        this.cantidad_postres = cantidad_postres;
        this.cantidad_papas = cantidad_papas;
        this.cant_pollo = cant_pollo;

        this.cant_ensaladas = cant_ensaladas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getHamburguesas() {
        return hamburguesas;
    }

    public void setHamburguesas(String hamburguesas) {
        this.hamburguesas = hamburguesas;
    }

    public String getBebidas() {
        return bebidas;
    }

    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }

    public String getPostres() {
        return postres;
    }

    public void setPostres(String postres) {
        this.postres = postres;
    }

    public String getPapas_complementos() {
        return papas_complementos;
    }

    public void setPapas_complementos(String papas_complementos) {
        this.papas_complementos = papas_complementos;
    }

    public String getPollo_crujiente() {
        return Pollo_crujiente;
    }

    public void setPollo_crujiente(String Pollo_crujiente) {
        this.Pollo_crujiente = Pollo_crujiente;
    }

    public String getEnaladas() {
        return enaladas;
    }

    public void setEnaladas(String enaladas) {
        this.enaladas = enaladas;
    }

    public int getCantidad_hamburguea() {
        return cantidad_hamburguea;
    }

    public void setCantidad_hamburguea(int cantidad_hamburguea) {
        this.cantidad_hamburguea = cantidad_hamburguea;
    }

    public int getCant_bebidas() {
        return cant_bebidas;
    }

    public void setCant_bebidas(int cant_bebidas) {
        this.cant_bebidas = cant_bebidas;
    }

    public int getCantidad_postres() {
        return cantidad_postres;
    }

    public void setCantidad_postres(int cantidad_postres) {
        this.cantidad_postres = cantidad_postres;
    }

    public int getCantidad_papas() {
        return cantidad_papas;
    }

    public void setCantidad_papas(int cantidad_papas) {
        this.cantidad_papas = cantidad_papas;
    }

    public int getCant_pollo() {
        return cant_pollo;
    }

    public void setCant_pollo(int cant_pollo) {
        this.cant_pollo = cant_pollo;
    }

    public int getCant_ensaladas() {
        return cant_ensaladas;
    }

    public void setCant_ensaladas(int cant_ensaladas) {
        this.cant_ensaladas = cant_ensaladas;
    }

}
