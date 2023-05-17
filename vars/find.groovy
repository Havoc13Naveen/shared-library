def call(name){
  sh '''
  find /home/ubuntu/ -type d -mmin -20  >> /home/ubuntu/log_file
  cd /home/ubuntu/
  cat log_file
  cat script.sh
  '''
}
