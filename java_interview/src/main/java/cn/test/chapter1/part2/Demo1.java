package cn.test.chapter1.part2;

/**
 * 
    * @ClassName: A  
    * @Description: TODO(使用default访问修饰符)
    * @author sunlei  
    * @date 2018年6月23日  
    *
 */
class A{
	
	void display(){
		System.out.println("Hello World");
	}
}

/**
 * 
    * @ClassName: Demo1  
    * @Description: TODO(此类可以访问默认修饰符修饰的类)  
    * @author sunlei  
    * @date 2018年6月23日  
    *
 */
public class Demo1 {

	public static void main(String[] args){
		A a = new A();
		a.display();
	}
	
}
