
String.metaClass.swapCase = { ->
  def sb = new StringBuffer()
  def ch
  delegate.each {
    ch = it as char
    sb << (Character.isUpperCase(ch) ? Character.toLowerCase(ch) :
           Character.toUpperCase(ch))
  }
  sb.toString()
}

println "TuNe-YaRdS".swapCase()


