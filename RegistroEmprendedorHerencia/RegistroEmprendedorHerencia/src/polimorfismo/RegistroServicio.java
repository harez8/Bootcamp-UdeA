package polimorfismo;

public class RegistroServicio {
    //Registro Basico
    public void registrar(Persona persona){
        System.out.println("Registro basico ");
        persona.mostrarResumen();
    }
    //Registro con mensaje adicional
    public void registrar(Persona persona, boolean mostrarMensaje){
        if (mostrarMensaje){
            System.out.println(" ¡Registro Exitoso! ");
        }
        persona.mostrarResumen();
    }
    //Registro mensaje personalizado
    public void registrar(String mensaje, Persona persona){
        System.out.println(mensaje);
        persona.mostrarResumen();
    }
    //Registro multiple (sobrecarga con un arreglo)
    public void registrar(Persona[] personas){
        System.out.println(" Registro en lote ");
        for(Persona p: personas){
            p.mostrarResumen();
        }
    }
}
