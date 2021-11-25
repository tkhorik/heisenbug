package io.github.tkhorik.eroshenkoworkshop.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import io.github.tkhorik.eroshenkoworkshop.HeisenbugApp;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = HeisenbugApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
