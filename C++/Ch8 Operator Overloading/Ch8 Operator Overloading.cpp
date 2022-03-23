#include <iostream>

using namespace std;

class complex
{
	float a, b;
public:
	complex(){}
	complex(float x, float y) {a=x, b=y;}
	void modify(float x, float y) {a=x, b=y;}
	complex operator + (complex);
	complex operator - (complex);
	void display(void);
};

complex complex::operator + (complex x)
{
	return complex(a+x.a, b+x.b);
}

complex complex::operator - (complex x)
{
	return complex(a-x.a, b-x.b);
}

void complex::display(void)
{
	if ( !a && b )
		cout<<b<<'i'<<endl;
	else if ( a && !b )
		cout<<a<<endl;
	else if ( !a && !b )
		cout<<0<<endl;
	else if ( a && b<0 )
		cout<<a<<b<<'i'<<endl;
	else
		cout<<a<<'+'<<b<<'i'<<endl;
}

void main()
{
	complex o(0, -2), p;
	p.modify(1, 2);

	complex q=o+p;
	complex r=o-p;

	o.display();
	p.display();
	q.display();
	r.display();
}