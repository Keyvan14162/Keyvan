package Turkey;

import java.util.Scanner;

public class Kutahya{
    public int age;
    public int weight;
    public String name;
    public String surname;
    public String skin_color;

    public int getAge() {
        return age;
    }
    
//I use public because i wanna reach this class from out of package classes
    Scanner scanner = new Scanner(System.in);
    
    public Kutahya(){
    }
    
    public Kutahya(int age, int weight, String name, String surname, String skin_color) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.surname = surname;
        this.skin_color = skin_color;
    }
    
    public void read(){
        System.out.print("Name :");
        name = scanner.nextLine();
        System.out.print("Surname :");
        surname = scanner.next();
        System.out.print("Age :");
        age = scanner.nextInt();
        System.out.print("Skin color :");
        skin_color = scanner.next();
        System.out.print("Weight(kg) :");
        weight = scanner.nextInt();    
    }
    
    public void show(){
        System.out.println("\nName :"+name);
        System.out.println("Surname :"+surname);
        System.out.println("Age :"+age);
        System.out.println("Skin color :"+skin_color);
        System.out.println("Weight(kg) :"+weight);
    }
    
      
}
