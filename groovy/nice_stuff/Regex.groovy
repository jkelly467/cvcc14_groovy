
assert "cheesecheese" =~ /cheese/

def matcher = "cheesecheese" =~ /cheese/
def ch = matcher.replaceFirst("nice")
assert ch == "nicecheese"

assert "2009" ==~ /\d+/


