package com.UST.Interviewfeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class InterviewfeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewfeedbackApplication.class, args);
	}

}
