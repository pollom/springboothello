pipeline {
    agent any

    stages {
        stage ('build') {
            steps {
                //sh './gradlew'
                gradlew('test')
            }
        }
        stage ('webtest') {
            steps {
                //bat 'docker-compose up'
                // gradlew('webtest')
                withGradle {
                    bat 'gradlew.bat :runCompose'
                }
            }
        }
    }
}

def gradlew(String... args) {
    bat "gradlew.bat ${args.join(' ')} -s"
}
