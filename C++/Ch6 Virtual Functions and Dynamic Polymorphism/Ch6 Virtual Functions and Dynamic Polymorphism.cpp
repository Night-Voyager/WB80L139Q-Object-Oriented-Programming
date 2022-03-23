#include <iostream>

using namespace std;

class media
{
protected:
	char *name;
public:
	media(void)
	{
		name=new char[30];
	}
	~media(void)
	{
		delete name;
	}
	virtual void get(void)
	{
		cin>>name;
	}
	virtual void show(void)
	{
		cout<<name<<endl;
	}
};

class book: public media
{
	int totalPage;
public:
	void get(void)
	{
		cin>>name;
		cin>>totalPage;
	}
	void show(void)
	{
		cout<<name<<' '<<totalPage<<endl;
	}
};

class video: public media
{
	float totalTime;
public:
	void get(void)
	{
		cin>>name;
		cin>>totalTime;
	}
	void show(void)
	{
		cout<<name<<' '<<totalTime<<endl;
	}
};

void main()
{
	media a;
	book b;
	video c;

	a.get();
	b.get();
	c.get();

	a.show();
	b.show();
	c.show();
}