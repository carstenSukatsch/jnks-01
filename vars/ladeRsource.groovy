def call( Map cfg =[:] ){
  String  scrContent = libraryResource("data/myTx.txt")
  String  wert = "blah balh"
  String cc =  scrContent.replaceAll( '\\$VAL', 'fff' )
  writeFile file : "ff" , text : cc
}
