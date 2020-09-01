package TextWriter;

import java.util.Scanner;
import java.io.*;

//In this program you can choose your txt file name,you can can write whatever you want in that files and
//and you can choose how many times to write.Also you can read files.


public class Main {
    
    public static void main(String[] args) {
        
        String txt,file,sentence ;
        int repeat,choose,exit = 0;
        
        Scanner scan =  new Scanner(System.in);
        
        while(exit == 0){

            System.out.println("What you wanna do ?");
            System.out.println("1:Add sentences to txt file(If your txt file exits,program will add your sntences to that file automaticly)");
            System.out.println("2:Read a txt file");
            choose = scan.nextInt();

            if(choose == 1){

                System.out.println("Enter your txt file name:");

                txt = scan.next();

                PrintWriter exitStream = null;

                file = txt+".txt";//Because we want a txt file 

                try{
                    exitStream = new PrintWriter(new FileOutputStream(file,true)); 
                }
                catch(FileNotFoundException e){
                    System.out.println("File creating error");
                }


                System.out.println("What to write in the file");
                sentence = scan.nextLine();
                sentence = scan.nextLine();

                System.out.println("How many times should the sentence repeat?");
                repeat = scan.nextInt();

                System.out.println("your transaction continues...");

                for(int i=1 ; i <= repeat ; i++){
                    exitStream.println(i+":"+sentence);
                }
                exitStream.close();

            }

            else if(choose == 2){

                try{
                    String temp,readFile;
                    String satir = null;

                    System.out.println("Which file you want  to read?(don't add txt)");
                    temp = scan.nextLine();
                    temp = scan.nextLine();
                    readFile = temp+".txt";

                    BufferedReader enter = new BufferedReader(new FileReader(readFile));

                    satir = enter.readLine();

                    while( satir != null){
                        System.out.println(satir);
                        satir = enter.readLine();
                    }
                    enter.close();
                }

                catch(IOException e){
                    System.out.println("File not found");
                }           
            } 

            else
                System.out.println("Wrong input");
        
            
            System.out.println("\nFor continue enter 0,for exit enter different number.");
            exit = scan.nextInt();
        

        }//while 
    }//main method
}//main class
