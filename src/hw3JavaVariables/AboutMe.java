package hw3JavaVariables;

public class AboutMe {

	public String lastName; // variable declared.
	public String firstName = "Mohammad"; // variable initialized.
	public byte age = 33;
	public short matricNo = 2381;
	public int yearlyExpense = 56089;
	public long yearlyIncome = 82792847l;
	public float myHeight = 5.57f;
	public double myCgpa = 3.3098748273;
	public char Apt = 'G';
	public boolean resident = false;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("My First name is: " + aboutMe.firstName + "\nMy age is " + aboutMe.age
				+ "\nMy matric No is " + aboutMe.matricNo + "\nand my Height is " + aboutMe.myHeight);

	}

}
