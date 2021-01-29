# Run Length Encoding

La codificación de longitud de ejecución (RLE) es una forma muy simple de compresión de datos en la que las ejecuciones de datos (es decir, las secuencias en las que ocurre el mismo valor de datos en muchos elementos de datos consecutivos) se almacenan como un valor y recuento de datos únicos, como la ejecución original. 

El objetivo es escribir una codificación de longitud de ejecución. Para una cadena dada, devuelva un array de pares [(i1, s1), (i2, s2),…, (in, sn)], de modo que se pueda reconstruir la cadena original replicando el carácter sx ix veces y concatenando todas esas cadenas. Su codificación de longitud de ejecución debe ser mínima, es decir. para todo i, los valores si y si + 1 deberían diferir.

## Ejemplos

RLE.encode("¡hola mundo!")
   [(1, 'h'), (1, 'e'), (2, 'l'), (1, 'o'), (1, ''), (1, 'w') , (1, 'o'), (1, 'r'), (1, 'l'), (1, 'd'), (1, '!')]

RLE.decode(new Tuple(8,'a'), new Tuple(3,'b'))
	"aaaaaaaabbb"
