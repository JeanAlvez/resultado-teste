package exerc_03;

import java.util.LinkedList;

public class ExercTres {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();		
		
		list.add(3);
		list.add(8);
		list.add(9);
		list.add(4);
		list.add(7);
		list.add(1);
		list.add(6);
		list.add(1);	
		
		int K = 1;

		for (int i = 0; i < 7; i++) { 
			if (list.get(i) == K ) {
			list.remove(i);
			}
        }           		
		System.out.println("Resultado da Lista: " + list);
				
	}

}
