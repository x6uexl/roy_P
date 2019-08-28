import java.util.logging.Logger;
public class Log4jTester {
	public  static Logger logger=Logger.getLogger(Log4jTester.class);
	
	public static void main(String[] args) {
		Log4jTester.test();	
	}
	 public static void test(){
		 
		 //记录debug级别的日志
		 logger.debug("记录debug级别的日志");
		 //记录info级别的日志
		 logger.info("记录info级别的日志");
		 //记录warning级别的日志
		 logger.warning("记录warning级别的日志");
		 //记录error级别的日志
		 logger.error("记录error级别的日志");
		 
	 }

}
