Ejercicio: Juego del Ahorcado

Parte 1:
Implementar la clase Ahorcado que modele al juego del ahorcado. El juego consiste en que un jugador debe adivinar una palabra oculta arriesgando letras de a una. El usuario sólo puede equivocarse un máximo de 5 veces.

La clase Ahorcado debe tener la siguiente interfaz:

public Ahorcado(String palabraSecreta) 
Construye un Ahorcado en su estado inicial.

public boolean arriesgarLetra(char l) 
Permite arriesgar una letra. Si la letra está en la palabra, las próximas veces que se muestre el juego, se mostrarán todas las apariciones de la letra adivinada. Si no está, se deberá computar un intento fallido. El método devuelve verdadero si la letra estaba en la palabra secreta.

public void mostrar() 
Muestra el estado del juego (Excepto la palabra secreta!) 

public void arriesgarPalabra(String p) 
Permite arriesgar una palabra completa, de ser correcta el juego queda ganado, de no ser correcta el juego queda perdido.

public boolean terminado() 
Devuelve si el juego está terminado. 

public boolean ganado() 
Devuelve si el juego está ganado.

Parte 2: 
Una vez implementada la clase, programar una clase Juego que se encargue de usar un objeto de tipo Ahorcado y permitirle al usuario jugar al ahorcado desde la consola.


Parte 3:

Hay que tener en cuenta que al implementar el diccionario se debe recurrir al archivo "lemario.txt"
Dependiendo de donde se corra el programa hay que adaptar la clase Juego.

Para correr tal cual esta el código se debe poner al diccionario en la direccion "src/clase10/lemario.txt".

Otro metodo es ubicando a "lemario.txt" en la carpeta src del proyecto y cambiando la direccion del archivo a escanear en la clase Juego
En ese caso hay que cambiar File f=new File("src/clase10/lemario.txt"); a File f=new File("lemario.txt"); detro de palabraRandom().



