package com.javainuse.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.javainuse.model.Alert;

public class MyProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		Alert alert = exchange.getIn().getBody(Alert.class);
		
	}

}