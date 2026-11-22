package org.middletonrobotics.mlib.utilities;

public class MathUtilities {
	public static double inputModulus(double value, double upperBound, double lowerBound) {
		double modulus = upperBound - lowerBound;

		int numMax = (int) ((value - lowerBound) / modulus);
		value -= numMax * modulus;

		int numMin = (int) ((value - upperBound) / modulus);
		value -= numMin * modulus;

		return value;
	}

	public static double angleModulus(double angleRadians) {
		return inputModulus(angleRadians, Math.PI, -Math.PI);
	}

	public static double clamp(double value, double upperBound, double lowerBound) {
		return Math.max(lowerBound, Math.min(upperBound, value));
	}
}
