#include <iostream>

using namespace std;

class primary
{
protected:
	int a, b;
	double c;
public:
	primary(void) {a=b=c=0;}
	void get(void) {cin>>a; cin>>b;}
	void show(void) {cout<<c<<endl;}
	void plus(void) {c=a+b;}
	void sub(void) {c=a-b;}
};

class upper: public primary
{
public:
	void mul(void) {c=a*b;}
	void divide(void) {c=a/b;}
};

void main()
{
	upper x;
	x.show();
	x.get();
	x.mul();
	x.show();
}