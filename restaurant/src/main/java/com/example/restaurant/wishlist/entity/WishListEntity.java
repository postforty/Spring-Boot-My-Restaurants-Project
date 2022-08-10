package com.example.restaurant.wishlist.entity;

import java.time.LocalDateTime;

import com.example.restaurant.db.MemoryDbEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WishListEntity extends MemoryDbEntity {

	private String title; // ���ĸ�, ��Ҹ�
	private String category; // ī�װ�
	private String address; // �ּ�
	private String roadAddress; // ���θ�
	private String homePageLink; // Ȩ������ �ּ�
	private String imageLink; // ����, ���� �̹��� �ּ�
	private boolean isVisit; // �湮����
	private int visitCount; // �湮 ī��Ʈ
	private LocalDateTime lastVisitDate; // ������ �湮����
	
}
