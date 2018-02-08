#include<iostream>
using namespace std;
class function
{
public:
int* create(int* , int);
void merge_array(int*, int, int*, int, int);
void display(int* , int);
};
int main()
{
function ob1;
int* a; int* b; int size1,size2,size3; int* ptr1; int*ptr2;
cout<<"Enter size of first array :";
cin>>size1;
ptr1 = ob1.create(a , size1);
ob1.display(ptr1 , size1); 
cout<<"\nEnter the size of second array :";
cin>>size2;
ptr2 = ob1.create(b , size2);
ob1.display(ptr2 , size2); 
size3 = size1+size2;
ob1.merge_array(ptr1, size1, ptr2, size2, size3);
return 0;
}
int* function :: create(int* arr , int m)
{
arr = new int[m];
cout<<"Enter the elements : ";
for(int i = 0; i < m; i++)
{
cin>>arr[i];
}
return arr;
}
void function :: display(int* arr , int m)
{
for(int i = 0; i < m; i++)
{
	
cout<<arr[i]<<" ";
}
}
void function :: merge_array(int* arr1, int size1, int* arr2, int size2, int size3)
{
int* arr3;
arr3 = new int[size3];
int i = 0, j = 0, k = 0;
while(i < size1 && j < size2)
{
if(arr1[i] < arr2[j])
{
arr3[k] = arr1[i];
k++;
i++;
}
else
{
if(arr1[i] == arr2[j])
{
arr3[k] = arr1[i];
k++;
i++;
j++;
size3--;
}
else
{
arr3[k] = arr2[j];
k++;
j++;
}
}
}
if(i >= size1)
{
while( j <= size2)
{
arr3[k] = arr2[j];
k++;
j++;
}
}
if(j >= size2)
{
while( i <= size1)
{
arr3[k] = arr1[i];
k++;
i++;
}
}
cout<<"\nThe merged array is :";
display(arr3, size3);
}

