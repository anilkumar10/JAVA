#include<iostream>
using namespace std;
class combined
{
	public:
	int size,x,n,i,no,pos;
	int* pointers;
	int read()
	{
		cout<<"enter the size of array = ";
		cin>>size;
		pointers=new int[size];
		cout<<"how many elements do you want to enter in array = ";
		cin>>x;
		cout<<"Enter your elements in Array: ";
		for(i=0;i<x;i++)
			cin>>pointers[i];
	}
	int display()
	{
		cout<<"\n\nelements present in Array: ";
		for(i=0;i<x;i++)
		cout<<pointers[i]<<" ";
	}
		int insert_new()
	{
		cout<<"\n\nEnter position where you to insert number: ";
		cin>>pos;		
		if(pos>x+1)
		cout<<"\n\n enter valid input";
		else
		{
		cout<<"\n\nEnter the new number: ";
		cin>>no;
		--pos;
		for(i=x-1;i>=pos;i--) 
			pointers[i+1]=pointers[i];
		pointers[pos]=no;
		x=x+1;
		}
	}
		int del()
	{
		cout<<"\n\nEnter position where you to delete number: \n";
		cin>>pos;
		if(pos>size)
		{
		cout<<"enter the valid input: ";
		}
		else
		{
		--pos;
		for(i=pos;i<size-1;i++)
		{
	 	pointers[i]=pointers[i+1];
	 	} 
		x=x-1;}
	}
};
int main()
{
	combined z;
	z.read();
	z.display();
	z.insert_new();
	z.display();
	z.del();
	z.display();
	return 0;
}
