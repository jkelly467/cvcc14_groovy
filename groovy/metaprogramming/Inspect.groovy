
class Impenetrable {
  private static random = new Random()
  static generate() {
    def result
    switch (random.nextInt(15)) {
      case 0..4:
        result = new Opaque()
        break
      case 5..9:
        result = new Void()
        break
      case 10..14:
        result = new Obscure()
        break
    }
    result
  }
}

class Opaque extends Impenetrable {
  String what = "A brick wall, bud"

  def whatAmI() {
    what
  }
}

class Void extends Impenetrable {
  String me = "Nothingness"

  def whatAmI() {
    me
  }
}

class Obscure extends Impenetrable {
  String me = "Nunya Bizness"

  def whoAmI() {
    me
  }
}

def o 
for (i in 1..10) {
  o = Impenetrable.generate()
  println "--== Subject $i ==--"
  switch (o) {
    case Opaque:
    case Void:
      switch (o.whatAmI()) {
        case ~ /.*brick.*/:
          println "Must be Mr. Brick Wall"
          break
        case ~ /Nothing.*/:
          println "Must be Mr. Void"
          break
        default:
          println "Must be ${o.whatAmI()}"
      }
      break
    case Obscure:
      println "Must be ${o.whoAmI()}"
      break
  }
}


