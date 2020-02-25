
// my package name
package ymc.exe.app;

// include some package
//import org.apache.log4j.Logger;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

// create my class
public class ComputerTest {
  @Test
  public void testHelloWorld() {
    Computer app = new Computer();
    assertThat("Hello World.", is("Hello World."));
  }
}
