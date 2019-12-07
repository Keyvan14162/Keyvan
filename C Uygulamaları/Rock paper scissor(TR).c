#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <locale.h>

main(){

setlocale(LC_ALL, "Turkish");

int a,b,i,pc=0,user=0,n,exit=1;
char isim[20];

while(exit==1){
	printf("------------------------------------------\n");
	printf("TAÞ KAÐIT MAKAS OYUNU\n\n");
	printf("Takma adýnýzý giriniz:");
	scanf("%s",isim);
	
	
	printf("Kaç tur oynamak istersiniz?\nTur sayýsý:");
	scanf("%d",&n);
	
	
	for(i=0;i<n;i++){
		printf("---------------------\n");
		printf("\n1=TAÞ\n2=KAÐIT\n3=MAKAS\n");
		scanf("%d",&a);
	
			if(a==1)
				printf("\nTaþ seçtiniz");
			else if(a==2)
				printf("\nKaðýt seçtiniz");
			else if(a==3)
				printf("\nMakas seçtiniz");
			else{
				printf("\nYanlýþ deðer girdiniz\n");
				continue;
			}
			
		srand(time(NULL));
		b=rand()%3+1;
		
			if(b==1)
				printf("\nBilgisayar taþ seçti\n");
			else if(b==2)
				printf("\nBilgisayar kaðýt seçti\n");
			else if(b==3)
				printf("\nBilgisayar makas seçti\n");
	
		
			if(a==b){
				printf("\nEþitlik,bilgisayar ve %s 1 puan kazandýlar\n\n",isim);
				pc+=1;
				user+=1;
			}
			else if((a==1 && b==3) || (a==2 && b==1) || (a==3 && b==2)){
				printf("\n%s 1 puan kazandý\n\n",isim);
				user+=1;
			}
			else{
				printf("\nBilgisayar 1 puan kazandý\n\n");
				pc+=1;
			}
		}
		
		printf("\n\n%s:%d Bilgisayar:%d\n",isim,user,pc);
		
			if(user==pc)
				printf("\n--Beraberlik--");
			else if(user>pc)
				printf("\n--%s kazandý--",isim);
			else
				printf("\n--Bilgisayar kazandý--");
			
	printf("\n\n0=Çýk\n1=Baþa Dön\n");
	scanf("%d",&exit);
	
}
getch();
}
