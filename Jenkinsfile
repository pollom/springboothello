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
                bat 'docker-compose up'
                bat 'docker-compose down'
                // gradlew('webtest')
                //withGradle {
                //    bat 'gradlew.bat :runCompose'
                //}
            }
        }
    }
}

def gradlew(String... args) {
    bat "gradlew.bat ${args.join(' ')} -s"
}
