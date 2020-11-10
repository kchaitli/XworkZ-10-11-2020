//method with return type and parameter
class Calci2{
	public static int add(int a,int b){
		int sum = a+b;
		return sum;
	}
	
	public static int sub(int a,int b){
		int sub= a-b;
		return sub;
	}
	public static int mul(int a, int b){
		int mul= a*b;
		return mul;
	}
	public static int div(int a,int b){
		int div= a/b;
		return div;
	}
	public static void main(String []args){
		int sum=Calci2.add(10,20);
		int sub=Calci2.sub(33,22);
		int mul=Calci2.mul(5,22);
		int div=Calci2.div(50,10);
		System.out.println("the sum of 2 numbers is:"+" "+sum);
		System.out.println("the sub of 2 numbers is:"+" "+sub);
		System.out.println("the mul of 2 numbers is:"+" "+mul);
		System.out.println("the div of 2 numbers is:"+" "+div);

	}
}