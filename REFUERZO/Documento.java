public class Documento {
    private int id;
    private String titulo;
    private String materia;
    private int cantidadEjemplares;
    private String estado;

    public Documento(int id, String titulo, String materia, int cantidadEjemplares, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.materia = materia;
        this.cantidadEjemplares = cantidadEjemplares;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMateria() {
        return materia;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Documento [ID: " + id + ", Título: " + titulo + ", Materia: " + materia
                + ", Cantidad de Ejemplares: " + cantidadEjemplares + ", Estado: " + estado + "]";
    }
}
