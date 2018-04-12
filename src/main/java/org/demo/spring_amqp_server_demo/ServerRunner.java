package org.demo.spring_amqp_server_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;

public class ServerRunner implements CommandLineRunner {

	@Value("${tutorial.client.duration:0}")
	private int duration;

	@Autowired
	private ConfigurableApplicationContext ctx;


	public void run(String... arg0) throws Exception {
		System.out.println("Ready ... running for " + duration + "ms");
		Thread.sleep(duration);
		ctx.close();
	}
}
