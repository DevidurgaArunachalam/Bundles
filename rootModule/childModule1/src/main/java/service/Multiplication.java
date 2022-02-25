package service;

import org.osgi.service.component.annotations.Component;

@Component
public class Multiplication {

    public static void mulitiply() {
        System.out.println("enter variable1:");
        int variable1 = Arithmetic.scanner.nextInt();
        
        System.out.println("enter variable2:");
        int variable2 = Arithmetic.scanner.nextInt();
        
        int multiply = variable1 * variable2;
        System.out.println(multiply);
   }

}
