package cn.test.chapter1.part2;

/**
 * 
    * @ClassName: C  
    * @Description: TODO(使用protected访问修饰符)  
    * @author sunlei  
    * @date 2018年6月23日  
    *
 */
class C{
	protected void display(){
		System.out.println("Hello World");
	}
	
}

public class Demo3 extends A{

	public static void main(String[] args){
		C a = new C();
		a.display();
	}
	
	
}
