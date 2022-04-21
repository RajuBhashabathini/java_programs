package com.shad.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "intel")
@Primary
public class IntelProcessor implements Processor {

	public void process() 
	{
		System.out.println("Intel is running");

	}

}