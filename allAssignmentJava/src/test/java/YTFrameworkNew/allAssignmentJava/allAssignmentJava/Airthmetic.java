package allAssignmentJava;
//((((10+2)-2)+2)*2)/2

public class Airthmetic {

	
	public int sum(int a , int b)
	{
		int s1;
		s1=a+b;
		System.out.println("sum of a and b is " + s1);
		return s1;
	}
	
	public int sub(int d, int p)
	{
		int su;
		su= d-p;
		System.out.println("subtaction of d and p is "+ su);
		return su;
	}
	public int multi(int r, int y)
	{
		int m;
		m= r*y;
		System.out.println("Multiplication of r and y is "+ m);
		return m;
		
	}
public void dev(int g,int o)
{
	int d;
	d= g/o;
	System.out.println("devision of g and o is " + d);
}
public static void main(String[] args) {
	Airthmetic sush=new Airthmetic();
	int Sumresult =sush.sum(10, 2);
	int subresult= sush.sub(Sumresult, 2);
	int Sumresult2= sush.sum(subresult, 2);
	int multiresult = sush.multi(Sumresult2, 2);
	sush.dev(multiresult, 2);
	
	
}

}


