public class GestorNotas {
        // se crean los metodos con un SOUT para simplificar, pero se eniende que en el caso del método asignarNota se sobrecarga
        // de tal manera que dependiendo de los parámetros que se ingresen, se ejecute un algortimo u otro.
    public void asignarNota(int idEstudiante, double nota) {
        System.out.println("Asignando nota " + nota + " al estudiante con ID " + idEstudiante);
    }

    public void asignarNota(int idEstudiante, String nombreMateria, double nota) {
        System.out.println("Asignando nota " + nota + " en " + nombreMateria + " al estudiante con ID " + idEstudiante);
    }

    public void asignarNota(int idEstudiante, String nombreMateria, double nota, String comentario) {
        System.out.println("Asignando nota " + nota + " en " + nombreMateria + " al estudiante con ID " + idEstudiante + ". Comentario: " + comentario);
    }

    public double obtenerNota(int idEstudiante, String nombreMateria) {
        System.out.println("Obteniendo nota de " + nombreMateria + " para el estudiante con ID " + idEstudiante);
        return 0.0;
    }

    public void eliminarNota(int idEstudiante, String nombreMateria) {
        System.out.println("Eliminando nota de " + nombreMateria + " para el estudiante con ID " + idEstudiante);
    }

        // Esta clase respesta el principio de responsalidad única,  debido a que no hacen parte de clases concretas como la de un profesor...
        // Más bien, lo que se hace es instanciar la clase GestorNotas la cual contiene todos estos métodos yesa es su única responsabilidad.
}