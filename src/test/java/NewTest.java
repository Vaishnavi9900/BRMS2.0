import org.testng.annotations.Test;

public class NewTest {
  
	
	@Test(priority = 0)
	public void test() {
		
		int a=10;
		int b;
		System.out.println(b=a/0);
		
	}
	
	@Test(dependsOnMethods = "test")
	public void test1() {
		System.out.println("test1");
	}
	@Test(dependsOnMethods = "test")
    public void test2() {
    	System.out.println("test2");
	}
}
