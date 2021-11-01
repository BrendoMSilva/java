
public class TestaValores {
	public static void main(String[] args) {
		int primeiroNumero = 3;
		int segundoNumero = 5;
		
		segundoNumero = primeiroNumero;
		primeiroNumero = 10;
		
		System.out.println(segundoNumero);
		System.out.println(primeiroNumero);
		
	}
}
