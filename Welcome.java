package MainMenu;

import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = input.next();

        System.out.print("연락처를 입력하세요 : ");
        int userMobile = input.nextInt();

        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";
		
	}
}

