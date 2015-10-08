package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Scanner;

/**
 * @file_name : MemberRegister.java author : soomin0322@naver.com date : 2015.
 *            10. 8. story : 회원등록 프로그램
 */
public class MemberRegister {
	/**
	 * 신규회원 가입 프로그램입니다. 
	 * 저장은 외부에 바탕화면에 member 라는폴더에 아이디.txt 로 저장
	 * 만약, 아이디.txt 가 존재한다면, 이미 등록된 회원입니다 라고 띄어주세요
	 * 존재하지 않다면 해당아이디,txt 파일을 생성합니다.
	 * hong.txt 홍길동 인적정보파일 
	 * lee.txt 이순신 인적정보파일
	 * 해당 회원이 회원가입한 날짜시간 2015-10-08 4:18 오후 까지 저장 시켜주세요.
	 * [결과]
	 * hong.txt
	 * 아이디 : hong
	 * 비밀번호 : 1234
	 * 이름 : 홍길동 
	 * 가입일 : 2015-10-08 4:18
	 */
	public static void main(String[] args) {
		Member mb = new Member();
		Scanner scanner = new Scanner(System.in);
		System.out.println("===회원가입===");
//		String id = scanner.next();
//		String pass = scanner.next();
//		String name = scanner.next();
		mb.setId(scanner.next());
		mb.setPass(scanner.next());
		mb.setName(scanner.next());
		String filename = "c:\\Users\\hb4\\Desktop\\member\\"+mb.getId()+".txt";
		// 파일 존재 여부를 체크해서, 없으면 만들고
		// 있으면 스캐너가 입력 받은 정보를 txt 파일에 기재한다.
				
		BufferedWriter bw;
		BufferedReader br;
		File file = new File(filename);
		
		if (!file.exists()) {
			try {
				bw = new BufferedWriter(new FileWriter(new File(filename)));
				bw.write("아이디: "+mb.getId());
				bw.newLine();
				bw.write("비밀번호: "+mb.getPass());
				bw.newLine();
				bw.write("이름: "+mb.getName());
				bw.close();
				System.out.println("파일을 생성하였습니다.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("이름:" +mb.getId());
			System.out.println("이름:" +mb.getName());
			System.out.println("이름:" +mb.getPass());
			System.out.println("파일이름:" +file.getName());
//			System.out.println("상대경로:" +file.getPath());
			System.out.println("절대경로:" +file.getAbsolutePath());
//			System.out.println("쓰기가능:" +file.canWrite());
//			System.out.println("읽기가능:" +file.canRead());
//			System.out.println("파일길이:" +file.length());

			return;
		}
	}
}

class Member implements Serializable{	//객체 직렬화
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	//해시값
	private String id;
	private String pass;
	private String name;

	public String getId() {
		return id;
	}

	public String getPass() {
		return pass;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setName(String name) {
		this.name = name;
	}

}