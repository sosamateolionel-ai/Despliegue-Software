# Proyecto Software

Programa en Java que modela el ciclo de vida de un proyecto de software, permitiendo avanzar entre distintas fases hasta llegar al despliegue.

## Funcionalidad

- Clase `ProyectoSoftware` que representa un proyecto asociado a un cliente/empresa, con una fase actual que inicia en 1 (Análisis).
- Método `avanzarFase()` que incrementa la fase en 1 hasta un máximo de 3, informando el nuevo estado o notificando que ya se alcanzó la fase final.
- Método `obtenerEstado()` que traduce el número de fase a su nombre correspondiente (Análisis, Desarrollo, Despliegue) mediante un `switch`.
- Método `mostrarEstado()` que imprime un resumen del proyecto (nombre, cliente y fase actual).
- Ejemplo de uso en `main`, avanzando el proyecto a través de sus tres fases.

## Ejemplo de salida

<img width="747" height="267" alt="image" src="https://github.com/user-attachments/assets/4223b456-184f-49af-b8d3-c3cdad66a285" />


## Tecnologías

- Java (sin dependencias externas)
