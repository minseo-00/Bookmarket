# 📖 Chapter 11: 메뉴 선택 및 장바구니 예외 처리하기

---

## 📌 챕터 목표

- 메뉴 선택 기능을 체계적으로 구현하고,  
  장바구니 관련 예외 상황(예: 비어있는 장바구니 조작 등)에 대해  
  사용자 정의 예외(CartException)를 활용하여 견고하게 처리합니다.

---

## 🛠️ 구현 내용

- **com.market.exception 패키지 생성**  
  - 예외 처리를 위한 별도 패키지 구조 도입
- **CartException 클래스 생성**  
  - `CartException extends Exception`  
    - 예: `throw new CartException("장바구니에 항목이 없습니다");`
- **Welcome.java**  
  - 메뉴별 기능(비우기, 삭제, 주문 등)에서 장바구니가 비었을 때 예외 발생  
  - try-catch로 예외 상황 안내 및 프로그램 흐름 제어
- **장바구니 관련 메서드(menuCartClear, menuCartRemoveItem, menuCartBill 등)**  
  - 장바구니가 비었을 때 CartException 발생  
  - 예외 메시지를 사용자에게 출력
- **전체 코드 주석 및 정리**

---

## 🏷️ 브랜치 목적

이 브랜치는  
**장바구니 예외 처리 및 사용자 경험 개선**  
에 중점을 두고 있습니다.  
비정상적인 장바구니 조작 시 프로그램이 안정적으로 동작하도록  
사용자 정의 예외와 예외 메시지 출력을 구현하였습니다.

---

## ✅ 커밋 내역

- feat: CartException 클래스 추가
- feat: 메뉴 선택 및 장바구니 예외 처리 적용
- style: 코드 정리 및 주석
