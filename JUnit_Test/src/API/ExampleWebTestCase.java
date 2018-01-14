package API;
import junit.framework.TestCase;
import net.sourceforge.jwebunit.WebTester;
public class ExampleWebTestCase extends TestCase {
private WebTester tester;
public ExampleWebTestCase(String name) {
super(name);
tester = new WebTester();
}
//set base url
public void setUp() throws Exception {
getTestContext().setBaseUrl("http://myserver:8080/myapp");
}
//test base info
@Test
public void testInfoPage() {
beginAt("/info.html");
}
}

//
//public class ExampleWebTestCase {
//
//}
