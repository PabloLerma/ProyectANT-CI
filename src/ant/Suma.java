package ant;
public class Suma {
	private double resultado = 0;
	
	public double getSuma(double operando1, double operando2) {
		resultado = operando1 + operando2;
		return resultado;
	}

	public double incrementa(double operando) {
		resultado = operando + 1;
		return resultado;
	}
}