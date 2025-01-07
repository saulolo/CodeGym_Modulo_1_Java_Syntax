package org.educatiom.modulo_I.lesson20_SingletonInterruptorYEnum;

import java.io.Serializable;

public class SingletonExample implements Serializable {

    //Singleton
    /*Es un patron de diseño que nos asegurar crear una unica instancia de una clase.*/

    /*Formas de crear un Singleton.
    * - Usar un constructor privado.
    * - Exponer un method público estático para proporcinar acceso a una única instancia. */

    //A. Con Constructor Private
    /*1. Declaramos un campo como final y private para que sea inmutable y lo inicializamos, o sea queno pertenezca a ningun objeto
    * sino a la variable en si.*/
    public static final SingletonExample PRINTER = new SingletonExample();

    //2. Declaramos un constructor como private para evitar la creación de objetos fuera de la clase.
    //El constructor solo se llamará una vez durante la inicialización.
    private SingletonExample() {
    }

    //B. Con un Method
    /*B.1. Creamos un SINGLETON utilizando un method estatico para proporcionar acceso a una unica instancia de la clase.
    * tener en cunata que el campo debe de ser privaddo en esta segunda opción, asi:
    *     private static final SingletonExample PRINTER = new SingletonExample();*/
    public static SingletonExample getInstance() {
        return PRINTER;
    }

    /*3. Si neceistamos serialización debemoos a parte de utilizar la interfaz Serializable, debemos agregar el
    * method readResolve, este method nos permite obtener el mismo objeto que deserializamos, evitando asi la creación
    * de singletons no autorizada..
    * Nota: Serialización es guardar el estdo de un objeto como una secuencia de bytes.
    * Deserialización: restaura el objeto a partior de esos bytes.*/
    public Object readResolve() {
        return PRINTER;
    }

    /*Nota: El singleton en la clase enum viene ya implementado. Si no se necesita implementar la herencia lo mejor es
    * utiizar el patrón singleton con los enums ya que este enfoque de implementacón nos brinda comodidad, compacidad,
    * serialización integrada, protección contra ataques de reflexión y singularidad.*/

    /*Comparación Construcción Singleton
    * CONSTRUCTOR PRIVADO                               METHOD ESTÁTICO
    * - Más fácil y conciso.                            - Puede ser usado con una referencia de method.
    * - La API es obvia ya que el campo singleton es    - Puede ser usado para escribir una fábrica genérica de singletons.
    *   public final.                                   - Puede ser usado para devolver una instancia separada para cada usuario.
    *  */
}
