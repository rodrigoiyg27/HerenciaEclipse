package ejemplo1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numerador = 0;
        double denominador = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Ingrese el numerador: ");
            numerador = Double.parseDouble(reader.readLine());

            System.out.print("Ingrese el denominador: ");
            denominador = Double.parseDouble(reader.readLine());

            Operaciones operaciones = new Operaciones();
            double resultado = operaciones.dividir(numerador, denominador);

            System.out.println("El resultado de la división es: " + resultado);
        } catch (Excepcion e) {
            System.err.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }

	}

}
