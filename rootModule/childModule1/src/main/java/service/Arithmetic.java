package service;

import java.util.Scanner;

import org.osgi.service.component.annotations.Component;

@Component
public class Arithmetic {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void addition() {
        
        System.out.println("enter variable1:");
        int variable1 = scanner.nextInt();
        
        System.out.println("enter variable2:");
        int variable2 = scanner.nextInt();
        
        int sum = variable1 + variable2;
        System.out.println(sum);
   }

    public static void userChoice() {
       
        System.out.println("ARITHMETIC OPERATIONS\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
        
        do {
            int choice = Integer.parseInt(Validation.choiceValidation(scanner.nextLine().trim()));
            
            switch (choice) {
            case 1:
                Arithmetic.addition();
                break;
            case 2:
                Subtract.subtract();
                break;
            case 3:
                Multiplication.mulitiply();
                break;
            case 4:
                Division.division();
                break;
            default :
                System.exit(5);
         }
            scanner.close();   
        } while (true); 
      
    }
}
