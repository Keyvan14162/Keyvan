
package Deneme;

import java.util.Scanner;

public class Improved {

  
    public static void main(String[] args) {
        
        int exit;
        
        do{
            System.out.println("-----Ultra Advanced Corona&Ebola Tester-----");
            System.out.println("Which test do you wanna do ? (Type ebola or corona)");

            Scanner scanner = new Scanner(System.in);

            String temp = scanner.nextLine();

            if(temp.equalsIgnoreCase("corona")){
                System.out.println("Where are you from ?\n1:China\n2:Not China");
                int corona = scanner.nextInt();

                if(corona == 1)
                    System.out.println("You got corona");
                else if(corona == 2)
                    System.out.println("You are okey");
                else
                    error();
            }
            else if(temp.equalsIgnoreCase("ebola")){
                System.out.println("Where are you from ?\n1:Africa\n2:Not Africa");
                int ebola = scanner.nextInt();

                if(ebola == 1)
                    System.out.println("You got ebola");
                else if(ebola == 2)
                    System.out.println("You are okey");
                else
                    error();
            }
            System.out.println("\nThis is program is raceisn't");
            System.out.println("1:Exit\n2:Another one");

            exit = scanner.nextInt();
            if(!(exit == 1 || exit == 2))
                error();
            
        }while(exit == 2);

        
    }
    
     public static void error(){
        System.out.println("WRONG KEY");
    }
    
}
    
    

