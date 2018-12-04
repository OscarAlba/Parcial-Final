

/* global getTemperature, axios */

var RestControllerModule = (function (){
    
    var getCelsiusTofahrenheit = function (id, callback){
        axios.get('temperature/CelsiusTofahrenheit/'+id)
            .then(function (consult){
                callback.onSuccess(consult.data);
            })
            .catch(function (error){
                callback.onFailed(error);
            });
    };
    
    var getfahrenheitToCelsius = function (id, callback){
        axios.get('temperature/FahrenheitToCelsius/'+id)
            .then(function (consult){
                callback.onSuccess(consult.data);
            })
            .catch(function (error){
                callback.onFailed(error);
            });
    };
    
    return {
        getCelsiusTofahrenheit: getCelsiusTofahrenheit,
        getfahrenheitToCelsius: getfahrenheitToCelsius
    };
})();