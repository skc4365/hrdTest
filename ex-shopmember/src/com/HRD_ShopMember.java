package com;

import com.ex.ExClass;

public class HRD_ShopMember {

	public static void main(String[] args) {

		ExClass exClass = new ExClass();
		
		exClass.insertShopMember("홍길동", "010-1234-5678", "서울시 강남구", "2020-01-01", 'A', "01");
		exClass.insertShopMember("이순신", "010-2222-3333", "부산시 해운대구", "2021-03-15", 'B', "02");
		exClass.insertShopMember("강감찬", "010-7777-8888", "대구시 달서구", "2019-05-20", 'C', "03");
		exClass.insertShopMember("을지문덕", "010-8888-9999", "경기도 수원시", "2023-03-03", 'D', "04");
		

		
	}

}
