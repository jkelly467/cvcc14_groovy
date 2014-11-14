
def addToInt(i, amt=1) {
  i + amt
}

assert addToInt(1) == 2
assert addToInt(1, 3) == 4

//Groovy makes these for you
def addToInt(i) {
  addToInt(1, 1)
}

def addToInt(i, amt) {
  i + amt
}


