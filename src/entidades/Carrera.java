package entidades;

public class Carrera {
    private String nombre;
    private String codigo;
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;
    private Materia[] materias;
    private int cantidadMaterias;

    public Carrera(String nombre, String codigo, int capacidadMaximaEstudiantes, int capacidadMaximaMaterias) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estudiantes = new Estudiante[capacidadMaximaEstudiantes];
        this.cantidadEstudiantes = 0;
        this.materias = new Materia[capacidadMaximaMaterias];
        this.cantidadMaterias = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public int getCantidadEstudiantes() {
        return cantidadEstudiantes;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public int getCantidadMaterias() {
        return cantidadMaterias;
    }

    public boolean registrarEstudiante(Estudiante estudianteNuevo) {

        if (estudianteNuevo == null) {
            return false;
        }

        if (cantidadEstudiantes >= estudiantes.length) {
            return false;
        } else {
            estudiantes[cantidadEstudiantes] = estudianteNuevo;
            cantidadEstudiantes++;
            return true;
        }

    }

    public void listarEstudiantes() {
        System.out.println("Lista de estudiantes en la carrera " + this.nombre + ":");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("- " + estudiantes[i].getNombre() + " " + estudiantes[i].getApellido() + ", ");
        }

    }

    public Estudiante buscarEstudiante(int codigoEstudiante) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getDni() == codigoEstudiante) {
                return estudiantes[i];
            } 
        } if (cantidadEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados en la carrera.");
        } else {
            System.out.println("No se encontró el estudiante.");
        }
        return null;

    }
}
