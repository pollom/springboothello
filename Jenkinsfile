pipeline {
    agent any

    stages {
        stage ('unit tests') {
            steps {
                //sh './gradlew'
                gradlew('test')
            }
        }
        stage ('webapp test') {
            steps {
                //bat 'docker-compose up'
                
                gradlew('composeup')
                //withGradle {
                //    bat 'gradle runCompose'
                //}
            }
        }
    }
}

def gradlew(String... args) {
    bat "gradlew.bat ${args.join(' ')} -s"
}
