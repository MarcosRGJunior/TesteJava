package testejava;

public class Licao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome= "Thiago";
		Integer idade= new Integer(31);

		Pessoa pessoa1= new Pessoa(nome, idade);
		
		Pessoa pessoa2= new Pessoa("Marcos", new Integer(19));
		
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa2.getIdade());
		
		pessoa2.aniversario();
		
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa2.getIdade());
	}

}
