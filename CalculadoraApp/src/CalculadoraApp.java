import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            menu();
            try {
                int operacion = Integer.parseInt(teclado.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                operaciones(operacion, teclado);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("La opcion " + operacion + " no es valida");
                }
            }
            catch(Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println("");
        }

    }
    //Funciones utilizadas
    private static void menu() {
        System.out.println("*** Aplicacion Calculadora ****");
        System.out.println("""
                    Elige la operacion:
                    1-Suma
                    2-Resta
                    3-Multiplicacion
                    4-Division
                    5-Salir
                     """);
    }

    private static void operaciones(int operacion, Scanner teclado) {
        System.out.print("Escribe la primera cantidad: ");
        var operando1 = Integer.parseInt(teclado.nextLine());
        System.out.print("Escribe la segunda cantidad: ");
        var operando2 = Integer.parseInt(teclado.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("El resultado es de la SUMA es " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("El resultado de la RESTA es " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("El resultado de la MULTI es " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("El resultado de la DIV es " + resultado);
            }
            default -> {
                System.out.println("La opcion " + operacion + " no es valida");
            }
        }
    }

} //fin clase
