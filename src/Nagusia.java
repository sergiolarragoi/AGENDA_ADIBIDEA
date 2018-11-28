
import java.util.Scanner;

/**
 * azterketa programa nagusia 2017-11-22 EXAMEN PROGRAMACI�N, programa principal
 *
 */
public class Nagusia {

    public static void main(String[] args) {

        // -------------Aldagaiak
        Agenda agendaAna = new Agenda();

        String nombre;

        // -------------Programa
        Scanner sc = new Scanner(System.in);
        int opcion = 1;

        agendaAna.load_data("src/datuak/fitxategia.txt"); // fitxero batetik kargatzen dira datuak / se cargan los datos de un fichero

//		String misCasas[]= {"san migeul2","parque etxeb, 7"};
//		
//		agendaAna.getLista().get(0).setDirecciones(misCasas);
        do {
            System.out.println("......................");
            System.out.println("AGENDA");
            System.out.println("......................");
            System.out.println("1-Nuevo contacto");
            System.out.println("2-Buscar contacto");
            System.out.println("3-Modificar numero a un contacto");
            System.out.println("4-Eliminar un contacto");
            System.out.println("5-Listado de contactos");
            System.out.println("0-Salir");
            System.out.println("......................");
            System.out.println("Opcion: ");
            System.out.println("......................");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agendaAna.nuevo();
                    break;
                case 2:
                    System.out.println("\n\n\t\t2-Buscar contacto");
                    System.out.println("Nombre a buscar:");
                    nombre = sc.nextLine();

                    agendaAna.buscar(nombre);

                    break;
                case 3:
                    System.out.println("\n\n\t\t2-Modificar contacto");
                    System.out.println("Nombre del contacto a modificar:");
                    nombre = sc.nextLine();

                    agendaAna.modificar(nombre);

                    break;
                case 4:
                    System.out.println("\n\n\t\t4-Eliminar un contacto");
                    System.out.println("Nombre a eliminar:");
                    nombre = sc.nextLine();
                    agendaAna.eliminar(nombre);

                    break;
                case 5:
                    agendaAna.mostrarDatos();
                    break;

                case 0:
                    System.out.println("AGUR!!");
                    break;
                default:
                    System.out.println("Opcion incorrecta ...(1-5) salir 0");
            }
        } while (opcion != 0);
        sc.close();
    }

}
