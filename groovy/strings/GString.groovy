class Me {
  def first = "James"
  def last = "Bond"
  
  def fullName() {
    return first + " " + last
  }

  String toString() {
    return last
  }
}

def me = new Me()

println "The name's $me, ${me.fullName()}"
println "The name's $me.last, $me.first $me.last"
timeGuy = "Also, did you know that ${new Date()} is before ${writer -> writer << new Date()}"
sleep 1000
println timeGuy



