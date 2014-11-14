class Chipotle implements Comparable<Chipotle> {
  static meatWeight = [
    'Chicken':1, 'Steak':2, 'Barbacoa':3, 'Carnitas':4
  ]

  private weight
  def meat

  Chipotle(meat) {
    this.meat = meat
    weight = meatWeight[meat]
  }

  int compareTo(Chipotle o2) {
    this.weight.compareTo(o2.weight)
  }

  String toString() {
    meat
  }

  Chipotle next() {
    def m = meatWeight.find {k, v -> v == weight + 1 }
    m ? new Chipotle(m.key) : null
  }

  Chipotle previous() {
    def m = meatWeight.find {k, v -> v == weight - 1 }
    m ? new Chipotle(m.key) : null
  }
}

println (new Chipotle("Steak") .. new Chipotle("Carnitas"))


