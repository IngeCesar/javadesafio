import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion =  0;

        System.out.println("****************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + "L. " + saldo);
        System.out.println("\n****************************************");
        
        String menu = """
                *** Escriba el número de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Su saldo actualizado es: " + "L. " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo >= valorARetirar){
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldo);
                    }
                    else {
                        System.out.println("Su saldo es insuficiente para retirar esa cantidad.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    double valorADepositar = teclado.nextDouble();
                    saldo = saldo + valorADepositar;
                    System.out.println("El saldo actualizado es: " + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del sistema, vuelva pronto");
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese una de las opciones que se ofrecen");

            }
        }
    }
}
