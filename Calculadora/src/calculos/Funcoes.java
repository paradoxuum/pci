package calculos;

public class Funcoes {
	public double soma(double a, double b) {
		double total = a + b;
		return total;
	}
	public double subt(double a, double b) {
		double total = a - b;
		return total;
	}
	public double divi(double a, double b) {
		double total = a / b;
		return total;
	}
	public double mult(double a, double b) {
		double total = a * b;
		return total;
	}
	public double MaisMenos(double a) {
		double b = -a;
		return b;
	}
	public double raiz(double a) {
		double b = Math.sqrt(a);
		return b;
	}
	public double porc(double a, double b){
		b = (b /100) * a;
		return b;
	}
	public double frac(double a) {
		double b = 1/a;
		return b;
	}
}
