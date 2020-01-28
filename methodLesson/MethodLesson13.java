import java.util.*;
public class MethodLesson13{
	public static void main(String[] args){
		System.out.print("配列の要素数を入力してください>");
		int n=new Scanner(System.in).nextInt();
		int[] orgArr=new int[n];
		for(int i=0;i<orgArr.length;i++){
			orgArr[i]=new Random().nextInt(21)-10;
		}
		System.out.println("配列を生成しました。");
		int[] tempArr=cloneArr(orgArr);
		printArr(tempArr);
		while(true){
			System.out.print("1...元の配列を表示,2...配列を昇順ソート,3...配列を降順ソート,4...終了>");
			int select=new Scanner(System.in).nextInt();
			switch(select){
			case 1:
				printArr(orgArr);
				break;
			case 2:
				sortArr(tempArr);
				printArr(tempArr);
				break;
			case 3:
				sortArr(tempArr,true);
				printArr(tempArr);
				break;
			default:
				System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}
	public static int[] cloneArr(int[] arr){
		int[] retArr=new int[arr.length];
		for(int i=0;i<retArr.length;i++){
			retArr[i]=arr[i];
		}
		return retArr;
	}
	public static void sortArr(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void sortArr(int[] arr,boolean isDesc){
		if(!isDesc){
			sortArr(arr);
		}else{
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]<arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}

		}
	}
	public static void printArr(int[] arr){
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
			if(i<arr.length-1){
				System.out.print(",");
			}
		}
		System.out.println("}");
	}
}
