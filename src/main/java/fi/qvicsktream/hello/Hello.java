package fi.qvicsktream.hello;

import org.slf4j.LoggerFactory;



public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		org.slf4j.Logger logger = LoggerFactory.getLogger(Hello.class);
		logger.trace("Main starting");
		logger.info("Hello Maven!");

	}

}
