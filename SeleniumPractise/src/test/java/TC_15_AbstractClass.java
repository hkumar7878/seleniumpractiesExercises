
public class TC_15_AbstractClass {
	
	
	public abstract class AbstractDemo{
		public void myMethod() {
			System.out.println("Hello");
		}
		
		abstract public void anotherMethod();
			
		
	}
	
	public class ConcreteDemo{
		public void anotherMethod()
		{
			System.out.println("Abstract method");
		}
	}
	
	public static void main(String[] args) {
		//ConcreteDemo obj=new ConcreteDemo();
		
	}

}
