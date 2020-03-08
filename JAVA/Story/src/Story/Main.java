package Story;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("-----Life Story-----\n");
            
        Scanner scan = new Scanner(System.in);
        
        Real_man human = new Real_man();
        
        human.get();
        human.show();   
    }
}
