//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class AddSubMult {
	public static double check(double a, double b) {
		double answer;
		if (a > b) {
			answer = a - b;
		} else if (b > a) {
			answer = b - a;
		} else {
			answer = a * b;
		}
		return Math.floor(answer * 10) / 10;
	}
}