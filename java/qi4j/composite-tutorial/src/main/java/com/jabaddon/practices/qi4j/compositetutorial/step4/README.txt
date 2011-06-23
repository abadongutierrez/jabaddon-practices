Tutorial 4 - Concerns

En este tutorial se refactoriza el mixin de los anteriores pasos para que el resultado del metodo
say() sea modificado para agregarle un prefijo como "Simon dice:". Los Concerns son un tipo de
modificador el cual modifica el comportamiento de los metodos en los mixins. Los Concerns logran
esto interceptando las llamadas a los metodos de los TransientComposite. Esto les permite cambiar
los parametros de la invocacion, regresar su propio valor o tirar sus propias excepciones, y hacer
otras cosas que directamente afectan la llamada al metodo original.

Los Concerns no deben permitir algun efecto secundario (side-effect), tal como actualizar el estado
de algun otro TransientComposite, Mixin o algun similar. Cualquier efecto secundario se realiza via
los SideEffects, a los cuales si se les permite realizar efectos secundarios pero al contrario de
los Concerns no se les permite modificar los parametros o cuambiar el valor de regreso de la
invocacion a un metodo.

Los Concerns son implementados en una de dos formas: crear una clase que directamente implementa
la interfaz que tiene los metodos a ser interceptados, o crear un modificador generico implementando
la interfaz InvocationHandler (o heredando de GenericConcern el cual lo hace por uno). Agregar
una anotacion @ConcernFor, como un atributo, parametro de constructor o parametro de metodo, el cual
tiene el mismo tipo de la interfaz que el Concern implementa. Cuando algun metodo de un
TransientComposite es invocado el Concern sera llamado, permitiendo realizar su trabajo. Si la llamada
debe proceder, se llama al metodo del objeto injectado al Concern. El camino preferido para realizar
todo esto es heredando de ConcerOf el cual permite realizar esto.

Los Concerns son aplicados agregando la anotacion @Concerns a el TransientComposite, a la interface
de dominio, o a la implementacion del Mixin. Cualquiera de las anteriores formas funciona, y cual
usar depende del dise–o.

Pasos para el tutorial:

I. Crear un Concern, implementar la interfaz HelloWorldBehaviour y ahi modificar el resultado que
regresa el metodo say() anexando el prefijo "Simon dice:".
II. Agregar la anotacion @Concerns en el mixin HelloWorldBehaviourMixin el cual hace referencia
a la clase del Concern.

1. Crear una nueva clase llamada HelloWorldBehaviourConcern que hereda de ConcerOf<HelloWorldBehaviour>
e implementa la interfaz HelloWorldBehaviour. De esta forma esta clase tiene los mismos metodos del
tipo que intercepta y tiene acceso a el objeto del cual intercepta sus llamadas.
2. Se configura los Concerns que tendra el mixin HelloWorldBehaviourMixin agregando a la declaracion
de la clase una anotacion @Concers y especificando los Concerns que se desean. En este caso la clase
HelloWorldBehaviourConcern.class