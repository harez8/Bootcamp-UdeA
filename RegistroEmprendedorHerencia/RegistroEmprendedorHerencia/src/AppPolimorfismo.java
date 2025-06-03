import polimorfismo.*;

import java.util.Scanner;

public class AppPolimorfismo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ingreso de datos del emprendedor
        System.out.println("Que tipo de persona desea ingresar? (1: polimorfismo.Emprendedor, 2: polimorfismo.Mentor: )");
        int tipo = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el Documento: ");
        String documento = sc.nextLine();
        System.out.println("Ingrese la ciudad: ");
        String ciudad = sc.nextLine();

        if(tipo==1){
            System.out.println("Ingrese el sector al que pertenece: ");
            String sector = sc.nextLine();
            Emprendedor emp = new Emprendedor(nombre,documento,ciudad,sector);

            System.out.println("Ingrese el Nombre del proyecto: ");
            String nombreProyecto = sc.nextLine();
            System.out.println("Ingrese una descipcion del proyecto: ");
            String descripcion = sc.nextLine();

            NivelInnovacion nivel = null;
            while(nivel == null){
                try{
                    System.out.println("Ingrese el nivel de Innovacion(BAJO, MEDIO, ALTO: ");
                    String nivelTexto= sc.nextLine();
                    nivel = NivelInnovacion.valueOf(nivelTexto);
                } catch (IllegalArgumentException e) {
                    System.out.println("El nivel no existe, intente de nuevo.");
                }
            }

            EstadoProyecto estado = null;
            while(estado == null){
                try{
                    System.out.println("\n\n Ingrese el estado del proyecto (EN_DISENO, EN_MARCHA, CRECIMIENTO): ");
                    String estadoTexto = sc.nextLine().toUpperCase();
                    estado = EstadoProyecto.valueOf(estadoTexto);

                } catch (IllegalArgumentException e){
                    System.out.println("Valor del estado ingresado inválido");
                }
            }
            Proyecto proyecto = new Proyecto(nombreProyecto, descripcion, nivel, estado,emp);
            // Mostrar resumen inicial
            System.out.println("\n-------------------------");
            proyecto.mostrarResumen();

        } else if(tipo==2) {
            System.out.println("Ingrese el area de experticia: ");
            String area = sc.nextLine();
            Mentor mentor = new Mentor(nombre, documento, ciudad, area);

            System.out.println("--------------------");
            System.out.println("polimorfismo.Mentor Registrado");
            mentor.mostrarDatosBasicos();
        } else{
            System.out.println("Opcion no valida");
        }

//        // Mostrar resumen actualizado
//        System.out.println("\n-------------------------");
//        proyecto.mostrarResumen();

        sc.close();
    }
}
