def call( Map cfg =[:] ){
  String  scrContent = libraryResource("data/myTx.txt")
  echo "-- ${scrContent}"
  String  wert = "blah balh"
  String cc =  scrContent.replaceAll( '\\$VAL', wert )
  writeFile file : "ff" , text : cc
}
