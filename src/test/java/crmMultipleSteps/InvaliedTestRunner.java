package crmMultipleSteps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
      (
      features="src\\test\\resources\\crmFeaature\\invaliedData.feature",
      glue= {"crmMultipleSteps"},
      monochrome=true,
      plugin= {"pretty","json:target/cucumber.json"}
  		)


public class InvaliedTestRunner {

}
