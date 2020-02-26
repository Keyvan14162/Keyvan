#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>
#define max 50


void selectionsort(int arr[],int size){
	
	int j,i,minindex;
	
	for(i=0;i<size;i++){
		minindex=i;
		for(j=i;j<size;j++){
			if(arr[j] < arr[minindex]){
				minindex=j;
			}
	}
	int temp=arr[i];
	arr[i]=arr[minindex];
	arr[minindex]=temp;
	}
}

int main(){
	int array[max],size,i;
	printf("Eleman sayisi:");
	scanf("%d",&size);
	
	for(i=0;i<size;i++)
		scanf("%d",&array[i]);
		
	selectionsort(array,size);
	
	for(i=0;i<size;i++)
		printf("%d ",array[i]);
	
	
}

              

