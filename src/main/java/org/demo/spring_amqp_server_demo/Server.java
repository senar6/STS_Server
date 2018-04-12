package org.demo.spring_amqp_server_demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class Server {

	@RabbitListener(queues = "req.queue")
	public String greetBot(String message) {
		System.out.println(" [x] Received request for " + message);
		String result = "Test Case ID#: 89491.0 #& Similarity Index#: 99% #& Test Name#: Sample test name1 #& Test Description #: This is a sample test description for the test case1 #@ Test Case ID#: 89467.0 #& Similarity Index#: 99% #& Test Name#: Sample test name2 #& Test Description #: This is a sample test description for the test case2 #@ Test Case ID#: 75547.0 #& Similarity Index#: 99% #& Test Name#: Sample test name3 #& Test Description #: This is a sample test description for the test case3 #@ Test Case ID#: 89466.0 #& Similarity Index#: 99% #& Test Name#: Sample test name4 #& Test Description #: This is a sample test description for the test case4 #@ Test Case ID#: 89492.0 #& Similarity Index#: 99% #& Test Name#: Sample test name5 #& Test Description #: This is a sample test description for the test case5";
		System.out.println(" [.] Returned " + result);
		return result;
	}

}
