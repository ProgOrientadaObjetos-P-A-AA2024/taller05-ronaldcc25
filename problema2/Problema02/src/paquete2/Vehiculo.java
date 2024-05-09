package paquete2;

public class Vehiculo {

    private String cedula;
    private String marca;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Vehiculo(String c, String m, int a, double v) {
        cedula = c;
        marca = m;
        anioFabricacion = a;
        valorVehiculo = v;
    }

    public Vehiculo(String c, int a, double v) {
        cedula = c;
        marca = "Audi A3";
        anioFabricacion = a;
        valorVehiculo = v;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerAnioFabricacion(int a) {
        anioFabricacion = a;
    }

    public void establecerValorVehiculo(double v) {
        valorVehiculo = v;
    }

    public void calcularValorMatricula() {
        valorMatricula = (2024 - anioFabricacion) * (valorVehiculo * 0.00002);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    /*@Override
    public String toString() {
        String cadena = String.format("\nVEHICULO\n"
                + "Cedula del duenio: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Anio de fabricacion: %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor de matricula: %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAnioFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());

        return cadena;
    }*/
}
