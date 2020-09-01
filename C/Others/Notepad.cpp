#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>


int main(){
	
printf("                        NOTEPAD");

printf("\n\nThis program will add a 'NOTEPAD.txt' file to programs files directory.\n");
printf("You can write your notes to the that file with this program.\n");
printf("You should just run the program and write what you want :)\n\n");

int a;
printf("For add a new note enter :1\nFor delete all notes enter :2\n");
scanf("%d",&a);

if(a == 1){
	
	int ex;
	
	do{
		
		FILE *filep = fopen("NOTEPAD.txt","a");	
		char data[200];
		
		fgets(data,200,stdin);//didnt use 1 fgets function after a scan idk why
				
		printf("\nDate:");
		fgets(data,200,stdin);
		fputs(data,filep);
				
		printf("\nNOTE(Push enter for finish):");
		fgets(data,200,stdin);
		fputs(data,filep);
		
		fclose(filep);
		
		printf("\nFor exit:1\nFor new note :2\n");
		scanf("%d",&ex);
		
		if(ex != 1 && ex != 2){
			printf("Wrong key!!!");
			break;
		}
	}
	while(ex == 2);
}



else if(a == 2){
	FILE *filep = fopen("NOTEPAD.txt","w");
	printf("All notes were deleted");	
}



else
	printf("Wrong key!!!");
	
printf("\nThanks for using :)");

}
