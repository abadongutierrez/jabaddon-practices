Tutorial 3 - Mixins

En este tutorial se reafactoriza el Mixin para dividirlo en dos, uno que sirva el estado del objeto
y otro el comportamiento. De esta forma se pueden reutilizar las interfaces independientemente y
hace posible en intercambio de implementaciones.

Pasos para el tutorial:

I. Refactorizar el Mixin en uno que contenga el comportamiento y otro que contenga el estado. Usando
la injeccion @This para permitir al comportamiento acceder al estado.
II. Agregar la anotacion @Mixins a las interfaces de comportamiento y estado para declarar los Mixins
como implementacion default.
III. Remover la anotacion @Mixins de la interface TransientComposite. 


1. Crear una clase HelloWorldStateMixin que implemente HelloWorldState.
2. Agregar @Mixins(HelloWorldStateMixin.class) a la interface HelloWorldState.
3. Crear una clase HelloWorldBehaviourMixin que implemente HelloWorldBehaviour
4. Agregar @Mixins(HelloWorldBehaviourMixin.class) a la interface HelloWorldBehaviour.
5. Borrar la clase HelloWorldMixin ya que no se utiliza.
