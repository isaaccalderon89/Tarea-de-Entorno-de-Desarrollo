![git](https://it-junior.by/storage/photos/1/blog/GIT_tutorial_for_beginers.png)
# GIT 
***
Git es un sistema de control de versiones diseñado por **Linus Tolvar**. 

### Características más importantes
1. Gestión distribuida. 
2. Libre y de código abierto. 
3. Rápido y pequeño. 
4. Ramificación sencilla. 

## Descarga e instalación
Lo primero que debemos hacer es decargar **Git** en nuestro ordenador.
Una vez intalado, con el siguiente comando podemos verificar la instalación y ver la versión de GIT.

        git --version


## Flujo de trabajo 

Tenemos 3 secciones de trabajo dentro de un proyecto Git, una cuarta en caso de que queramos trabajar de manera colaborativa. 
* **Directorio de trabajo o WorkSpace**. La capeta que contiene los ficheros con los que vamos a trabajar.
* **Stage, area de preparación o Index**. Zona intermedia entrel WorkSpace y el repositorio local.
* **Repositorio local o directorio de Git**. Es donde se almacenan los metadatos y la base de datos de tu proyecto. 
* **Repositorio remoto**. Donde se persistirá la información de todos los repositorios locales de nuestro proyecto. 
 
## Comandos de configuración inicial
        git config --global user.name "NOMBRE QUE USAREMOS EN GIT"
        git config --global user.email "correo@electronico.com"

## Comandos básicos
        git init / Para crear un repositorio local
        git status / Para ver el estado de nuestro espacio de trabajo
        git add nombre_fichero / Para añadir ficheros al stage
        git add . / Para añadir todos los ficheros al stage
        git restore --staged nombre_fichero / Para quitar los ficheros del stage 
        git commit -m "descripcion del commit" / versionar los cambios
        git log / para ver todo el historial de cambios. Si queremos cerrar
                    el histórico debemos pulsar la tecla q
        git diff / para ver los cambios en nuestro repositorio local
        git restore nombre_fichero / eliminar cambios hechos en el WS
        git restore . / para eliminar todos los repositorios
        git checkout mensaje_hash / Para ver a cualquier foto de nuestro poryecto
        git log --all / para mostrar todos los commits
        git checkout master / para regresar al último commit de la rama principal
        git show mensaje_hash / para ver los detalles de los commit 
        git commit -am "descripción" / unir un "add" y "commit en una sola sentencia". Solo vale para cambios sirve ficheros ya versionados. 
        
## Ramas 
Una **rama o branch**  se crea para ejecutar una nueva línea de desarrollo o versión. Tiene por defecto la rama **main**.
Las ramas en git son simplemente punteros o referencias que apuntan a un commit. 

### Head
**Head** es una referencia o puntero a la rama donde te encuentras en cada momento, donde este apuntando el head , será **el commit con el que estamos trabajando**.

## Comando para trabajar con ramas

        git checkout -b nombre_rama / crea la rama y nos cambia a dicha rama 
        git branch nombre_rama / crea pero pertenecemos en la actual
        git branch -d nombre_rama / Para borrar una rama
        gitk / herramienta visual para poder ver los commit
        gitk --all / para ver todos los commit 
        git merge rama_fusionar / fusionar dos ramas de desarrollo paralelo 
        git tag version / para poder crear estiquetas en los commit
        git checkout version / para volver a la version que queramos
        
![git](https://blog.ida.cl/wp-content/uploads/sites/5/2018/08/Por-que-usamos-git.png)