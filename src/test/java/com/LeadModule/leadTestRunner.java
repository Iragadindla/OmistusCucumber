package com.LeadModule;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
      (
      features="src\\test\\resources\\crmFeaature\\Lead.feature",
      glue= {"com.LeadModule"},
      monochrome=true,
      plugin= {"pretty","json:target/cucumber.json"}
  		)
public class leadTestRunner {

}
