package MainMenu;

import java.util.Scanner;

public class Welcome {
	static final int NUM_BOOK = 3; // 도서의 개수에 대한 상수 NUM_BOOK 선언
	static final int NUM_ITEM = 7; // 도서 정보의 개수에 대한 상수 NUM_ITEM 선언
	static CartItem[] mCartItem = new CartItem[NUM_BOOK];
	static int mCartCount = 0;

	public static void menuIntroduction() { // 메뉴 출력하는 메서드
		System.out.println("***************************************");
		System.out.println("1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기 \t8. 종료");
		System.out.println("***************************************");
	}

	public static void menuGuestInfo(String name, int mobile) { // 고객 정보 확인하는 메서드
		System.out.println("현재 고객 정보 : ");
		// System.out.println("이름 " + Name + " 연락처 " + Mobile);
		
		Person person = new Person(name, mobile);
		System.out.println("이름 : " + person.getName() + " 연락처 " + person.getPhone()); 
	}

	public static void menuCartItemList() { // 장바구니 상품 목록 확인하는 메서드
		System.out.println("장바구니 상품 목록 :");
		System.out.println("-----------------------------------------------");
		System.out.println("       도서ID \t|     수 량 \t|       합 계");
		for(int i = 0; i < mCartCount; i++) {
			System.out.print("     "+mCartItem[i].getBookID() + "\t| ");
			System.out.print("     "+mCartItem[i].getQuantity() + "\t| ");
			System.out.println("     "+mCartItem[i].getTotalPrice());
		}
		System.out.println("-----------------------------------------------");
	}

	public static void menuCartClear() { // 장바구니 모든 항목 삭제하는 메서드
		System.out.println("장바구니 비우기: ");
	}

	public static void menuCartAddItem(String[][] book) { // String[][] book 매개변수 추가, 장바구니에 도서를 추가하는 메서드
		// System.out.println("장바구니에 항목 추가하기 : ");

		BookList(book); // 도서 정보를 저장하는 메서드 호출
		for (int i = 0; i < NUM_BOOK; i++) { // 도서 정보 출력
			for (int j = 0; j < NUM_ITEM; j++)
				System.out.print(book[i][j] + " | ");
			System.out.println("");
		}
		
		boolean quit = false;
		
		while(!quit) { // 장바구니에 항목을 추가하지 않을 때까지 반복하는 while문
			System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");
			
			Scanner input = new Scanner(System.in);
			String str = input.nextLine(); // 도서의 ID를 입력받음
			
			boolean flag = false;
			int numId = -1;
			
			for(int i = 0; i < NUM_BOOK; i++) { // 입력된 도서의 ID와 저장되어 있는 도서 정보의 ID가 일치하는지 확인하여
				if(str.equals(book[i][0])) { // 일치하면 도서 정보의 numId(인덱스 번호)와 flag(일치 여부) 변수에 값을 변경하여 저장하고 반복문 종료
					numId = i;
					flag = true;
					break;
				}
			}
			
			if(flag) { // 변수 flag가 참이면(입력된 도서의 ID와 저장되어 있는 도서 정보의 ID가 일치하면) 반복문을 종료하고, 거짓이면 '다시 입력해 주세요' 출력
				System.out.println("장바구니에 추가하겠습니까? Y | N");
				str = input.nextLine(); // 장바구니에 도서 추가 여부를 위한 입력값을 받음
				
				if(str.toUpperCase().equals("Y")) { // 입력값을 대문자로 변경하여 Y이면 '도서가 장바구니에 추가되었습니다.' 출력
					System.out.println(book[numId][0] + "도서가 장바구니에 추가되었습니다.");
					
					// 장바구니에 넣기
					if(!isCartInBook(book[numId][0]))
						mCartItem[mCartCount++] = new CartItem(book[numId]);
				}
				
				quit = true;
				
			} else
				System.out.println("다시 입력해 주세요");
		}
	}

