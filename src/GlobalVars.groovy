
class GlobalVars {
   static String foo = "bar"
  
   static List pfade = [
    "c:\\dir-q",
    "2´d:\\ein\\verzeichnis"
 ]

 static def f1()
   {
      return " nix dolles"
   }
   
 static def f2()
   {
      return  this.pfade.join(';')
   }
  
}


