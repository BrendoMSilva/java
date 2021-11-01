
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 10;
		int quantidadePessoas = 3;
		if(idade >= 18) {
			System.out.println("Você é maior de idade!");
			System.out.println("Seja ben-vindo");
		}else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você não é de maior, mas pode entrar, "
					+ "pois estar acompanhado por um responsável");
			} else {
				System.out.println("Você não pode entrar.");
				
			}
		}
	}
}
