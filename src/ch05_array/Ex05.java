package ch05_array;


//가변배열
public class Ex05 {

	public static void main(String[] args) {
		//5개반 학생들의 몸무게를 저장하세요
		double [][] weight= {
				{20.5, 21.8,26.9},
				{16.6,19.5},
				{26.7},
				{20.9,22.2,30.4,16.7},
				{36.0,32.7}
				};
		for(int i=0 ; i<weight.length ; i++) {
			for(int j=0 ; j<weight[i].length ; j++) {
				System.out.print(weight[i][j]+" ");
			}System.out.println();
		}
		
		
		
	}

}
