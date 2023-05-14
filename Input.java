import java.util.Scanner;
public class Input{
	public static void main(String[]args) {
		Scanner myScanner =new Scanner(System.in);
		System.out.println("请输入名字");
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水");
		double xinShui = myScanner.nextDouble();
		System.out.println("人的信息如下：" + "\n"+"名字是 "+ name +"\n"+"年龄是 "+
				age+"\n"+"薪水是 " + xinShui );
		
	}
}