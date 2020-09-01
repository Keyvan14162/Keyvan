#include <stdio.h>
#include <conio.h>
#include <string.h>
#define limit 5
/* I make limit 5 because you cannot paste the hanger character that higher than z's hanger number
I dont know why we cant paste

This program will be respectively increase the characters number 
Program will increase the number first character 1,second  character 2...and last 5
Limit will reset and sixth character will be increase by 1 

I tried this code with only English charactres
*/


int main(){

char txt[3000];
int i,max;

printf("Enter the text you want to encrypt:\n");

gets(txt);

for(i=0,max=1;i<strlen(txt);i++,max++){
	txt[i]=txt[i]+max;
	if(max==limit)
		max=1;
	
}

printf("\nEncrypted version:\n");
puts(txt);

FILE *filep = fopen ("Encrypted_text.txt","w"); //In here program will open a  Encrpted_text txt file to where to code is
fputs(txt,filep);								//and it will add the encrypted text to that file						
fclose(filep);

for(i=0,max=1;i<strlen(txt);i++,max++){
	txt[i]=txt[i]-max;
	if(max == limit)
		max=1;
}


printf("\nSolved version:\n")	;
puts(txt);
}
