package herencia;

public class Emprendedor extends Persona {
private String sector;

public Emprendedor(String nombre, String documento, String sector, String ciudad) {
   super(nombre, documento, ciudad);
   this.sector = sector;
}
    public String getSector() {return sector;}
}
