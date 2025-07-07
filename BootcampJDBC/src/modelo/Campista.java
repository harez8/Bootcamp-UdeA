package modelo;

public class Campista {
    private int id;
    private String nombre;
    private String documento;
    private String generoNacimiento;
    private boolean activo;

    //Constructor vacio (necesario apra frameworks o carga manual
    public Campista(){};

    //Constructor completo
    public Campista(int id, String nombre, String documento, String generoNacimeinto, boolean activo){
        this.id = id;
        this.nombre = nombre;
        this.documento= documento;
        this.generoNacimiento= generoNacimeinto;
        this.activo= activo;
    }

    //Constructor sin ID (para insertar nuevos campistas)
    public Campista(String nombre, String documento, String generoNacimiento, boolean activo){
        this.nombre= nombre;
        this.documento= documento;
        this.generoNacimiento = generoNacimiento;
        this.activo = activo;
    }

    //Getters y Setters
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public String getDocumento(){
        return documento;
    }
    public void setDocumento(){
        this.documento= documento;
    }

    public String getGeneroNacimiento() {
        return generoNacimiento;
    }
    public void setGeneroNacimiento(){
        this.generoNacimiento = generoNacimiento;
    }
    public boolean isActivo(){
        return activo;
    }
    public void setActivo(){
        this.activo = activo;
    }

    //Metodo de ayuda para impresion
    @Override
    public String toString(){
        return "Campista{"+
                "id=" + id +
                ", nombre=" + nombre + '\'' +
                ", documento=" + documento + '\'' +
                ",generoNacimiento="+ generoNacimiento + '\'' +
                ",activo="+ activo +
                '}';
    }
}

