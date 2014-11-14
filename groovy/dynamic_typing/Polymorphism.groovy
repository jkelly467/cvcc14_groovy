class Song {
  def name
  def length
}

class Book {
  def name
  def author
}

void doSomething(thing) {
  println thing.name
}

doSomething(new Song(name: "ABCs", length:1.0)) 
doSomething(new Book(name: "Game of Thrones", author: "George R. R. Martin")) 


