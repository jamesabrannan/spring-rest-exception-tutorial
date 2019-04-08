package com.tutorial.exceptions.spring.rest.exceptionstutorial;


import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	public HelloGoodbye createGreeting(String type, int id) throws GreetingTypeException {
		
		HelloGoodbye helloGoodbye = new HelloGoodbye();


			if (type.equals("hello")) {
				helloGoodbye.setGreeting("Hello there " + this.getPersonName(id));
			} else if (type.equals("goodbye")) {
				helloGoodbye.setGoodbye("Goodbye for now " + this.getPersonName(id));
			}
			else
			{
				throw new GreetingTypeException("Valid types are hello or goodbye.");
			}

			helloGoodbye.setType(type);

		return helloGoodbye;
	}
	
	
	public String getPersonName(int id) {
		
		if(id==1) {
			return "Tom";
		}
		else if(id==2) {
			return "Sue";
		}
		else
		{
			throw new NameNotFoundException(Integer.toString(id));
		}
		
	}
	
}
