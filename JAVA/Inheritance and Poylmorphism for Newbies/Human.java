
package Deneme;

public class Human {
    
    private int age;
    private int lenght;
    private int weight;
    private String color;
    
    public Human() { //now we can create new human without parameters
    }
    
    //CONSTRUCTOR
    public Human(int age,int lenght, int weight, String color) { // constructor
        
        //encapsulation
        
        if(age > 0)
            this.age = age;
        
        if(lenght > 50)
            this.lenght = lenght;
        
        if(weight > 40)
            this.weight = weight;
        
        
        if(!(color.equalsIgnoreCase("nigga") || color.equalsIgnoreCase("nigger")))
            this.color = color;
        
        else if ((color.equalsIgnoreCase("nigga") || color.equalsIgnoreCase("nigger"))){
            this.color = color; // it will do operation
            System.out.println("Dont be racist dumb"); // with a massage
        }
    }

    
    //setters and getters for privacy
    public int getAge(){
        return age;
    }
    
    public void setAge( int age){
        this.age = age;
    }
    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public void eat(){//Human will get 1 kilo
        System.out.println("----------");
        System.out.println("Human(+1) eated patato");
        weight++;
    }
    
    public void changeColor(String color){
        setColor(color);
    }
    
    public void get_old(){//without parameter it will increase just 1
        setAge(getAge()+1);
        System.out.println("----------");
        System.out.println("Human 1 year grew up");
    }
    
    //OVERLOAD
    public void get_old(int age){//it will increase up to parameter with a parameter
        setAge(getAge() +age);
        System.out.println("----------");
        System.out.println("Human " +age+" year grew up");
    }
    
    public void show(){
        System.out.println("-----HUMAN-----");
        System.out.println("Age :"+getAge());
        System.out.println("Weight :" +getWeight());
        System.out.println("Lenght :" +getLenght());
        System.out.println("Color :"+getColor());
    }   
}
