#include <stdio.h>
#include <locale.h>

main(){
	
setlocale(LC_ALL,"Turkish");
	
int a,b,min,max,x;
char ch;
ch='a';

	while((ch=toupper(ch)) != 'E'){
	
		printf("--------------------------------------------------------\n");
		printf("Bilgisayarin hangi aralýkta sayý tutacaðýný belirleyiniz\nEn az:");
		scanf("%d",&min);
		printf("En çok:");
		scanf("%d",&max);
		
		x=(max-min)+1;
		
		if(max==min || min>max){
			printf("\nAz olan deðer çok olan deðerden fazla olamaz veya deðerler eþit olamazlar\nTekrar deneyin\n");
			continue;
		}
		
		
		srand(time(NULL));
		a=rand()%x+min;
		
		printf("Bilgisayar [%d,%d] aralýðýnda bir sayý tuttu,bulmaya çalýþalým\n",min,max);
		
		for(b=min-1;b != a;){
			printf("Tahmin:");
			scanf("%d",&b);
			
			if(b != a)
				printf("Tutmadý\n");
		}
		
		printf("%d=%d Aferin sayýyý buldunuz\n",a,b);
		
		printf("\nÇýkmak için E tuþuna basýnýz\nDevam etmek için rastgele bir tuþa basýnýz\n");
		ch=getch();
	}
	
return 0;
}
