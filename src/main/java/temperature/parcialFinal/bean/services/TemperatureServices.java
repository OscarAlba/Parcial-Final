/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.parcialFinal.bean.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import temperature.parcialFinal.persistence.TemperaturePersistence;

/**
 *
 * @author 2106991
 */
@Service
public class TemperatureServices {
    @Autowired
    TemperaturePersistence temperature;

   
    /**
     * 
     * @param fahrenheit
     * @return 
     */
    public int getFtoC(int fahrenheit){
        return temperature.getFtoC(fahrenheit);
    }
    
    /**
     * 
     * @param celsius
     * @return 
     */
    public int getCtoF(int celsius){
        return temperature.getCtoF(celsius);
    }
}
