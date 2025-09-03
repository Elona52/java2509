package ch03.check;

public class check01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int x = 10;
	        int y = 20;
	        int z = (++x) + (y--);
	        System.out.println(z);

	        int score = 85;
	        String result = (!(score > 90)) ? "가" : "나";
	        System.out.println(result);
	    }

	}