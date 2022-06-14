pipeline {
    agent any

    stages {
        stage ('unit tests') {
            steps {
                //sh './gradlew'
                gradlew('test')
                publishHTML (target: [
                                allowMissing: false,
                                alwaysLinkToLastBuild: false,
                                keepAll: true,
                                reportDir: 'coverage',
                                reportFiles: 'index.html',
                                reportName: "RCov Report"
                ])
            }
        }
        stage ('webapp test') {
            steps {
                //bat 'docker-compose up'
                
                gradlew('runCompose')
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
