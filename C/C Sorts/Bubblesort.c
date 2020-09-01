#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>
#define max 50


void bubblesort(int arr[],int size){
	
	int i,j;
	
	for(i=0;i<size;i++)
		for(j=1;j<size-i;j++)
			if(arr[j-1]>arr[j]){
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
}

int main(){
	int array[max],size,i;
	printf("Eleman sayisi:");
	scanf("%d",&size);
	
	for(i=0;i<size;i++)
		scanf("%d",&array[i]);
		
	bubblesort(array,size);
	
	for(i=0;i<size;i++)
		printf("%d ",array[i]);
	
	
}

              

