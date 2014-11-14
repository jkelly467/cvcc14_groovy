
def list = ["first", "second", "third", "fourth"]

def newList = list.collect {
  return it+" item"
}

println newList


