/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.parcialFinal.bean;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import temperature.parcialFinal.bean.services.TemperatureServices;

/**
 *
 * @author 2106991
 */
@RestController
@RequestMapping(value = "/temperature")
public class ControllerAPITemperature {
    
    @Autowired
    TemperatureServices temperature;
    
    @RequestMapping(method = RequestMethod.GET, path = "CelsiusTofahrenheit/{celsius}")
    public ResponseEntity<?> getCtoF(@PathVariable int celsius) {
   
        return new ResponseEntity<>(temperature.getCtoF(celsius),HttpStatus.OK);   
    }

    @RequestMapping(method = RequestMethod.GET, path = "FahrenheitToCelsius/{fahrenheit}")
    public ResponseEntity<?> getFtoC(@PathVariable int fahrenheit) {
        return new ResponseEntity<>(temperature.getFtoC(fahrenheit),HttpStatus.OK);   
    }
}
