import java.util.Scanner;
public class WavePrint {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String []args) {
		final int size = sc.nextInt();
		final int arr[][] = new int[size][size];
		for (int i=0;i<size;i++)
			for (int j=0;j<size;j++)
				arr[i][j] = sc.nextInt();
		final StringBuilder sb = new StringBuilder();
		boolean wave = true;
		for (int i=0;i<size;i++) {
			if (wave) {
				for (int j=0;j<size;j++)
					sb.append(arr[i][j]).append(" ");
				wave = false;
			} else {
				for (int j=size-1;j>=0;j--)
					sb.append(arr[i][j]).append(" ");
				wave = true;
			}
		}
		System.out.println(sb);
	}
}