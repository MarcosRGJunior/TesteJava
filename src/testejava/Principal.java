package testejava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Principal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		try {
			FileReader arq= new FileReader("E:\\Desenvolvimento\\Marcos\\testejava\\banco.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			
			
			String linha = lerArq.readLine();
		
			while(linha != null)
			{	
				if(linha.indexOf(";")!= -1) {
					String[] arrayDados= linha.split(";");
					Pessoa p= new Pessoa(arrayDados[0], new Integer(arrayDados[1]));
					Endereco e= new Endereco(arrayDados[2], arrayDados[3], arrayDados[4]);
					
					p.setEndereco(e); // endereco atrelado a uma pessoa
					
					Banco.adicionaPessoa(p);
				
				}
				 linha = lerArq.readLine();
				
			}
			
			lerArq.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Banco.getPessoas());
	}

}
