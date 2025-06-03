package polimorfismo;

public abstract class Persona {
    protected String nombre;
    protected String documento;
    protected String sector;
    protected String ciudad;


    public Persona(String nombre, String documento, String ciudad) {
        this.nombre = nombre;
        this.documento = documento;
        this.sector = sector;
        this.ciudad = ciudad;
    }
    public String getNombre() {return nombre;}
    public String getDocumento() {return documento;}
    public String getSector() {return sector;}
    public String getCiudad() {return ciudad;}

    public void setCiudad(String ciudad) {
        if (!ciudad.isEmpty()) {
            this.ciudad = ciudad;
        }}
    public void mostrarDatosBasicos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Sector: " + sector);
        System.out.println("Ciudad: " + ciudad);
    }
    //Metodo abstracto sobreeescrito por subclases
    public abstract void mostrarResumen();
}
