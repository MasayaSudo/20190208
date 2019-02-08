	
public class Student {
	int id = 800000;//学生番号
	String name = "名前がありません";//名前
	int credits = 0;//取得済み単位数

	void setData(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void setCredits(int credits) {
		this.credits = credits;
	}

	public static void main(String[] args) {
		Student p1 = new Student();
		p1.setData(800999, "若馬 大輔");
		p1.setCredits(45);

		System.out.println("学生番号：" + p1.id);
		System.out.println("名前：" + p1.name);
		System.out.println("取得済み単位数：" + p1.credits);
		System.out.println("------------------");

		Student p2 = new Student();
		p2.setData(900999, "入門 若葉");
		p2.setCredits(61);
		System.out.println("学生番号：" + p2.id);
		System.out.println("名前：" + p2.name);
		System.out.println("取得済み単位数：" + p2.credits);

	}

}
