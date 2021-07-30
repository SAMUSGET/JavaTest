package controller;

import java.util.Scanner;

import action.Action;

public class MemberController {

	public void processRequest(Scanner s, Action action) {
		
		// 예외 처리
		try { 
			// 오류가 발생할 것 같은 부분
			System.out.println("4.MemberController : MemberUI의 action객체가 null이 아닐 경우로 이동");
			action.excute(s);
			
		} catch (Exception e) {
			// 오류가 발생했을 시 대처하는 부분
			e.printStackTrace();
			
			// printStactTrace() : 오류발생 경로 및 메세지 출력(어디서 에러가 나왔는지 알려줌)
			
		}
		
	}
}
