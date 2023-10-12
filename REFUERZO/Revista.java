public class Revista extends Documento {
    private int ano;
    private int numero;

    public Revista(int id, String titulo, String materia, int cantidadEjemplares, String estado, int ano, int numero) {
        super(id, titulo, materia, cantidadEjemplares, estado);
        this.ano = ano;
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Revista [ID: " + getId() + ", Título: " + getTitulo() + ", Materia: " + getMateria()
                + ", Cantidad de Ejemplares: " + getCantidadEjemplares() + ", Estado: " + getEstado()
                + ", Año: " + ano + ", Número: " + numero + "]";
    }
}
