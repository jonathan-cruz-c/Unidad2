//Se pide:Tabla de multiplicar del 7. Utilizando el bucle for, mostrar la tabla de multiplicar del número 7.
//Secrea la clase publica.
public class TablaMul7 {
//Se crea el metodo principal.
public static void main(String[] args){
//Se crea la variable de numero entero
int num1 = 7;
//Se  crea el bucle for, para interar del 1 al 10 para la multiplicacion
for (int i=1; i <= 10; i++) {
//Se crea una variable, que es el resultado.
int r = num1 * i;
//Se imprime la tabla de multiplicacion del 7.
System.out.println( num1 + "x" + i + "=" + r);
}
}
}
