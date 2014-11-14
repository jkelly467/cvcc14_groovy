
String.metaClass.upperSome = { chars ->
  def sb = new StringBuffer()
  def ch
  delegate.each {
    ch = it as char
    sb << (it in chars ? Character.toUpperCase(ch) : ch)
  }
  sb.toString()
}

println "bohemian rhapsody".upperSome(['b', 'r'])



