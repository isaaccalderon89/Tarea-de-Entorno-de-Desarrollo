![Javadoc](https://res.infoq.com/presentations/java-evolution-performance/en/slides/sl10.jpg)
# JavaDoc
***

JavaDoc es una utilidad de Oracle para la generación de documentación. Es el estándar de la industria para documentar clases Java. 

El objetivo de JavaDoc es el proporcionador información a otro desarrolladores de como utilizar nuestras clases y métodos. Si la documentación está bien hecha, podemos hacer las pruebas unitarias sin necesidad de entender el código. 

El JavaDoc se crea dentro de las clases java y tendrá la siguiente forma:
        
        /**
        * Documentación
        *
        * @Anotaciones
        */

        
## @Anotaciones en JavaDoc

El Objetivo de las anotaciones es la de enriquecer la documentación. Ma

* **@author**. Nombre del autor. 
* **@version**. Versión del método o clase. 
* **@param**. Definición de un parámetro de entrada de un método, es requerido para todos los parámetros del método. 
* **@return**. Informar de lo que devuelve el método, no se puede usar en métodos constructores o métodos *"void"*. 
* **@throws**. Excepción lanzada por el método, primero la clase y luego la excepción. 
* **@see**. Asocia con un elemento externo como un método o cualquier elemento externo en la red. Tembién se puede usar la equita *@link*.
* **@since**. Usado principalmente para los métodos. Nos dice desde que versión de la clase se encuentra en dicho método. 
* **@link**. Para crear un hipervinculo sobre el texto dentro del mismo programa. 
* **@deprecated**. Indica que la clase o el método es antigua y no recomienda su uso

Se puede poner HTML para enriquecer el formato. 

### Documentación de una clase

Son importantes anotaciones como **@author** o **@version**. 

            *poner ejemplo de la tarea. 



### Documentación de un método

Son importantes las anotaciones **@param** y **@return**. Puede haber varios **@param**, pero como máximo habrá un solo **@return** (y no lo habrá en caso de que el método devuelva **void**). Los setter y los getter normalmente no se comentan. 

            *poner ejemplo de la tarea.


### Documentación de constructores

No se puede poner la anotación **@return** ya que los constructores no devuelven nada. 

### Generar documentación de manera autómatica (HTML)