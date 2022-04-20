/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author guille
 * @version 1.0
 * @since 24/03/22
 * 
 */
public class Coche extends Vehiculo{
    private String marca;
    
    private String modelo;
    
    private int n_plazas;
    
    private int peso;
    /**
     * Constructor
     * @param marca
     * Valor cadena
     * 
     * @param modelo
     * Valor cadena
     * 
     * @param n_plazas
     * Valor numerico
     * 
     * @param peso
     * Valor numerico
     * 
     * @param cv 
     * Valor numerico
     * 
     */
    public Coche(String marca, String modelo, int n_plazas, int peso, int cv){
        super(cv);
        this.marca=marca;
        this.modelo=modelo;
        this.n_plazas=n_plazas;
        this.peso=peso;
    }
    
    /**
     * Constructor
     * @param marca
     * Valor cadena
     * 
     * @param modelo
     * valor cadena
     * 
     * @param cv 
     * Valor numerico
     * 
     */
    public Coche(String marca, String modelo, int cv){
        this(marca, modelo, 5, 1000, cv);
    }
    /**
     * Metodo sobreescrito clase Vehiculo
     * @see Vehiculo
     * @return cadena
     * Valor cadena
     * 
     */
    @Override
    public String getTipo(){
        return "Este objeto es del tipo Coche";
    }
    /**
     * Metodo devolver marca
     * @return marca
     * Valor cadena
     */
    public String getMarca(){
        return marca;
    }
    /**
     * Metodo devolver modelo
     * @return modelo
     * Valor cadena
     */
    public String getModelo(){
        return modelo;
    }
    /**
     * Metodo devolver n_plazas
     * @return n_plazas
     * Valor numerico
     */
    public int getNplazas(){
        return n_plazas;
    }
    /**
     * Metodo devolver peso
     * @return peso
     * Valor numerico
     */
    public int getPeso(){
        return peso;
    }
    /**
     * Metodo para asignar marca
     * @param marca 
     * Valor cadena
     */
    public void setMarca(String marca){
        this.marca=marca;
    }
    /**
     * Metodo para asignar modelo
     * @param modelo 
     * valor cadena
     */
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    /**
     * Metodo para asignar n_plazas
     * @param n_plazas 
     * valor cadena
     */
    public void setNplazas(int n_plazas){
        this.n_plazas=n_plazas;
    }
    /**
     * Metodo para asignar peso
     * @param peso 
     * Valor numerico
     */
    public void setPeso(int peso){
        this.peso=peso;
    }
}
