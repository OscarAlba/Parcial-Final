/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.parcialFinal.bean.services;

import temperature.parcialFinal.persistence.TemperaturePersistence;

/**
 *
 * @author 2106991
 */
public class TemperatureServices {
    
    
    TemperaturePersistence temperature;
    
    
    public int getFtoC(int fahrenheit){
        return temperature.getFtoC(fahrenheit);
    }
    
    public int getCtoF(int celsius){
        return temperature.getCtoF(celsius);
    }
}
