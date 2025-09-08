package ch05.test;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		// 학생 수 저장 변수
		int studentNum = 0;
		// 점수를 저장할 배열 (초기에는 null)
		int[] scores = null;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");

//			int selectNo = Integer.parseInt(scanner.nextLine());
			int selectNo = scanner.nextInt();
			scanner.nextLine();  // 남아있는 개행 문자 제거
			if (selectNo == 1) {
				System.out.print("학생수> ");
				
				// 학생 수 입력받아 변수에 저장
				studentNum = Integer.parseInt(scanner.nextLine());

				// 학생 수 만큼 점수 배열 초기화
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				
				// 점수 배열에 각 학생 점수 입력
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}

			} else if (selectNo == 3) {
				// 현재까지 입력된 점수 출력
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if (selectNo == 4) {
				// 분석: 최고 점수와 평균 점수 계산
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					// 최고 점수 갱신
					max = (max < scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				// 평균 계산
				avg = (double) sum / studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}