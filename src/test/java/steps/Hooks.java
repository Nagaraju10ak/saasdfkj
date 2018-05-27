package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class Hooks extends ProjectMethods {

	@After
	public void afterMethod (Scenario sc)
	{
		//System.out.println(sc.getStatus());
		closeAllBrowsers();
		endResult();
	}
	@Before
	public void beforeMethod(Scenario sc)
	{
		//System.out.println("hello");
		//System.out.println(sc.getId());
		//System.out.println(sc.getName());
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("smoke");
		test.assignAuthor("rishabh");
		startApp("chrome");	
		
	}
}
