

import org.apache.log4j.Logger;

public class Tester {
	public static Logger logger=  Logger.getLogger(Tester.class);
 public static void main(String[] args) {	 
	 logger.info("dfjl");
	 logger.debug(" This is debug!!!");
     logger.info(" This is info!!!");
     logger.warn(" This is warn!!!");
     logger.error(" This is error!!!");
     logger.fatal(" This is fatal!!!");
     }
}
