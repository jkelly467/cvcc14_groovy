
def MASTER = ["foo", "bar"]
def list = ["foo", "baz", "bar", "brah", "breh", "bluh"]

println list.find {
  return MASTER.contains(it)
}



