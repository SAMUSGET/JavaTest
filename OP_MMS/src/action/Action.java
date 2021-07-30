package action;

import java.util.Scanner;

public interface Action {
	// 각 요청을 처리하는 Action클래스 객체들의 형태를 정의한 인터페이스
	// 모든 Action 클래스 객체는 execute()메소드를 제정의
	
	void excute(Scanner s) throws Exception;
	
	
}
