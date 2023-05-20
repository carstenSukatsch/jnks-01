def call( Map cfg =[:] ){
  def scrContent = libraryResource("data/myTx.txt")
  def wert = "blah balh"
   scrContent.replaceAll( 'kk', '#' )
  writeFile file : "ff" , text : scrContent
}
