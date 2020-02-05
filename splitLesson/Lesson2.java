import java.util.*;
public class Lesson2{
	public static void main(String[] args){
		System.out.print("カンマ区切りで数字いれてね>");
		String input=new Scanner(System.in).nextLine();
		String[] nums=input.split(",");
		int sum=0;
		for(String n:nums){
			sum+=Integer.parseInt(n);
		}
		System.out.println("合計は"+sum);
		
		
		
	}
}
