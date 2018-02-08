#include<iostream>
using namespace std;
class selection
{
	public:
		int i,min,size,loc,temp,j;
		int* pointers;
		int insert()
		{
			cout<<"how many elements do you want to enter in array = ";
			cin>>size;
			pointers= new int[size];
			cout<<"Enter your elements in Array: ";
			for(i=0;i<size;i++)
			{
			cin>>pointers[i];
			}
			cout<<"\n\nelements present in Array: \n";
			for(i=0;i<size;i++)
			{
		  	cout<<pointers[i]<<"\t";
			}
		}
		int sort()
		{
			for(i=0;i<size;i++)
			{
				min=pointers[i];
				loc=i;
				for(int j=i+1;j<size;j++)
				{
            	if(min>pointers[j])
					{
                		min=pointers[j];
                		loc=j;
            		}
        		}
        		temp=pointers[i];
				pointers[i]=pointers[loc];
				pointers[loc]=temp;
			}
		}
		int display()
		{
			cout<<"\nsorted array = \n";
			for(i=0;i<size;i++)
			cout<<pointers[i]<<"\t";
		}
};
int main()
{
	selection x;
	x.insert();
	x.sort();
	x.display();
	return 0;
}
