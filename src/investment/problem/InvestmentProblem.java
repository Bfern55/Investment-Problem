package investment.problem;
public class InvestmentProblem {
public static void main(String[] args) {
      int startingBalance = 10000;
      double balance = startingBalance;
      double interestRate = .05;
      int year = 0;
      double interest;
      while (balance < 20000){
      interest = balance * interestRate;
      balance = interest + balance;
      year++;
    System.out.println("Year:" + year + " Balance:" + balance);
}
} 
}
