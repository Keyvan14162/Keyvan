#include <stdio.h>
#include <time.h>
#include <stdlib.h> 
#include <locale.h>
		
//This is may way to solve this,there is more and easier ways to do

main(){

		setlocale(LC_ALL,"Turkish");
		
		float a;
		int i,j,c=1,lang,exit=1;
		
		printf("Türkçe için:1\nFor English:2\n");
		scanf("%d",&lang);
		
	if(lang == 1){
		
		while(exit == 1){
						
			printf("Değeri giriniz:");
			scanf("%f",&a);
					
			if(a < 0)
				a = a*-1;
				
			if(a==2){
				printf("Asal");
			}
					
			else if(a == 1)
				printf("Asal değil");
					
			else{
				for(i=1;i<a;i++){
					for(j=1;j<a;j++){				
							if(a/i == j){
							c=0;
						}
					}
				}
			}
			
			if(c==0)
				printf("Asal deðil");
			else if(c != 0)
				printf("Asal");
			
			c=0;
			
			printf("\nÇıkış:0\nDevam:1\n");
			scanf("%d",&exit);
		}
	}
	////////////////////////////////////////////////////
	else if(lang == 2){
		
		while(exit == 1){
			
			
			printf("Number:");
			scanf("%f",&a);
					
			if(a < 0)
				a = a*-1;
				
			if(a==2){
				printf("Number is prime");
			}
					
			else if(a == 1)
				printf("Number is not prime");
					
			else{
				for(i=1;i<a;i++){
					for(j=1;j<a;j++){				
						if(a/i == j){
							c=0;
						}
					}
				}
			}
			
			if(c==0)
				printf("Number is not prime");
			else if(c != 0)
				printf("Number is prime");
			
			c=1;
			
			printf("\nExit:0\nContinue:1\n");
			scanf("%d",&exit);
			
			
		}
	}

	else 
		printf("Hata/Error");
		
		
}
