package ch04_if_for;

////주의! break 속한 반복문 or switch문을 종료!
public class Ex07_break2 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum>100) {
				break;	//반복문을 종료!
			}
			i++;
			sum += i; //sum=sum+i;
			System.out.println("i가"+i+"일때의 sum="+sum);
		}
		System.out.println("while문밖");
		
		System.out.println("i="+i);
		System.out.println("누적총합 sum="+sum);
		
		System.out.println("---------------------------------------");
		
		
		while(sum<110){		
			while(true) {
		
				if(sum>100) {	//조건충족시 실행하는 문장이 한줄일때는 {}생략가능
					break;	//주의! break 속한 {}블록문의 해당 반복문을 종료!
				}
				i++;
				sum += i; //sum=sum+i;
				System.out.println("i가"+i+"일때의 sum="+sum);
			}
			System.out.println("내부while문밖");
			System.out.println("i="+i);
			System.out.println("누적총합 sum="+sum);
			sum++;
		}
		System.out.println("외부while문밖");

	}

}
