import java.util.Scanner;
public class Reverse {
	private static final Scanner sc = new Scanner(System.in);
	private static void reverse(int arr[]) {
		int temp;
		for (int i=0;i<(arr.length-1)/2;i++) {
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
	public static void main(String args[]) {
		final int n = sc.nextInt();
		final int arr[] = new int[n];
		final StringBuilder sb = new StringBuilder();
		for (int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		reverse(arr);
		for (int i: arr)
			sb.append(i).append(" ");
		System.out.println(sb);
	}
}