import java.util.*;
public class BubbleSort {
	
	private static final Scanner sc = new Scanner(System.in);
	private static void swap(char arr[], int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	private static String BubbleSort(char arr[]) {
		final StringBuilder sb = new StringBuilder();
		for (int i=0; i<arr.length; i++) 
			for (int j=0; j<arr.length-1;j++) 
				if (arr[j] > arr[j+1])
					swap(arr,j,j+1);
		for (char i: arr)
				sb.append(i);
		return sb.toString();
	}
	public static void main(String args[]) {
		final char arr[] = sc.nextLine().toCharArray();
		System.out.println(BubbleSort(arr));
	}
}