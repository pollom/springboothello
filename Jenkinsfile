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
                bat 'docker-compose up'



                //gradlew('composeUp')
                //withGradle {
                //    bat 'gradlew composeUp'
                //}
            }
        } 

        stage ('test report') {
            steps {
                publishHTML (target: [
                                allowMissing: false,
                                alwaysLinkToLastBuild: true,
                                keepAll: true,
                                reportDir: 'coverage',
                                reportFiles: 'index.html',
                                reportName: "Test Report"
                ])    
            }         
        }        
       
    }
}

def gradlew(String... args) {
    bat "gradlew.bat ${args.join(' ')} -s"
}
