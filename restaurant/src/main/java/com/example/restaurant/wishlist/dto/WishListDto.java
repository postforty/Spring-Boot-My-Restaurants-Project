package com.example.restaurant.wishlist.dto;

import java.time.LocalDateTime;

import com.example.restaurant.db.MemoryDbEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WishListDto {
	private int index;
	private String title; // ���ĸ�, ��Ҹ�
	private String category; // ī�װ���
	private String address; // �ּ�
	private String readAddress; // ���θ�
	private String homePageLink; // Ȩ������ �ּ�
	private String imageLink; // ����, ���� �̹��� �ּ�
	private boolean isVisit; // �湮����
	private int visitCount; // �湮 ī��Ʈ
	private LocalDateTime lastVisitDate; // ������ �湮����
	
}