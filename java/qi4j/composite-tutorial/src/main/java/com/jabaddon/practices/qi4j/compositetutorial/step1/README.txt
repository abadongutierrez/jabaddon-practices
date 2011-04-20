Tutorial 1 - Interface refactoring

Qi4j se basa y promueve mucho el uso de interfaces. Esto hace posible que un objeto externamente
implemente un numero de interfaces las cuales internamente estan basadas en un numero de Mixins,
los cuales algunos podrian ser de reuso o escritos por uno mismo. Tambien hace posible introducir
modificadores (interceptores o advices), los cuales son "fragmentos" de codigo que se ejecutan 
antes o despues de un metodo de un Mixin.

Pasos para el tutorial:

I. Refactorizar la clase HelloWorld un una interface y su implementacion.
Solucion:
1. Se renombra la clase HelloWorld por HelloWorldImpl
2. Se crea una interfaz HelloWorld
3. Se hace que la clase HelloWorldImpl implemente la interfaz HelloWorld
4. Se hace un refactor "pull up" para mover los metodos setters, getters y say a la interfaz HelloWorld

II. Refactorizar la interfaz para que extienda de una interfaz llamada HelloWorldBehaviour que 
contenga con el comportamiento y otra llamada HelloWorldState que contenta el estado (get/set) 
1. Se crea la interfaz llamada HelloWorldBehaviour
2. Se crea la interfaz llamada HelloWorldState
3. Se mueve la definicion del metodo 'say' de la interfaz HelloWorld a HelloWorldBehaviour
4. Se mueven los setters y getters de la interfaz HelloWorld a HelloWorldState
5. Se hace que la interfaz HelloWorld herede de HelloWorldBehaviour y HelloWorldState

Se renombra la clase HelloWorldImpl a HelloWorldMixin para que la solucion sea parecida a la que
muestra la pagina de Qi4j.