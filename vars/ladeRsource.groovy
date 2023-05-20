def call( Map cfg =[:] ){
  String  scrContent = libraryResource("data/myTx.txt")
  String  wert = "blah balh"
  String cc =  scrContent.replaceAll( '\\$VAL', '1234' )
  writeFile file : "ff" , text : cc
}
