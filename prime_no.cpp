#include<iostream>
using namespace std;
class prime_no
{
	public:
		int x,ans,flag=0;
		int insert()
		{
			cout<<"Enter the number to check prime or not : ";
			cin>>x;
		}
		int check()
		{
			for(int i=2;i<=x/2;i++)
			{
				ans=x%i;
				if(ans==0)
				flag=1;
			}
		}
		int display()
		{
			if(flag==0)
			cout<<x<<" is a prime number";
			else
			cout<<x<<" is not prime number";
		}
};
int main()
{
	prime_no z;
	z.insert();
	z.check();
	z.display();
	return 0;
}
