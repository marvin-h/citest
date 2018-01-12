pipeline {
    agent {
        label 'bss'
    }
    stages {
        stage('Compile') {
            steps {
                sh 'mvn -U compile'
            }
        }
        stage('Unit Test') {
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

