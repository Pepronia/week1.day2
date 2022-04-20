package week1.day2;

public class LearnMethods {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		LearnMethods obj = new LearnMethods();
		int mul = obj.multiplyTwoNumbers(4, 3);
		System.out.println(obj.printCarName());
		System.out.println(obj.getCarRegNumber());
		System.out.println(obj.getCarVarient());
		System.out.println(mul);
	}

	public String printCarName() {
		String carName = "Polo";
		System.out.println(carName);
		return carName;
	}

	public int getCarRegNumber() {
		int carNumber = 3456;
		return carNumber;
	}

	public String getCarVarient() {
		String carVarient = "Diesel";
		return carVarient;

	}

	public int multiplyTwoNumbers(int a, int b) {
		return (a * b);

	}

}
