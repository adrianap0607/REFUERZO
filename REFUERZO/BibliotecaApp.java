import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcion;
        do {
            System.out.println("----- Menú de la Biblioteca -----");
            System.out.println("1. Ingresar nuevo documento");
            System.out.println("2. Devolver título de una publicación por ID");
            System.out.println("3. Calcular cantidad de documentos de una materia");
            System.out.println("4. Determinar cantidad de revistas de una materia");
            System.out.println("5. Mostrar información de todos los libros");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del documento: ");
                    int nuevoID = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el salto de línea
                    System.out.print("Ingrese el título del documento: ");
                    String nuevoTitulo = scanner.nextLine();

                    System.out.print("Ingrese el autor (o presione Enter si no es aplicable): ");
                    String nuevoAutor = scanner.nextLine();

                    System.out.print("Ingrese la editorial (o presione Enter si no es aplicable): ");
                    String nuevaEditorial = scanner.nextLine();

                    System.out.print("Ingrese la materia: ");
                    String nuevaMateria = scanner.nextLine();

                    System.out.print("Ingrese la cantidad de ejemplares: ");
                    int nuevaCantidadEjemplares = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el salto de línea

                    System.out.print("Ingrese el estado (disponible o agotado): ");
                    String nuevoEstado = scanner.nextLine();

                    System.out.print("Tipo de documento (Libro, Revista o Articulo): ");
                    String tipoDocumento = scanner.nextLine();

                    Documento nuevoDocumento = null;

                    if (tipoDocumento.equalsIgnoreCase("Libro")) {
                        nuevoDocumento = new Libro(nuevoID, nuevoTitulo, nuevoAutor, nuevaEditorial, nuevaMateria, nuevaCantidadEjemplares, nuevoEstado);
                    } else if (tipoDocumento.equalsIgnoreCase("Revista")) {
                        System.out.print("Ingrese el año de la revista: ");
                        int anoRevista = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea
                        System.out.print("Ingrese el número de la revista: ");
                        int numeroRevista = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el salto de línea
                        nuevoDocumento = new Revista(nuevoID, nuevoTitulo, nuevaMateria, nuevaCantidadEjemplares, nuevoEstado, anoRevista, numeroRevista);
                    } else if (tipoDocumento.equalsIgnoreCase("Articulo")) {
                        System.out.print("Ingrese el nombre del árbitro: ");
                        String nombreArbitro = scanner.nextLine();
                        nuevoDocumento = new Articulo(nuevoID, nuevoTitulo, nuevaMateria, nuevaCantidadEjemplares, nuevoEstado, nombreArbitro);
                    } else {
                        System.out.println("Tipo de documento no válido.");
                        break;
                    }

                    biblioteca.ingresarNuevoDocumento(nuevoDocumento);
                    System.out.println("Documento ingresado con éxito.");
                    break;

                case 2:
                    System.out.print("Ingrese el ID de la publicación: ");
                    int idBuscado = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el salto de línea
                    String titulo = biblioteca.obtenerTituloPorID(idBuscado);
                    System.out.println("Título: " + titulo);
                    break;

                case 3:
                    System.out.print("Ingrese la materia: ");
                    String materiaCalculo = scanner.nextLine();
                    int cantidadDocumentos = biblioteca.calcularCantidadDocumentosPorMateria(materiaCalculo);
                    System.out.println("Cantidad de documentos de " + materiaCalculo + ": " + cantidadDocumentos);
                    break;

                case 4:
                    System.out.print("Ingrese la materia: ");
                    String materiaRevistas = scanner.nextLine();
                    int cantidadRevistas = biblioteca.determinarCantidadRevistasPorMateria(materiaRevistas);
                    System.out.println("Cantidad de revistas de " + materiaRevistas + ": " + cantidadRevistas);
                    break;

                case 5:
                    biblioteca.mostrarInformacionLibros();
                    break;

                case 6:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 6);
        scanner.close();
    }
}
