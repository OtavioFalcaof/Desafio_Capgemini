package br.com.capgemini.questoes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao02 {
	
	public static boolean PasswordSecurity(String password) {
		Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9a-zA-Z!@#$%^&*()-+]{6,}");
	
		Matcher matcher = pattern.matcher(password);
		
		if(!matcher.find()) {
			System.out.println("Sua senha não esta segura");
			System.out.println(password);
			return false;
		}else {
			System.out.println("Senha segura");
			System.out.println(password);
			return true;
		}
	}
}
