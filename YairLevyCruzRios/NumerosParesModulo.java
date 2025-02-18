public class NumerosParesModulo {  // Definimos la clase principal llamada NumerosParesModulo
    public static void main(String[] args) { // Método main: punto de entrada del programa
        for (int num = 1; num <= 100; num++) { // Bucle for que inicia en 1 y avanza de 1 en 1 hasta 100
            if (num % 2 == 0) { // Verificamos si el número es par (su residuo al dividirlo entre 2 es 0)
                System.out.println(num); // Si es par, lo imprimimos en la consola
            } //llave de cierre del if
        } //llave de cierre del for
    } //llave de cierre del main
} //llave de cierre de la clase
