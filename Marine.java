package starcraft;

import java.util.Scanner;

public class Marine extends Terran{
	
	int steampack = 10;
	
	public Marine(String name, String clan, int strength, int power, int speed) {
		super(name, clan, strength, power, speed);
		
		
	}
	
	public void announce1() {
		System.out.println("테란을 선택하셨습니다.");
		System.out.println("마린을 생산합니다.\n");
	}
	
	public void steam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("스팀팩 투여");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int input = sc.nextInt();
		
		do {
			if(input == 1) {
				speed += 3;
				strength -= 5;
				steampack -= 10;
				System.out.println("이동속도가 3 증가했습니다.");
				System.out.println("체력이 5 감소했습니다.\n");
			}else if(input == 2) {
				System.out.println("업그레이드를 취소합니다.\n");
			}else{
				System.out.println("잘못된 숫자를 선택했습니다. 다시 선택해주세요\n");
			}
		} while (input > 2 || input < 1);
		sc.close();
	}
	 
	@Override
	public void attack() {
		System.out.println(name + "이 공격합니다!\n");
	}
	
	public void announce2() {
		System.out.println("현재 체력은 " + strength + " 스팀팩 잔여량은 " + steampack + " 이동속도는 " + speed + " 전투력은 " + power + "\n");
	}

}
