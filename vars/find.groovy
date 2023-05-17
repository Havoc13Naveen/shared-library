def call(name){
  sh '''
  find /home/ubuntu/ -type d -mmin -20 -iname "${name}" >> log_file
  cd /home/ubuntu/workspace/test-library/
  cat log_file
  cd /home/ubuntu/
  cat script.sh
  '''
}
