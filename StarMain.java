package starcraft;

import java.util.Scanner;



public class StarMain {

	public static void main(String[] args) {
		
		
		Marine marine = new Marine("마린", "테란", 40, 6, 1);//유닛이름, 종족이름, 체력, 공격력, 이동속도
		Zergling zergling = new Zergling("저글링", "저그", 35, 5, 2);//유닛이름, 종족이름, 체력, 공격력, 이동속도
		Zealot zealot = new Zealot("질럿", "프로토스", 100, 16, 1, 60);//유닛이름, 종족이름, 체력, 공격력, 이동속도, 쉴드
		Com com = new Com();
		com.comClan();
		
		boolean run = true;
		
		
		do {
			Scanner sc = new Scanner(System.in); // 스캐너
			System.out.println("종족을 골라주세요.");
			System.out.println("1. 테란");
			System.out.println("2. 저그");
			System.out.println("3. 프로토스");
			
			int input = sc.nextInt(); //종족 입력
			
			do {
				if(input == 1) {
					
					marine.clan = "테란";
					marine.announce1();
					marine.steam();
					//marine.attack();
					marine.announce2();
					
				}else if(input == 2) {
					zergling.clan = "저그";
					zergling.announce1();
					zergling.Adrenaline();
					//zergling.attack();
					zergling.announce2();
				}else if(input == 3) {
					zealot.clan = "프로토스";
					zealot.announce1();
					zealot.speed();
					//zealot.attack();
					zealot.announce2();
				}else {
					System.out.println("잘못된 숫자를 선택했습니다1");
					break;
				}
			} while (input < 1 || input > 3);
			
			System.out.println("적군을 만났습니다! 적군의 캐릭터는 " + com.com);
			System.out.println("적군과 싸우시겠습니까?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			int input2 = sc.nextInt(); // 공격 입력
			
			do {
				if(input2 == 1) {
					System.out.println("적을 공격합니다!");
					if(com.comNum == 1) {
						System.out.println("적의 남은체력 : " + com.marine.strength);
					}else if(com.comNum == 2) {
						System.out.println("적의 남은체력 : " + com.zergling.strength);
					}
				}else if(input2 == 2) {
					
				}else {
					
				}
			} while (input2 < 1 || input2 > 2); 
			sc.close();
		} while (!run);
		
		
		
	}

}
