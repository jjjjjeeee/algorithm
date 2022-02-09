package Practice;

import java.util.Scanner;

public class chap06_ShellSort {
	// ¼Ð Á¤·Ä (version 1)
	
	static void shellSort(int[]a, int n) {
		for(int h=n/2; h>0; h/=2) {
			for(int i=h; i<n; i++) {
				int j;
				int tmp=a[i];

				for(j=i-h; j>=0 && a[j]>tmp; j-=h) {
					a[j+h] = a[j];
				
				}	a[j+h] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("¿ä¼Ú¼ö : ");
		int nx = s.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x["+i+"] =>");
			x[i] = s.nextInt();
		}
		
		shellSort(x, nx); // ¹è¿­x¸¦ ¼Ð Á¤·Ä
		
		for(int i=0; i<nx; i++) {
			System.out.println("x["+i+"] =>"+x[i]);
		}
	}

}
