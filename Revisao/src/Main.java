import java.util.Scanner;


public class Main {
	static Contato contatos[] = new Contato[10];
	public static void main(String[] args){
		
		
		
//		Contato c1 = new PessoaFisica();
//		Contato c2 = new PessoaJuridica();
//		Contato c3 = new PessoaFisica();
//		Contato c4 = new PessoaJuridica();
//		Contato c5 = new PessoaFisica();
//		Contato c6 = new PessoaFisica();
//		Contato c7 = new PessoaJuridica();
//		Contato c8 = new PessoaFisica();
//		Contato c9 = new PessoaJuridica();
//		Contato c10 = new PessoaFisica();
//		
//		((PessoaFisica)c1).setName("João Moura");
//		((PessoaFisica)c1).setTelefone("2010-1111");
//		((PessoaFisica)c1).setCpf("11");
//		
//		((PessoaJuridica)c2).setName("Coca-Cola");
//		((PessoaJuridica)c2).setTelefone("2010-4444");
//		((PessoaJuridica)c2).setCnpj("12");
//		
//		((PessoaFisica)c3).setName("Maria");
//		((PessoaFisica)c3).setTelefone("2010-1212");
//		((PessoaFisica)c3).setCpf("13");
//		
//		((PessoaJuridica)c4).setName("Brahma");
//		((PessoaJuridica)c4).setTelefone("2010-1414");
//		((PessoaJuridica)c4).setCnpj("14");
//		
//		((PessoaFisica)c5).setName("Bartolomeu");
//		((PessoaFisica)c5).setTelefone("2010-1515");
//		((PessoaFisica)c5).setCpf("1115");
//		
//		((PessoaFisica)c6).setName("Mariano Costa");
//		((PessoaFisica)c6).setTelefone("2010-1616");
//		((PessoaFisica)c6).setCpf("11116");
//		
//		((PessoaJuridica)c7).setName("Neros");
//		((PessoaJuridica)c7).setTelefone("2010-1717");
//		((PessoaJuridica)c7).setCnpj("11111117");
//		
//		((PessoaFisica)c8).setName("Amilton Ferreira");
//		((PessoaFisica)c8).setTelefone("2010-1818");
//		((PessoaFisica)c8).setCpf("1111118");
//		
//		((PessoaJuridica)c9).setName("Armazém");
//		((PessoaJuridica)c9).setTelefone("2010-1919");
//		((PessoaJuridica)c9).setCnpj("1111119");
//		
//		((PessoaFisica)c10).setName("Bill Gates");
//		((PessoaFisica)c10).setTelefone("2010-1010");
//		((PessoaFisica)c10).setCpf("1110");
//		
//		contatos[0] = c1;
//		contatos[1] = c2;
//		contatos[2] = c3;
//		contatos[3] = c4;
//		contatos[4] = c5;
//		contatos[5] = c6;
//		contatos[6] = c7;
//		contatos[7] = c8;
//		contatos[8] = c9;
//		contatos[9] = c10;
		
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println(
				"\nLista de contatos"
				+ "\n1 - Mostrar contatos da lista"
				+ "\n2 - Adicionar contatos"
				+ "\n3 - Remover contatos"
		//		+ "\n4 - Editar contatos"
				+ "\n------------------\n"
			);
			
			int opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				for (int i = 0; i < contatos.length; i++) {
					if (contatos[i] != null){
						System.out.println();
					
					}
					
				} 
				
				break;
			default:
				break;
			}
			
			
		}
		

	}

}
