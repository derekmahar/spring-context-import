package ca.derekmahar.example.springContainerImport.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A {
	private static Logger logger = LoggerFactory.getLogger(A.class);

	private B b;
	private C c;
	
	public A(B b, C c) {
		this.b = b;
		this.c = c;
		logger.info("Created A");
	}

	public void run() {
		logger.info("Running A");
		b.run();
		c.run();
	}
}
