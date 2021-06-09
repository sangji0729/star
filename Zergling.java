package starcraft;

import java.util.Scanner;

public class Zergling extends Zerg{

	public Zergling(String name, String clan, int strength, int power, int speed) {
		super(name, clan, strength, power, speed);
		
	}
	
	public void announce1() {
		System.out.println("저그를 선택하셨습니다.");
		System.out.println("저글링을 생산합니다.\n");
	}
	
	public void Adrenaline() {
		System.out.println("아드레날린 업그레이드를 하시겠습니까?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		do {
			if(input == 1) {
				System.out.println("업그레이드를 시작합니다.");
				speed += 3;
				System.out.println("이동속도가 3 증가했습니다.\n");
			}else if(input == 2){
				System.out.println("업그레이드를 취소합니다.\n");
			}else {
				System.out.println("잘못된 숫자를 선택했습니다. 다시 선택해주세요.\n");
			}
		} while (input > 2 || input < 1);
		sc.close();
	}
	
	@Override
	public void attack() {
		System.out.println(name + "이 공격합니다! \n");
	}
	
	public void announce2() {
		System.out.println("현재 체력은 " + strength + " 이동속도는 " + speed + " 전투력은 " + power + "\n");
	}

}
