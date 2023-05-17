def call(name){
  sh '''
  find /home/ubuntu/ -type f -mmin -20 -iname "${name}"
  '''
}
