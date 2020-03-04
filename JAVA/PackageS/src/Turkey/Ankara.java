package Turkey;

//import java.util.Scanner;
import France.Paris;

public class Ankara {
    public static void main(String[] args){
        
        System.out.println("-----Packages are talking to each other-----");
       
        
        Paris iso = new Paris();
        //With this we can reach Paris package
        iso.stdnt();
        
        Kutahya human = new Kutahya(20,60,"Robin","Seer","Blue");
        
        System.out.println("\nHi! my name is "+human.name+".My class is 'Ankara' and my package is 'Turkey'.");
        System.out.println("But i have created in different package and class.I have created in 'Paris' class.Paris class");
        System.out.print("is in 'France' package.If you are not beliving me you can check it in my codes.\n");
        System.out.println("I have created in Paris by using 'Kutahya' class(In Turkey package) for my informations.");
        System.out.println("You can create someone like me and you by using 'Paris' class.");
        System.out.println("Ty ^^");
        
    }//main
}
