package paquete2;

public class LibretaNotas {

    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public LibretaNotas(String n, double c1, double c2, double c3) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public LibretaNotas(String n, double c1, double c2) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = (c1 + c2) / 2;
    }

    public void establecerNombreEstudiante(String x) {
        nombreEstudiante = x;
    }

    public void establecerCalificacionUno(double x) {
        calificacion1 = x;
    }

    public void establecerCalificacionDos(double x) {
        calificacion2 = x;
    }

    public void establecerCalificacionTres(double x) {
        calificacion3 = x;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacionUno() {
        return calificacion1;
    }

    public double obtenerCalificacionDos() {
        return calificacion2;
    }

    public double obtenerCalificacionTres() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n\nLIBRETAS DE CALIFICACIONES\n"
                + "Nombre del Estudiante: %s\n"
                + "Calificacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombreEstudiante(),
                obtenerCalificacionUno(),
                obtenerCalificacionDos(),
                obtenerCalificacionTres(),
                obtenerPromedio());
        
        return cadena;
    }

}
