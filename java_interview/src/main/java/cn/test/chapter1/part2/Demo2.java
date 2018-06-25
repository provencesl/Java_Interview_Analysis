package cn.test.chapter1.part2;

/**
 * 
    * @ClassName: B  
    * @Description: TODO(使用private访问修饰符)  
    * @author sunlei  
    * @date 2018年6月23日  
    *
 */
class B{
	private void display(){
		System.out.println("Hello World");
	}
}

public class Demo2 {

	public static void main(String[] args){
		B a = new B();
		//a.display(); 无法访问
	}
}
