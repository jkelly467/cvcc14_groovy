def list = ["superlonglong superlonglong", "short", "longlonglong", "medium"]
def list2 = ["a", "aaaa", "aaa", "aa"]

list.sort { a, b ->
  a.length().compareTo(b.length())
}

list2.sort { a, b ->
  a.length().compareTo(b.length())
}

println "List: "+list
println "List2: "+list2


