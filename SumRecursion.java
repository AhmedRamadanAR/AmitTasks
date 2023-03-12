package rec;

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(SumRecursion.SumRecursion(x));
	}

}
class SumRecursion {
	public static int SumRecursion(int n) {
        if (n > 0) {
            return n + SumRecursion(n - 1);
        } else {
            return 0;
        }
    
    }
