//Se pide:Imprimir los números del 1 al 20 con ciertas condiciones.
//Se crea una clase publica 
public class NumFizzBuzz {
//Se crea el metodo main.
public static void main(String [] args) {
//Se crea el bucle for para itnterar del 1 al 20.
for (int i = 1; i <= 20; i++) {
//Se crea la una declaracion if que genera la condicion si es divicible de 3 y 5.
if (i % 3 == 0 && i % 5 == 0) {
//Si se cumple, imprime FizzBuzz en vez del numero.
System.out.println("FizzBuzz");
//Se declara una condicion else if, si no se cumple la condicion pero si un numero es divicible por 3.
} else if ( i % 3 == 0) {
//Si se cumple esta nueva condicion, se impime solo Fizz.
System.out.println("Fizz");
//Se declara una nueva declaracion else if, ahora si el numero es divicible por 5.
} else if ( i % 5 ==0) {
//Si se cumple la condicion se imprime Buzz.
System.out.println("Buzz");
//Se declara else si nigun numero cumple las condiciones.
} else {
//Se imprime  el numero.
System.out.println(i);
}
}
}
} 


