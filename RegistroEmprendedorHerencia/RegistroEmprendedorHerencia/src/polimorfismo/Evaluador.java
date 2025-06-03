package polimorfismo;

public class Evaluador extends Persona {
    public Evaluador(String nombre, String documento, String sector, String ciudad) {
        super(nombre, documento, sector, ciudad);
    }
    @Override
    public void mostrarResumen(){
        System.out.println(nombre + " ("+ documento + ") -Rol: Evaludador del sector " +  sector);
    }
}
