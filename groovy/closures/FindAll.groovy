
def MASTER = ["foo", "bar"]
def list = ["foo", "baz", "bar", "brah", "breh", "bluh"]

println list.findAll {
  return MASTER.contains(it)
}



