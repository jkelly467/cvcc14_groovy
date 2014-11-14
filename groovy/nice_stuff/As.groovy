
def myInt = 4
def bigDec = myInt as BigDecimal

assert bigDec.class == BigDecimal.class
assert bigDec == 4.0

myInt = "4.2"
bigDec = myInt as BigDecimal

assert bigDec == 4.2


