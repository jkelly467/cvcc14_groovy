import groovy.util.GroovyScriptEngine
import groovy.lang.Binding

String[] roots = [ "." ]
GroovyScriptEngine gse = new GroovyScriptEngine(roots)
Binding binding = new Binding()
while (true) {
  println "What's your name?"
  def name = System.console().readLine()
  binding.setVariable("name", name)
  gse.run('judgement.groovy', binding)
  println binding.getVariable("myThoughts")
}
