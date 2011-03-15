package ca.derekmahar.example.springContainerImport.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class C {
	private static Logger logger = LoggerFactory.getLogger(C.class);
	
	private D d;

	public C(D d) {
		this.d = d;
		logger.info("Created C");
	}

	public void run() {
		logger.info("Running C");
		d.run();
	}
}
