
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    ArrayList<Contacto> lista = new ArrayList<Contacto>();

    public ArrayList<Contacto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Contacto> lista) {
        this.lista = lista;
    }

    public Agenda() {
        super();
    }

    public Agenda(ArrayList<Contacto> lista) {
        super();
        this.lista = lista;
    }

    public void load_data(String path) {

        String line, nombre, apellido, telefono;
        String[] split_line;
        try {
            File fich = new File(path);
            Scanner sc = new Scanner(fich);

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                split_line = line.split("::");
                nombre = split_line[0];
                apellido = split_line[1];
                telefono = split_line[2];
                String direcciones[] = new String[2];
                direcciones[0] = split_line[3];
                direcciones[1] = split_line[4];
                Contacto nuevo = new Contacto(nombre, apellido, telefono, direcciones);
                this.lista.add(nuevo);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe...");
        }
    }

    public void nuevo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n\t\t1-Nuevo contacto");
        System.out.println("Por favor introduzca el nombre:");
        String nombre = sc.nextLine();
        System.out.println("Por favor introduzca el apellido:");
        String apellido = sc.nextLine();
        System.out.println("Por favor introduzca el telefono:");
        String telefono = sc.nextLine();
        String direcciones[] = new String[2];
        System.out.println("Por favor introduzca la 1� direccion :");
        direcciones[0] = sc.nextLine();
        System.out.println("Por favor introduzca la2� direccion :");
        direcciones[1] = sc.nextLine();
        Contacto contacto = new Contacto(nombre, apellido, telefono, direcciones);

        this.lista.add(contacto);

    }

    public void buscar(String nombre) {
        int pos = -1;

        for (int i = 0; i < this.lista.size(); i++) {

            if (this.lista.get(i).getNombre().equalsIgnoreCase(nombre)) {

                System.out.println("CONTACTO ENCONTRADO ");
                pos = i;
            }
        }
        if (pos == -1) {

            System.out.println("CONTACTO NO SE HA ENCONTRADO ");
        } else {
            System.out.println("LOS DATOS DEL CONTACTO SON : ");
            this.lista.get(pos).mostrarDatos();
        }

    }

    public void mostrarDatos() {

        System.out.println("\n\n\t\t5-Listado de contactos");
        for (int i = 0; i < this.lista.size(); i++) {

            this.lista.get(i).mostrarDatos();
        }

    }

    public void eliminar(String nombre) {
        int pos = -1;

        for (int i = 0; i < this.lista.size(); i++) {

            if (this.lista.get(i).getNombre().equalsIgnoreCase(nombre)) {

                System.out.println("CONTACTO ENCONTRADO ");
                pos = i;
            }
        }
        if (pos == -1) {

            System.out.println("CONTACTO NO SE HA ENCONTRADO ");
        } else {
            // LO BORRAMOS		
            this.lista.remove(pos);
            System.out.println("CONTACTO BORRADO");

        }

    }

    public void modificar(String nombre) {
        int pos = -1;

        for (int i = 0; i < this.lista.size(); i++) {

            if (this.lista.get(i).getNombre().equalsIgnoreCase(nombre)) {

                System.out.println("CONTACTO ENCONTRADO ");
                pos = i;
            }
        }
        if (pos == -1) {

            System.out.println("CONTACTO NO SE HA ENCONTRADO ");
        } else {
            //ENCONTRADO
            Scanner scan = new Scanner(System.in);
            System.out.println("1-Nombre : " + this.lista.get(pos).getNombre());
            System.out.println("2-Apellido : " + this.lista.get(pos).getApellido());
            System.out.println("3-Telefono : " + this.lista.get(pos).getTelefono());
            System.out.print("ELIGE num(1-3) : ");
            int num = Integer.parseInt(scan.nextLine());

            switch (num) {
                case 1:
                    System.out.print("Nuevo nombre : ");
                    String newName = scan.nextLine();
                    this.lista.get(pos).setNombre(newName);
                    break;
                case 2:
                    System.out.print("Nuevo apellido : ");
                    String newSurname = scan.nextLine();
                    this.lista.get(pos).setApellido(newSurname);
                    break;
                case 3:
                    System.out.print("Nuevo telefono : ");
                    String newTel = scan.nextLine();
                    this.lista.get(pos).setTelefono(newTel);
                    break;

                default:
                    System.out.print("Opcion incorrecta ");
                    break;
            } //fin switch

        }
    }
}
