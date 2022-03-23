#include <iostream>

using namespace std;

class Date
{
	int month;
	int day;
	int year;
	void setMonth(int);
	void setDay(int);
	void setYear(int);
public:
	void setDate(int a, int b, int c);
	void showDate(void);
};

void Date::setDate(int a, int b, int c)
{
	setMonth(a);
	setDay(b);
	setYear(c);
}

void Date::showDate(void)
{
	cout<<year<<" Year "<<month<<" Month "<<day<<" Day "<<endl;
}

void Date::setDay(int a)
{
	if (a<=31)
		day=a;
	else
		day=31;
}

void Date::setMonth(int a)
{
	if (a<=12)
		month=a;
	else
		month=12;
}

void Date::setYear(int a)
{
	year=a;
}

void main()
{
	Date x, y;

	x.setDate(1, 1, 2019);
	y.setDate(13, 40, 3000);

	x.showDate();
	y.showDate();
}
