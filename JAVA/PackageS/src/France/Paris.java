package France;

import Turkey.Ankara;
import Turkey.Kutahya;
import java.util.Scanner;


public class Paris extends Kutahya{
    
    public void stdnt(){
  
        Ankara main = new Ankara();
        //with this we can reach Ankara class , Ankara is in Turkey Package
       
        Scanner scanner = new Scanner(System. in);
        
        Kutahya human = new Kutahya();
        
        while(true){
            
        System.out.println("Please enter persons informations :");
        human.read();
        human.show();
        
        System.out.println("For confirm persons informations please type 'confirm'");
        System.out.println("For rewrite persons informations please type 'rewrite'");
        String temp = scanner.next();
        
        if (temp.equalsIgnoreCase("confirm"))
            break;
        else if(temp.equalsIgnoreCase("rewrite"));
        else
            System.out.println("Wrong type.Let's do it agagin");
        }        
    }
}
