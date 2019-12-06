#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <locale.h>

main(){

setlocale(LC_ALL, "Turkish");

int a,b,i,pc=0,user=0,n,exit=1;
char name[20];

while(exit==1){
	printf("------------------------------------------\n");
	printf("ROCK PAPER SCISSORS GAME\n\n");
	printf("Nickname:");
	scanf("%s",name);
	
	
	printf("How many tour you want to play?\nTours:");
	scanf("%d",&n);
	
	
	for(i=0;i<n;i++){
		printf("---------------------\n");
		printf("\n1=ROCK\n2=PAPER\n3=SCISSORS\n");
		scanf("%d",&a);
	
			if(a==1)
				printf("\nYou have chosen stone");
			else if(a==2)
				printf("\nYou have chosen paper");
			else if(a==3)
				printf("\nYou have chosen scissors");
			else{
				printf("\nOops! Wrong number\n");
				continue;
			}
			
		srand(time(NULL));
		b=rand()%3+1;
		
			if(b==1)
				printf("\nComputer have chosen stone\n");
			else if(b==2)
				printf("\nComputer have chosen paper\n");
			else if(b==3)
				printf("\nComputer have chosen scissors\n");
	
		
			if(a==b){
				printf("\nDraw,computer and %s won 1 point\n\n",name);
				pc+=1;
				user+=1;
			}
			else if((a==1 && b==3) || (a==2 && b==1) || (a==3 && b==2)){
				printf("\n%s won 1 point\n\n",name);
				user+=1;
			}
			else{
				printf("\nComputer won 1 point\n\n");
				pc+=1;
			}
		}
		
		printf("\n\n%s:%d Computer:%d\n",name,user,pc);
		
			if(user==pc)
				printf("\n--DRAW--");
			else if(user>pc)
				printf("\n--%s WON--",name);
			else
				printf("\n--COMPUTER WON--");
			
	printf("\n\n0=EXIT\n1=BACK TO TOP\n");
	scanf("%d",&exit);
	
}
getch();
}
