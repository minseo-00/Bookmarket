package MainMenu;

import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {
		if(n < 1 || n > 8 ) { // 메뉴 선택 번호가 1~8이 아니면 아래 문자열 출력
			System.out.println("1부터 8까지의 숫자를 입력하세요.");
		}
		
		else {
			switch(n) { //switch문을 이용하여 메뉴 선택 번호별 정보 출력
			case 1:
				System.out.println("현재 고객 정보 : ");
				System.out.println("이름" + userName + " 연락처 "+ userMobile); // 메뉴 번호가 1일 때 입력된 고객 이름과 연락처 출력
				break;
			case 2:
				System.out.println("장바구니 상품 목록 보기 : ");
				break;
			case 3:
				System.out.println("장바구니 비우기: ");
				break;
			case 4:
				System.out.println("장바구니에 항목 추가하기 : ");
				break;
			case 5:
				System.out.println("5. 장바구니의 항목 수량 줄이기");
				break;
			case 6:
				System.out.println("6. 장바구니의 항목 삭제하기");
				break;
			case 7:
				System.out.println("7. 영수증 표시하기");
				break;
			case 8:
				System.out.println("8. 종료");
				quit = true; // quit에 true를 넣어 반복문 종료 조건을 충족
				break;
				
				}
			}
		}
	}


