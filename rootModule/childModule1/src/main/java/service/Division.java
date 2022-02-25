package service;

import org.osgi.service.component.annotations.Component;

@Component
public class Division {

    public static void division() {
        
        System.out.println("enter variable1:");
        int variable1 = Arithmetic.scanner.nextInt();
        
        System.out.println("enter variable2:");
        int variable2 = Arithmetic.scanner.nextInt();
        
        int divide = variable1 / variable2;
        System.out.println(divide);
   }
}
