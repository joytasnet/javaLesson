import java.util.*;
public class Q3{
	public static void main(String[] args){
		System.out.print("整数:");
		int n=new Scanner(System.in).nextInt();
		int ans=checkNun(n);
		System.out.println("実行結果は"+ans+"です。");
	}
	public static int checkNum(int n){
		int ret;
		if(n>0){
			ret=1
		}else if(n<0){
			ret=-1;
		}else{
			ret=0;
		}
	}
}
