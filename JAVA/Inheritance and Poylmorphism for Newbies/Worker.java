
package Deneme;

public class Worker extends Human{
    private int salary;

    public Worker() {//With this we can create a worker without a parameter
    }

    public Worker(int age ,int salary, int lenght, int weight, String color) {
        super(age, lenght, weight, color); //sub class getting infos from super class
        this.salary = salary;//sub class adding own things
    }

    @Override
    public void eat() {//Worker will get 2 kilos
        System.out.println("----------");
        System.out.println("Worker(+2) eated patato");
        setWeight(getWeight()+2);
    }
  
    //getter and setter for privacy
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
    //this method is just for worker class
    public void raise(int amount){
        salary = salary + amount;
        System.out.println("----------");
        System.out.println("Worker salary is raised plus "+amount);
    }
    

    @Override
    public void get_old(int age) {
        setAge(getAge() +age);
        System.out.println("----------");
        System.out.println("Human " +age+" year grew up");
    }

    @Override
    public void get_old() {
       setAge(getAge()+1);
       System.out.println("----------");
       System.out.println("Worker 1 year grew up");
    }
    
    @Override
    public void changeColor(String color) {
        super.changeColor(color); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void show() {
        //super.show(); //i want to change super method2 so i dont need this
        System.out.println("-----WORKER-----");//bcs of this
        System.out.println("Age :"+getAge());
        System.out.println("Weight :" +getWeight());
        System.out.println("Lenght :" +getLenght());
        System.out.println("Color :"+getColor());
        System.out.println("Slary :"+getSalary());
    }
}
