pipeline {
    agent none

    stages {

        stage('Unit Tests') {
            agent {
                docker {image 'hello-spring-boot-docker:latest'}
            }

            steps {
                bat 'gradlew.bat test'
            }
        }


 
    }
}

def gradlew(String... args) {
    bat "gradlew.bat ${args.join(' ')} -s"
}
