pipeline {
    agent {
        label 'argus'
    }
    stages {
        stage('SCM pull') {
            steps {
                echo 'Doing...'
            }
        }
        stage('Static program analysis') {
            steps {
                echo 'Doing...'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
