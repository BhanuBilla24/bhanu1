pipeline {
    agent any
    
    tools {
        jdk "jdk17"
    }

    stages {
        
        stage('git') {
            steps {
                git branch: 'main', url: 'https://github.com/BhanuBilla24/bhanu1.git'
            }
        }
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
