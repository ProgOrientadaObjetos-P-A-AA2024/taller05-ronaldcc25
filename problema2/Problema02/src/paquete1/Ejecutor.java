package paquete1;

import paquete2.Vehiculo;

public class Ejecutor {

    public static void main(String[] args) {
    
        
        Vehiculo vehiculoUno = new Vehiculo("1103695847", "BMW Serie 3",
                1975, 10655);
        vehiculoUno.calcularValorMatricula();

        Vehiculo vehiculoDos = new Vehiculo("1105284769", 1996, 32754);
        vehiculoDos.calcularValorMatricula();

        System.out.printf("%s", vehiculoUno);
        System.out.printf("%s", vehiculoDos);
        while (true) {            
            
        }
    }

}
