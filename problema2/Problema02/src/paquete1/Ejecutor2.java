package paquete1;

import java.util.Scanner;
import paquete2.Vehiculo;

public class Ejecutor2 {

    public static void main(String[] args) {
        
        String cedula;
        String marca;
        int anioFabricacion;
        double valor;
        String opcion;
        String cadenaFinal;
        Scanner leer = new Scanner(System.in);

        cadenaFinal = "";

        boolean bandera = true;

        while (bandera) {

            System.out.print("\nNumero de cedula: ");
            cedula = leer.nextLine();
            System.out.print("Marca del Vehiculo: ");
            marca = leer.nextLine();
            System.out.print("Ingresar Anio de Fabricacion: ");
            anioFabricacion = leer.nextInt();
            System.out.print("Ingresar el valor del Vehiculo: ");
            valor = leer.nextDouble();

            Vehiculo vehiculo = new Vehiculo(cedula, marca,
                    anioFabricacion, valor);
            vehiculo.calcularValorMatricula();

            cadenaFinal = String.format("%s\nVEHICULO\n"
                    + "Cedula del duenio: %s\n"
                    + "Marca del vehiculo: %s\n"
                    + "Anio de fabricacion: %d\n"
                    + "Valor del vehiculo: %.2f\n"
                    + "Valor de matricula: %.2f\n", cadenaFinal,
                    vehiculo.obtenerCedula(),
                    vehiculo.obtenerMarca(),
                    vehiculo.obtenerAnioFabricacion(),
                    vehiculo.obtenerValorVehiculo(),
                    vehiculo.obtenerValorMatricula());

            leer.nextLine();
            System.out.println("Desea ingresar más vendedores. Ingrese n para"
                    + " salir");
            opcion = leer.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }
        }
        System.out.printf("%s", cadenaFinal);
    }

}
