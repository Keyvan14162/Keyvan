package Deneme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
        String text,ch;
        int temp,counter=0,same = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        
        text = scan.nextLine();
           
        while (true) {            
            System.out.println("\n1:Choose a speacial character(Case Sensetive)");
            System.out.println("2:Choose a speacial character(Not Case Sensetive)");
            System.out.println("3:Show all the number of characters(Case Sensetive)");
            System.out.println("4:Show all the number of characters(Not Case Sensetive)");
            System.out.println("5:Exit");
            temp = scan.nextInt(); 
            
            //Here if is more easier for me
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            if (temp == 1) {
                
                System.out.print("Enter the character :");
                ch = scan.next();
                
                for(int i = 0 ;i < text.length();i++){
                    
                    if(text.startsWith(ch,i)){
                        counter++;
                    }
                }
                     
                System.out.println("\nThere is "+counter+" "+ch+" characters");
                
                
                System.out.println("\n1:Menu\n2:Exit");
                temp = scan.nextInt();
                if(temp == 2)
                    break;
                else if(temp != 2 && temp != 1)
                    System.out.println("Wrong key program will be close");
                    
                
            } 
            
            else if (temp == 2) {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
                System.out.print("Enter the character :");
                ch = scan.next();
                
                for(int i = 0 ;i < text.length();i++){
                    
                    if(text.toLowerCase().startsWith(ch.toLowerCase(),i)){
                        counter++;
                    }
                }
                     
                System.out.println("\nThere is "+counter+" "+ch.toLowerCase()+" and "+ch.toUpperCase()+" characters");
                
                System.out.println("\n1:Menu\n2:Exit");
                temp = scan.nextInt();
                if(temp == 2)
                    break;
                else if(temp != 2 && temp != 1)
                    System.out.println("Wrong key program will be close");                             
            }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            else if (temp == 3) {
                
                for(int i = 0 ;i < text.length();i++){
                    for(int j = 0; j < text.length();j++){   
                        
                        if(text.charAt(i) == text.charAt(j))
                            counter++;
                        
                    }
                    System.out.println("\n"+(i+1)+". character '"+text.charAt(i)+"' is repating "+counter+" times");
                    counter = 0;
                }
                
                System.out.println("\n1:Menu\n2:Exit");
                temp = scan.nextInt();
                if(temp == 2)
                    break;
                else if(temp != 2 && temp != 1)
                    System.out.println("Wrong key program will be close");
            }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////           
            else if(temp == 4){
                
                for(int i = 0 ;i < text.length();i++){
                    for(int j = 0; j < text.length();j++){   
                        
                        if(text.toLowerCase().charAt(i) == text.toLowerCase().charAt(j))
                            counter++;
                        
                    }
                    System.out.println("\n"+(i+1)+". character "+text.toLowerCase().charAt(i)+" or "+text.toUpperCase().charAt(i)+" is repating "+counter+" times");
                    System.out.println("(Note case sensetive)");
                    counter = 0;
                }
                System.out.println("\n1:Menu\n2:Exit");
                temp = scan.nextInt();
                if(temp == 2)
                    break;
                else if(temp != 2 && temp != 1)
                    System.out.println("Wrong key program will be close");
                
            }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            else if(temp == 5)
                break;
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
            else 
                System.out.println("Please just enter 1,2,3,4 or 5");
                           
        }
    }  
}
