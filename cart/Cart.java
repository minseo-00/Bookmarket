package com.market.cart;

import java.util.ArrayList;
import com.market.bookitem.Book; // Book 클래스 사용하기 위한 선언

public class Cart implements CartInterface { // CartInterface 인터페이스의 자식 클래스 Cart 생성
	public ArrayList<CartItem> mCartItem = new ArrayList<CartItem>(); // mCartItem은 ArrayList 클래스를 이용하여 장바구니에 항목을 담는 객체
																		// 변수

	// static final int NUM_BOOK = 3;  // 이전 내용 주석
	// public CartItem[] mCartItem = new CartItem[NUM_BOOK];  // 이전 내용 주석
	public static int mCartCount = 0; // 장바구니에 담긴 항목의 총 개수를 저장하는 변수

	public Cart() { // Cart 클래스의 기본 생성자

	}

	public void printBookList(ArrayList<Book> booklist) { // Book[] booklist -> ArrayList<Book> 전체 도서 정보 목록 출력 구현
		/*  이전 내용 주석
		 * for(int i = 0; i< booklist.length; i++) {
		 * System.out.print(booklist[i].getBookId() + " | ");
		 * System.out.print(booklist[i].getName() + " | ");
		 * System.out.print(booklist[i].getUnitPrice() + " | ");
		 * System.out.print(booklist[i].getAuthor() + " | ");
		 * System.out.print(booklist[i].getDescription() + " | ");
		 * System.out.print(booklist[i].getCategory() + " | ");
		 * System.out.print(booklist[i].getReleaseDate() + " | ");
		 * System.out.println("");
		 */

		for (int i = 0; i < booklist.size(); i++) {
			Book bookitem = booklist.get(i);
			System.out.print(bookitem.getBookId() + " | ");
			System.out.print(bookitem.getName() + " | ");
			System.out.print(bookitem.getUnitPrice() + " | ");
			System.out.print(bookitem.getAuthor() + " | ");
			System.out.print(bookitem.getDescription() + " | ");
			System.out.print(bookitem.getCategory() + " | ");
			System.out.print(bookitem.getReleaseDate() + " | ");
			System.out.println("");
		}

	}


	public void insertBook(Book book) { // CartItem에 도서 정보를 등록하는 메서드 구현
		// mCartItem[mCartCount++] = new CartItem(book);  이전 내용 주석

		CartItem bookitem = new CartItem(book);
		mCartItem.add(bookitem);
		mCartCount = mCartItem.size();

	}

	public void deleteBook() { // 장바구니의 모든 항목을 삭제하는 메서드 구현
		// mCartItem = new CartItem[NUM_BOOK];  이전 내용 주석

		mCartItem.clear();
		mCartCount = 0;

	}

	public void printCart() {
		System.out.println("장바구니 상품 목록 :");
		System.out.println("-----------------------------------------------");
		System.out.println("       도서ID \t|     수 량 \t|       합 계");
		/*  이전 내용 주석
		 * for(int i = 0; i < mCartCount; i++) {
		 * System.out.print("     "+mCartItem[i].getBookID() + "\t| ");
		 * System.out.print("     "+mCartItem[i].getQuantity() + "\t| ");
		 * System.out.print("     "+mCartItem[i].getTotalPrice());
		 * System.out.println("  "); }
		 */
		for (int i = 0; i < mCartCount; i++) {
			System.out.print("     " + mCartItem.get(i).getBookID() + "\t| ");
			System.out.print("     " + mCartItem.get(i).getQuantity() + "\t| ");
			System.out.print("     " + mCartItem.get(i).getTotalPrice());
			System.out.println("  ");
		}

		System.out.println("-----------------------------------------------");
	}

	public boolean isCartInBook(String bookId) { // 장바구니에 담긴 도서의 ID와 장바구니에 담을 도서의 ID를 비교하는 메서드 구현
		boolean flag = false;
		/*  이전 내용 주석
		 * for(int i = 0; i < mCartCount; i++) { if(bookId == mCartItem[i].getBookID())
		 * { mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1); flag = true; } }
		 */

		for (int i = 0; i < mCartItem.size(); i++) {
			if (bookId == mCartItem.get(i).getBookID()) {
				mCartItem.get(i).setQuantity(mCartItem.get(i).getQuantity() + 1);
				flag = true;
			}
		}

		return flag;
	}

	public void removeCart(int numId) { // 장바구니 순번 numId의 항목을 삭제하는 메서드 구현
		/* 이전 내용 주석
		 * CartItem[] cartItem = new CartItem[NUM_BOOK]; int num = 0;
		 * 
		 * for (int i = 0; i < mCartCount; i++) if (numId != i) cartItem[num++] =
		 * mCartItem[i];
		 * 
		 * 
		 * mCartCount = num; mCartItem = cartItem;
		 */

		mCartItem.remove(numId);
		mCartCount = mCartItem.size();

	}

}