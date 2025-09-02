package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;

		System.out.println("------1-------");
		x++;
		y++;
		System.out.println("x: " + x);

		System.out.println("------2-------");
		y--;
		--y;
		System.out.println("y: " + y);

		System.out.println("------3-------");
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x=" + x);

		System.out.println("-------4------");
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x=" + x);

		System.out.println("-------5------");
		z = ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x=" + x);
		System.out.println("y: " + y);

	}

}
