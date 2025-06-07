package MainMenu;

public interface CartInterface { // 장바구니 처리의 메서드를 정의하기 위한 인터페이스 생성
	
	void printBookList(Book[] p); // 전체 도서 정보 목록 출력
	boolean isCartInBook(String id); /// 장바구니에 담긴 도서의 ID와 장바구니에 담을 도서의 ID를 비교하는 메서드
	void insertBook(Book p); // CartItem에 도서 정보를 등록하는 메서드
	void removeCart(int numId); // 장바구니 순번 numId의 항목을 삭제하는 메서드
	void deleteBook(); // 장바구니의 모든 항목을 삭제하는 메서드
	
}
