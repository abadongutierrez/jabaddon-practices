Tutorial 2 - Creating a Composite

Una interface TransientComposite es aquella que junta todas las piezas. Es una interface comun y
corriente que extiende de aquellas interfaces que se desea exponer del modelo de dominio y las cuales
a su vez usan varias anotaciones que declaran los fragmentos que incluyen.

Los fragmentos puede ser: Mixins, Concerns, SideEffects y Constraints.

Pasos para el tutorial:

I. Crear una interface que extienda de la interface de dominio HelloWorld y
org.qi4j.api.composite.TransientComposite.
1. Se crea la interfaz HelloWorldComposite la cual extiende, como lo menciona el paso del tutorial,
de HelloWorld y de TransientComposite.
2. Se agrega la anotacion org.qi4j.api.mixin.Mixins a la interface HelloWorldComposite y esta
anotacion recibe como argumento un "value" que es la clase del Mixin que en este caso es
HelloWorldMixin
