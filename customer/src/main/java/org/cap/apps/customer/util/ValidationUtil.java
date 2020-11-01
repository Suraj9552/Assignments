package org.cap.apps.customer.util;

import org.cap.apps.customer.exceptions.InvalidArgumentException;
import org.cap.apps.customer.exceptions.InvalidCustomerNameException;

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
