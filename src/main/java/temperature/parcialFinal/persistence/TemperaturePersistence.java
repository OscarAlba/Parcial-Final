/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.parcialFinal.persistence;

/**
 *
 * @author 2106991
 */
public interface TemperaturePersistence {
    
    /**
     * 
     * @param fahrenheit
     * @return Devuelve en  Celsius los grados fahrenheit que se le pasan como parametro
     */
    public int getFtoC(int fahrenheit);
    /**
     * 
     * @param celsius
     * @return Devuelve en Fahrenheit los grados celsius que se le pasan como parametro
     */
    public int getCtoF(int celsius);
}
