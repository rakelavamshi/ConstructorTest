
public class TestConstructor 
{

	int rollNo;
	String name;
	
	TestConstructor() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("Calling simple Constructor");
	}
	
	TestConstructor(int r,String n)
	{
		System.out.println("calling parameterized constructor!!!");
		rollNo=r;
		name=n;
	}
	
	void display()
	{
		System.out.println(rollNo+"\n"+name);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor s0=new TestConstructor();
		TestConstructor s1=new TestConstructor(123,"vam");
	
		
		s1.display();
		TestConstructor s2=new TestConstructor(124,"vam11");
		s2.display();
		
	}

}
