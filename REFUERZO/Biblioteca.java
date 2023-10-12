import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Documento> documentos = new ArrayList<>();

    public void ingresarNuevoDocumento(Documento documento) {
        documentos.add(documento);
    }

    public String obtenerTituloPorID(int id) {
        for (Documento documento : documentos) {
            if (documento.getId() == id) {
                return documento.getTitulo();
            }
        }
        return "ID no encontrado";
    }

    public int calcularCantidadDocumentosPorMateria(String materia) {
        int cantidad = 0;
        for (Documento documento : documentos) {
            if (documento.getMateria().equalsIgnoreCase(materia)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int determinarCantidadRevistasPorMateria(String materia) {
        int cantidad = 0;
        for (Documento documento : documentos) {
            if (documento instanceof Revista && documento.getMateria().equalsIgnoreCase(materia)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public void mostrarInformacionLibros() {
        for (Documento documento : documentos) {
            if (documento instanceof Libro) {
                Libro libro = (Libro) documento;
                System.out.println(libro.toString());
            }
        }
    }
}
