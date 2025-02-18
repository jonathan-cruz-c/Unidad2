class TablasMultiplicar{// Nombre de la clase
    public static void main(String[] args) {// Metodo main
        for (int i = 1; i <= 10; i++) {// Bucle de los numeros 1 al 9
            System.out.println("Tabla de multipicar del " + i + ":");// Imprime lo que tendra la tabla
            for (int h = 1; h <= 10; h++) {// Bucle para multiplicar a cada numero del 1 al 10
                System.out.println(i + " x " + h + " = " + (i * h));// Imprime el resultado de la multiplicación
            }//Cierra el for
            System.out.println();// Salta una linea entre tablas
        }//Cierra for
    }//cierra el main
}//cierra la clase 