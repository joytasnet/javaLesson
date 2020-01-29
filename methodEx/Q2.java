import java.util.*;
public class Q2{
	public static void main(String[] args){
		System.out.print("文字列:");
		String word=new Scanner(System.in).next();
		System.out.print("実行回数");
		int num=new Scanner(System.in).nextInt();
		repeatWord(word,num);
	}
	public static void repeatWord(String word,int num){
		for(int i=0;i<num;i++){
			System.out.println(word);
		}
	}
}
