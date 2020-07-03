package ArrayList_Streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    
    public static void menu() {
        
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("");
        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1:Listeyi oku");
        System.out.println("2:Listeye ekleme yap");
        System.out.println("3:Listeden öğe sil(index veya öğeyi girerek)");
        System.out.println("4:Listeden bir öğeyi güncelle");
        System.out.println("5:Listeden iki öğenin yerlerini birbirleri ile değiştir"); 
        System.out.println("6:Listeyi temizle");
        System.out.println("7:Kaydet ve yazdırma kısmına geç");
        System.out.println("");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        
    }
    
    public static void main(String[] args) {
        
        boolean exit = false;
        
        Scanner scan = new Scanner(System.in);
        
        
        Hobaa hoba = new Hobaa();
        
        System.out.println("İstediğiniz değerlerle bir liste oluştarabileceğiniz\nbu listeyi çeşitli şekillerde düzenleye"
                + "bileceğiniz ve\nsizin seçtiğiniz isimde bir txt dosyasına ekleyebileceğiniz java kodu.");
        
        System.out.println("Listenizi yazdırmadan önce oku seçeneğiyle kontrol ediniz!!!\n");
            
        
        while(exit == false) {
            
            int select;
            
            menu();
            
            System.out.print("Seçim:");
            select = scan.nextInt();
            
            if(select == 1) {
                hoba.oku();
            }
            
            else if(select == 2) {
                System.out.println("Eklemek istediğiniz metini yazınız:");
                scan.nextLine();//dummy
                String text = scan.nextLine();
                hoba.ekle(text);
            }
            
            else if(select == 3) {
                
                System.out.println("-------------------------");
                System.out.println("1:Index ile sil\n2:Öğeyi girerek sil ");
                int secim = scan.nextInt();
                System.out.println("-------------------------");
                
                if(secim == 1) {
                    System.out.println("Silmek istediğiniz index numarasını giriniz:");
                    int silIndex = scan.nextInt();
                    hoba.silIndex(silIndex);
                }
                
                else if(secim == 2) {
                    
                    scan.nextLine();//dummy
                    
                    System.out.println("Silmek istediğiniz öğeyi yazınız:");
                    String silMetin = scan.nextLine();
                    hoba.silString(silMetin);
                }
                else
                    System.out.println("Hatalı giriş,seçim ekranına yönlendiriliyorsunuz...");
            }
            
            else if(select == 4) {
                System.out.println("Güncellemek istediğiniz öğenin indexini ve eklenecek olacak öğeyi giriniz:");
                
                System.out.print("Index:");
                int index = scan.nextInt();
                
                scan.nextLine();//dummy
                
                System.out.print(index +" indexine eklenecek yeni öğe:");
                String text = scan.nextLine();
                
                hoba.guncelle(index, text);
                
            }
            
            else if(select == 5) {
                System.out.println("Yerlerini değiştirmek istediğiniz öğelerin indexleriniz giriniz:");
                
                System.out.print("Index 1:");                
                int index1 = scan.nextInt();
                
                System.out.print("Index 2:");
                int index2 = scan.nextInt();
                
                hoba.yerDegistir(index1, index2);
            }
            
            else if(select == 6) {
                
                hoba.hepsiniSil();
                
            }
            
            else if(select == 7) {
                
                System.out.println("Veriler kaydedildi,yazdırma ekranına geçiliyor...");
                exit = true;
                
            }
            
            else
                System.out.println("Hatalı giriş,seçim ekranına yönlendiriliyorsunuz...");

        }
        
        exit = false;
////////////////////////////////////////////////////////////////////////////////        
        while(exit == false) {
            
            System.out.println("");
            
            int k = 0;
             
            for(String s:hoba.getList()){
                                      
                System.out.println(k+": "+s);
                k++;
                
            }
            
            
            System.out.println("Lütfen yukarıdaki listenin bastırılacağı txt dosyasının ismini giriniz:");
            System.out.print("İsim:");
            
            scan.nextLine();//dummy
            
            String txt = scan.nextLine();
            
            txt += ".txt";
            
            PrintWriter stream = null;
            
            try {
                stream = new PrintWriter(new FileOutputStream(txt));
            }
            catch(FileNotFoundException e) {
                System.out.println(txt +" oluşturulurken bir hata oldu!!!"); 
                System.exit(0);
            }
            
            System.out.println("Liste "+txt+" dosyasına yazdırlıyor...");
                 
            
            for(int i=0 ; i<hoba.getList().size() ; i++) {
                
                stream.println(i+": "+hoba.getList().get(i));
                
            }
            
            stream.close();
            
            File file = new File(txt);
            
            System.out.println("Liste "+file.getAbsolutePath());
            System.out.println("konumundaki "+ txt +" dosyasına yazdırılmıştır");
            
            
            System.out.println("5 saniye içinde programdan çıkış yapılacaktır...");
            
            exit = true;

        }
   
    }

}
