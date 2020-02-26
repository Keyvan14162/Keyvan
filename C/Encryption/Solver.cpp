#include <stdio.h>
#include <conio.h>
#include <string.h>

// U can paste Encrypted code to here and program will solve it

int main(){

char txt[3000];
int i,max,limit = 5;
gets(txt);

for(i=0,max=1;i<strlen(txt);i++,max++){
	txt[i]=txt[i]-max;
	if(max == limit)
		max=1;
}

printf("\nSolved version:")	;
puts(txt);
}
