pipeline {
    agent any
    stages {
        stage('Checkout git') {
            steps {
                
                sh """mvn -version""";
                sh """git --version""";
                echo 'Pulling...';
                git branch :'master',url:'https://github.com/Yassine-Azougagh/ProjetSpring2.git';
                
            }
         }
         stage('Builsing image'){
             steps{
                 script{
                  sh 'docker build -t yassineazougagh/spring_api .'
                 }
             }
        }
    }
}
