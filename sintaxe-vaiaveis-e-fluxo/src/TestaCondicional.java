
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 10;
		int quantidadePessoas = 3;
		if(idade >= 18) {
			System.out.println("Voc� � maior de idade!");
			System.out.println("Seja ben-vindo");
		}else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voc� n�o � de maior, mas pode entrar, "
					+ "pois estar acompanhado por um respons�vel");
			} else {
				System.out.println("Voc� n�o pode entrar.");
				
			}
		}
	}
}
