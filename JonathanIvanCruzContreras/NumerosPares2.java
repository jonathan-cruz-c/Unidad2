// Clase llamada NumerosPares2
class NumerosPares2 {
    // Metodo principal main
    public static void main(String[] args) {
        // Bucle for que inicia en 0 y termina en 100, incrementa de 1 en 1
        for (int i = 0; i <= 100; i++) {
            // Verifica si el numero actuar i es par
            if (i % 2 == 0) {
                // Si el numero es par lo imprime
                System.out.println(i);
            }
        }
    }
}