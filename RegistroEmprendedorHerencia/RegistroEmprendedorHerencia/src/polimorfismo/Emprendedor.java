package polimorfismo;

public class Emprendedor extends Persona {

public Emprendedor(String nombre, String documento, String sector, String ciudad) {
   super(nombre, documento, sector, ciudad);
}
    public String getSector() {return sector;}
}
@Override
public void mostrarResumen(){
    System.out.println(nombre + " - Emprendedor de " + sector + " en " + ciudad);
}