def call( Map cfg =[:] ){
  def scrContent = libraryResource("data/myTx.txt")
  writeFile file : "ff" , text : scrContent
}
