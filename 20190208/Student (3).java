
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

	void show() {
		System.out.println("学生番号：" + id);
		System.out.println("名前：" + name);
		System.out.println("取得済み単位数：" + credits);

	}
	/* 上文のshowメソッドの補足
	以下のように、３個の引数を指定するのは間違いです。★
	理由：以下のメソッドの場合、フィールドをまったく使用していないため、
	１１章のメソッドではありません。１１章のメソッド中では、
	　　・フィールド　か
	　　・メソッド
	を必ず使用します。以下のメソッドは間違いです。★
	void show(int id,String name,int credits) {
	    //以下では、フィールドでなく、仮引数を使用しています★
		System.out.println("学生番号：" + id);
		System.out.println("名前：" + name);
		System.out.println("単位：" + credits);
		}
	*/

	public static void main(String[] args) {
		Student p1 = new Student();
		p1.show();

		System.out.println("------------------");

		Student p2 = new Student();
		p2.setData(900999, "入門 若葉");
		p2.setCredits(61);
		p2.show();
	}

}
