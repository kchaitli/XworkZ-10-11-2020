//method with return type but no parameter
class Calci3{
	public static int sum(){
		int a=10;
		int b=20;
		int sum = a+b;
		return sum;
	}
	
	public static int sub(){
		int a=33;
		int b=22;
		int sub= a-b;
		return sub;
	}
	public static int mul(){
		int a=5;
		int b=22;
		int mul= a*b;
		return mul;
	}
	public static int div(){
		int a=50;
		int b=10;
		int div= a/b;
		return div;
	}
	public static void main(String []args){
		int sum = Calci3.sum();
			System.out.println("the sum of 2 numbers is:"+" "+sum);
		int sub = Calci3.sub();
			System.out.println("the sub of 2 numbers is:"+" "+sub);
		int mul = Calci3.mul();
			System.out.println("the mul of 2 numbers is:"+" "+mul);
		int div = Calci3.div();
			System.out.println("the div of 2 numbers is:"+" "+div);
	}
}