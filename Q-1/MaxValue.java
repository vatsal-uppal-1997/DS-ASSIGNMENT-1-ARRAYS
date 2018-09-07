import java.util.Scanner;

public class MaxValue {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String []args) {
		
		final int size = sc.nextInt();
		final int arr[] = new int[size];
		final StringBuilder sb = new StringBuilder();
		int max = Integer.MIN_VALUE;
		
		for (int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		
		for (int i: arr) {
			sb.append(i).append(" ");
			if (i > max)
				max = i;
		}
		System.out.println(max+" is the greatest element in the array : "+sb);
	}
	
}