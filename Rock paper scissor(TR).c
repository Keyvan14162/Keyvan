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
	printf("TA� KA�IT MAKAS OYUNU\n\n");
	printf("Takma ad�n�z� giriniz:");
	scanf("%s",isim);
	
	
	printf("Ka� tur oynamak istersiniz?\nTur say�s�:");
	scanf("%d",&n);
	
	
	for(i=0;i<n;i++){
		printf("---------------------\n");
		printf("\n1=TA�\n2=KA�IT\n3=MAKAS\n");
		scanf("%d",&a);
	
			if(a==1)
				printf("\nTa� se�tiniz");
			else if(a==2)
				printf("\nKa��t se�tiniz");
			else if(a==3)
				printf("\nMakas se�tiniz");
			else{
				printf("\nYanl�� de�er girdiniz\n");
				continue;
			}
			
		srand(time(NULL));
		b=rand()%3+1;
		
			if(b==1)
				printf("\nBilgisayar ta� se�ti\n");
			else if(b==2)
				printf("\nBilgisayar ka��t se�ti\n");
			else if(b==3)
				printf("\nBilgisayar makas se�ti\n");
	
		
			if(a==b){
				printf("\nE�itlik,bilgisayar ve %s 1 puan kazand�lar\n\n",isim);
				pc+=1;
				user+=1;
			}
			else if((a==1 && b==3) || (a==2 && b==1) || (a==3 && b==2)){
				printf("\n%s 1 puan kazand�\n\n",isim);
				user+=1;
			}
			else{
				printf("\nBilgisayar 1 puan kazand�\n\n");
				pc+=1;
			}
		}
		
		printf("\n\n%s:%d Bilgisayar:%d\n",isim,user,pc);
		
			if(user==pc)
				printf("\n--Beraberlik--");
			else if(user>pc)
				printf("\n--%s kazand�--",isim);
			else
				printf("\n--Bilgisayar kazand�--");
			
	printf("\n\n0=��k\n1=Ba�a D�n\n");
	scanf("%d",&exit);
	
}
getch();
}
