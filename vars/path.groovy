def call(){
  sh '''
  cd /home/ubuntu
  top | head -20 | tail -1
  '''
}
