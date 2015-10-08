package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @file_name : StreamNote.java
 * author     : soomin0322@naver.com
 * date       : 2015. 10. 8.
 * story      : 스트림 문법
 */
public class StreamNote {
	/**
	 * 모든 스트림(데이터의 흐름: 강줄기, 수도물) 2가지 종류가 있다.
	 * 1. 바이트 스트림(튜브의 지름이 작지만 빠르다)
	 * 2. 문자 스트림(튜브의 지름이 바이트 2배, 용적률이 좋다)
	 * 바이트 스트림은 InputStream = IS 로 끝나고
	 * 기본형타입 (primitive) => P 타입
	 * 객체형타입 (reference) => R 타입
	 * DataIs - DataOS 		: P 타입
	 * ObjectIS - ObjectOS 	: R 타입
	 * BufferedIS - BufferedOS :바이트를 버퍼에 저장했다가 한꺼번에 입출력
	 * 문자 스트림은 Reader(Writer) => getter, setter 를 클래스화 한 형상 
	 */
	
	public static void main(String[] args) {	// writer setter 와 비슷하다고 생각
		// 자바 영역을 벗어난다면 try - catch 는 무조건 쓰인다고 생각 
		String fileName = "c:\\test.txt"; 
		String buffer="";
		BufferedWriter bw;
		BufferedReader br;
		try {
			 bw = new BufferedWriter(new FileWriter(new File(fileName)));	//카톡이 전송 버튼 누르기 전 텍스트를 머금듯이..
			 bw.write("안녕");
			 bw.newLine(); 		// System.out.println();
			 bw.write("반갑다 패턴 씨방...");
			 bw.close();		// 항상 닫아 주어야 저장이 됨.. 카톡에서 문자를 쓰고 엔터를 누르는 것과 동일
			 
			 br = new BufferedReader(new FileReader(new File(fileName)));
			 while ((buffer = br.readLine()) != null) {		// 읽어들인 내용 끝까지
				System.out.println(buffer);
			}
			 br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
