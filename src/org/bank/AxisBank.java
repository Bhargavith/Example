package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
		System.out.println("Axis Bank deposit account 15% interest");
		}
		
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		System.out.println("(Parent)BankInfo deposit() ");
		System.out.print("*******************************");
		System.out.print("\n");
		//b.saving();
		//b.fixed();
		b.deposit();
		System.out.print("\n");
		AxisBank a=new AxisBank();
		System.out.println("(Child)AxisBank deposit() Overide");
		System.out.print("************************************");
		System.out.print("\n");
		a.deposit();
		System.out.println("hiiiihello Bagi");
		System.out.println("hiiiihello world");
		System.out.println("changes made by change2 and udated userstory");

		System.out.println("changes made as per userstory");
		System.out.println("changes made by hdfc1");
System.out.println("changes made by hdfc2");


	}
	

}
