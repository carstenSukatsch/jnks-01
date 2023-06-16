
def call( Map cfg = [:] ){

  echo " herster param: ${cfg.name}"
  def pp = ${cfg.name}
  echo "${pp}"
  
  bat '''
    @echo OFF
    echo "call something "
  '''
  
}
