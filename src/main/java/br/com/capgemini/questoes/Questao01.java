package br.com.capgemini.questoes;

public class Questao01 {
	
	public static void LaddersConstructor(Integer LadderSize) {
		for (Integer row = 1; row <= LadderSize; row++) {
			System.out.println(" ");
			
			for(Integer col = 1; col <= row; col++) {
				System.out.print("*");
			}//Fim do for (col)
		}//Fim do for (row)
	}
}
