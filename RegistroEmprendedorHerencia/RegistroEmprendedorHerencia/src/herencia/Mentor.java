package herencia;

public class Mentor extends Persona {
    private String areaExperticia;

    public Mentor(String nombre, String documento,String ciudad, String areaExperticia){
        super(nombre,documento, ciudad);
        this.areaExperticia = areaExperticia;
    }
    public String getAreaExperticia() {return areaExperticia;}

    @Override
    public void mostrarDatosBasicos() {
        super.mostrarDatosBasicos();
        System.out.println("areaExperticia = " + areaExperticia);
    }
}
