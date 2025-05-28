public class Persona {
    protected String nombre;
    protected String documento;
    protected String ciudad;

    public Persona(String nombre, String documento, String ciudad) {
        this.nombre = nombre;
        this.documento = documento;
        this.ciudad = ciudad;
    }
    public String getNombre() {return nombre;}
    public String getDocumento() {return documento;}
    public String getCiudad() {return ciudad;}

    public void setCiudad(String ciudad) {
        if (!ciudad.isEmpty()) {
            this.ciudad = ciudad;
        }}
    public void mostrarDatosBasicos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Ciudad: " + ciudad);
    }
}
