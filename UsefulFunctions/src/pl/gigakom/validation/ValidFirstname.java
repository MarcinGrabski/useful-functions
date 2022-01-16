package pl.gigakom.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidFirstname {
	/*
	 * This method valid first name.
	 */
	public static final Pattern VALID_FIRSTNAME_REGEX = Pattern.compile("([a-zA-z]{1}[a-zA-z_'-,.]{1,23}[a-zA-Z]{0,1})");
	public static boolean validFirstname(String firstname) {
		Matcher matcher = VALID_FIRSTNAME_REGEX.matcher(firstname);
		return matcher.find();
	}
}
