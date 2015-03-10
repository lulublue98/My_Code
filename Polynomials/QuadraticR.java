import java.util.*;
import java.lang.*;

public class QuadraticR {

    private int[] poly = new int[3];
    private int a;
    private int b;
    private int c;

    public QuadraticR (int a1, int b1, int c1) {
	a = a1;
	b = b1;
	c = c1;
	poly[0] = a;
	poly[1] = b;
	poly[2] = c;
    }

    public String toString() {
	String s = "";
	if ( a != 1 ) {
	    s = a + "x^2 + " + b + "x + " + c;
	} else {
	    s = "x^2 + " + b + "x + " + c;
	}
	return s;
    }

    public double discrim() {
	double x = b^2 - (4 * a * c);
	return x;
    }

    public double discrimPos() {
	double x = ( b*b ) - (4 * a * c);
	double y = java.lang.Math.sqrt(x);
	double z = ( ( b * -1 ) + y ) / ( 2 * a );
	return z;
    }

    public double discrimNeg() {
	double x = ( b*b ) - (4 * a * c);
	double y = java.lang.Math.sqrt(x);
	double z = ( ( b * -1 ) - y ) / ( 2 * a );
	return z;
    }

}
