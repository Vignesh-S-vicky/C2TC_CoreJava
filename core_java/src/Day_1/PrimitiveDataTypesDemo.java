package Day_1;

public class PrimitiveDataTypesDemo {
	

		public static void main(String[] args) {
			
			byte byteMax = 127;
			byte byteMin = -128;
			System.out.println("Min range of byte is " + byteMin + "\nMax range of byte is " + byteMax);
			
			short shortMax = 32767;
			short shortMin = -32768;
			System.out.println("\nMin short range is " + shortMin + "\nMax short range is " + shortMax);
			
			int maxInt = 2147483647;
			int minInt = -2147483648;
			System.out.println("\nMin int range is " + minInt + "\nMax int range is " + maxInt);
			
			long maxLong = 9223372036854775807L;
			long minLong = -9223372036854775808L;
			System.out.println("\nMin long range is " + minLong + "\nMax long range is " + maxLong);
			
			float f = 3234.141243278345f;
			double d = 3456.14124512345678902345678914f;
			System.out.println("\nfloat value is " + f + " \ndouble value is " + d);
			
			boolean flag = false;
			System.out.println("\nboolean value is " + flag);
		}
	}


