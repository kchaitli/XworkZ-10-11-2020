class Calci{
	public static void add(){
		int a=10;
		int b=20;
		int sum = a+b;
		System.out.println("the sum of 2 numbers is:"+" "+sum);
	}
	
	public static void sub(){
		int a=33;
		int b=22;
		int sub= a-b;
		System.out.println("the sub of 2 numbers is:"+" "+sub);
	}
	public static void mul(){
		int a=5;
		int b=22;
		int mul= a*b;
		System.out.println("the mul of 2 numbers is:"+" "+mul);
	}
	public static void div(){
		int a=50;
		int b=10;
		int div= a/b;
		System.out.println("the div of 2 numbers is:"+" "+div);
	}
	public static void main(String []args){
		Calci.add();
		Calci.sub();
		Calci.mul();
		Calci.div();
	}
}