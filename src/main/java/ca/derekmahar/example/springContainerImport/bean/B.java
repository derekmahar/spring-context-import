package ca.derekmahar.example.springContainerImport.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B {
	private static Logger logger = LoggerFactory.getLogger(B.class);
	
	private D d;

	public B(D d) {
		this.d = d;
		logger.info("Created B");
	}

	public void run() {
		logger.info("Running B");
		d.run();
	}
}
