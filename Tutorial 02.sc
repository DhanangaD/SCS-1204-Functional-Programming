//Question 01 - 02------------------------------------------------------------------------
var k = 2
var i = 2
var j = 2
var m = 5
var n = 5
var f = 12.0f
var g = 4.0f
var c = 'X'

//Question 03------------------------------------------------------------------------------
//part I
//a).
println(k + 12 * m)

//b).
println(m / j)

//c).
println(n % j)

//d).
println(m / j * j)

//e).
println(f + 10 * 5 + g)

//f).
i = i + 1
println(i * n)

//Question 3-------------------------------------------------------------------------------
//part II
var a = 2
var b = 3
var c = 4
var d = 5
var k = 4.3f

//a).
b = b - 1
println(b * a + c * d)
d = d - 1

//b).
println(a)
a = a + 1

//c).
println(-2 * (g - k) + c)

//d).
println(c)
c = c + 1

//e).
c = c + 1
println(c * a)
a = a + 1

//Question 04------------------------------------------------------------------------------------
//part a).
val salaryForWorkingHour = 250.00f
val salaryForOTHour = 85.00f
val workingHoursPerWeek = 40
val OTHoursPerWeek = 30
val taxRate = 0.12f

def isValid(workingHours: Int, otHours: Int): Boolean = workingHoursPerWeek <= workingHours && OTHoursPerWeek <= otHours
def totalSalary(workingHours: Int, otHours: Int): Float = (workingHours * salaryForWorkingHour) + (otHours * salaryForOTHour)
def tax(totalSalary: Float): Float = totalSalary * taxRate
def takeHomeSalary(totalSalary: Float, tax: Float) : Float = totalSalary - tax

def calculateSalary(workingHours: Int, otHours: Int) : Float = if (isValid(workingHours, otHours)) {
  val totalSalaryAmount= totalSalary(workingHours, otHours)
  val taxAmount = tax(totalSalaryAmount)
  takeHomeSalary(totalSalaryAmount, taxAmount)
}
else {
  0.00f
}

calculateSalary(60,60)

//Question 04---------------------------------------------------------------------------------------------
//part b).
val costForEachPerformance = 500.00f
val costForEachAttendee = 3.00f
val basePrice = 15.00f
val priceChange = 5

def max(a: Float, b: Float): Float = if (a >= b) a else b
def numberOfAttendees(priceChange: Int): Int = -1 * (priceChange * 20 / 5) + 120
def TicketPrice(priceChange: Int): Float = basePrice + priceChange
def Income(numberOfPeople: Int, ticketValue: Float): Float = ticketValue * numberOfPeople
def Cost(numberOfPeople: Int): Float = costForEachPerformance + (costForEachAttendee * numberOfPeople)
def Profit(incomeValue: Float, costValue: Float): Float = incomeValue - costValue
def calculateProfit(numberOfPeople: Int, ticketValue: Float) : Float = Profit(Income(numberOfPeople, ticketValue), Cost(numberOfPeople))

def findBestPrice(priceIncrease: Int, priceDecrease: Int): Float = {
  val IncreasedNumberOfAttendees = numberOfAttendees(priceIncrease)
  val IncreasedTicketPrice = TicketPrice(priceIncrease)
  val IncreasedProfit = calculateProfit(IncreasedNumberOfAttendees, IncreasedTicketPrice)

  val numberOfPeople_decreased = numberOfAttendees(priceDecrease)
  val DecreasedTicketPrice = TicketPrice(priceDecrease)
  val profit_decreased = calculateProfit(numberOfPeople_decreased, DecreasedTicketPrice)

  if(IncreasedProfit >= profit_decreased) IncreasedTicketPrice else DecreasedTicketPrice
}

findBestPrice(5, -5)
