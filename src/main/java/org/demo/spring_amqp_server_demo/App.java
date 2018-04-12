package org.demo.spring_amqp_server_demo;

import org.demo.spring_amqp_server_demo.ServerRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
	
	@Bean
	public CommandLineRunner runner() {
		return new ServerRunner();
	}
	
}
