//Se pide: Mostrar la tabla de multiplicar de los números del 1 al 9. Usaremos dos bucles anidados.
//Se crea la clase publica.
public class TablasMultiplicar{
//Se crea el metodo principal.
public static void main(String[] args) {
//Se crea un bucle for para iterar del 1 al 9.
for (int i = 1; i <= 9; i++) {
//Se crea un segundo bucle for, para la multiplicacion.
for (int j = 1; j <= 10; j++) {
//Se crea una variable tipo entero para el resultado.
int g = i * j;
//Se imprime las tablas de multiplicar del 1 al 9.
System.out.println(i + "x" + j + "=" + g);
}
System.out.println("________________________________");
}
}
}
