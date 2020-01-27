import java.util.*;
public class TaxApp{
	public static void main(String[] args){
		System.out.print("消費税は何%ですか>");
		int tax=new Scanner(System.in).nextInt();
		int sum=0;
		while(true){
			System.out.print("価格を入力(0でお会計)>");
			int fee=new Scanner(System.in).nextInt();
			if(fee==0){
				break;
			}
			sum+=fee;
		}
		System.out.printf("お買い物の合計金額は%d円(税込み)です%n",
				calcTotalFee(sum,tax));
	}
	public static int calcTotalFee(int costExcludeTax,int tax){
		double totalFee=costExcludeTax*(1.0+tax/100d);
		return (int)totalFee;
	}
}
