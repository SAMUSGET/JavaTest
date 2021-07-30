package service;

import ui.MemberUI;
import vo.Member;

public class MemberRegistService {

	public boolean registMember(Member newMember) throws Exception {
		
		boolean registSuccess = true;

		// 아이디 중복체크
		System.out.println("8. MemberRegistService");
		System.out.println("newMember정보를 가지고 아이디 중복체크");
		for (int i = 0; i < MemberUI.MemberArray.length; i++) {

			if (MemberUI.MemberArray[i].getId() == newMember.getId()) {
				registSuccess = false;
				break;
			}
		}

		// 아이디가 중복이 아닐경우 registSuccess는 true -> if문실행
		System.out.println("9. MemberRegistService : ");
		System.out.println("아이디가 중복이 아닐 경우 :");
		System.out.println("MemberUI.memberArray배열의 크기를 1 늘려주고 그곳에");
		if (registSuccess) {
			Member[] tempArray = MemberUI.MemberArray;
			MemberUI.MemberArray = new Member[MemberUI.MemberArray.length + 1];

			for (int i = 0; i < tempArray.length; i++) {
				MemberUI.MemberArray[i] = tempArray[i];
			}
			MemberUI.MemberArray[MemberUI.MemberArray.length - 1] = newMember;
		}
		System.out.println("10. MemberRegistService");
		System.out.println("아이디가 중복이면 false값을 반환, 중복이 아니면 true값 반환");
		return registSuccess;

	}
}
