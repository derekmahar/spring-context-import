package ca.derekmahar.example.springContainerImport.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class D {
	private static Logger logger = LoggerFactory.getLogger(C.class);

	public D() {
		logger.info("Created D");
	}

	public void run() {
		logger.info("Running D");
	}
}
