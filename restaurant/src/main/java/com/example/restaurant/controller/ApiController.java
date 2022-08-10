package com.example.restaurant.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.wishlist.dto.WishListDto;
import com.example.restaurant.wishlist.service.WishListService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/restaurant")
@RequiredArgsConstructor
public class ApiController {
	
	private final WishListService wishListService;
	
	@GetMapping("/search")
	public WishListDto search(@RequestParam String query) {
		return wishListService.search(query);
	}
	
	@PostMapping("")
	public WishListDto add(@RequestBody WishListDto wishListDto) {
		log.info("{}", wishListDto);
		return wishListService.add(wishListDto);
	}
	
	@GetMapping("/all")
	public List<WishListDto> findAll() {
		return wishListService.findAll();
	}
}
