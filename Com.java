package starcraft;

public class Com extends StarMain {
	
	Marine marine = new Marine("마린", "테란", 40, 6, 1);//유닛이름, 종족이름, 체력, 공격력, 이동속도
	Zergling zergling = new Zergling("저글링", "저그", 35, 5, 2);//유닛이름, 종족이름, 체력, 공격력, 이동속도
	Zealot zealot = new Zealot("질럿", "프로토스", 100, 16, 1, 60);//유닛이름, 종족이름, 체력, 공격력, 이동속도
	
	int comNum = (int)(Math.random() * 3 + 1);
	public String com;
	
	public void comClan() {
		
		do {
			if(comNum == 1) {
				marine.clan = "테란";
				com = "마린";
			}else if(comNum == 2) {
				zergling.clan = "저그";
				com = "저글링";
			}else {
				zealot.clan = "프로토스";
				com = "질럿";
			}
		} while (comNum < 1 || comNum > 3);
	}
	
}

