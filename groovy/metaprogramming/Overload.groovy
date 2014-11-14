
String.metaClass.plus = { String b ->
  def sb = new StringBuffer()
  sb << b
  sb << delegate
  sb.toString()
}

println ("How" + "Now")


