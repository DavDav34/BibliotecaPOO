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

abstract class RecursoBibliografico {
    protected String titulo;
    protected String identificador;

    public RecursoBibliografico(String titulo, String identificador) {
        this.titulo = titulo;
        this.identificador = identificador;
    }

    public abstract boolean prestar();
    public abstract boolean devolver();
    public abstract boolean estaDisponible();
    public abstract String getDetalles();

    public String getIdentificador() { return identificador; }
    public String getTitulo() { return titulo; }
}

class Libro extends RecursoBibliografico {
    private String autor;
    private String isbn;
    private boolean prestado;

    public Libro(String titulo, String isbn, String autor) {
        super(titulo, isbn);
        this.isbn = isbn;
        this.autor = autor;
        this.prestado = false;
    }

    @Override
    public boolean prestar() {
        if (!prestado) {
            prestado = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean devolver() {
        if (prestado) {
            prestado = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean estaDisponible() { return !prestado; }

    @Override
    public String getDetalles() {
        return String.format("[LIBRO] %s - %s | ISBN: %s | Estado: %s",
                titulo, autor, isbn, prestado ? "Prestado" : "Disponible");
    }
}

class Revista extends RecursoBibliografico {
    private String issn;
    private int añoPublicacion;
    private int ejemplares;

    public Revista(String titulo, String issn, int año, int ejemplares) {
        super(titulo, issn);
        this.issn = issn;
        this.añoPublicacion = año;
        this.ejemplares = ejemplares;
    }

    @Override
    public boolean prestar() {
        if (ejemplares > 0) {
            ejemplares--;
            return true;
        }
        return false;
    }

    @Override
    public boolean devolver() {
        ejemplares++;
        return true;
    }

    @Override
    public boolean estaDisponible() { return ejemplares > 0; }

    @Override
    public String getDetalles() {
        return String.format("[REVISTA] %s | Año: %d | Ejemplares: %d | ISSN: %s",
                titulo, añoPublicacion, ejemplares, issn);
    }
}