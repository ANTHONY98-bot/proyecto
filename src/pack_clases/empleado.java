package pack_clases;

public class empleado {
    private int codigo;
    private int DNI;
    private String Nombre;
    private String Apellido;
    private int telefono;
   
    private String edad;
    private String Departamento ;
    private String Distrito ;
    private String Ciudad ;
    private String Direccion ;
    private String cargo;
  

    public empleado() {
    }

    public empleado(int codigo, int DNI, String Nombre,String Sexo ,String Apellido, int telefono, String edad, String Departamento, String Distrito, String Ciudad, String Direccion, String cargo) {
        this.codigo = codigo;
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.Departamento = Departamento;
        this.Distrito = Distrito;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
        this.cargo = cargo;
    }

    public String getEdad() {
        return edad;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

       public double sueldo(){
        switch(cargo){
            case "Administrador": return 2100.0;
            case "Cajero": return 1500.0;
            case "Anfitriona":return 1100.0;
            case "Mesero":return 1200.0;
            case"Ayudante Cocina":return 1300.0;
            case"Chef":return 1450.0;
            default :return 0.0;
                    
        }
    }
     public String Cargo(){
         switch(cargo){
            case "Administrador": return "Administrador";
            case "Cajero": return "Cajero";
            case "Anfitriona":return "Anfitriona";
            case "Mesero":return "Mesero";
            case "Ayudante Cocina":return "Ayudante Cocina";
              case"Chef":return "Chef";
            default :return null;
                    
        }
     }
}

    
