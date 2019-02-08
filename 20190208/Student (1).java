
public class Student {
	int id;//学生番号
	String name;//名前
	int credits;//取得済み単位数

	public static void main(String[] args) {
		Student p1 = new Student();
		
		p1.id=800999;
		p1.name="若馬 大輔";
		p1.credits=45;
		System.out.println("学生番号："+p1.id);
		System.out.println("名前："+p1.name);
		System.out.println("取得済み単位数："+p1.credits);
		System.out.println("------------------");

		Student p2 = new Student();
		p2.id=900999;
		p2.name="入門 若葉";
		p2.credits=61;
		System.out.println("学生番号："+p2.id);
		System.out.println("名前："+p2.name);
		System.out.println("取得済み単位数："+p2.credits);

	}

}
