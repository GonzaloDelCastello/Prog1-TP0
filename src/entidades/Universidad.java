package entidades;

import java.lang.reflect.Array;

public class Universidad {
    private String nombre;
    private String direccion;
    private Estudiante[] estudiantes;
    private Carrera[] carreras; 
    private int cantidadEstudiantes;   

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.cantidadEstudiantes = 0;
        this.carreras = new Carrera[100];
        this.estudiantes = new Estudiante[500];
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
