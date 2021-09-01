package aug31;

public class Person {
	
	//String name="kani";
	
	private String name;
	private int age;
	
	Person()
	{
		
	}
	
//	Person(String name,int age)
//	{
//		this.name=name;
//		this.age=age;
//	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	boolean isEligibleForVote(String name,int age) throws Exception
	{
		int a=name.length();
		
		if(a==0 ||a<3 )
			throw new Exception("Person name is invalid");
		
		else if(age<18)
			throw new Exception("Age is invalid");
		
		else if(a!=0 && a>3 && age>18)
			throw new Exception("Eligible");
		
		else
			throw new Exception("Eligible");
		
		
		
	}

	public static void main(String args[])
	{
		//String name="akni";
		Person obj=new Person();
		//System.out.println(obj.isEligibleForVote("kani", 21)); 
		try {
			obj.isEligibleForVote("Kani", 21);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
