

def list = ["superlonglong superlonglong", "short", "longlonglong", "medium"]
def list2 = ["a", "aaaa", "aaa", "aa"]

def arbitrary = 10

def comparator = { a, b ->
  (a.length() + b.length()).compareTo(arbitrary)
}

list.sort(comparator)
list2.sort(comparator)

println "List: "+list
println "List2: "+list2


