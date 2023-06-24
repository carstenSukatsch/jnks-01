String  call(  ){

 String bt = xf2()
 String b2 = "C:\\Program Files\\IBM\\Rational\\DOORS\\9.7\\bin"
 def  pfade = [
     b2
 ]
 
pfade.addAll( bt )
 
 
 return  pfade.join(';')
}
