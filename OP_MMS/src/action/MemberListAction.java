package action;

import java.util.Scanner;

import service.MemberListService;
import util.ConsoleUtil;
import vo.Member;

public class MemberListAction implements Action {

	@Override
	public void excute(Scanner s) throws Exception {
		MemberListService mls = new MemberListService();
		System.out.println("7.");
		Member[] memberArr = mls.getMemberArray();
		
		ConsoleUtil console = new ConsoleUtil();
		
		
		
		
		console.printMemberList(memberArr);
		
		
				
	}

}
