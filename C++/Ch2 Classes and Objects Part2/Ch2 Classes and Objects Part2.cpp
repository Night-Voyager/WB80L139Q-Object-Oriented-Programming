#include <iostream>
#include <string>

using namespace std;

class Customer
{
	int ID;
	char name[30];
	int credit_limit;
public:
	void setData(int, char * , int);
	void display(void);
};

void Customer::setData(int a, char *str, int b)
{
	ID = a;
	strcpy(name, str);
	credit_limit = b;
}

void Customer::display(void)
{
	cout<<ID<<' '<<name<<' '<<credit_limit<<endl;
}

void main()
{
	Customer customer[5];

	customer[0].setData(18722001, "DAI", 0);
	customer[1].setData(18722007, "HAO", 1000000);
	customer[2].setData(18722006, "GUO", 999999);
	customer[3].setData(18722014, "LI", 999999);
	customer[4].setData(18722000, "Nobody", -1);

	for (int i=0; i<5; i++)
		customer[i].display();
}