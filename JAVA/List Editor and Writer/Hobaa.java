
package ArrayList_Streams;

import java.util.ArrayList;

public class Hobaa {
    
    private ArrayList<String> list = new ArrayList<String>();
    //Arraylist i oluşturdum ve başlattım

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
    
    
    public void oku() {
        
        if(list.isEmpty()){
            
            System.out.println("-------------------------");
            System.out.println("Liste boş");
            System.out.println("-------------------------");
            
        }
            
        else {   
            
            System.out.println("-------------------------");

            for(int i=0 ; i<list.size();i++){

                System.out.println(i+": "+ list.get(i));

            }

            System.out.println("İşlem tamamlanmıştır.");    
            System.out.println("-------------------------");
            
        }
    }
    //Listeyi okuyor,eğer liste boş ise uyarı mesajı yazdırıyor
    
    public void ekle(String isim) {
        
        System.out.println("-------------------------");
        list.add(isim);
        System.out.println(list.indexOf(isim) +" indexli yere "+isim+" eklenmiştir.");
        System.out.println("-------------------------");
        
    }
    
    
    public void silIndex(int index) {
        
        System.out.println("-------------------------");
        
        System.out.println(index +" indexli "+ list.get(index) +" silinmiştir.");
        list.remove(index);
        
        System.out.println("-------------------------");
          
    }
    
    
    public void silString(String s) {
        
        System.out.println("-------------------------");
        
        System.out.println(list.indexOf(s) +" indexli " + s + " silinmiştir.");
        list.remove(s);
        
        System.out.println("-------------------------");
        
    }
    
  
    public void guncelle(int index,String isim) {
     
        System.out.println("-------------------------");
        String temp = list.get(index);
        list.set(index, isim);
        System.out.println(index +" indexli "+ temp +" yerine "+ isim +" eklenmiştir.");
        System.out.println("-------------------------");
              
    }
    
    
    public void hepsiniSil() {
        
        System.out.println("-------------------------");
        
        for(int i=0 ; ; ){

             list.remove(i);
             
             if(list.isEmpty())
                 break;
            //Liste boşalana kadar ilk elemanı siliyor,sonunda eleman kalmıyor
        }
        System.out.println("İşlem tamamlandı.");
        
        System.out.println("-------------------------");
        
    }
    
    
    public void yerDegistir(int index1,int index2) {
        
        System.out.println("-------------------------");
        
        String temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
        
        System.out.println(index1 +" indexli "+ list.get(index2) + " elemanı  ile "+ index2 +" indexli "
        + list.get(index1) +" elemanı yer değiştirmiştir.");
        //elemanlar yer değiştirdiği için elemanların yeni indexleri kullanılıyor
        
        System.out.println("-------------------------");
        
    }
}