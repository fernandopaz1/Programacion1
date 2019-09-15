Ejercicios recursion con String

1. Escribir una función int longitud(String s) que devuelve la longitud de la cadena s. No vale usar length(). Hacer primero la función auxiliar resto(String s) que devuelva toda la cadenas menos el primer caracter (hacerla sin recursión por ahora).

2. Escribir una función recursiva llamada void imprimirEspaciado(String s) que imprima la cadena s con un espacio luego de cada caracter. Por ejemplo, imprimirEspaciado(“Juan”) muestra por pantalla "J u a n ".

3. Escribir una función que tome una cadena como parámetro y la imprima por consola intercalando un ’∗’ entre cada letra (pero no al final de la misma). Por ejemplo, si la función toma la cadena ”hola” como parámetro, deberá imprimir ”h∗o∗l∗a”.

4. Escribir la función recursiva String reverso(String s) que devuelva el String que resulta de invertir todos los caracteres de s. Por ejemplo, reverso("casa") devuelve "asac".

5. Escribir la función recursiva String combinar(String s, String t) que devuelva el String que resulta de comparar s y t caracter a caracter y colocar el menor de ellos en el resultado. Si un string es más largo que el otro, el resto de ese string se agrega al final del resultado. Ejemplos:

combinar(“abd”, "bbc") devuelve "abc"
combinar(“fgd”, "adfxgtgs") devuelve "addxgtgs"

6. Implementar el método boolean esAbecedaria(String s) que indica si s es una palabra "abecedaria". Una palabra se dice que es "abecedaria" si las letras en la palabra aparecen en orden alfabetico. Por ejemplo, la siguientes son todas palabras abecedarias del castellano. adios, afín, año, ágil, bello, celos, cenó, chinos dijo, dimos, dios, fijos, finos, hijos, hilos, himno
