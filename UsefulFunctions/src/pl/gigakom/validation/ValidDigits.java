package pl.gigakom.validation;

public class ValidDigits {
	public static boolean isDigital(String string) {
		return string.chars().allMatch(x -> Character.isDigit(x));
	}
}
