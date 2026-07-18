package entidades;

public class Universidad {
    private String nombre;
    private String direccion;
    private Estudiante[] estudiantes; 
    private int cantidadEstudiantes;   

    public Universidad(String nombre, String direccion, int capacidadMaxima) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estudiantes = new Estudiante[capacidadMaxima]; 
        this.cantidadEstudiantes = 0; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
