#include <stdio.h>
#include <locale.h>

main(){
	
setlocale(LC_ALL,"Turkish");
	
int a,b,min,max,x;
char ch;
ch='a';

	while((ch=toupper(ch)) != 'E'){
	
		printf("--------------------------------------------------------\n");
		printf("Determine the range in which the computer keeps numbers\nMin:");
		scanf("%d",&min);
		printf("Max:");
		scanf("%d",&max);
		
		x=(max-min)+1;
		
		if(max==min || min>max){
			printf("\nMin and max cannot be equal or min cannot be higher than max\nTry again\n");
			continue;
		}
		
		
		srand(time(NULL));
		a=rand()%x+min;
		
		printf("Selected number range=[%d,%d],Lets try to find!\n",min,max);
		
		for(b=min-1;b != a;){
			printf("Guess:");
			scanf("%d",&b);
			
			if(b != a)
				printf("Nope\n");
		}
		
		printf("%d=%d Nice job!\n",a,b);
		
		printf("\nFor exit press 'e'\nFor continue press any key\n");
		ch=getch();
	}
	
return 0;
}
