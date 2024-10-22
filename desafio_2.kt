class BankAccount(val accountHolder: String) {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
        } else {
            println("Seu saldo é insuficiente.")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount("Wesley Jonatha")

    account.deposit(100.0)
    account.withdraw(40.0)
    account.withdraw(70.0)

    println("Saldo final: ${account.getBalance()}")
}
