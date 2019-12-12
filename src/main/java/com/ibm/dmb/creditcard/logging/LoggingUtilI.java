package com.ibm.dmb.creditcard.logging;

public interface LoggingUtilI {
	
	public long startLog(String className,String methodName);
	public void endLog(long startTime,String className,String methodName);

}