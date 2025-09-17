package ch15;

public class GenericsExam {

	class Box {

		private Object item;

		void setItem(Object item) {
			this.item = item;
		}

		public Object getItem() {
			return item;
		}

	}

	class Box2<T> {	   //제너릭 클래스

		private T item;

		public void setItem(T item) {
			this.item = item;
		}

		public T getItem() {
			return item;
		}

	}

	public GenericsExam() {
		Box box = new Box();

		box.setItem("Hello"); //문자열 저장

		//형변환 필요(런타임 오류가능성 o)
		String str = (String) box.getItem();
		System.out.println(str);

		Box2<String> box2 = new Box2<>();
		box.setItem("Hello");
		//형변환 불필요(런타임 오류가능성 x)
		String str2 = box2.getItem();
		System.out.println(str);

	}

}
