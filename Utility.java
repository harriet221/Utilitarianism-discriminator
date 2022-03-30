
public class Utility {
	private int point;
	private String category;
	
	Utility() {}
	
	Utility(int zero) {
		point = zero;
	}
	
	int get_point() {
		return point;
	}
	
	void set_principle(String ca) {
		category = ca;
	}
	
	void show() {
		System.out.println(category+" : "+get_point());
	}
	
	boolean plus(int po) {
		if (po > 10)
			return false;
		point += po;
		return true;
	}
	
}