	public static boolean isCartInBook(String bookId) { // 장바구니에 담긴 도서의 ID와 장바구니에 담을 도서의 ID를 비교하는 메서드
		boolean flag = false;
		for(int i = 0; i < mCartCount; i++) {
			if(bookId == mCartItem[i].getBookID()) {
				mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1);
				flag = true;
			}
		}
		return flag;
	}

	public static void menuCartRemoveItemCount() { // 장바구니의 항목 수량 줄이는 메서드
		System.out.println("5. 장바구니의 항목 수량 줄이기");
	}

	public static void menuCartRemoveItem() { // 장바구니의 항목 삭제하는 메서드
		System.out.println("6. 장바구니의 항목 삭제하기");
	}

	public static void menuCartBill() { // 영수증 표시하는 메서드
		System.out.println("7. 영수증 표시하기");
	}

	public static void menuExit() { // 종료하는 메서드
		System.out.println("8. 종료");
	}

	public static void BookList(String[][] book) { // 도서 정보를 저장하는 메서드

		book[0][0] = "ISBN1234";
		book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
		book[0][2] = "27000"; // 27,000
		book[0][3] = "송미영";
		book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍 ";
		book[0][5] = "IT전문서";
		book[0][6] = "2018/10/08";

		book[1][0] = "ISBN1235";
		book[1][1] = "안드로이드 프로그래밍";
		book[1][2] = "33000"; // 33,000
		book[1][3] = "우재남";
		book[1][4] = "실습 단계별 명쾌한 멘토링!";
		book[1][5] = "IT전문서";
		book[1][6] = "2022/01/22";

		book[2][0] = "ISBN1236";
		book[2][1] = "스크래치";
		book[2][2] = "22000"; // 22,000
		book[2][3] = "고광일";
		book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
		book[2][5] = "컴퓨터입문";
		book[2][6] = "2019/06/10";
	}

	public static void main(String[] args) {
		String[][] mbook = new String[NUM_BOOK][NUM_ITEM]; // 도서 정보를 저장할 mBook을 2차원 배열로 생성
		// PART2에서 작성한 내용
		Scanner input = new Scanner(System.in);

		System.out.print("당신의 이름을 입력하세요 : ");
		String userName = input.next();

		System.out.print("연락처를 입력하세요 : ");
		int userMobile = input.nextInt();

		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";

		boolean quit = false; // 종료 여부 설정 변수

		while (!quit) { // quit 변수가 true일 때까지 계속 반복			
			System.out.println("***************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);

			/*
			 * 기존 메뉴 설명 주석 처리 System.out.println("***************************************");
			 * System.out.println("1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
			 * System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
			 * System.out.println("3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
			 * System.out.println("7. 영수증 표시하기 \t8. 종료");
			 * System.out.println("***************************************");
			 */

			menuIntroduction(); // 메뉴 목록 출력 메서드 호출

			System.out.println("메뉴 번호를 선택해주세요 ");
			int n = input.nextInt();

//		System.out.println(n +"n번을 선택했습니다. ");

			if (n < 1 || n > 8) { // 메뉴 선택 번호가 1~8이 아니면 아래 문자열 출력
				System.out.println("1부터 8까지의 숫자를 입력하세요.");
			}

			else {
				switch (n) { // switch문을 이용하여 메뉴 선택 번호별 정보 출력
				case 1:
					/*
					 * 기존 내용 주석 처리 
					 * System.out.println("현재 고객 정보 : "); System.out.println("이름 " + userName + " 연락처 "+ userMobile); // 메뉴 번호가 1일 때 입력된 고객 이름과 연락처 출력
					 */
					menuGuestInfo(userName, userMobile);
					break;
				case 2:
//				System.out.println("장바구니 상품 목록 보기 : ");
					menuCartItemList();
					break;
				case 3:
//				System.out.println("장바구니 비우기: ");
					menuCartClear();
					break;
				case 4:
//				System.out.println("장바구니에 항목 추가하기 : ");
					menuCartAddItem(mbook);
					break;
				case 5:
//				System.out.println("5. 장바구니의 항목 수량 줄이기");
					menuCartRemoveItemCount();
					break;
				case 6:
//				System.out.println("6. 장바구니의 항목 삭제하기");
					menuCartRemoveItem();
					break;
				case 7:
//				System.out.println("7. 영수증 표시하기");
					menuCartBill();
					break;
				case 8:
//				System.out.println("8. 종료");
					menuExit();
					quit = true; // quit에 true를 넣어 반복문 종료 조건을 충족
					break;

				}
			}
		}
	}
}