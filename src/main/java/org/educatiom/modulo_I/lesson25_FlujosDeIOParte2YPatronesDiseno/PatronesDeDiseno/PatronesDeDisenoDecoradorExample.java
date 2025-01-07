package org.educatiom.modulo_I.lesson25_FlujosDeIOParte2YPatronesDiseno.PatronesDeDiseno;

public class PatronesDeDisenoDecoradorExample {

    public static void main(String[] args) {


                            //Clasificación de los Patrones de Diseño
        /*
        *   Tipo de patrón	                     Aplicación
                Creador	                Un tipo que resuelve el problema de creación de objetos
                Estructural	            Patrones que nos permiten construir una jerarquía de clases correcta y extensible en nuestra arquitectura
                Conductual	            Este conjunto de patrones facilita una interacción segura y conveniente entre los objetos en un programa.*/


                            //Propósito de los Patrones de Diseño
        /*        Patrón	                Propósito
                Singleton	        Ya estamos familiarizados con este patrón: lo usamos para crear y acceder a una clase
                                    que no puede tener más de una instancia.
                Iterator	        También estamos familiarizados con este patrón. Sabemos que nos permite iterar sobre
                                    un objeto de colección sin revelar su representación interna. Se usa con colecciones.
                Adapter	            Este patrón conecta objetos incompatibles para que puedan funcionar juntos. Creo que
                                    el nombre del patrón de adaptador te ayuda a imaginar exactamente lo que hace.
                                    Aquí hay un ejemplo sencillo de la vida real: un adaptador USB para un enchufe
            Méthod de plantilla     Un patrón de programación de comportamiento que resuelve el problema de integración
                                    y permite cambiar los pasos algorítmicos sin cambiar la estructura del algoritmo.
                                    Imagina que tenemos un algoritmo de ensamblaje de automóviles en forma de una
                                    secuencia de pasos de ensamblaje:
                                    Chasis -> Carrocería -> Motor -> Interior de la cabina
                                    Si colocamos un marco reforzado, un motor más potente o un interior con iluminación
                                    adicional, no tenemos que cambiar el algoritmo, y la secuencia abstracta sigue
                                    siendo la misma.
               Decorador        	Este patrón crea envoltorios para objetos para darles funcionalidad útil. .*/



                                            //Patron Decorador
        /*Un decorador tiene una implementación súper sencilla y cambia dinámicamente los objetos, mejorándolos. Los
        decoradores se pueden reconocer por sus constructores, que aceptan como parámetros objetos del mismo tipo
        abstracto o interfaz que la clase actual. En Java, este patrón se utiliza ampliamente en las clases de I/O.*/

        /*Ejemplo: Inicialmente, tenemos la opción de varios tipos de casas. La configuración mínima es una planta con
        un techo. Luego usamos todu tipo de decoradores para cambiar parámetros adicionales, lo que naturalmente afecta
        el precio de la casa.
        Por ejemplo, como ya hemos señalado, todas las subclases de java.io.InputStream, OutputStream, Reader y Writer
        tienen un constructor que acepta objetos de las mismas clases.*/

        //Ejemplo. Implementar el sighuiente ejercicio. Diagrama UML (Este patron comienza en la clase House).

        /*
        *         +----------------+
                  |     House      |
                  +----------------+ <--------------------------------------------------------------------------relation
                  | + getInfo()    |  1                                                                             |
                  | + getPrice()   |                                                                                |
                  +----------------+                                                                                |
                           ^                                                                                        |
                           |                                                                                        |
                        Extends                                                                                     |
                           |                                                                                        |
     +---------------------+----------------------+--------------------------------------------+                    |
     |                                            |                                            |                    |
+-------------+                          +------------------+                        +------------------+           |
| BrickHouse  |                          | WoodenHouse      |                        | HouseDecorator   |           |
+-------------+                          +------------------+                        +------------------+ <>---------
| + getInfo() |                          | + getInfo()      |                        |                  |  0.1
| + getPrice()|                          | + getPrice()     |                        +------------------+
+-------------+                          +------------------+                                   ^
*                                                                                               |
                                                                                             Extends
                                                                                                |
                                                                          +---------------------+----------------------+
                                                                          |                                            |
                                                                 +------------------+                        +------------------+
                                                                 | SecondFloor      |                        | Garage           |
                                                                 +------------------+                        +------------------+
                                                                 | + getInfo()      |                        | + getInfo()      |
                                                                 | + getPrice()     |                        | + getPrice()     |
                                                                 +------------------+                        +------------------+

Relations:
- `HouseDecorator` has a relation (0..1) with `House`.

        *
        *
        *
        * */
    }
}
