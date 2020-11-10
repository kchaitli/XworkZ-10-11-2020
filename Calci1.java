//with parameter but no return type
class Calci1{
	public static void add(int a,int b){
		int sum = a+b;
		System.out.println("the sum of 2 numbers is:"+" "+sum);
	}
	
	public static void sub(int a,int b){
		int sub= a-b;
		System.out.println("the sub of 2 numbers is:"+" "+sub);
	}
	public static void mul(int a, int b){
		int mul= a*b;
		System.out.println("the mul of 2 numbers is:"+" "+mul);
	}
	public static void div(int a,int b){
		int div= a/b;
		System.out.println("the div of 2 numbers is:"+" "+div);
	}
	public static void main(String []args){
		Calci1.add(10,20);
		Calci1.sub(33,22);
		Calci1.mul(5,22);
		Calci1.div(50,10);
	}
}