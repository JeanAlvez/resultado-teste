package exerc_05;

import java.util.Spliterator;

public class Exerc_05 {

	public static void main(String[] args) {
	        
			String frase = "Programador Programação de sextama";
			String[] vetor = frase.split("\s+");
			String palavra = "ama"; 
			int total = 0;
			
			for(int i = 0; i < vetor.length; i++){
				if(vetor[i].contains(palavra)){					
					total += 1;		
				}				
			}
			 System.out.println ("Encontrado a palavra " + palavra);
			 System.out.println ("Encontrado a palavra " + total);
			}
}
