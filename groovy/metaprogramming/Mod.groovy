
String.metaClass.mod = { String b ->
  delegate.equalsIgnoreCase(b)
}

println ("WHAT THE" % "whAT tHe")


