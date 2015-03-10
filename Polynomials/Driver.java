public class Driver {

    public static void main(String[] args) {
	QuadraticR R = new QuadraticR(1,4,1);
	QuadraticR Q = new QuadraticR(1,3,-10);
  	System.out.println(R);
	System.out.println(R.discrimPos());
	System.out.println(R.discrimNeg());
	System.out.println(Q);
	System.out.println(Q.discrimPos());
	System.out.println(Q.discrimNeg());
  }

}
