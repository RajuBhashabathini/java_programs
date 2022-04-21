package com.shad.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "amd")
//@Primary
public class AmdProcessor implements Processor {

	public void process()
	{
		System.out.println("AMD is running");

	}

}