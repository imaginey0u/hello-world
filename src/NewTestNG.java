import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestNG {
  @Test
  public void f() {
	  System.out.println("testing!!!");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test running...");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test running...");
  }

}
