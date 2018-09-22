package testejava;

import java.util.ArrayList;
import java.util.List;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		String nome= new String(" Marcos Rogerio Gonçalves Junior"); // inicializando uma string
		int  num= 0; // inicializando um int (tipo primitivo)

		
		nome = nome.replace("ç", "c");
		System.out.println(nome);
		
		Integer num2 = new Integer(0);
		
		if(num2.equals(0))
		{
		  System.out.println("São Iguais");
		}
		else
		 {
			System.out.println("São diferentes");
		 }
		
		
		for(int i=0 ; i<=10 ; i++)
		{
			System.out.println(i);
		}
		
		while(num==0)
		{
			System.out.println("coca-cola");
			num= num+1;
		}
		
		List lista= new ArrayList();
		lista.add(num);
		
		
	}
}
