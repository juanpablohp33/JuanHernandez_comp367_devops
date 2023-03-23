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
        sh 'sudo docker build -t webapp_juanhernandez . -t juanpablohp31/webapp_juanhernandez:latest'
      }
    }

    stage('Docker Login') {
      steps {
        sh 'sudo docker login -u juanpablohp31 -p Alianza123.'
      }
    }

    stage('push') {
      steps {
        sh 'sudo docker push juanpablohp31/webapp_juanhernandez:latest'
      }
    }

  }
}