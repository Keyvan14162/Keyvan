#include <stdio.h>
#include <locale.h>

main(){
	
setlocale(LC_ALL,"Turkish");
	
int a,b,min,max,x;
char ch;
ch='a';

	while((ch=toupper(ch)) != 'E'){
	
		printf("--------------------------------------------------------\n");
		printf("Bilgisayarin hangi aral�kta say� tutaca��n� belirleyiniz\nEn az:");
		scanf("%d",&min);
		printf("En �ok:");
		scanf("%d",&max);
		
		x=(max-min)+1;
		
		if(max==min || min>max){
			printf("\nAz olan de�er �ok olan de�erden fazla olamaz veya de�erler e�it olamazlar\nTekrar deneyin\n");
			continue;
		}
		
		
		srand(time(NULL));
		a=rand()%x+min;
		
		printf("Bilgisayar [%d,%d] aral���nda bir say� tuttu,bulmaya �al��al�m\n",min,max);
		
		for(b=min-1;b != a;){
			printf("Tahmin:");
			scanf("%d",&b);
			
			if(b != a)
				printf("Tutmad�\n");
		}
		
		printf("%d=%d Aferin say�y� buldunuz\n",a,b);
		
		printf("\n��kmak i�in E tu�una bas�n�z\nDevam etmek i�in rastgele bir tu�a bas�n�z\n");
		ch=getch();
	}
	
return 0;
}
