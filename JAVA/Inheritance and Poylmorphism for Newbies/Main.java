
package Deneme;


public class Main {
    
    public static void main(String[] args) {
        
        //U can ask for this variables from user
        //But didnt add it
     
        Human human = new Human(19,160,100,"niggerr");
        // 2 types of giving values 
        // we did use constructors and getters setters
        Worker worker = new Worker();
        worker.setAge(29);
        worker.setWeight(180);
        worker.setLenght(120);
        worker.setColor("Red");
        worker.setSalary(1999);
        
        human.show();
        worker.show();
        
        human.eat(); //will get +1 weight
        worker.eat();//will get +2 weight
         
        human.changeColor("White");
        worker.changeColor("Orange");
        
        worker.raise(200);
        
        human.get_old(); // increased 1
        worker.get_old(10); // increased 10
        
        human.show();
        worker.show();
        
        
   }
}
