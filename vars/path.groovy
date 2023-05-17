def call(){
  sh '''
  cd /home/ubuntu
  top | head -20 | tail -1 >> top_log
  cat top_log
  rm -rf top_log
  '''
}
