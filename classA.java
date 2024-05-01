package overloading;

public class classA {

	public static void main(String[] args) {
		sum s=new sum();
		System.out.println(s.sum(10, 20));
		System.out.println(sum.sum(10, 20,30));
		// TODO Auto-generated method stub

	}

}
