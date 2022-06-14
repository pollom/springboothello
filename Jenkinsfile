pipeline {
    agent any

    stages {
        stage ('unit tests') {
            steps {
                //sh './gradlew'
                gradlew('test')

            }
        }
/*         stage ('webapp test') {
            steps {
                bat 'docker-compose up'



                //gradlew('composeUp')
                //withGradle {
                //    bat 'gradlew composeUp'
                //}
            }
        } */
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

def gradlew(String... args) {
    bat "gradlew.bat ${args.join(' ')} -s"
}
