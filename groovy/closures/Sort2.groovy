
def list = ["superlonglong superlonglong", "short", "longlonglong", "medium"]
def list2 = ["a", "aaaa", "aaa", "aa"]

def comparator = { a, b ->
  a.length().compareTo(b.length())
}

list.sort(comparator)
list2.sort(comparator)

println "List: "+list
println "List2: "+list2


