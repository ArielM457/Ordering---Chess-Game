# Ordering---Chess-Game
El presente proyecto es el ordenamiento de un tablero de ajedréz a traves del ordenamiento 
de numeros o caracteres cada pieza tiene una representacion tanto numerica como de caracteres
donde el programa ordenara en base al tipo de argumentos que seleccionemos, segun el color de las 
piezas con el que quiera empezar el usuario con el ordenamiento.

El código trabajado  cumple con la aceptación, validación y ejecución de
intrucciones según los argumentos que se deben  indicar en la modificacion de 
argumentos del main introduciendo los argumentos de la siguiente manera a=i t=c o=b in=r r=16 s=120 
Donde:

a: siendo el algoritmo mediante el cual se realizará el ordenamiento en mi caso
3 algoritmos de ordenamiento disponibles, entonces hay 3 opciones posibles en mayuscula
o minuscula "I" o "i", "Q" o "q" y "S" o "s" que representarán a los algoritmos inserción 
sort, quick sort o select sort, la validación de los argumentos se realiza en la clase 
VerificacionAlgoritmo. la validación de la existencia de un algoritmo de ordenamiento o 
de la existencia del argumento a se la hace en la interfáz AsignacionArgumentos. La elección 
de los algoritmos se la hace en la interfáz AlgoritmoOrdenamiento donde a través de un mapa
se escoge mediante el argumento pasado a la interfaz "algoritmo" cada algoritmo tiene su clase
la cual la implementa de la interfáz AlgoritmoOrdenamiento, en cada clase de los algoritmos se le
pasa el tiempo de ejecución para que se implemente en cada iteración y el arreglo a ordenar.


t: que representa al tipo de arreglo que se usará ya sea de caracteres o de números, teniendo
2 opciones posibles en mayúsculas y minúsculas, "n" o "N" y "c" o "C", se valida que sea la entrada
del argumentmnto correcto en la clase VerificacionTipo, y de la existencia del argumento o del tipo 
de arreglo que se tomará se hará en la clase AsignacionArgumentos, una vez validada se pasará el argumento 
al main y depués al moderador para que pase a la clase GeneradorArreglo donde se encuentran almacenados 
en un mapa la opción de creación de un arreglo de caracteres o un arreglo numérico, según el algoritmo 
se creará el arreglo y se lo devolverá a la clase moderadora para pasarla a la clase principal de impresión 
para que a través de un if se lo pasará al moderador que le corresponde habiendo 2, 
moderadorOrdenamientoCaracteres y moderadorOrdenamientoNumeros cada uno encargado del ordenamiento del arreglo .


o: Siendo la variable que definirá el tipo de ordenamiento, según el color que se le introduzca
a esta variable es como se ordenarán las piezas en el tablero, teniendo 2 opciones posibles en
mayúsculas y minúsculas, "b" o "B" y " W" o "w" que validan que sea el tipo de ordenamiento correcto,
esto se lo valida en la clase VerificacionTipoOrdenamiento y la verificación de la inexistencia del 
tipo de ordenamiento o de la existencia del argumento en la clase AsignacionArgumentos, este tipo de 
ordenamiento será pasado al main, depués a la clase moderadora ya la clase moderadora del ordenamiento c
orrespondiente, despues se la pasa a la clase ColorPiezas que pone el color correspondiente a las piezas 
es decir si la pieza es TORRE, "T" y el color es negro a todas las siglas de las piezas les agregará la
sigla "N" terminando todas las siglas de las piezas en la sigla del color


in: Que es la validadora de que se puedan introducir el numero de piezas, teniendo 1 valor posible
en mayúsculas y minúsculas, "r" o "R" cualquiera de otros valores de in puede validar que se escoja
el numero de piezas de lo contrario nos lanzaria un error desde la clase de excepciones segun corresponde 
que no exista el ValidadorNumeroPiezas o que tenga un valor incorrecto.


-r: Que será el número de piezas que recibirán para el arreglo teniendo valores determinados 
que son válidos, "1", "2", "4", "6", "8", "10", "16" siendo nuestros valores validos los cuales 
serán verificados de ser correctos en la clase VerificacionPiezas que verifica que el valor de
este argumento sea correcto, y la existencia del valor del argumento o de la existencia del argumento 
en la clase AsignacionArgumentos, una vez que sea validado será derivado a la clase principal, moderadora 
y finalmente a la interfáz GeneradorArreglo que le pasará el argumento del número de piezas al arreglo que 
será creado que a su vez creará el arreglo aleatorio con el número de piezas como límite.

-s: Siendo el tiempo en el cual se ordenará el arreglo es decir que el número que introduzcamos será 
el tiempo en el cual se haga una iteración y en un final gracias a un contador retornará el número de
iteraciones por el timepo que le pasamos, a diferencia de los otros argumentos este se hará en el 
moderadorOrdenamientoCaracteres o moderadorOrdenamientoNumeros, es decir antes del ordenamiento del arreglo, 
comprobando si el argumento existe o si tiene un valor válido diferente de null y entre 100 y 1000.

Entonces el funcionamiento del programa viene desde la validación de los argumentos que se realizará como
primer paso antes de ejecutar otras clases y procesos, si alguno de ellos es erróneo o no exíste como se 
mencionó antes se lanzará un error desde la clase ArgumentValidationException el cual contiene. 
las excepciones para cada caso de inexistencia o valor invalido del argumento, si se validan todos los
argumentos se los pasarán al main y después al moderador que creará el arreglo de caracteres o números según 
corresponda con el número de piezas que se le paso lo guardará en Object [] para después pasarlo a la 
ClasePrincipalImpresion, que según el tipo de argumento lo pasará a la clase moderadora según el tipo de arreglo 
que sea, en la clase moderadora se creará la instancia pasar los elementos del arreglo del tipo Object a String o 
entero según corresponde, este arreglo se lo convertira en la posicion que representa el numero del arreglo en el tablero es 
decir que si el valor es 3 pasará a valer 1 por que en el tablero la pieza 3 la Torre T es la que irá en la posicion
1 entonces a su vez cada pieza tendrá una posicion, convertiremos la matriz a esta matriz de posiciones y  
ese arreglo se pasará a la interfáz AlgoritmoOrdenamiento con el algoritmo de ordenamiento,  que
se usará, ejecutando el algoritmo de ordenamiento y el mismo que pasará el arreglo en su ordenamiento a la clase mostrar 
mostrarTablero que mostrará el estado del tablero con respecto del ordenamiento en proceso del algoritmo en esta clase 
se llamará a una clase la cual guardara en un mapa como indice el numero o caracter de la pieza en el arreglo y como valor
el elemento actual del arreglo, en la lista que retornara la sigla de la pieza, mostrando las piezas en la impresion de la
consola entonces por cada movimiento del ordenamiento, por cada iteracion se mostrará el tablero los cambios en la consola, 
si los elementos fueran menores a 8 entonces en el moderador se lo pasará a la clase CompletarTablero que nos ayudará a separar 
los espacios entre las piezas que existe por la falta de piezas en este sentido cada pieza se mostrará en la consola con un debido timepo 
y por cada iteracion segun el numero de piezas.
El funcionamiento se comprobó mediante los test y se muestran en las pruebas de
ejecución que están en los paquetes del programa.
