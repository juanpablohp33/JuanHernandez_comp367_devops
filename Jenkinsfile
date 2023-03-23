pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/juanpablohp33/JuanHernandez_comp367_devops', branch: 'master', changelog: true)
      }
    }

  }
}