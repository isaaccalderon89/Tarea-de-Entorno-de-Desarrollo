# Tarea AD-2 JavaDoc y JUnit

A continuacion, voy a mostrar el enuciado pedido en la actividad. 

**Requerimiento 1**
Documentar y hacer las pruebas unitarias de la siguiente clase. 

            public class Soldado {
                private boolean estasMuerto; 
                private int numeroBalas;
                /*Crear los métodos "get" y "set" de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no apotan nada. */
                        
                public boolean puedeDisparar(){
                        if(this.numeroBalas >0){
                            return true; 
                        }
                        return false;
                }
                public void disparar(Soldado sol){
                    this.numeroBalas--;
                    sol.estaMuerto = true;
                }
            }

Valoración: 5 puntos sobre 10

**Requerimiento 2** 
Documentar y hacer las pruebas unitarias de la siguiente clase. 

			public class Jugador{
				private int dorsal;
				private int numeroTarjetasAmarillas;
				private int numeroTarjetasRojas;
			/*Crear los métodos "get" y "set" de los atributos cuando se vayan a hacer las pruebas y la documentación. Aquí no se han creado porque no apotan nada.
			*/
				public void ponerDorsal(int dorsal){
						if(dorsal)>=1 && dorsal <=30){
								this.dorsal = dorsal;
						} else{
								this.dorsal = -1;
						}
				}
			}

Para comenzar vamos a organizar la tarea de la siguiente manera, vamos a crear las clases en [Eclipse](https://www.eclipse.org/downloads/),  vamos a generar la documentacion de la clase **Soldado** y **Jugador** con [JavaDoc](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html), y posteriormente vamos a realizar las pruebas unitarias con [JUnit5](https://junit.org/junit5/).

*** 
![JavaDoc](https://www.konakart.com/wp-content/uploads/2014/11/javadoc.png) 

## Comenzamos 

* Creamos la clase donde vamos a realizar la tarea :

![Creacion actividad](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/im1.PNG)

* Creamos la clase :
* 
![Clase](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/im2.PNG)

En este caso, hemos creado  los *constructores y los getters and setters* no los hemos comentado porque el ejercicio no nos lo solicia. 
Empezamos por comentar la clase. Usamos las siguientes etiquetas: 

* **@author**. Con esta etiqueta estamos indicando el desarrollador de la clase. 
* **@since**. Se usa prinicpalmente en método, indica desde cuando está creada la clase. 
* **@version**. Indica la versión de la clase. 

![comentario de la Clase soldado](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/im3.PNG)    

Seguimos comentando los atributos. He puesto la etiqueta **@return**, no estoy muy seguro de si se puede poner en los atributos, he revisado la documentación y he visto que dice que la etiqueta **@return** no se puede usar en constructores o métodos *"void"*. 

![atributos](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/im4.PNG)

Pasamos a comentar ahora los métodos que aparecen en el ejercicio. 
En el primer método hemos hecho una breve descripcion del metodo, hemos utilizado la etiqueta **@return** indicando los valores de retorno y su significado. 
En el segundo método hemos hecho un resumen también, hemos utilizado la etiqueta **@param** para indicar que parámetros le hemos pasado. En este caso no utilizamos la etiqueta *@return* porque al ser de tipo *void* no devulve nada. 

![metodos](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/im5.PNG)  


Ahora vamos a comentar la siguiente clase que pedía la actividad, la clase **Jugador**.

Comentamos y tulizamos las mismas etiqueta que en la clase anterior:
* **@author**. Con esta etiqueta estamos indicando el desarrollador de la clase. 
* **@since**. Se usa prinicpalmente en método, indica desde cuando está creada la clase. 
* **@version**. Indica la versión de la clase. 

![clase Jugador](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/im6.PNG) 

Comentamos los atributos, en este caso no hemos puesto ninguna etiqueta por hacerlo algo mas diferente. 

![atributos](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/im7.PNG) 

Hemos puesto un comentario multinea en los constructores indicando lo que se puede leer en imagen. 

![constructores](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/im8.PNG) 

Hemo hecho lo mismo con los *Getters and Setters*.

![Getters and Setters](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/im9.PNG)

Ahora comentamos los métodos. 

En el primer método utilizamos la etiqueta **@param** y la etiqueta **@author**  para indicar los parámetros y el autor del método. 
En el segundo utilizamos la etiqueta **@return** para indicar que es lo que devuelve el método. En ambos hemos hecho una breve descripción del método. 
![métodos jugador ](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/im10.PNG)

Una vez finalizado el tema de la documentación procedemos a realizar las pruebas unitarias. 

***

![junit5](https://upload.wikimedia.org/wikipedia/commons/5/59/JUnit_5_Banner.png)  


Pruebas unitarias de lo que pide el ejercicio. 

Lo primero que hacemos es crear una carpeta que llamaremos *test*. 

![Junit](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/ju1.PNG) 

Configuramos el *BuildPaht*.

![ju2](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/ju2.PNG) 

Empezamos haciendo la prueba del metodo **puedeDispara()** de la clase **Soldado**. En este caso vamos a realizar tres pruebas. Si el **numeroBalas** es superior, igual o inferior a 0. Despues, probaremos las clase **estasMuerto()**

![pruebas](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/ju4.PNG)

Procedemos a realizar las pruebas unitarias de la clase **Jugador**. En este caso, vamos a realizar tres purebas con el dorsal, un número que sea entre 1 y 30, un número mayor de 30 y otro numero por debajo o igual de 1. 
Al realizar la prueba del número mayor de 30 observamos que nos marca un fallo, por lo que podemos decir que el código no es correcto. 

![fallo](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/ju5.PNG)

Observamos lo mismo en el caso de meterle un numero inferior a 1. 

![numeromenor](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/ju6.PNG) 

Vamos haciendo las pruebas con el resto de métodos y ya finalizamos. 

![prubaFinal](file:///C:/Users/admin/Desktop/iconografia/Entornos%20de%20desarrollo/javadoc/ju7.PNG)  


He hecho un par de moficaciones y vemos que al final las pruebas estan correctas. Pero como verredicto final tendriamos que revisar el código y ver porque no cumple como debería. 
