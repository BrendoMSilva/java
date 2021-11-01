
public class TestaNumeroFatorial {
	public static void main(String[] args) {
		int numeroFatorial = 1;
		for(int i = 1; i < 10; i++) {
			numeroFatorial *= i;
			System.out.println("fatorial de " + i + " = " + numeroFatorial);
		}
	}
}

