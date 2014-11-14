
class FooFinder {
  def MASTER = ["foo"]

  def findIt(list, Closure cl) {
    cl.delegate = this
    list.findAll(cl)
  }
}

class BarOrBrahFinder {
  def MASTER = ["bar", "brah"]

  def findIt(list, Closure cl) {
    cl.delegate = this
    list.findAll(cl)
  }
}

def list = ['foo', 'baz', 'bar', 'brah', 'breh', 'bluh']

def contains = {
  MASTER.contains(it)
}

println new FooFinder().findIt(list, contains)
println new BarOrBrahFinder().findIt(list, contains)


