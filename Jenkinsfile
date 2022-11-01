pipeline {
 agent any
 tools {
  maven 'm3'
 }
  stages {   
    stage('Checkout') {
        steps {
            git url: 'https://github.com/MTrain12/word_game_group.git',
                branch: 'main'
        }
    }
    stage('Test') {
      steps {
       sh "cd word_game"
        sh "mvn clean test"
      }
    }
    stage('Build') {
      steps {
        sh "mvn -DskipTests=true clean package"
      }
    }
    stage('Deploy') {
      steps {
        sh "echo 'Deploying'"
      }
    }
  }
}
