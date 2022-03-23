#include <iostream>

using namespace std;

void main()
{
	int *ptr;
	int i;

	ptr = new int;
	*ptr = 10;
	cout<<*ptr<<endl;

	delete ptr;
	cout<<*ptr<<endl;

	ptr = new int [10];
	for (i=0; i<10; i++)
		ptr[i] = i;
	for (i=0; i<10; i++)
		cout<<ptr[i]<<endl;
	
	delete ptr;
	for (i=0; i<10; i++)
		cout<<ptr[i]<<endl;
}