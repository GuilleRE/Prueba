package Objetos;

/**
 *
 * @author guille
 * @version 1.0
 * @since 24/03/22
 * 
 */
public abstract class Vehiculo implements Comparable{
    private int ruedas;
    
    private int cv;
    
    private int velocidad;
    /**
     * Metodo abstracto
     * @return cadena
     * Valor cadena
     */        
    public abstract String getTipo();
    
    /**
     * Constructor
     * @param ruedas
     * @param cv
     * @param velocidad 
     */
    public Vehiculo(int ruedas, int cv, int velocidad){     
        this.ruedas=ruedas;
        this.cv=cv;
        this.velocidad=velocidad;
    }
    /**
     * Constructor
     * @param cv 
     * Valor numerico
     * 
     */
    public Vehiculo(int cv){
        this(4,cv,0);
    }
    /**
     * Constructor
     * @param ruedas
     * Valor numerico
     * 
     * @param cv 
     * Valor numerico
     */
    public Vehiculo(int ruedas, int cv){
        this(ruedas, cv, 0);
    }
    /**
     * Constructor
     * @param v 
     * Valor Vahiculo
     */
    public Vehiculo(Vehiculo v){
        this.cv=v.cv;
        this.ruedas=v.ruedas;
        this.velocidad=v.velocidad;
    }
    //Metodo sobrescrito de la interfaz Compareble.
    /**
     * Metodo comparar mediante los cv
     * @param obj
     * @return int
     * Valor numerico
     */
    @Override
    public int compareTo(Object obj){
        Vehiculo veh=(Vehiculo)(obj);
        
        if(this.cv<veh.cv){
            return -1;
        }
        
        if(this.cv>veh.cv){
            return 1;
        }
        
        return 0;
    }
    /**
     * Metodo devolver ruedas
     * @return ruedas
     * Valor numerico
     */
    public int getRuedas(){
        return ruedas;
    }
    /**
     * Metodo devolver cv
     * @return cv
     * Valor numerico
     */
    public int getCv(){
        return cv;
    }
    /**
     * Metodo devolver velocidad
     * @return velicidad
     * Valor numerico
     */
    public int getVelocidad(){
        return velocidad;
    }
    /**
     * Metodo asignar ruedad
     * @param ruerdas 
     * Valor numerico
     */
    public void setRuedas(int ruerdas){
        this.ruedas=ruerdas;
    }
    /**
     * Metodo asignar cv
     * @param cv
     * Valor numerico
     */
    public void setCv(int cv){
        this.cv=cv;
    }
    /**
     * Metodo asignar velocidad
     * @param velocidad 
     * Valor numerico
     */
    public void setVelocidad(int velocidad){
        this.velocidad=velocidad;
    }
    /**
     * Metodo para acelerar el vehiculo en cierta medida
    * @param velocidad
    * Valor numerico
    */
    public void acelerar(int velocidad){

        this.velocidad+=velocidad;
    }
    
    /**
     * Metodo para frenar el vehiculo en cierta medida
    * @param velocidad
    * Valor numerico
    */
    public void desacelerar(int velocidad){
        
        if(this.velocidad>velocidad){
            this.velocidad-=velocidad;
        }else{
            this.velocidad=0;
        }  
    }
    /**
     * Metodo para frenal el cual asigna la velocidad a 0
     */
    public void frenar(){
        this.velocidad=0;
    }
    
}