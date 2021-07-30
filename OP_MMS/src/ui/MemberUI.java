package ui;

import java.util.Scanner;

import action.Action;
import action.MemberListAction;
import action.MemberRegistAction;
import controller.MemberController;
import vo.Member;

public class MemberUI {

	// 1. 필드(DB부분)
	public static Member[] MemberArray = new Member[0];
	
	
	// 2. 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberController controller = new MemberController();

		boolean run = true;

		Scanner s = new Scanner(System.in);
		Action action = null;

		int menu = 0;

		do {
			System.out.println("===================================");
			System.out.println("1. 회원 등록     2. 회원 목록     3. 회원정보 수정");
			System.out.println("-----------------------------------");
			System.out.println("4. 회원 삭제     5. 회원 검색     6. 시스템 종료");
			System.out.println("===================================");

			System.out.print("선택 : ");
			menu = s.nextInt();

			switch (menu) {
			case 1: // 회원등록
				System.out.println("case 1");
				System.out.println("3.MemberUI : action객체가 null일 경우");
				action = new MemberRegistAction();
				break;
			case 2: // 회원목록
				System.out.println("L1. MemberUI : 회원목록 선택");
				System.out.println("L2. MemberUI : action객체에 new MemberListAction()이 담김");
				
				action = new MemberListAction();
				break;
			case 3: // 회원수정
				action = new MemberRegistAction();
				break;
			case 4: // 회원삭제
				action = new MemberRegistAction();
				break;
			case 5: // 회원검색
				action = new MemberRegistAction();
				break;
			case 6: // 시스템종료

				System.out.println("시스템이 종료되었습니다.");
				run = false;
				break;
			default: // 그 외
				System.out.println("잘못 선택하셨습니다.");
				System.out.println();
				System.out.println();
				break;

			}
			if (action != null) {
				System.out.println("L3.MemberUI : action객체가 null이 아닐 경우");
				controller.processRequest(s, action);
			}

		} while (run);
	}

}
