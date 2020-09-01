#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>
#define max 50


void insertionsort(int arr[],int size){
	
	int i,j,element;
	
	for(i=1;i<size;i++){
		element = arr[i],
		j=i-1;
		while(j >= 0 && arr[j] > element){
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1]=element;
	}
}

int main(){
	int array[max],size,i;
	printf("Eleman sayisi:");
	scanf("%d",&size);
	
	for(i=0;i<size;i++)
		scanf("%d",&array[i]);
		
	insertionsort(array,size);
	
	for(i=0;i<size;i++)
		printf("%d ",array[i]);
	
	
}

              

