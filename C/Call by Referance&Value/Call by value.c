#include <stdio.h>
#include <time.h>
#include <stdlib.h> 
#include <locale.h>
#include <string.h>

void lol(int x,int y);

main(){
int a=1,b=2;

lol(a,b);

printf("a=%d b=%d",a,b);
}

void lol(int c,int d){
	
	int gec;
	
	gec=c;
	
	c=d;
	
	d=gec;
	
	printf("c=%d d=%d\n",c,d);
	
	
}
