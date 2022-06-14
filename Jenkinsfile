pipeline {
    agent any

    stages {
        stage ('build') {
            steps {
                //sh './gradlew'
                gradlew('test')
            }
        }
        stage ('webapp test') {
            steps {
                //bat 'docker-compose up'
                
                // gradlew('webtest')
                withGradle {
                    bat 'gradle test'
                }
            }
        }
    }
}

def gradlew(String... args) {
    bat "gradlew.bat ${args.join(' ')} -s"
}
