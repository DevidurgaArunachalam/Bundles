package service;

import java.util.Scanner;

import org.osgi.service.component.annotations.Component;

@Component
public class Division {

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter variable1:");
        int variable1 = scanner.nextInt();
        
        System.out.println("enter variable2:");
        int variable2 = scanner.nextInt();
        
        int divide = variable1 / variable2;
        System.out.println(divide);
   }
}
