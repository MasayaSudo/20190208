
public class Student {
	int id = 800000;//学生番号
	String name = "名前がありません";//名前
	int credits = 0;//取得済み単位数

	public	Student() {//(1)引数なしコンストラクタ
	}

	//(2)int型とString型の引数をもつコンストラクタ
	public Student(int id, String name) {
		setData(id, name);

	}
	//(3)int型とString型とint型の引数をもつコンストラクタ
	public	Student(int id, String name, int credits) {
		setData(id,name);
		setCredits(credits);

	}

	void setData(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	void setCredits(int credits) {
		this.credits = credits;
	}

	void show() {
		System.out.println("学生番号：" + id);
		System.out.println("名前：" + name);
		System.out.println("取得済み単位数：" + credits);

	}

	public static void main(String[] args) {
		Student p1 = new Student();
		p1.show();

		System.out.println("------------------");

		Student p2 = new Student();
		p2.setData(800999, "若馬 大輔");
		p2.show();

		System.out.println("------------------");

		Student p3 = new Student();
		p3.setData(900999, "入門 若葉");
		p3.setCredits(30);
		p3.show();

	}

}
