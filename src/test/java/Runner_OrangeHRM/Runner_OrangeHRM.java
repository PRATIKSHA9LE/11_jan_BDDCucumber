package Runner_OrangeHRM;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		           //location of feature file
		features= {"src\\test\\resources\\AppTest\\LoginWithData.feature"},
		
		        //map step with def
		glue= {"StepDef_OrangeHRM"},
		
		plugin= {"pretty"}
		
		//publish=true
		)

public class Runner_OrangeHRM extends AbstractTestNGCucumberTests
{

}
