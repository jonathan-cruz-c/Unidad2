public class TablaMultiplicar { // Definimos la clase principal llamada TablaMultiplicar
    public static void main(String[] args) { // Método main: punto de entrada del programa

        int numero = 7; // Declaramos una variable llamada "numero" y le asignamos el valor 7

        // Bucle for que recorre los valores del 1 al 10
        for (int i = 1; i <= 10; i++) {  
            int resultado = numero * i; // Calculamos el producto de 7 por el valor actual de i
            System.out.println(numero + " x " + i + " = " + resultado); // Mostramos el resultado en pantalla
        } // Fin del bucle for

    } // Fin del método main
} // Fin de la clase TablaMultiplicar
