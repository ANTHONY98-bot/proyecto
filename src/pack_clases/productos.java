package pack_clases;

public class productos {

    private String Nombre;
    /*
 private String hamburguesas;
 
     */
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

    public productos() {
    }

    public productos(String Nombre, String hamburguesas, String bebidas, String postres, String papas_complementos, String Pollo_crujiente, String enaladas, String cajita_feliz, int cantidad_hamburguea, int cant_bebidas, int cantidad_postres, int cantidad_papas, int cant_pollo, int cant_cajafeliz, int cant_ensaladas) {
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


    /*metodos de usuario*/
    public double precio_Hamburguesas() {
        switch (hamburguesas) {
            case "Bic Mac":
                return 12.50;
            case "Doble queso":
                return 11.50;
            case "Royal":
                return 10.50;
            case "Parrillera":
                return 14.50;
            case "A lo Pobre":
                return 13.50;
            case "Doble Carne":
                return 15.50;
            default:
                return 0.0;
        }

    }

    public double hamburgresa_total() {
        return cantidad_hamburguea * precio_Hamburguesas();
    }

    public double precio_papascomple() {

        switch (papas_complementos) {
            case "Papa Regular":
                return 3.90;
            case "Papa Mediana":
                return 4.90;
            case "Papa Familiar":
                return 6.90;
            case "Nuggets":
                return 5.50;

            default:
                return 0.0;
        }

    }

    public double precioTotal_papas() {
        return precio_papascomple() * cantidad_papas;

    }

    public double precio_bebidas() {

        switch (bebidas) {
            case "Coca cola Personal":
                return 2.50;
            case "Inca Cola Personal ":
                return 2.50;
            case "Gordita":
                return 4.00;
            case "Agua":
                return 1.90;
            case "Coca cola 3L":
                return 12.00;
            case "Inca Cola 3L":
                return 12.00;
            case "Chicha 1L":
                return 8.00;
            case "Maracuya 1L":
                return 8.00;

            default:
                return 0.0;
        }

    }

    public double precioTOTAL_Bebidas() {

        return cant_bebidas * precio_bebidas();

    }

    public double precio_postres() {
        switch (postres) {
            case "Torta Selva Negra":
                return 4.00;
            case "Torta Tres Leches":
                return 4.90;
            case "Gelatina Copa":
                return 3.90;
            case "Flan Copa":
                return 3.90;
            case "Mazamorra Copa":
                return 3.90;
            case "Cono":
                return 2.00;
            case "Super cono":
                return 3.00;
            default:
                return 0.0;
        }

    }

    public double precioTotal_potres() {
        return precio_postres() * cantidad_postres;

    }

    public double PRECIO_ensaladas() {

        switch (enaladas) {
            case "Ensalada mixta":
                return 3.00;
            case "Ensalada Caprese":
                return 6.90;
            case "Ensalada de Manzanas":
                return 7.90;
            case "Ensalada de Frutas":
                return 9.00;

            default:
                return 0.0;
        }

    }

    public double precioTotal_ensaladas() {
        if (PRECIO_ensaladas() == 0.0) {
            return PRECIO_ensaladas() * cant_ensaladas;
        } else {
            return 0.0;
        }
    }

    public double PrecioPollo() {
        switch (Pollo_crujiente) {
            case "Pecho Brosther":
                return 11.00;
            case "Muslo Brosther":
                return 9.00;
            case "Alita Brosther":
                return 7.00;

            default:
                return 0.0;

        }
    }

    public double precioTotal_pollo() {
        if (PrecioPollo() == 0.0) {
            return PrecioPollo() * cant_ensaladas;
        } else {
            return 0.0;
        }
    }

    public double Importe_Total() {
        return hamburgresa_total() + precioTotal_papas() + precioTotal_ensaladas() + precioTotal_pollo() + precioTOTAL_Bebidas() + precioTotal_potres();
    }

}

//factura y boleta

