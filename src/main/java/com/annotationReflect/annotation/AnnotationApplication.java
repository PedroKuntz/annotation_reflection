package com.annotationReflect.annotation;

import com.annotationReflect.annotation.annot.VisibleAnnotationImpl;
import com.annotationReflect.annotation.model.User;

public class AnnotationApplication {

	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setId(1);
		user.setName("KUNTZ");
		user.setLogin("pkuntz");
		user.setPassword("KUNTZ");
		user.setActive(true);
		
		VisibleAnnotationImpl.visibleAnnotation(user);
		
	}
}
