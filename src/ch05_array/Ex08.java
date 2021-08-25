package ch05_array;

//배열의 활용
//5명 학생의 총점수와 평균점수
/*출력결과
 * 총점 : ~
 * 평균 : ~
 */
public class Ex08 {

	public static void main(String[] args) {
		int[] score = {67,95,52,87,100};
		
		
		int	total = 0;	//총점을 저장하기 위한 변수 선언
		for(int i = 0; i < score.length; i++) {
			total = total + score[i];
		}
		
		float	avg = total / (float) score.length;
		
		System.out.println("총점 = " + total);
		System.out.println("평균 = " + avg);
		
		
		
		
	}

}
