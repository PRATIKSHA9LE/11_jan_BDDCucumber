package Runner_OrangeHRM;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
    features= {"C:\\my BDDworkspace\\BDD_11Jan_Only_Automation\\src\\test\\resources\\AppTest\\WidgetsOrangeHRM.feature"},
    
    glue= {"StepDef_OrangeHRM"},
    
    plugin= {"pretty"},
		
	publish=true	
		)

public class Runner_DashBoardWedget  extends AbstractTestNGCucumberTests
{
     //runner class
}
