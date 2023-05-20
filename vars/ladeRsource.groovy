def call( Map cfg =[:] ){
  def scrContent = libraryResource("data/myTx.txt")
  def wert = "blah balh"
   scrContent.text.replaceAll( '#', 'fff' )
  writeFile file : "ff" , text : scrContent
}
