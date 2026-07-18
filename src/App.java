import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        int aux = 0;
        while (aux < 10) {
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. Registrar nuevo estudiante");
            System.out.println("2. Listar todos los estudiantes");
            System.out.println("3. Buscar estudiante por código/DNI");
            System.out.println("9. Salir del programa");
            System.out.print("Elija una opción: ");
            
            int opcion = teclado.nextInt();
            
        }
    }
}
