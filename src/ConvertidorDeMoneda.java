import java.io.IOException;
import java.util.Scanner;


public class ConvertidorDeMoneda {
    

    static void conversionMoneda(ConsultaTasa consultaTasa, Scanner lectura, String moneda, String otraMoneda) {
        try {
            Tasas tasa = consultaTasa.buscaTasa(moneda);
            System.out.println("Ingrese la cantidad que desea convertir.");
            double monto = lectura.nextDouble();
            lectura.nextLine();

            Double valorDivisa = tasa.conversion_rates().get(otraMoneda);

            if (valorDivisa == null) {
                System.out.println("No Se Encontró La Tasa De Conversión Para La Moneda Seleccionada.");
            } else {
                double convierteValor = monto * valorDivisa;
                System.out.printf("El Valor De " + monto + " " +  moneda + " en " + otraMoneda + " es: " +  convierteValor + " " + otraMoneda);
            }
        } catch (IOException | InterruptedException | RuntimeException e) {
        }
    }
}


