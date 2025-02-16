// Clase llamada Tabla
class Tabla {
    // Metodo principal main
    public static void main(String[] args) {
        // Bucle externo que controla el numero de la tabla de multiplicar
        for (int num = 1; num <= 9; num++) {
            // Imprime el encabezado de cada tabla de multiplicar
            System.out.println("Tabla del " + num + ":");
            // Bucle interno que genera la multiplicacion del numero actual (num) por los
            // valores del 0 al 10
            for (int i = 0; i <= 10; i++) {
                // Calcula el resultado de multiplicar i por el numero actual num
                int r = i * num;
                // Imprime el resultado
                System.out.println(i + " x " + num + " = " + r);
            }
            // Imprime una linea en blanco para separar las tablas de multiplicar
            System.out.println();
        }
    }
}