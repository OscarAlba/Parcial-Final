

/* global getTemperature, axios */

function celsius(id) {
    axios.get('temperature/CelsiusTofahrenheit/' + id)
            .then(function (result) {
                $("#texto").text(result.data.Celsius+"°C es igual a "+result.data.Fahrenheit+ "°F");
            })
            .catch(function (error) {
                errorMessage();
                console.log(error);
            });

}

function fahrenheit(id) {
    axios.get('temperature/FahrenheitToCelsius/' + id)
            .then(function (result) {
                $("#texto").text(result.data.Fahrenheit+"°F es igual a "+result.data.Celsius+" °C");
            })
            .catch(function (error) {
                errorMessage();
                console.log(error);
            });
}

function errorMessage() {
    alert("There is a problem with our servers. We apologize for the inconvince, please try again later");
}
 