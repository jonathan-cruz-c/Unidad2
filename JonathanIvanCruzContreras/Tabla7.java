// Clase llamada Tabla7
class Tabla7 {
    // Metodo principal main
    public static void main(String[] args) {
        // Imprime el encabezado de la tabla
        System.out.println("Tabla de multiplicar del 7:");
        // Bucle for que genera la tabla de multiplicar del 7, desde 0 hasta 10
        for (int i = 0; i <= 10; i++) {
            // Calcula el resultado de multiplicar
            int r = i * 7;
            // Imprime el resultado
            System.out.println(i + " x 7= " + r);
        }
    }
}