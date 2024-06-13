package ejemplo1;

public class Operaciones {
	 public double dividir(double numerador, double denominador) throws Excepcion {
	        if (denominador == 0) {
	            throw new ArithmeticException("No se puede dividir por cero");
	        }
	        double resultado = numerador / denominador;
	        if (resultado < 0) {
	            throw new Excepcion("El resultado de la división es negativo");
	        }
	        return resultado;
	    }
}
