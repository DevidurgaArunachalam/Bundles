package service;

public class Validation {
	public static String choiceValidation(final String choice) {
        
        if (!choice.matches("[1-5]")) {
           Arithmetic.userChoice();
           return choiceValidation(Arithmetic.scanner.nextLine().trim());
        }
        return  choice;
    }
}
