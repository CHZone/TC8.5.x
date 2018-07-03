package org.apache.catalina.core;

public class CAILogUtils {
	public static void showClassThisMethod(Object thisInstance, String curClassName, String method){
		System.out.print("this:"+thisInstance.getClass().getSimpleName());
		System.out.print(", current Class:"+curClassName);
		System.out.print(", method:"+method);
		System.out.println();
	}
	
	public static void message(String msg){
		System.out.println(msg);
	}
}
