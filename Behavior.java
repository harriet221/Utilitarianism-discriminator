
class Behavior {
	private String behave;
	private int pleasure;
	private int sum;
	
	Behavior() {}
	
	Behavior(String behave) {
		this.behave = behave;
	}
	
	void show () {
		System.out.println(behave+"이라는 행위의 공리 : "+pleasure);
	}
	
	void set_point(int po) {
		pleasure = po;
	}
	
	int get_point() {
		return pleasure;
	}
	
	void plus_point(int po, Utility ut) {
		if ( ut.plus(po) )
			pleasure += po;
		else {
			System.out.println("0 ~ 10을 입력하셔야죠. 다시 해주세요.");
			System.exit(0);
		}
	}
	
	int result(Utility p1, Utility p2, Utility p3, Utility p4, Utility p5, Utility p6) {
		p1.show();
		p2.show();
		p3.show();
		p4.show();
		p5.show();
		p6.show();
		sum = p1.get_point() + p2.get_point() + p3.get_point() + p4.get_point() + p5.get_point() + p6.get_point();
		return sum;
	}
	int result(Utility prin) {
		return prin.get_point();
	}
}
