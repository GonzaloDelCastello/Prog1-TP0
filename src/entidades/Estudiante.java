package entidades;

public class Estudiante {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    private Materia[] materias;
    private int cantidadMaterias;

    Estudiante(int dni, String nombre, String apellido, int edad, String carrera, double promedio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = new Materia[100];
        this.cantidadMaterias = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }
    public int getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void agregarMateria(Materia materia) {
        this.materias[cantidadMaterias] = materia;
        cantidadMaterias++;
    }

}   
