#include <iostream>
#include <fstream>
#include <ctype.h>

using namespace std;

void main()
{
	char str[30];

	ifstream file("test.txt");

	file>>str;
	cout<<str<<endl;

	file.getline(str, 30);
	cout<<str;

	file.close();
}