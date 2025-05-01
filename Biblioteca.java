class Biblioteca {
    private List<RecursoBibliografico> recursos;
    private List<Usuario> usuarios;

    public Biblioteca() {
        recursos = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarRecurso(RecursoBibliografico recurso) {
        recursos.add(recurso);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarPrestamo(String userId, String recursoId) {
        Usuario usuario = buscarUsuario(userId);
        RecursoBibliografico recurso = buscarRecurso(recursoId);
        
        if (usuario == null || recurso == null) {
            System.out.println("datos incorrectos");
            return;
        }
        
        if (usuario.tomarPrestado(recurso)) {
            System.out.println("Prestamo realizado con exito");
        } else {
            System.out.println("No se pudo realizar el prestamo");
        }
    }

    public void realizarDevolucion(String userId, String recursoId) {
        Usuario usuario = buscarUsuario(userId);
        RecursoBibliografico recurso = buscarRecurso(recursoId);
        
        if (usuario == null || recurso == null) {
            System.out.println("datos incorrectos");
            return;
        }
        
        if (usuario.devolverRecurso(recurso)) {
            System.out.println("Devolucion realizada con exito");
        } else {
            System.out.println("No se pudo realizar la devolucion");
        }
    }

    public void listarRecursos() {
        System.out.println("\n--- LISTA DE RECURSOS ---");
        recursos.forEach(r -> System.out.println(r.getDetalles()));
    }

    public void mostrarPrestamosActivos() {
        System.out.println("\n--- PRESTAMOS ACTIVOS ---");
        usuarios.forEach(u -> {
            System.out.println("Usuario: " + u.getId());
            u.getPrestamos().forEach(p -> 
                System.out.println("  - " + p.getTitulo()));
        });
    }

    private Usuario buscarUsuario(String id) {
        return usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    private RecursoBibliografico buscarRecurso(String id) {
        return recursos.stream()
                .filter(r -> r.getIdentificador().equals(id))
                .findFirst()
                .orElse(null);
    }
}