import java.util.Scanner;

import entidades.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int aux = 0;
        while (aux < 10) {
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. Registrar nuevo estudiante.");
            System.out.println("2. Registrar una nueva carrera.");
            System.out.println("3. Seleccionar una carrera.");
            System.out.println("9. Salir del programa");
            System.out.print("Elija una opción: ");

            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre = entrada.nextLine();
                    System.out.print("Ingrese el apellido: ");
                    String apellido = entrada.nextLine();
                    System.out.println("Ingrese el DNI del estudiante.");
                    int dni = entrada.nextInt();
                    Estudiante estudiante1 = new Estudiante(dni, nombre, apellido);
                    break;
                    case 2: 

            }

        }
    }
}
