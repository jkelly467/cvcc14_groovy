package test.groovy.dsl

class Person {

  def name
  
  private want
  private drink

  def wants(want) {
    this.want = want
  }

  def drinks(drink) {
    this.drink = drink
  }

  def action(Closure cl) {
    cl.delegate = this
    cl.resolveStrategy = Closure.DELEGATE_FIRST
    cl()
  }
}

def ExpandoMetaClass createEMC(Class clazz, Closure cl) {
  ExpandoMetaClass emc = new ExpandoMetaClass(clazz, false)
  cl(emc)
  emc.initialize()
  return emc
}

Script s = new GroovyShell().parse(new File("./dude.person"))
s.metaClass = createEMC(s.class) { ExpandoMetaClass emc ->
  emc.person = { name, Closure cl ->
    cl.delegate = new Person(name: name)
    cl.resolveStrategy = Closure.DELEGATE_FIRST
    cl()
  }
}

s.run()
