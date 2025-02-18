class Multi { // Nombre de la clase
    public static void main(String[] args) {// método principal
        for (int i = 0; i <= 100; i++) {//Ciclo que itera del 0 al 100
            if (i % 2 == 0) {// condicion que determina si es par
                System.out.println("Números pares: " + i);//imprime números pares
            }// Cierra if

            else if (i % 2 == 1) {//Determina si el número es impar
                System.out.println("Números impares: " + i);//Imprime los números impares

            }//cierra el else if
        }//cierra el for
    }//cierra el método main
}//Cierra la clase 