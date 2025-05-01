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
                    biblioteca.listarRecursos();
                    break;
                case 2:
                    gestionarPrestamo(biblioteca, scanner);
                    break;
                case 3:
                    gestionarDevolucion(biblioteca, scanner);
                    break;
                case 4:
                    biblioteca.mostrarPrestamosActivos();
                    break;
            }
        } while(opcion != 5);
        
        scanner.close();
    }
        private static void cargarDatosDemo(Biblioteca biblioteca) {
        biblioteca.agregarRecurso(new Libro("El señor de los anillos: La comunidad del anillo", "9788445000663", "J.R.R. Tolkien"));
        biblioteca.agregarRecurso(new Libro("Moby Dick", "9788420674170", "Herman Melville"));
        biblioteca.agregarRecurso(new Libro("Don Quijote de la Mancha", "9788420412147", "Miguel de Cervantes Saavedra"));
        biblioteca.agregarRecurso(new Libro(" Las batallas en el desierto", "9789684115196", "Jose Emilio Pacheco"));
        biblioteca.agregarRecurso(new Libro("Cien años de soledad", "978-0307474728", "Gabriel García Marquez"));
        biblioteca.agregarRecurso(new Revista("National Geographic", "0027-9358", 2024, 5));
        biblioteca.agregarRecurso(new Revista("Forbes ", "0015-6914", 2025, 1));
        biblioteca.registrarUsuario(new Usuario("usuario 1", "1"));
        biblioteca.registrarUsuario(new Usuario("usuario 2", "2"));
    }

    private static void gestionarPrestamo(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("ID de usuario: ");
        String userId = scanner.next();
        System.out.print("ID de recurso: ");
        String recursoId = scanner.next();
        
        biblioteca.realizarPrestamo(userId, recursoId);
    }

    private static void gestionarDevolucion(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("ID de usuario: ");
        String userId = scanner.next();
        System.out.print("ID de recurso: ");
        String recursoId = scanner.next();
        
        biblioteca.realizarDevolucion(userId, recursoId);
    }
}