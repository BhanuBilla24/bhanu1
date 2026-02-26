pipeline {
    agent {label "slave"}
    
    tools {
        jdk "jdk21"
        maven "maven"
    }
    
    parameters {
        string (name: "Branch", defaultValue: "main")
        choice (name: "Branch", choices: ["main","dev","pre"])
        booleanParam (name: "dev", defaultValue:true)
    }

    stages {
        stage('Git') {
            steps {
                git branch: 'main', url: 'https://github.com/BhanuBilla24/bhanu1.git'
            }
        }
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('version') {
            steps {
                sh "java --version"
            }
        }
    }
}
