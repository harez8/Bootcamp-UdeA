import herencia.Emprendedor;
import polimorfismo.*;

import java.util.Scanner;

public class AppPolimorfismo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crear participantes
        Persona emprendedor = new Persona("Heider", "1234", "Tech","Medellin");
        Mentor mentor = new Mentor("Juan","12345","Financiero", "Envigado","Maestro");
        Evaluador evaluador = new Evaluador("Perez","12345","Tech","Bello");
        //Crear instancia de registrarServicio
        RegistroServicio servicio = new RegistroServicio();

        //Polimorfismo estatico: usando metodos sobrecargados
        System.out.println("\n :::::::::: REGISTRO INVIDIDUAL ::::::::::");
        servicio.registrar(emprendedor);
        servicio.registrar(mentor, true);
        servicio.registrar("REGISTRO VIP", evaluador);

        //Polimorfismo estatico + dinamico con arreglo
        System.out.println("\n ::::::: REGISTRO MULTIPLE::::");
        //Ingreso de datos del emprendedor
        System.out.println("Que tipo de persona desea ingresar? (1: polimorfismo.Emprendedor, 2: polimorfismo.Mentor: )");
        int tipo = Integer.parseInt(sc.nextLine());

      }
}
