import java.util.*;
public class Q6{
	public static void main(String[] args){
		System.out.print("要素数:");
		int n=new Scanner(System.in).nextInt();
		int[] nums=new int[n];
		for(int i=0;i<nums.length;i++){
			System.out.print("x["+i+"]:");
			nums[i]=new Scanner(System.in).nextInt();
		}
		int[] ret=createReverseArr(nums);
		System.out.println("要素の並びを反転しました");
		for(int i=0;i<ret.length;i++){
			System.out.println("x["+i+"]:"+ret[i]);
		}

	}
	public static int[] createReverseArr(int[] arr){
		int[] retArr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			retArr[arr.length-1-i]=arr[i];
		}
		return retArr;
	}
}
