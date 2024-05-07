package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizePre {
	public static void main(String[] args) {
		
	
	//원본이미지 pigs.jpg pigs_cute.jas 가로 400 세로200
	
	String 원본이미지 = "src/com/kh/imageEx/pigs.jpg";
	String 크기조정이미지 = "src/com/kh/imageEx/pigs_cute.jpg";
	
	int 가로 = 400;
	int 세로 = 200;
	
	try {
		BufferedImage 원본이미지데이터 = ImageIO.read(new File(원본이미지));
		BufferedImage 크기조정이미지데이터 = new BufferedImage(가로, 세로, BufferedImage.TYPE_INT_RGB);
		
		Image 이미지그리기 = 원본이미지데이터.getScaledInstance(가로, 세로, Image.SCALE_SMOOTH);
		//													x	y	효과추가여부
		크기조정이미지데이터.createGraphics().drawImage(이미지그리기, 0, 0, null);
		
		ImageIO.write(크기조정이미지데이터, "jpg", new File(크기조정이미지));
		System.out.println("크기조절을 완료했습니다.");
	} catch (IOException e) {
		System.out.println("크기조절을 하는데 실패했습니다.");
		e.printStackTrace();
	}
	
	}
}
