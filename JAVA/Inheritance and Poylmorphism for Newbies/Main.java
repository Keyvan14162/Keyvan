
package Deneme;


public class Main {
    
    public static void main(String[] args) {
        
        //U can ask for this variables from user
        //But i didnt add it
     
        Human human = new Human(19,160,100,"Blue");//if u make last string nigga or nigger 
        // it will show u something special on top
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
         
        human.changeColor("White");//human changed color
        worker.changeColor("Orange");//worker changed color
        
        worker.raise(200);
        
        human.get_old(); // increased 1
        worker.get_old(10); // increased 10
        
        human.show();
        worker.show();
        
        
   }
}
