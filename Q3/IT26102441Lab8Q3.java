import java.util.Scanner;
public class IT26102441Lab8Q3{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int number[] = new int [6];
		for(int n=0;n<6;n++){
			System.out.println("Enter a positive number "+(n+1)+":");
			number[n] = obj.nextInt();
			if(number[n]<=0){
				System.out.println("Error: Enter only positive numbers");
				n--;
			}else{
				int num=number[n];
			}
		}  
		int max = 0;
		for(int n=0;n<6;n++){
			if(number[n]>max){
				max = number[0];
				max = number[n];
			}
		}
		System.out.println("Array Contents:");
		for(int n=0;n<6;n++){
			System.out.print(number[n]+" ");
		}
		System.out.println();
		System.out.println("The maximum number entered: "+max);
	}
}