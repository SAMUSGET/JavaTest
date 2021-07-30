package util;

import java.util.Scanner;

import vo.Member;

public class ConsoleUtil {

	// 회원 정보를 등록하는 메소드
	public Member getNewMember(Scanner s) {
		System.out.println("6. ConnsoleUtil : 회원정보를 작성 후 newMember에 담음");

		// Member객체 생성
		Member newMember = new Member();

		System.out.println("===== 새 회원 정보 등록 =====");

		System.out.print("회원 아이디 : ");
		int id = s.nextInt();
		System.out.print("회원 이름 : ");
		String name = s.next();
		System.out.print("회원 연락처 : ");
		String phone = s.next();
		System.out.print("회원 나이 : ");
		int age = s.nextInt();
		System.out.print("회원 주소 : ");
		String addr = s.next();
		System.out.print("회원 이메일 : ");
		String email = s.next();
		System.out.print("회원 취미 : ");
		String hobby = s.next();

		newMember.setId(id);
		newMember.setName(name);
		newMember.setPhone(phone);
		newMember.setAge(age);
		newMember.setAddr(addr);
		newMember.setEmail(email);
		newMember.setHobby(hobby);

		System.out.println(newMember.toString());

		return newMember;

	}

	// 회원등록이 성공했을 시 메세지
	public void printRegistSuccessMessage(int id) {
		System.out.println(id + "번 회원등록 성공");
	}

	// 회원등록이 실패했을 시 메세지
	public void printRegistSFailMessage(int id) {
		System.out.println(id + "번 회원등록 실패");
	}
	
	// 회원목록을 출력하는 메소드
	public void printMemberList(Member[] memberArr) {
		// 회원정보 존재유무 파악
		if (memberArr.length == 0) {
			System.out.println("없습니다.");
		} else {
			for(int i=0;i<memberArr.length;i++) {
				System.out.println(memberArr[i]);
			}
		}
	}
}
