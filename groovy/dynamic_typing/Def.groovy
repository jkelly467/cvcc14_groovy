def action(param) {
  param = param + 6
  return param
}

def test = "Hello"
def result1 = action(test)

assert result1 == "Hello6"

test = 6
def result2 = action(test)

assert result2 == 12


