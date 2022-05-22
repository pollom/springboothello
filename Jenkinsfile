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
                gradlew('webtest')
            }
        }
    }
}

def gradlew(String... args) {
    sh "./gradlew ${args.join(' ')} -s"
}
