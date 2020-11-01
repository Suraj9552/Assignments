package org.cap.apps.customerjpa.util;

import org.cap.apps.customerjpa.exceptions.InvalidArgumentException;
import org.cap.apps.customerjpa.exceptions.InvalidCustomerNameException;

public class ValidationUtil {

	public static void checkArgumentNotNull(Object arg) {
		if(arg==null) {
			throw new InvalidArgumentException("Argument can't be null");
		}
	}
	public static void checkName(String name) {
		if(name==null || name.isEmpty()) {
			throw new InvalidCustomerNameException("Name should not be null");
		}
	}
	
}
