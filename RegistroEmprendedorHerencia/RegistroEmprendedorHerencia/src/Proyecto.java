public class Proyecto {
// Se declaran las variables a ingresar
    private String nombre;
    private String descripcion;
    private NivelInnovacion nivelInnovacion;
    private EstadoProyecto estado;
    private Emprendedor emprendedor;
    private Mentor mentor;
//se asignan los argumentos
    public Proyecto (String nombre, String descripcion, NivelInnovacion nivelInnovacion, EstadoProyecto estado, Emprendedor emprendedor){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelInnovacion = nivelInnovacion;
        this.estado = estado;
        this.emprendedor = emprendedor;

    }

    public String getEstado() {return estado.toString();}

    public void setEstado (EstadoProyecto estado){

        if (estado.equals("En diseño") || estado.equals("En marcha") || estado.equals("Crecimiento")){
            this.estado = estado;
        }

    }

    public String getNivelInnovacion() {return nivelInnovacion.toString();}

    public void setNivelInnovacion(NivelInnovacion nivelInnovacion){
        if (nivelInnovacion.equals("Bajo") || nivelInnovacion.equals("Medio") || nivelInnovacion.equals("Alto")){
            this.nivelInnovacion = nivelInnovacion;
        }
    }


    // Muestra el resumen de la información ingresada
public void mostrarResumen(){
        System.out.println("Registro exitoso\n");
        System.out.println("  Emprendedor  ");
//        System.out.println("\tNombre: " + emprendedor.getNombre());
//        System.out.println("\tDocumento: " + emprendedor.getDocumento());
//        System.out.println("\tSector: " + emprendedor.getSector());
//        System.out.println("\tCiudad: " + emprendedor.getCiudad());
    if(emprendedor instanceof Emprendedor){
        emprendedor.mostrarDatosBasicos();
        System.out.println("sector = " + ((Emprendedor) emprendedor).getSector());
    }

    //-----------Proyecto-------------
        System.out.println("\tProyecto");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tDescripción: " + descripcion);
        System.out.println("\tNivel de innovación: " + nivelInnovacion);
        System.out.println("\tEstado: " + estado);

    }

}
