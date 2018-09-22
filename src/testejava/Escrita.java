package testejava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Escrita {


		
		public static void main(String[] args) throws IOException {
			Scanner escreva = new Scanner(System.in);
			String n= "";
			StringBuilder sb = new StringBuilder();
		 
			FileWriter fw = new FileWriter("E:\\Desenvolvimento\\Marcos\\testejava\\banco.txt", true);
			
			BufferedWriter gravar = new BufferedWriter(fw);
		
			gravar.newLine();
			
			System.out.println("Informe o nome da pessoa:");
			n = escreva.nextLine();
			sb.append(n);
			
			System.out.println("Informe a idade da pessoa:");
			n = escreva.nextLine();
			sb.append(";" + n);
			
			System.out.println("Informe o rua da pessoa:");
			n = escreva.nextLine();
			sb.append(";" + n);
			
			System.out.println("Informe o bairro da pessoa:");
			n = escreva.nextLine();
			sb.append(";" + n);
			
			System.out.println("Informe o CEP da pessoa:");
			n = escreva.nextLine();
			sb.append(";" + n);
			
			System.out.println("Informe o complemento da pessoa:");
			n = escreva.nextLine();
			sb.append(";" + n);
			
			System.out.println(sb.toString());
			
		    gravar.append(sb);
	        gravar.close();
	
	        fw.close();
	        
		    System.out.printf("\nGravado com sucesso");
		  } 
}





