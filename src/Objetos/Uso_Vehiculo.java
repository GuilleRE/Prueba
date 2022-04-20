package Objetos;

import java.util.Arrays;

/**
 *
 * @author guille
 * @version 1.0
 * @since 24/03/22
 * 
 */
public class Uso_Vehiculo {
    public static void main(String[] args) {
        Vehiculo[] misVehiculos=new Vehiculo[4];
        /**
         * @see Vehiculo
         * Instancia de un Array de la clase Vehiculo
         */
        
        misVehiculos[0]=new Coche("Citroen", "Shara", 500);
        misVehiculos[1]=new Coche("Seat", "Ibiza", 6, 1500, 550);
        /**
         * @see Coche
         * Dos instancias de la clase Coche dentro de una Array de la clase Vehiculo
         * que al heredar de esta se puede instanciar en su interior.
         */
        misVehiculos[2]=new Moto(2, 50);
        misVehiculos[3]=new Moto(3, 100, 2);
        /**
         * @see Moto
         * Instancias de la clase Moto que al igual que la anterior
         * puede formar parte del Array.
         */
        
        Arrays.sort(misVehiculos);
        /**
         * Metodo de la clase Arrays para poder ordenar los objetos de su interior
         */
        
        for(Vehiculo v: misVehiculos){ //Bucle for:each para poder aplicar los metodos a todos los elementos del Array.
            System.out.println(v.getTipo());//Muestra el tipo del objeto
            v.acelerar(120);//@see Vehiculo @param velocidad
            System.out.println(v.getVelocidad());//Muestra la velocidad de los elementos del Array.
            v.desacelerar(50);//@see Vehiculo @param velocidad
            System.out.println(v.getVelocidad());//Muestrar la velocidad de nuevo
            v.frenar();//@see Vehiculo
            System.out.println(v.getVelocidad());//Muestra la velocidad de los vehiculos despues de frenar.
            System.out.println(v.getCv());//Muestra los cv de todos los vehiculos.
        }
        Moto m1=new Moto(3, 100);
        /**
         * @see Moto
         */
        System.out.println(m1.tieneProtec("si"));
        /**
         * @see Moto
         */
        Moto mimoto=(Moto) misVehiculos[2];
        // Refundición de tipos de Vehiculo a Moto.
        System.out.println(mimoto.tieneProtec("si"));
        /**
         * @see Moto
         * Indica si tiene estructura de protección
         */
        
    }
}