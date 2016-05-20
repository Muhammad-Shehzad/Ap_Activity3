import java.util.*;

public class TowerOfHanoi {
	public static int disks;

	public static Stack<Integer>[] poll = new Stack[8];

	public static void main(String[] args) {

		poll[1] = new Stack<Integer>();
		poll[2] = new Stack<Integer>();
		poll[3] = new Stack<Integer>();

		int num = 8;
		disks = num;
		toh(num);
	}

	public static void toh(int n) {
		for (int d = n; d > 0; d--)
			poll[1].push(d); //Pushing disk
		
		show(); //showing value
		moveDisk(n, 1, 2, 3);
	}

	public static void moveDisk(int n, int Src, int Aux, int Dst) {
		if (n > 0) {
			moveDisk(n - 1, Src, Dst, Aux);
			int d = poll[Src].pop();
			poll[Dst].push(d);
			show(); //showing value
			moveDisk(n - 1, Aux, Src, Dst);
		}
	}

	public static void show() {
		System.out.println("  src  |  aux  |  dst");
		System.out.println("---------------");
		for (int i = disks - 1; i >= 0; i--) {
			String d1 = " ", d2 = " ", d3 = " ";
			try {
				d1 = String.valueOf(poll[1].get(i));
				d2 = String.valueOf(poll[2].get(i));
				d3 = String.valueOf(poll[3].get(i));
			} catch (Exception e) {
			}
			
			System.out.println("  " + d1 + "  |  " + d2 + "  |  " + d3);
		}
		System.out.println("\n");
	}
}