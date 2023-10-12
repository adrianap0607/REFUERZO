public class Libro extends Documento {
    private String autor;
    private String editorial;

    public Libro(int id, String titulo, String autor, String editorial, String materia, int cantidadEjemplares, String estado) {
        super(id, titulo, materia, cantidadEjemplares, estado);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Libro [ID: " + getId() + ", Título: " + getTitulo() + ", Autor: " + autor + ", Editorial: " + editorial
                + ", Materia: " + getMateria() + ", Cantidad de Ejemplares: " + getCantidadEjemplares() + ", Estado: " + getEstado() + "]";
    }
}
