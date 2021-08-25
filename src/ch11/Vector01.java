package ch11;

import java.util.Vector;

//Vector
public class Vector01 {

	public static void main(String[] args) {
		//Vector(int initialCapacity)  : initial capacity가 채워지면  2배씩 증가
		//Vector vt1 = new Vector(20);
		Vector vt = new Vector();
		System.out.println("벡터의 크기capacity()="+vt.capacity());	//10 10개의 데이터저장할수 있는 공간 default값이 10
		System.out.println("벡터의 size()="+vt.size());	//0 데이터가 들어간 크기
		
		//객체삽입
		for(int i = 1 ; i<26 ; i++) {
		vt.add("제목"+i);		//25개의 객체가 삽입되면서
		//초기 capacity 10 -> 제목1...제목10 =>size 10
		//초기 capacity을 채우고 2배로 증가되어서 capacity 10
		//capacity 10을 채우고 2배로 증가디어서 capacity 20
		}
		
		System.out.println("벡터의 크기capacity()="+vt.capacity());	//40	초기값에서 2배씩 자동으로 커짐
		System.out.println("벡터의 size()"+vt.size());	//25 데이터가 들어간 크기
		System.out.println("-----------------------------------------------");
		

		//Vector(int initialCapacity,int capacityIncrement)
		Vector vt1 = new Vector(30,2);	//초기크기 20 공간은 2씩증가
		System.out.println("벡터1의 크기capacity()="+vt1.capacity());	//20
		System.out.println("벡터1의 size()="+vt1.size());	//0 
		
		//객체삽입
		for(int i = 1 ; i<32 ; i++) {
		vt1.add("내용"+i);		//
		}
		
		System.out.println("벡터1의 크기capacity="+vt1.capacity());	//32
		System.out.println("벡터1의 size()="+vt1.size());	//31
		

		//데이터가져오기
		for(int i=0; i<vt1.size(); i++) {
			Object obj = vt1.get(i);
			System.out.println(obj);
		}
		
		

		
	}

}
