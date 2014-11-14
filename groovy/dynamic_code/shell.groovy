
def run = true

println 'Awaiting input...'

while (run) {
  def i = System.console().readLine()
  def scr
  switch (i) {
    case 'r':
    case 'reload':
      scr = new GroovyShell().parse(new File('dyn.groovy'))
      println 'Script loaded'
      break
    case 'e':
    case 'execute':
      if (!scr) {
        println 'Nothing loaded'
      } else {
        scr.run()
      }
      break
    case 'x':
    case 'exit':
      println "Exiting"
      run = false
      break
  }
}



