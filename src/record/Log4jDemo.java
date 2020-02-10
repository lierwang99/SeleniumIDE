package record;

import org.apache.log4j.Logger;

public class Log4jDemo {
	 private static Logger logger = Logger.getLogger(Log4jDemo.class);  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("调试信息1");
		logger.warn("警告信息2");
		logger.fatal("致命的错误信息3");
		logger.error("错误信息4");
	}

}
