import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<공리주의적 행위 판별기>");
		System.out.print("판별할 행위를 적어주세요. : ");
		Behavior act1 = new Behavior( sc.nextLine() );
		
		Utility strength = new Utility(0);
		Utility persistence = new Utility(0);
		Utility certainty = new Utility(0);
		Utility proximity = new Utility(0);
		Utility productivity = new Utility(0);
		Utility purity = new Utility(0);
		
		act1.set_point(0);
		
		strength.set_principle("1. 강도");
		persistence.set_principle("2. 지속성");
		certainty.set_principle("3. 확신성");
		proximity.set_principle("4. 근접성");
		productivity.set_principle("5. 생산성");
		purity.set_principle("6. 순수성");
		
		System.out.println("강도 지속성 확신성 근접성 생산성 순수성 (0 ~ 10)\n각 점수를 엔터로 구분하여 순서대로 입력하세요.");
		act1.plus_point(sc.nextInt(), strength);
		act1.plus_point(sc.nextInt(), persistence);
		act1.plus_point(sc.nextInt(), certainty);
		act1.plus_point(sc.nextInt(), proximity);
		act1.plus_point(sc.nextInt(), productivity);
		act1.plus_point(sc.nextInt(), purity);
		
		int sum;
		sum = act1.result(strength, persistence, certainty, proximity, productivity, purity);
		if (sum >= 40) {
			if ( act1.result(strength) < 6)
				System.out.println("쾌락의 강도가 충분하지 않습니다.");
			if ( act1.result(persistence) < 6)
				System.out.println("쾌락의 지속성이 충분하지 않습니다.");
			if ( act1.result(certainty) < 5)
				System.out.println("쾌락의 확신성이 충분하지 않습니다.");
			if ( act1.result(proximity) < 5)
				System.out.println("쾌락의 근접성이 충분하지 않습니다.");
			if ( act1.result(productivity) < 4)
				System.out.println("쾌락의 생산성이 충분하지 않습니다.");
			if ( act1.result(purity) < 4)
				System.out.println("쾌락의 순수성이 충분하지 않습니다.");
			if (act1.result(strength) >= 6 && act1.result(persistence) >= 6 && act1.result(certainty) >= 5 && act1.result(proximity) >= 5 &&
					act1.result(productivity) >= 4 && act1.result(purity) >= 4)
				System.out.println("\n공리주의적으로 유용한 선택입니다! 행동하세요!");
		}
		else {
			act1.show();
			System.out.println("\n항목의 총합이 작습니다. 공리주의적으로 유용하지 않습니다.");
		}
		sc.close();
	}
}
