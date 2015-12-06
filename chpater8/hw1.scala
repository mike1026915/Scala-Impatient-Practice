class BankAccount(initialBalance: Double) 
{
    private var balance = initialBalance
    println("Account: "+ initialBalance +" dollars")
    def deposit(amount: Double) = {  balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance)
{
    def charge(fee: Int)
    {
        super.withdraw(fee)
    }
    override def deposit(amount: Double) =  { charge(1); super.deposit(amount)  } 
    override def withdraw(amount: Double) = { charge(1); super.withdraw(amount) }

}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance)
{
    def charge(fee: Int)
    {
       if (free_count<=0)
           super.withdraw(fee)
       else
           free_count -= 1
    }
    private var free_count = 3
    override def deposit(amount: Double) =  { charge(1); super.deposit(amount)  }
    override def withdraw(amount: Double) = { charge(1); super.withdraw(amount) }
    def earnMonthlyInterest(rate: Double)
    {
       free_count = 3
       val interest = super.deposit(0)*rate
       println("Add interest: " + interest)
       super.deposit(interest)
    }
}


println("=====  HW1  =====")
var ca = new CheckingAccount(100)
println("Desosit 10 dollars")
println(ca.deposit(10))
println("Withdraw 10 dollars")
println(ca.withdraw(10))
println("Desosit 13 dollars")
println(ca.deposit(13))

println("=====  HW2  =====")
var sa = new SavingsAccount(100)
println("Desosit 10 dollars")
println(sa.deposit(10))
println("Withdraw 10 dollars")
println(sa.withdraw(10))
println("Desosit 10 dollars")
println(sa.deposit(10))
println("Desosit 10 dollars")
println(sa.deposit(10))
println("Desosit 10 dollars")
println(sa.deposit(10))
sa.earnMonthlyInterest(0.01)
println("Desosit 10 dollars")
println(sa.deposit(10))
println("Desosit 10 dollars")
println(sa.deposit(10))





