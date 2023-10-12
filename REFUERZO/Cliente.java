import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String numeroIdentidad;
    private String nombre;
    private String direccion;
    private int cantidadPublicacionesEnPrestamo;
    private List<Documento> prestamos = new ArrayList<>();

    public Cliente(String numeroIdentidad, String nombre, String direccion) {
        this.numeroIdentidad = numeroIdentidad;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadPublicacionesEnPrestamo = 0;
    }

    public void solicitarPrestamo(Documento documento) {
        if (cantidadPublicacionesEnPrestamo < 5) {
            prestamos.add(documento);
            cantidadPublicacionesEnPrestamo++;
        } else {
            System.out.println("El cliente ha alcanzado el límite de préstamos.");
        }
    }

    public void devolverPrestamo(Documento documento) {
        if (prestamos.contains(documento)) {
            prestamos.remove(documento);
            cantidadPublicacionesEnPrestamo--;
        } else {
            System.out.println("El cliente no tiene este documento en préstamo.");
        }
    }

    public void prorrogarPrestamo(Documento documento) {
        if (prestamos.contains(documento)) {
            if (documento instanceof Libro) {
                Libro libro = (Libro) documento;
                if (libro.getMaxDiasPrestamo() >= 3) {
                    libro.prorrogarPrestamo();
                    System.out.println("Prórroga exitosa para el libro: " + libro.getTitulo());
                } else {
                    System.out.println("No es posible prorrogar el libro: " + libro.getTitulo());
                }
            } else {
                System.out.println("No es posible prorrogar este documento.");
            }
        } else {
            System.out.println("El cliente no tiene este documento en préstamo.");
        }
    }
}
