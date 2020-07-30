//question 4

var bank:List[Account]=List()
class Account(id:String,n: Int, b: Double) {
val nic:String=id
val acnumber: Int = n
var balance: Double = b
override def toString =
 "["+nic+":"+acnumber +":"+ balance+"]"
}

def withdraw(a:Double) =
this.balance=this.balance-a
def deposit(a:Double) =
this.balance=this.balance+a
var bank:List[Account]=List()
val find=(n:String,b:List[Account])=>
b.filter(x=>x.nic.equals(n))
//List of Accounts with negative balances
val overdraft=(b:List[Account])=> b.filter(...)
//Total of all account balances
val balance=(b:List[Account])=> b.reduce(....)
//If balance is positive deposit interest is .05
//If balance is negative overdraft interest is .1
val interest=(b:List[Account])=>b.map(....)