package ch05_array;



//배열의 복사-for문을 이용한 배열의 복사
public class Ex07 {

	public static void main(String[] args) {
		//oldArr1
		int[] oldArr1 = {1,2,3};
		int[] newArr1 = new int[10];
		
		newArr1[0] =10;	//newArr1[0] =1; 
		newArr1[1] =30;	//newArr1[1] =2;
		newArr1[2] =16;	//newArr1[2] =3;
		newArr1[3] =0;		
		
		System.out.println("배열복사전 oldArr1");
		for (int i=0; i<oldArr1.length; i++) {
			System.out.print(oldArr1[i]);
		}System.out.println();
		
		System.out.println("배열복사전  newArr1");
		for (int i=0; i<newArr1.length; i++) {
			System.out.print(newArr1[i]);
		}System.out.println();
		
		System.out.println("for문을 이용한 배열의 복사");
		for (int i=0;i<3;i++) {
			newArr1[i] = oldArr1[i];
		}System.out.println();
		
		System.out.println("배열복사후의 newArr1");
		for(int temp:newArr1) {
			System.out.print(temp);
		}System.out.println();
	}

}
