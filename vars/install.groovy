def call() {
  sh 'sudo apt install tree -y'
  sh 'tree --version'
}
