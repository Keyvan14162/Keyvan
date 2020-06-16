package Notepad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("Bu program uygulamanın çalıştırıldığı klasöre Notepad.txt isimli bir dosya açacaktır.");
        Scanner scan = new Scanner(System.in);
        
        int exit = 0;
        
        String dosya = "Notepad.txt";
        String metin;
        
        PrintWriter cıktı = null;
        
        
        while(exit == 0){
            try{
                cıktı = new PrintWriter(new FileOutputStream(dosya,true));
            }
            catch(FileNotFoundException erros){
                System.out.println("Dosya oluşturulurken bir hata oldu,çıkı yapılıyor");
                System.exit(0);
            }

            System.out.println("Yapmak istediğiniz işlem rakamını giriniz");
            System.out.println("1.Belgeye metin ekleyin");
            System.out.println("2:Belgeyi okuyun");
            System.out.println("3:Belgeyi temizleyin");

            int secim = scan.nextInt();

            if(secim == 1){
                System.out.print("Metini yazınız:");          
                metin = scan.nextLine();
                metin = scan.nextLine();
                cıktı.println("------------------------------------------------------");
                Date simdikiZaman = new Date();
                cıktı.println("Tarih:"+simdikiZaman.toString());
                cıktı.println(metin);
                cıktı.println("------------------------------------------------------");

                System.out.println("Metin dosyanıza eklenmiştir");
                cıktı.close();
            }

            else if(secim == 2){

                try {
                    BufferedReader giris = new BufferedReader(new FileReader("Notepad.txt"));
                    String satir =giris.readLine();

                    while(satir != null){
                        System.out.println(satir);
                        satir = giris.readLine();
                    }
                    giris.close();
                } 
                catch (FileNotFoundException ex) {
                    System.out.println("Dosya bulunamadı");
                    System.exit(secim);
                }
                catch(IOException e){
                    System.out.println("Veri girisinde hata oldu");
                }

            }

            else if(secim == 3){

                try{
                    cıktı = new PrintWriter(new FileOutputStream(dosya,false));
                }
                catch(FileNotFoundException err){
                    System.out.println("Dosya oluşturulurken bir hata oldu,çıkış yapılıyor");
                    System.exit(0);
                }
                System.out.println("Belge temizlenmiştir");
            }
            
            System.out.println("Devam etmek için 0,çıkmak için herhangi bir rakam giriniz.");        
            exit = scan.nextInt();
            System.out.println("");
        }
            
                
                
                
               
              
        
     
        
        
        
    }
}
