package ant;
public class Suma {
	private double total = 0;
	
	public double getSuma(double operando1, double operando2) {
		total = operando1 + operando2;
		return total;
	}

	public double incrementa(double operando) {
		total = operando + 1;
		return total;
	}
}