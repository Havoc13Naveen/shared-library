def call(name){
  sh '''
  find /home/ubuntu/ -type d -mmin -20 -iname "${name}" >> log_file
  cat log_file
  '''
}
