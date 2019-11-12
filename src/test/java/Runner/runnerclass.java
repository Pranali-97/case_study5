package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\junit.feature",
                     glue="Testcase",
                     //plugin="html:target\\htmlreport"
                     plugin="json:target\\jsonreport.json",
					 tags= {"@payment"})
                    
public class runnerclass
{
	
}