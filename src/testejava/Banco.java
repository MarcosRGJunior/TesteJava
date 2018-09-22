package testejava;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Pessoa> listpessoa = new ArrayList<>(); // atributos e metodos de classe!
	
	 public static void adicionaPessoa(Pessoa p) {
		 listpessoa.add(p);
	 }
	 
	 public static List<Pessoa> getPessoas() {
		 return listpessoa;
	 }

}
