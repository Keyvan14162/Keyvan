package Story;

import java.util.Scanner;

public class Real_man implements Human{
    
    public static int no = 0;
    public String name,weather,born_in,strgender,mood,animal;
    public int gender,age,year,marryed,chield,chield2;

    Scanner scan = new Scanner(System.in);
    
    @Override
    public void get() {
        
        System.out.println("Hey just give some informatios for story(Enter just 1 word for some replys):");
        System.out.println("Gender of character:\n1:Male\n2:Female");
       
        while(true){
            System.out.print("Enter:");
            gender = scan.nextInt();
            if(gender == 1){
                strgender="Mr.";
                break;
            }
            else if(gender == 2){
                strgender = "Mrs";
                break;
            }
            else
                System.out.println("Just enter 1 or 2");   
        }
        
        System.out.print("Name of character:");
        name = scan.next();
        System.out.println("How was weather?");
        weather = scan.next();
        System.out.println("Hmm where is the best place  for living?");
        born_in = scan.next();
        System.out.println("When was your character born ?(Can't be more than 2000)");
        
        while(true){
            System.out.print("Enter:");
            year = scan.nextInt();
            if(year <2000)
                break;
            else 
                System.out.println("I said year can't be more than 2000!!!");
        }
        
        System.out.println("How is your characters mood?");
        mood = scan.next();
        System.out.println("How many childeren do you want?(No limits,cant be negative or 0)");
        
        while(true){
            System.out.print("Enter:");
            chield = scan.nextInt();
            
            if(chield > 0)
                break;
            else
                System.out.println("Read the rules"); 
        }
        
        System.out.println("Make more for your country!! How many more?");
        
        while(true){
            System.out.print("Enter:");
            chield2 = scan.nextInt();
        
            if(chield2 > 0)
                break;
            else 
                System.out.println("Can't be 0 or negative");
        }
        
        System.out.println
        ("Which animal do you like?");
        animal = scan.next(); 
    }

    @Override
    public void show() {   
        System.out.println("Hey "+strgender+ ",here is life story:\n");
        System.out.print("It was a "+weather+" day.You were borned in "+born_in+",the date was "+year+".Your name was "+name+"\n");
        System.out.print("You were a "+mood+" guy. You got married in "+(year+40)+",when you were 40.You did had\n");
        System.out.print(+chield+" childeren.It wasn't that much so you decided to make "+chield2+" more.");
        System.out.print("At least you had a "+(chield+chield2)+" chielderen.In "+(year+40+40)+",when you were 80 a\n");
        System.out.print(animal+" hit you so hard.This was your dead reason.");
        System.out.print("\n-----END-----");
    }
}
