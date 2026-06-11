pipeline {
  agent any
  stages {

    stage('Checkout') {
      steps {
        git branch: 'main', url: 'https://github.com/sraghavksit/student-app.git'
      }
    }

    stage('Build') {
      steps { sh 'mvn clean package -DskipTests' }
    }

    stage('Test') {
      steps { sh 'mvn test' }
      post { always { junit 'target/surefire-reports/*.xml' } }
    }

    stage('Code Coverage') {
      steps { sh 'mvn verify' }
      post { always {
        jacoco(execPattern: 'target/jacoco.exec', minimumInstructionCoverage: '80')
      }}
    }

    stage('Publish Artifact') {
      steps { sh 'mvn install -DskipTests' }
    }

  }
}
