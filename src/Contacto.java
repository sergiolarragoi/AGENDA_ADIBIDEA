/*--
 * Definicion de la clase Contacto con sus atributos u metodos.
 * 
 */
public class Contacto {

    private String nombre;
    private String apellido;
    private String telefono;
    private String direcciones[];

    //---------------------  CONSTRUCTOR
    public Contacto() {
        apellido = "Ruiz";

        String direcciones[] = new String[2];

    }

    public Contacto(String pNombre, String pApellido, String pTelefono, String direcciones[]) {
        this.nombre = pNombre;
        this.telefono = pTelefono;
        this.apellido = pApellido;
        this.direcciones = new String[2];
        this.direcciones[0] = direcciones[0];
        this.direcciones[1] = direcciones[1];

    }

    //-------------------  getter & setters
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public String[] getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(String[] direcciones) {
        this.direcciones = direcciones;
    }

    public void setTelefono(String pTelf) {
        this.telefono = pTelf;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String pApellido) {
        this.apellido = pApellido;
    }

    public void mostrarDatos() {
        System.out.println("\t Nombre : " + this.nombre);
        System.out.println("\t Apellido : " + this.apellido);
        System.out.println("\t Telef : " + this.telefono);
        System.out.println("\t Direccion 1 : " + this.direcciones[0]);
        System.out.println("\t Direccion 2 : " + this.direcciones[1]);
        System.out.println("-------------------------------");
    }
}
