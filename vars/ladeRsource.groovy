def call( Map cfg =[:] ){
  String  scrContent = libraryResource("data/myTx.txt")
  echo "-- ${scrContent}"
  String  wert = cfg.xl
  String cc =  scrContent.replaceAll( '\\$VAL', wert )
  writeFile file : "ff" , text : cc
}
