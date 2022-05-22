pipeline {
    agent any

    stages {
        stage ('build') {
            //sh './gradlew'
            gradlew('test')
        }
        stage ('webtest') {
            //bat 'docker-compose up'
            gradlew('webtest')
        }
    }
}

def gradlew(String... args) {
    sh "./gradlew ${args.join(' ')} -s"
}
