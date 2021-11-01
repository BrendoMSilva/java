
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3;
		
		// boolean acompanhado = quantidadePessoa >= 2;
		
		boolean acompanhado;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
	
		System.out.println("O valor de acompanahdo = " +  acompanhado);
		if(idade >= 18 && acompanhado) {
			System.out.println("Seja ben-vindo");;
		} else {
			System.out.println("Infelizmente você não pode entrar.");	
		}
		
	}
}

