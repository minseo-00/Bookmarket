package MainMenu;

import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {
		//PART2에서 작성한 내용
				Scanner input = new Scanner(System.in);
				
				System.out.print("당신의 이름을 입력하세요 : ");
				String userName = input.next();
				
				System.out.print("연락처를 입력하세요 : ");
				int userMobile = input.nextInt();
				
				String greeting = "Welcome to Shopping Mall";
				String tagline = "Welcome to Book Market!";
				
				boolean quit = false; // 종료 여부 설정 변수
				
				while(!quit) { // quit 변수가 true일 때까지 계속 반복
				System.out.println("***************************************");
				System.out.println("\t"+greeting);
				System.out.println("\t"+tagline);
				System.out.println("***************************************");
				System.out.println("1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
				System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
				System.out.println("3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
				System.out.println("7. 영수증 표시하기 \t8. 종료");
				System.out.println("***************************************");
				System.out.println("메뉴 번호를 선택해주세요 ");
				int n = input.nextInt(); 
				
				//System.out.println(n +"n번을 선택했습니다. ");
				
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
		}

