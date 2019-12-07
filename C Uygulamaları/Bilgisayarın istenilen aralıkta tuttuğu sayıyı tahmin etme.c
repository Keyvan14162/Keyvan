#include <stdio.h>
#include <locale.h>

main(){
	
setlocale(LC_ALL,"Turkish");
	
int a,b,min,max,x;
char ch;
ch='a';

	while((ch=toupper(ch)) != 'E'){
	
		printf("--------------------------------------------------------\n");
		printf("Bilgisayarin hangi aralıkta sayı tutacağını belirleyiniz\nEn az:");
		scanf("%d",&min);
		printf("En çok:");
		scanf("%d",&max);
		
		x=(max-min)+1;
		
		if(max==min || min>max){
			printf("\nAz olan değer çok olan değerden fazla olamaz veya değerler eşit olamazlar\nTekrar deneyin\n");
			continue;
		}
		
		
		srand(time(NULL));
		a=rand()%x+min;
		
		printf("Bilgisayar [%d,%d] aralığında bir sayı tuttu,bulmaya çalışalım\n",min,max);
		
		for(b=min-1;b != a;){
			printf("Tahmin:");
			scanf("%d",&b);
			
			if(b != a)
				printf("Tutmadı\n");
		}
		
		printf("%d=%d Aferin sayıyı buldunuz\n",a,b);
		
		printf("\nÇıkmak için E tuşuna basınız\nDevam etmek için rastgele bir tuşa basınız\n");
		ch=getch();
	}
	
return 0;
}
