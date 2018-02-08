#include<iostream>
using namespace std;
class linsearch
{
	public:
		int data()
		{
		int x,no,i,flag,y;
		cout<<"enter the size of array = ";
		cin>>x;
		 int a[x];
		 cout<<"Enter your elements in Array: ";
		 for(i=0;i<x;i++)
		 cin>>a[i];
		 cout<<"\nelements present in Array: ";
		 for(i=0;i<x;i++)
		 cout<<a[i]<<" ";
		 cout<<"\nenter the element to search = ";
		 cin>>no;
		 for(i=0;i<=x;i++)
		 {
		 	if(a[i]==no)
		 	{
		 	flag=1;
		 	y=i+1;
			}
		}
		 	if(flag==1)
		 	cout<<cout<<"\nsearching completed "<<no<<" is present at position: "<<y;
		 	else
		 	cout<<"\nsearching completed "<<no<<" is not present";
		}
};
int main()
{
	linsearch x;
	x.data();
	return 0;
}
