def call( Map cfg =[:] ){
  def scrContent = libraryResource("data/myTx.txt")
  def wert = "blah balh"
  writeFile file : "ff" , text : scrContent
}
