class Usuario {
    private String nombre;
    private String id;
    private List<RecursoBibliografico> prestamos;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.prestamos = new ArrayList<>();
    }

    public boolean tomarPrestado(RecursoBibliografico recurso) {
        if (recurso.prestar()) {
            prestamos.add(recurso);
            return true;
        }
        return false;
    }

    public boolean devolverRecurso(RecursoBibliografico recurso) {
        if (prestamos.remove(recurso) && recurso.devolver()) {
            return true;
        }
        return false;
    }

    public String getId() { return id; }
    public List<RecursoBibliografico> getPrestamos() { return prestamos; }
}