
def (a,b,c) = [10,20,'foo']
assert a == 10 && b == 20 && c == 'foo'

def nums = [1,3,5]
def d,e,f
(d,e,f) = nums
assert d == 1 && e == 3 && f == 5

def (_, m, y) = "18th June 2009".split()
assert "In $m of $y" == "In June of 2009"

def (g,h,i) = [1,2]
assert g == 1 && h == 2 && i == null

def (j,k) = [1,2,3]
assert j == 1 && k == 2


