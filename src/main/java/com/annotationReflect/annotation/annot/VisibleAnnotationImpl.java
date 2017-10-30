package com.annotationReflect.annotation.annot;

import java.lang.reflect.Method;

public class VisibleAnnotationImpl {

	public static void visibleAnnotation(Object obj) throws Exception {
		Class<?> clazz = obj.getClass();
		for(Method meth : clazz.getDeclaredMethods()){
			meth.setAccessible(true);
			if(meth.isAnnotationPresent(Visible.class)) {
				System.out.println(meth.getName() + ": " + meth.invoke(obj));
			}
		}
	}
	
}
