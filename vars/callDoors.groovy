

def call( Map cfg = [:] ){

  echo " param: ${cfg.name}"
  def pp = "${cfg.name}"
  echo "${pp}"
  
  bat '''
    @echo OFF
    set PATH=%PATH%;C:\\Users\\carst\\Documents\\jenkins-ideen\\peek
    echo "call something "
    call hi.cmd
    path
  '''

  script{
    powershell '''
     $env:Path += ';C:\\Users\\carst\\Documents\\jenkins-ideen\\peek'
     hi.cmd
    '''
  }
}
