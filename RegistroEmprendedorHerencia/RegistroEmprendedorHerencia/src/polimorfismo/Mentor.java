package polimorfismo;

public class Mentor extends Persona{
    private String areaExperticia;

    public Mentor(String nombre, String documento,String sector, String ciudad, String areaExperticia){
        super(nombre,documento, ciudad);
        this.areaExperticia = areaExperticia;
    }

    @Override
    public void mostrarResumen(){
        System.out.println(nombre + " - Mentor en " + areaExperticia + " del sector " + sector + " en " + ciudad);
    }

    @Override
    public void mostrarDatosBasicos() {
        super.mostrarDatosBasicos();
        System.out.println("areaExperticia = " + areaExperticia);
    }
}
