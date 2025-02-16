// Clase llamada Numeros
class Numeros {
    // Metodo principal main
    public static void main(String[] args) {
        // Bucle for que recorre los numeros del 1 al 20
        for (int i = 1; i <= 20; i++) {
            // Verifica si el numero es divisible entre 3 y 5 al mismo tiempo
            if (i % 3 == 0 && i % 5 == 0) {
                // Imprime "FizzBuzz" si es divisible de ambos
                System.out.println("FizzBuzz");
                // Verifica si el numero es divisible de 3
            } else if (i % 3 == 0) {
                // Imprime "Fizz" si es divisible de 3
                System.out.println("Fizz");
                // Verifica si el numero es divisible de 5
            } else if (i % 5 == 0) {
                // Imprime "Buzz" si es divisible de 5
                System.out.println("Buzz");
                // Si no es divisible de 3 ni de 5
            } else {
                // Imprime el numero tal cual
                System.out.println(i);
            }
        }
    }
}