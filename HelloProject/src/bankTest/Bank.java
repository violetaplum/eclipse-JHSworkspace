package bankTest;
/*import bankTest.BankAccount.**/;
import java.util.Scanner;

//설계도 class파일 : BankAccount.java
//은행잔고 balance, getter/serter 및 생성자 만들기
//deposit, withdraw 사용
//(결과)
//고객오심
//10만원넣음
//출금후 5만원 잔액
//입금후 15만원 잔액

public class Bank extends BankAccount {

    public static void withdraw(int amount)
    {
        BankAccount.setBalance(balance-amount);
    }
    public static void deposit(int amount)
    {
        BankAccount.setBalance(balance+amount);
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();


        System.out.print("Hello you! insert you money.. >>");
        Bank.deposit(sc.nextInt());
        System.out.println("You have.. >> "+b.getBalance());

        System.out.print("withdraw amount >> ");
        Bank.withdraw(sc.nextInt());
        System.out.println("You have.. >> "+b.getBalance());

        System.out.print("deposit amount >>");
        Bank.deposit(sc.nextInt());
        System.out.println("You have.. >> "+b.getBalance());


    }
}
