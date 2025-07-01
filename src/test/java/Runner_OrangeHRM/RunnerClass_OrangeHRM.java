package Runner_OrangeHRM;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
      (
    	          //path of the feature file	  
       features= {"src\\test\\resources\\AppTest\\loginOrangeHRM.feature"},

              //map/glue test steps with Methods of step defination class
       glue= {"StepDef_OrangeHRM"},
       
       plugin= {"pretty"}
      )


      public class RunnerClass_OrangeHRM extends AbstractTestNGCucumberTests
      {
	
       }
