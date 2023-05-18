import java.util.Scanner;
public class Sublime{
	public static void main(String[] args) {
		
		
//		Scanner myScanner = new Scanner(System.in);
//		double[] scores ;
//		scores =new double[5];
//		for (int i = 0 ; i < scores.length  ; i++) {
//			System.out.println("请输入第"+(i+1)+"个元素的值");
//			scores[i] = myScanner.nextDouble();
//		}
//		System.out.println("数组的元素如下：");
//		for(int i = 0;i < scores.length ;i++) {
//			System.out.println("第"+(i+1)+"个元素的值="+scores[i]);
//		}
		
//		int[] date = {5,7,78,23,678,234};
//		int[] date1 = new int[6];
//		date1[1] = 5;		date1[2] = 7;
//		date1[3] = 78;		date1[4] = 23;
//		date1[5] = 678;		date1[6] = 234;
//		System.out.println(date);
//		System.out.println(date1);


//		char[] zimu = new char[26];
//		for(int i=0;i<zimu.length;i++) {
//			zimu[i] = (char)('A'+i);
//		}
//		System.out.println("数组为：");
//		for(int i=0;i<zimu.length;i++) {
//			System.out.print(zimu[i] + " ");
//		}
		
//		int[] shuzu = {4,-1,89,5,19,789,90,4567};
//		int max =shuzu[0];
//		int maxIndex = 0;
//		for(int i=0;i< shuzu.length;i++) {
//			if(max<shuzu[i]) {
//				max = shuzu[i];
//				maxIndex = i;
//			}
//		}
//		System.out.println("最大值为"+max+"它的下标为"+maxIndex);

//		Scanner myScanner = new Scanner(System.in);
//		double[]  hens=new double[6];
//		double  mad = 0;
//		double  pin = 0;
//		 for(int i = 0; i < hens.length;i++) {
//			 System.out.print("请输入第"+(i+1)+"只鸡的重量:");
//			 hens[i] = myScanner.nextDouble ();
//		 }
//		 for(int i = 0; i < hens.length;i++) {
//			 mad+=hens[i];
//		 }
//		 pin=mad/hens.length;
//		 System.out.println("鸡的总重量:"+ mad);
//		 System.out.println("鸡的平均重量:"+ pin);

		
//数组拷贝： 不能在栈里直接类似值拷贝，需要在堆里new一个	新数据空间，然后循环数据空间进行单个值拷贝
//		int[] jjj = {9,8,7,6};
//		
//		int[] kkk = new int[jjj.length];
//		for (int i = 0;i< jjj.length;i++) {
//			kkk[i] = jjj[i];
//		}
//		kkk[3] = 200;
//		for (int i = 0;i< jjj.length;i++) {
//		 System.out.print(kkk[i]+" ");
//		}
//		 System.out.println();
//		for (int i = 0;i< jjj.length;i++) {
//		 System.out.print(jjj[i]+" ");
//			}
		
		
		int[] jjj = {1,2,3,4,5,6};
		
		for(int i = 0; i < jjj.length/2; i++) {
			int mid = jjj[jjj.length-1-i];
			jjj[jjj.length-1-i]=jjj[i];
			jjj[i] = mid;
		}
		for(int i = 0; i < jjj.length; i++) {
			 System.out.print(jjj[i]+" ");
		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
	}
}