package com.example.restaurant.naver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.restaurant.naver.dto.SearchImageReq;
import com.example.restaurant.naver.dto.SearchLocalReq;

@SpringBootTest
public class NewClientTest {

	@Autowired
	private NaverClient naverClient;
	
	@Test
	public void searchLocalTest() {
		
		var search = new SearchLocalReq();
		search.setQuery("������");
		
		var result = naverClient.searchLocal(search);
		System.out.println(result);
	}
	
	@Test
	public void searchImageTest() {
		
		var search = new SearchImageReq();
		search.setQuery("������");
		
		var result = naverClient.searchImage(search);
		System.out.println(result);
	}
}
