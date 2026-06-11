pipeline {
  agent any
  stages {

    stage('Checkout') {
      steps {
        git branch: 'main', url: 'https://github.com/sraghavksit/student-app.git'
      }
    }

    stage('Build') {
      steps { bat 'mvn clean package -DskipTests' }
    }

    stage('Test') {
      steps { bat 'mvn test' }
      post { always { junit 'target/surefire-reports/*.xml' } }
    }

    stage('Code Coverage') {
      steps { bat 'mvn verify' }
      post { always {
        jacoco(execPattern: 'target/jacoco.exec', minimumInstructionCoverage: '70')
      }}
    }

    stage('Publish Artifact') {
      steps { bat 'mvn install -DskipTests' }
    }

  }
}
