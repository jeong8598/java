package ch05_array;

import java.util.Arrays;

//system.arraycopy()를 이용한 배열의 복사
//원본배열의 일부데이터를 원하는 새배열 위치부터 넣을 수 있다.

public class Ex07_2 {

	public static void main(String[] args) {

		int[] oldArr1 = {11,12,13,14,15,};
		int[] newArr1 = new int[10];
		System.out.println("배열복사전 oldArr1");
		for (int i=0; i<oldArr1.length; i++) {
			System.out.print(oldArr1[i]);
		}System.out.println();
		
		System.out.println("배열복사전  newArr1");
		for (int i=0; i<newArr1.length; i++) {
			System.out.print(newArr1[i]);
		}System.out.println();

		System.out.println(Arrays.toString(newArr1));
		//Arrays : java.util 패키지 안에 존재하면서 배열과 관련된 여러 기능을 제공하는 클래스
		//Arrays.toString(배열명):파라미터로 던진 배열안에 데이터를 문자열형태로 가져온다
		//Arrays클래스에 대한 자세한 내용은 교재 p624참고
		
	
		//system.arraycopy(Object src:원본배열명, int srcPos:복사시작인덱스번호, Object dest새배열명, int destPos새배열명의 시작인덱스번호, int length원본배열에서 가져올 크기)를 이용한 배열의 복사
		//source(src) : 출처,자료, 원본배열
		//destination(dest):목적지,복사할 배열
		
		//출력결과 11 12 13 14 15 0 0 0 0 0
		/*
		System.arraycopy(oldArr1,0,newArr1,0,oldArr1.length);
		System.out.println("배열복사후의 newArr1");
		for(int temp:newArr1) {
			System.out.print(temp+" ");
		}System.out.println();
		*/
		
		// 0 0 0 0 0 13 14 15 0 0
		System.arraycopy(oldArr1,2,newArr1,5,3);
		System.out.println("배열복사후의 newArr1");
		for(int temp:newArr1) {
			System.out.print(temp+" ");
		}System.out.println();
	
		System.out.println(Arrays.toString(newArr1));
	}


}
