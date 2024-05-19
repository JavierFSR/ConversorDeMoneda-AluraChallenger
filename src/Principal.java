import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaTasa consulta = new ConsultaTasa();
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;

        String menu = """
                \n***********************************************
                     Bienvenido/a Al Conversor De Monedas 
                ***********************************************          
                *** Escriba el numero de la opccion deseada ***
                \n1- Dolar =>> Peso Argentino.
                2- Peso Argentino =>> Dolar.
                3- Dolar =>> Real Brasileño.
                4- Real Brasileño =>> Dolar.
                5- Dolar =>> Peso Colombiano.
                6- Peso Colombiano =>> Dolar.
                7- Peso Méxicano =>> Dolar.
                8- Dolar =>> Peso Méxicano.
                9- Salir.
                Elija Una Opcion Valida:
                ************************************************
                """;

        while (opcion != 9) {
            System.out.println(menu);
            opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                    ConvertidorDeMoneda.conversionMoneda(consulta, lectura, "USD", "ARS");
                    break;
                case 2:
                    ConvertidorDeMoneda.conversionMoneda(consulta, lectura, "ARS", "USD");
                    break;
                case 3:
                    ConvertidorDeMoneda.conversionMoneda(consulta, lectura, "USD", "BRL");
                    break;
                case 4:
                    ConvertidorDeMoneda.conversionMoneda(consulta, lectura, "BRL", "USD");
                    break;
                case 5:
                    ConvertidorDeMoneda.conversionMoneda(consulta, lectura, "USD", "COP");
                    break;
                case 6:
                    ConvertidorDeMoneda.conversionMoneda(consulta, lectura, "COP", "USD");
                    break;
                case 7:
                    ConvertidorDeMoneda.conversionMoneda(consulta, lectura, "MXN", "USD");
                    break;
                case 8:
                    ConvertidorDeMoneda.conversionMoneda(consulta, lectura, "USD", "MXN");
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestro convertidor de monedas");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}


