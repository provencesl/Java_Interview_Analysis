package cn.test.chapter1.part3;



public class Demo1 {

	public static void test(int x){
		
		x = x + 5;
		System.out.println("val的值为:"+x);
		
	}
	
	public static void main(String[] args){
		
		int val = 10;
		test(val);
		System.out.println("x的值为"+val);
	}
	
}
