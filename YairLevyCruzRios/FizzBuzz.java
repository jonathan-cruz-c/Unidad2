public class FizzBuzz { // Definimos la clase principal llamada FizzBuzz
    public static void main(String[] args) { // Método main: punto de entrada del programa

        for (int num = 1; num <= 20; num++) { // Bucle for que recorre los números del 1 al 20

            // Verificamos si el número es divisible por 3 y 5 (caso especial de FizzBuzz)
            if (num % 3 == 0 && num % 5 == 0) { 
                System.out.println("FizzBuzz"); // Imprimimos "FizzBuzz" si cumple la condición
            } 

            // Si no es divisible por 3 y 5, verificamos si es divisible solo por 3
            else if (num % 3 == 0) { 
                System.out.println("Fizz"); // Imprimimos "Fizz" si es divisible solo por 3
            } 

            // Si no es divisible por 3, verificamos si es divisible solo por 5
            else if (num % 5 == 0) { 
                System.out.println("Buzz"); // Imprimimos "Buzz" si es divisible solo por 5
            } 
            else { // Si no es divisible ni por 3 ni por 5, imprimimos el número 
                System.out.println(num); // Mostramos el número tal cual
            } 
        } // Fin del bucle for
    } // Fin del método main
} // Fin de la clase FizzBuzz
