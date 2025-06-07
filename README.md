# 📖 Chapter 9: 장바구니 항목 삭제 및 비우기

---

## 📌 챕터 목표

- 도서 장바구니 시스템에서 **장바구니 항목 삭제 및 전체 비우기 기능**을 구현합니다.
- 추상 클래스(Item)와 상속(Book), 그리고 객체 조합(CartItem, Cart) 설계를 통해  
  객체지향적 구조를 한 단계 발전시킵니다.

---

## 🛠️ 구현 내용

- **Item (추상 클래스)**  
  - 도서의 공통 속성(bookId, name, unitPrice)과 추상 메서드 정의
- **Book (Item의 자식 클래스)**  
  - Book의 상세 정보(저자, 설명, 카테고리, 출간일 등) 필드 및 메서드 구현
- **CartItem**  
  - Book 객체와 수량, 합계 금액을 관리하는 장바구니 항목 클래스  
  - Book 객체를 조합하여 장바구니 항목 생성 및 가격 계산
- **CartInterface (인터페이스)**  
  - 장바구니 관련 메서드(도서 목록 출력, 항목 추가/삭제/비우기 등) 정의
- **Cart (CartInterface 구현 클래스)**  
  - CartItem 배열로 장바구니 관리  
  - insertBook, removeCart(항목 삭제), deleteBook(전체 비우기), printCart 등 기능 구현
- **Welcome**  
  - BookList, menuCartAddItem, menuCartRemoveItem, menuCartClear 등  
    사용자 인터페이스 및 메뉴 기능 구현  
  - Book 객체 기반 도서 정보 관리 및 장바구니 연동
---

## 🏷️ 브랜치 목적

이 브랜치는  
**장바구니 항목 삭제 및 비우기 기능의 구현**과  
**객체지향적 설계(추상 클래스, 상속, 조합) 강화**에 중점을 두고 있습니다.  
코드를 구조화하여 유지보수성과 확장성을 높였습니다.

---

## ✅ 커밋 내역

- feat: 도서/장바구니 클래스 구조 개선(Item, Book, Cart 등 추가)
- feat: 바구니 처리의 메서드를 정의하기 위한 인터페이스 생성
- feat: 장바구니 항목 삭제 및 비우기 기능 구현
