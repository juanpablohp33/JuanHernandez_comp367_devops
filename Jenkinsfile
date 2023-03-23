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
        sh './mvnw spring-boot:run'
      }
    }

    stage('Docker Build') {
      steps {
        sh 'sudo docker build -t webapp_juanhernandez .'
      }
    }

  }
}