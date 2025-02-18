class FizzBuzz { // Nombre de la clase
    public static void main(String[] args) { // Metodo principal mas importante 
        for (int i = 1; i <= 20; i++) { // Utilizamos un bucle for que recorra los números del 1 al 20 
            if (i % 3 == 0 && i % 5 == 0) { // Utilizamos la condición if para verificar si el número es divisible por 3 y 5
                 System.out.println("FizzBuzz"); // Si es divisible por 3 y 5 imprimimos FizzBuzz
            } else if (i % 3 == 0) {// Si es divisible por 3 pero no por 5 imprimimos Fizz  
                System.out.println("Fizz");// Si es divisible por 5 pero no por 3 imprimimos Buzz    
            } else if (i % 5 == 0) { // Si no es divisible por 3 ni 5 imprimimos el número
                System.out.println("Buzz");// Si no es es divisible imprime Buzz
            } else {//Condicion else 
                 System.out.println(i);//Imprimimos i 
            }//Cierra el if 
        }//cierra for
    }//cierra el método y main 
}//cierra class 