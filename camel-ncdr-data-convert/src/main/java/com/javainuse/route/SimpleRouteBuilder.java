package com.javainuse.route;

import javax.xml.bind.JAXBContext;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.routepolicy.quartz.CronScheduledRoutePolicy;

import com.javainuse.model.Alert;
import com.javainuse.processor.MyProcessor;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		//
		CronScheduledRoutePolicy startPolicy = new CronScheduledRoutePolicy();
		startPolicy.setRouteStartTime("0 0/1 * * * ?");
		
		// XML Data Format
		JaxbDataFormat xmlDataFormat = new JaxbDataFormat();
		JAXBContext con = JAXBContext.newInstance(Alert.class);
		xmlDataFormat.setContext(con);
		//to("jms:queue:ncdr_WRA_ReservoirWarn")
		// JSON Data Format
		JacksonDataFormat jsonDataFormat = new JacksonDataFormat(Alert.class);

		from("file:C:/MARIA/WRA_ReservoirWarn").routePolicy(startPolicy).noAutoStartup().doTry().unmarshal(xmlDataFormat).
		process(new MyProcessor()).marshal(jsonDataFormat).to("file:C:/outputFolder?fileName=${file:name.noext}.json")
		.doCatch(Exception.class).process(new Processor() {
					public void process(Exchange exchange) throws Exception {
						Exception cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
						System.out.println(cause);
					}
				});
	}
}
