package br.com.capgemini.executador;

import java.util.Scanner;

import br.com.capgemini.questoes.Questao01;
import br.com.capgemini.questoes.Questao03;
import br.com.capgemini.questoes.Questao02;

public class Execute {

static Scanner Keyboard = new Scanner(System.in);
	
	private static void ExecuteQuestao01() {
		Integer LadderSize;
		
		System.out.println("Digite um número");
		LadderSize = Keyboard.nextInt();
		
		Questao01.LaddersConstructor(LadderSize);
	}
	
	private static void ExecuteQuestao02() {
		String password;
		boolean SecurePassword;	
		
		do {
			System.out.println("Digite uma senha");
			
			password = Keyboard.next();
			
			SecurePassword = Questao02.PasswordSecurity(password);
		}while(SecurePassword != true);
	}
	
	private static void ExecuteQuestao03() {
		Questao03 Question03 = new Questao03(); 
		
		String word;
		
		System.out.println("Digite uma palavra");
		word = Keyboard.next();
		
		char Vetor[] = Question03.WordStorage(word);
		
		Question03.AnagramCalculator(Vetor, 0);
	}
	
	public static void Execution() {
		
		boolean ExecuteQuestion;
		Integer Quest;
		
		do {
			ExecuteQuestion = true;
			
			System.out.println("Digite a questão que deseja executar: (1 , 2 , 3)");
			
			Quest = Keyboard.nextInt();
			
			switch (Quest) {
			case 1:
				ExecuteQuestao01();
				break;
			case 2:
				ExecuteQuestao02();
				break;
			case 3:
				ExecuteQuestao03();
				break;
			default:
				System.out.println("Valor inválido");
				break;
			}
			
			System.out.println(" ");
			System.out.println("Deseja executar mais uma questão? Digite 'true' para continuar ou 'false' para finalizar.");
			
			ExecuteQuestion = Keyboard.nextBoolean();
		
		}while(ExecuteQuestion != false);
		
		System.out.println("----- Sistema encerrado -----");
	}
}
