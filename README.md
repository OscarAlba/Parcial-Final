# Parcial-Final

La arquitectura de esta API consta de Una capa de persistencia en donde se definen como van a ser calculados los grados °C a grados °F,
luego una clase llamada Service, implementa estos metodos para asi dar el servicio al controlador el cual es el que se contacta finalmente
con la vista. Este seria el componente grueso de la aquitectura, despues un cliente web mediante javascript se conecta y le hace peticiones
get a esta API y asi poder mostrar al cliente el resultado.
