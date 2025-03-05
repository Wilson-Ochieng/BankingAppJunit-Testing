pipeline {
    agent any

    stages {
        // Stage 1: Checkout the code from GitHub
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Wilson-Ochieng/BankingAppJunit-Testing.git'
            }
        }

        // Stage 2: Build and test the application using Maven
        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        // Post-build action: Publish JUnit test results
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}