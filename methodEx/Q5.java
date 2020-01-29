import java.util.*;
public class Q5{
	public static void main(String[] args){
		System.out.print("人数:");
		int num=new Scanner(System.in).nextInt();
		int[] nums=new int[num];
		for(int i=0;i<num;i++){
			System.out.print(i+1+"人目:");
			nums[i]=new Scanner(System.in).nextInt();
		}
		printGraph(nums);
	}
	public static void printGraph(int[] nums){
		System.out.println("点数グラフ");
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
