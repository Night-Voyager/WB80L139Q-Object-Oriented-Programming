#include <iostream>

using namespace std;

class integer
{
	int m, n;
public:
	integer(void);
	integer(int, int);
	integer(integer &x);
	~integer();
	void set(int, int);
	void display(void);
};

integer::integer(void) {m=0; n=0;}

integer::integer(int a, int b) {m=a; n=b;}

integer::integer(integer &x) {m=x.m; n=x.n;}

integer::~integer() {cout<<"END"<<endl;}

void integer::set(int a, int b)
{
	m=a; n=b;
}

void integer::display(void)
{
	cout<<"m = "<<m<<endl;
	cout<<"n = "<<n<<endl;
}

void main()
{
	integer x;

	x.display();

	x.set(1, 2);

	x.display();

	integer y(3, 4);

	y.display();

	integer z=y;

	z.display();
}