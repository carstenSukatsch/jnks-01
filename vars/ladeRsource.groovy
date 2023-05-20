def call( Map cfg =[:] ){
  String  scrContent = libraryResource("data/myTx.txt")
  String  wert = "blah balh"
   scrContent.replaceAll( '#', 'fff' )
  writeFile file : "ff" , text : scrContent
}
