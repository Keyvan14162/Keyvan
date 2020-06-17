package Kayıtlı_Toplama_Oyunu;

import java.io.*;
import java.util.Date;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        String isim ;
        int exit = 0;
       
        Scanner scan = new Scanner(System.in);
        
       
        while(exit == 0){
        
        System.out.println("Yapmak istediğiniz işlem rakamını giriniz.");
        System.out.println("1:Oyunu oyna");
        System.out.println("2:Panoyu gör");
        System.out.println("3:Panoyu temizle");
        System.out.print("İşlem:");
        int sec = scan.nextInt();
        
        PrintWriter cıktı = null;
        String dosya = "Pano.txt";
        
////////////////////////////////////////////////////////////////////////////////        
        if(sec == 1){
            
            System.out.print("Lütfen kullanıcı adınızı giriniz:");
            isim = scan.next();
            
            System.out.println("Sonuçları giriniz.\n");
            
            int puan = 0;
            
            for(int i = 1; i<4 ;i++){/////////////////////
                         
                int a = (int)(Math.random()*100);
                int b = (int)(Math.random()*100);
                int sonuc = a+b;
                int cevap ;
                
                System.out.print(i+".soru: "+a+"+"+b+" = ");
                cevap = scan.nextInt();     
                
                if(cevap == sonuc){
                    puan++;
                    System.out.println("Doğru cevap,+1 puan kazandınız.Şuanki puanınız:"+puan);
                }
                else {
                    System.out.println("Doğru cevap "+sonuc+" olcaktı.Şuanki puanınız:"+puan);
                }
              
            }///////////////////////////
            
            System.out.println("\nOyun bitmiştir,"+isim+" kullanıcısının toplam puanı:"+puan+"\n");
            System.out.println("Verileriniz yazdırılıyor...");
            
            try{
               cıktı = new PrintWriter(new FileOutputStream(dosya,true));
            }
            catch(FileNotFoundException e){
                System.out.println("Dosya bulunamadı!");
                System.exit(0);
            }
            
            cıktı.println("------------------------------------------------------");
            Date simdikiZaman = new Date();
            cıktı.println("Tarih:"+simdikiZaman.toString());
            cıktı.println("Kullanıcı:"+isim+" Puan:"+puan);
            cıktı.close();
            
            System.out.println("Verileriniz başarıyla yazdırılmıştır.");
                       
        }
////////////////////////////////////////////////////////////////////////////////
        else if(sec == 2){
            
            try{
                BufferedReader giris = new BufferedReader(new FileReader("Pano.txt"));
                
                //String satir = null ;
                String satir = giris.readLine();
               
                
                while(satir != null){
                    System.out.println(satir);
                    satir = giris.readLine();
                }
                //System.out.println("");
            }
            
            catch(FileNotFoundException e){
                System.out.println("Dosya bulunamadı!");
                System.exit(0);
            }
            catch(IOException e){
                System.out.println("Veri girişinde hata!");
            }
            
            
        }
 ///////////////////////////////////////////////////////////////////////////////       
        else if(sec == 3){
            
             try{
                    cıktı = new PrintWriter(new FileOutputStream(dosya,false));
                }
                catch(FileNotFoundException err){
                    System.out.println("Dosya oluşturulurken bir hata oldu,çıkış yapılıyor");
                    System.exit(0);
                }
                System.out.println("Pano temizlendi");
            }
            
////////////////////////////////////////////////////////////////////////////////        
        else
            System.out.println("Hatalı giriş!");
////////////////////////////////////////////////////////////////////////////////         
       
        System.out.println("\nDevam etmek için 0,çıkmak için herhangi bir rakam giriniz");
        exit = scan.nextInt();
        
        }
    } 
}
