package chap2.interview16;

public class Interview16Q1 {

	/**
	 * Convention solution, not efficient enough.
	 * @param base
	 * @param exponent
	 * @return
	 */
	public static double power1(double base, int exponent) {
		
		if(base == 0 && exponent < 0) {
			System.out.println("Denominator is zero!");
			return 0;
		}
		
		if(base == 0) {
			return 0;
		}
		
		if(exponent == 0) {
			return 1;
		}
		
		
		if(exponent < 0) {
			double result = powerWithPositiveExponent(base, Math.abs(exponent));
			return 1/result;
		}else {
			return powerWithPositiveExponent(base, exponent);
		}
		
		
	}
	
	private static double powerWithPositiveExponent(double base, int exponent) {
		
		double result = base;
		for(int i = 1; i < exponent; i++) {
			result *= base;
		}
		
		return result;
		
	}
	
	/**
	 * 
	 * @param base
	 * @param exponent
	 * @return
	 */
	public static double power2(double base, int exponent) {
		
		if(base == 0 && exponent < 0) {
			System.out.println("Denominator is zero!");
			return 0;
		}
		
		if(base == 0) {
			return 0;
		}
		
		if(exponent == 0) {
			return 1;
		}
		
		if(exponent < 0) {
			return 1/powerWithPositiveExponentRecurr(base, Math.abs(exponent));
		}else {
			return powerWithPositiveExponentRecurr(base, exponent);
		}
	}
	
	private static double powerWithPositiveExponentRecurr(double base, int exponent) {
		
		double result = base;
		
		if(exponent == 1) {
			return result;
		}
		
		if((exponent & 1) == 0) {
			
			exponent = exponent >> 1;
			result = powerWithPositiveExponentRecurr(base, exponent);
			return result * result;
		
		}else {
			
			exponent = exponent >> 1;
			result = powerWithPositiveExponentRecurr(base, exponent);
			return result * result * base;
		}
		
	}
}
