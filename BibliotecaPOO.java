import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaPOO {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        cargarDatosDemo(biblioteca);
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n--- SISTEMA DE BIBLIOTECA ---");
            System.out.println("1. Mostrar recursos disponibles");
            System.out.println("2. Registrar un prestamo");
            System.out.println("3. Registrar una devolucion");
            System.out.println("4. Mostrar prestamos activos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    ;
                    break;
                case 2:
                    ;
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
            }
        } while(opcion != 5);
        
        scanner.close();
    }