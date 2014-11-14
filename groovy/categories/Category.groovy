
class StringCategory {
  static String lower(String string) {
    string.toLowerCase()
  }
  static String mod(String a, String b) {
    a.equalsIgnoreCase(b)
  }
}

use (StringCategory) {
  assert 'test' == 'TeSt'.lower()
  assert 'test' % 'TeSt'
}

try {
  println 'tESt'.lower()
} catch (Exception e) {
  println "Only can use with a category"
}


