import java.util.*;
public class Q4{
	public static void main(String[] args){
		System.out.print("正の整数a:");
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt(); 
		System.out.println("生成したランダムな値は"+
				randomRange(Math.min(a,b),Math.max(a,b))+"です。";
	}
	public static int randomRange(int min,int max){
		return new Random().nextInt(max-min+1)+min;
	}
}
