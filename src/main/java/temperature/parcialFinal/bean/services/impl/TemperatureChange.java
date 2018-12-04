/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.parcialFinal.bean.services.impl;

import temperature.parcialFinal.persistence.TemperaturePersistence;

/**
 *
 * @author 2106991
 */
public class TemperatureChange implements TemperaturePersistence{
    
    
    @Override
    public int getFtoC(int fahrenheit) {
        return (fahrenheit -32)*5/9 ;
    }

    @Override
    public int getCtoF(int celsius) {
        return (celsius *9/5) + 32;
    }
    
}
