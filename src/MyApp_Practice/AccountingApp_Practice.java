package MyApp_Practice;

public class AccountingApp_Practice {

	public static void main(String[] args) {
		
		double valueofsupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expnseRate = 0.3;
		double vat = valueofsupply * vatRate;
		double total = valueofsupply * vat;
		double expense = valueofsupply * expnseRate;
		double income = valueofsupply - expense;
		double dividen1 = income * 0.5;
		double dividen2 = income * 0.3;
		double dividen3 = income * 0.2;
		
		System.out.println("Value of supply :" + valueofsupply );
		System.out.println("VAT :" + vat);
		System.out.println("Total :" + total);
		System.out.println("Expense :" + expense );
		System.out.println("Income :" + income );
		System.out.println("Dividend 1 : " + dividen1);
		System.out.println("Dividend 2 : " + dividen2);
		System.out.println("Dividend 3 : " + dividen3);

	}

}
