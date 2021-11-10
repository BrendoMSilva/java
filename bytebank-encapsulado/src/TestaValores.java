
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 21226);
		
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(12312312);
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(2123, 16129);
		
		System.out.println(Conta.getTotal());
	}
}
