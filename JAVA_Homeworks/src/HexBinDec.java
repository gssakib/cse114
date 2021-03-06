/*
		Name: Gazi Sakib
		SBU ID - 109849940
		Course No. - CSE 114
		Assignment Name - : Exception Handling (Problem 2)(Homework 7) 

 */
public class HexBinDec {

	public static void main(String[] args) {
		// valid hex
		try {
			System.out.println(hex2Dec("AffDd9"));

		} catch (HexFormatException ex) {

			ex.printStackTrace();
		}

		// invalid hex
		try {
			System.out.println(hex2Dec("sdfsdf234"));

		} catch (HexFormatException ex) {
			// System.out.println("Invalid Hexa-decimal Number");
			ex.printStackTrace();
		}

		// valid binary
		try {
			System.out.println(bin2Dec("10010101"));

		} catch (BinaryFormatException ex) {
			// System.out.println("Invalid Binary Number");
			ex.printStackTrace();
		}

		// invalid binary
		try {
			System.out.println(bin2Dec("sdfsdf234"));

		} catch (BinaryFormatException ex) {
			// System.out.println("Invalid Binary Number");
			ex.printStackTrace();
		}

	}

	public static int hex2Dec(String hexString) throws HexFormatException {

		int result = 0;
		for (int i = 0; i < hexString.length(); i++) {
			if (hexString.charAt(i) >= '0' && hexString.charAt(i) <= '9') {
				result = result
						+ (int) ((Character
								.getNumericValue(hexString.charAt(i))) * Math
								.pow(16, (hexString.length() - 1 - i)));

			} else if (hexString.charAt(i) >= 'A' && hexString.charAt(i) <= 'F') {
				result = result
						+ (int) ((10 + hexString.charAt(i) - 'A') * (Math.pow(
								16, (hexString.length() - 1 - i))));

			} else if (hexString.charAt(i) >= 'a' && hexString.charAt(i) <= 'f') {

				result = result
						+ (int) ((10 + ((char) (hexString.charAt(i) - 32)) - 'A') * (Math
								.pow(16, (hexString.length() - 1 - i))));

			} else {
				throw new HexFormatException();

			}

		}

		return result;

	}

	public static int bin2Dec(String binString) throws BinaryFormatException {

		int result = 0;
		for (int i = 0; i < binString.length(); i++) {
			if (binString.charAt(i) == '0' || binString.charAt(i) <= '1') {
				result = result
						+ (int) ((Character
								.getNumericValue(binString.charAt(i))) * Math
								.pow(2, (binString.length() - 1 - i)));

			} else {
				throw new BinaryFormatException();

			}

		}

		return result;

	}

}

class BinaryFormatException extends Exception {
	public BinaryFormatException() {
		super("Invalid Formatted binary number");
	}

}

class HexFormatException extends Exception {
	public HexFormatException() {
		super("Invalid Formatted hexadecimal number");
	}

}
