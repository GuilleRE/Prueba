
package Objetos;

/**
 *
 * @author guille
 * @version 1.0
 * @since 24/03/22
 * 
 */
public class Moto extends Vehiculo implements Proteger{
    private int dispositivo_seguridad;
    /**
     * Constructor
     * @param ruedas
     * Valor numerico
     * @param cv
     * Valor numerico
     * @param dispositivos_seguridas
     * Valor numerico
     */
    public Moto(int ruedas, int cv, int dispositivos_seguridas){
        super(ruedas, cv);
        this.dispositivo_seguridad=dispositivos_seguridas;
    }
    /**
     * Constructor
     * @param ruedas
     * Valor numerico
     * @param cv 
     * Valor numerico
     */
    public Moto(int ruedas, int cv){
        this(ruedas, cv, 0);
    }
    /**
     * Motodo sobreescrito de la clase Protecger
     * @see Proteger
     * @param op
     * Valor cadena
     * @return cadena
     * Valor cadena
     */
    @Override
    public String tieneProtec(String op){
        if(op.equalsIgnoreCase("si")){
            return "La moto tiene una estructura de protección";
        }else if(op.equalsIgnoreCase("no")){
            return "La moto no tiene una estructura de pretección";
        }else{
            return "La respuesta no es valida";
        }
        
    }
    /**
     * Metodo sobreescrito
     * @see Vehiculo
     * @return cadena
     * Valor cadena
     */
    @Override
    public String getTipo(){
        return "Este objeto es del tipo Moto";
    }
    /**
     * Metodo para devolver el numero de dispositivos de seguridad
     * @return dispositivo_seguridad
     * Valor numerico
     */
    public int getSeguridad(){
        return dispositivo_seguridad;
    }
    /**
     * Metodo para asignar los numero de dispositivos de seguridad
     * @param dispositivo_seguridad
     * Valor numerico
     */
    public void setSeguridad(int dispositivo_seguridad){
        this.dispositivo_seguridad=dispositivo_seguridad;
    }
}
