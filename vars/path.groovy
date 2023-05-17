def call(){
  sh '''
  cd /home/ubuntu
  top | head -13 | tail -1
  '''
}
