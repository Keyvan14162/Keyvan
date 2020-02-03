#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>


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
	printf("Number of array elements:");
	scanf("%d",&size);
	
	for(i=0;i<size;i++)
		scanf("%d",&array[i]);
		
	selectionsort(array,size);
	
	for(i=0;i<size;i++)
		printf("%d ",array[i]);
	
	
}

              

