//Se pide: Imprimir los números pares que hay dentro de los 100 primeros números enteros.
// Se crea la clase publica.
public class NumPares100 {
//Se crea el metodo main.
public static void main (String [] args) {
//Utilizamos el bucle for, intera desde el 0 al 100 aumentando de 1 en 1.
for (int i = 0; i <= 100; i++) {
//Se utiliza una condicion para saber si es par, utilizaremos modulo (%) para determinarlo.
if (i % 2 == 0) {
//Al final se imprime, solo si i es par.
System.out.println(i);
}
}
}
} 
 
