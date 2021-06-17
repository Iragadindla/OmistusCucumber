package com.filib;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
      (
      features="src\\test\\resources\\crmFeaature\\Login.feature",
      glue= {"com.filib"},
      monochrome=true,
      plugin= {"pretty","json:target/cucumber.json"}
  		)
public class testTestRunner {

}
