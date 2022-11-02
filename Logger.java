package com.example;
import java.util.*;
class LoggerIMP {
	
	public int debugLevel=1;
	public String dedugLevel;
	
public void Debug(String logLine) {
		System.out.println("Debug:"+logLine);
		
	}
public void info(String logLine)
{
	
	System.out.println("Info:"+logLine);
}
}
public class Logger{
	public static void main(String args[])
	{
		LoggerIMP L1=new LoggerIMP();
	 L1.Debug("debug level"+L1.dedugLevel);
		L1.debugLevel=6;
		L1.info("info at level"+L1.debugLevel);
		
	}
}


