public class TablasForAnidados { // Definimos la clase principal llamada TablasMultiplicar
    public static void main(String[] args) { // Método main: punto de entrada del programa

        // Bucle externo: Recorre los números del 1 al 9 (las tablas de multiplicar)
        for (int num = 1; num <= 9; num++) { 
            System.out.println("Tabla del " + num + ":"); // Imprimimos el encabezado de la tabla

            // Bucle interno: Multiplica el número actual (num) por los valores del 1 al 10
            for (int i = 1; i <= 10; i++) { 
                int resultado = num * i; // Calculamos la multiplicación
                System.out.println(num + " x " + i + " = " + resultado); // Mostramos el resultado
            } // Fin del bucle interno

            System.out.println(); // Agregamos una línea en blanco para separar las tablas
        } // Fin del bucle externo

    } // Fin del método main
} // Fin de la clase TablasMultiplicar
