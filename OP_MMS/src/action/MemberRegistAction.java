package action;

import java.util.Scanner;

import service.MemberRegistService;
import util.ConsoleUtil;
import vo.Member;

public class MemberRegistAction implements Action{

	@Override
	public void excute(Scanner s) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("5.MemberRegistAction");
		System.out.println("MemberController");
		ConsoleUtil console = new ConsoleUtil();
		Member newMember = console.getNewMember(s);
		// console.getNewMember(s); : 입력한 회원 정보
		
		MemberRegistService mrs=new MemberRegistService();
		boolean registSuccess = mrs.registMember(newMember);
		
		if(registSuccess) {
			// 회원등록성공메세지(메소드 호출)
			System.out.println("11. MemberRegistAction");
			System.out.println("반환된 registSuccess값이 참이면 성공메세지");
			console.printRegistSuccessMessage(newMember.getId());
		} else {
			// 회원등록실패메세지(메소드 호출)
			System.out.println("11. MemberRegistAction");
			System.out.println("반환된 registSuccess값이 참이면 실패메세지");
			console.printRegistSFailMessage(newMember.getId());// 회원등록실패메세지(메소드호출)
		}
		
	}

}
