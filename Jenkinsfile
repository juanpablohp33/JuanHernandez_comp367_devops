pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/juanpablohp33/JuanHernandez_comp367_devops', branch: 'master', changelog: true)
      }
    }

    stage('Maven') {
      steps {
        sh 'sudo ./mvnw clean package'
      }
    }

    stage('Docker Build') {
      steps {
        sh 'sudo docker build -t webapp_juanhernandez .'
      }
    }

  }
}