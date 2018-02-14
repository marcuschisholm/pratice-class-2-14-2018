package addNumbers;

public class addnum {
	public static void main(String[]args){
		int a=2;
		int b=4;
		int c = addNumbers(a,b);
		System.out.println("the sum is"+ c);
		int r = addNumbers(2,4);
	}
	public static int addNumbers( int num1,int num2){
		int sum= num1+num2;
		return sum;
	}
}
