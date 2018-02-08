#include<iostream>
using namespace std;
class array
{
public:
  void create();
    void display();
	void merge(array , array );
	int* arr, size;
};
void array::create()
{
 cout<<"\nWhat is the size of the array\n";
    cin>>size;
    arr = new int[size];
    cout<<"\nPlease enter the values in ascending order only.\n\n";
    for(int i = 0; i < size; i++)
    {
 cin>>arr[i];
    }
}
//definition for display function
void array::display()
{
    for(int i = 0; i < size; i++)
    {
        cout<<arr[i]<<"  ";
    }
    cout<<endl;
}
void array::merge(array ob1 , array ob2)
{
   array ob3;
    ob3.size = ob1.size + ob2.size;
   ob3.arr = new int[ob3.size];
    int i = 0, j = 0, k = 0;
  int end1 = (ob1.size-1);
    int end2 = (ob2.size-1);
    while( i <= end1 && j <= end2)
    {
        if( ob1.arr[i] < ob2.arr[j])
        {
            ob3.arr[k] = ob1.arr[i];
            i++;
            k++;
        }
        else
        {
            if( ob1.arr[i] == ob2.arr[j])
            {
                ob3.arr[k] = ob1.arr[i];
                k++;
                i++;
                j++;
                ob3.size--;
            }
            else
          {
                ob3.arr[k] = ob2.arr[j];
                k++;
                j++;
            }
        }
    }
if( i >= ob1.size)
    {
        while(j <= ob2.size)
        {
            ob3.arr[k] = ob2.arr[j];
            k++;
            j++;
        }
    }
    if( j >= ob2.size)
    {
        while(i <= ob1.size)
        {
            ob3.arr[k] = ob1.arr[i];
            k++;
            i++;
        }
    }
    cout<<"\n\nThe merged array is as follows :\n\n";
    ob3.display();
}
int main()
{
        array ob1, ob2, ob3;
        ob1.create();
        ob1.display();
        ob2.create();
        ob2.display();
        ob3.merge(ob1, ob2);
    return 0;

}

