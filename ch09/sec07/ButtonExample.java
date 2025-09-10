package ch09.sec07;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btnOk = new Button();

		btnOk.setClickListener(new Button.ClickListener() {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		});

		btnOk.click();

		Button brnCancel = new Button();

		btnCancel.setClickListener(new Button.ClickListener() {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		});

		btnCancel.click();
	}
}
