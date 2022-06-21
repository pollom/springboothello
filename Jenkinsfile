pipeline {
    agent any

    stages {
        stage ('Unit Tests') {
            steps {
                //sh './gradlew'
                //gradlew('test')
                bat 'gradlew test'
                //withGradle {
                //    bat 'gradlew clean test'
                //}                
 
            }

            post {
                always {
                    junit '**/build/test-results/TEST-*.xml'
                }
            }
        }




/*          stage ('Playwright Tests') {
            steps {
                //bat 'docker-compose up'



                //gradlew('composeUp')
                withGradle {
                    bat 'gradlew composeUp'
                }
            }
        } 

         stage ('Test Report') {
            steps {
                publishHTML (target: [
                                allowMissing: false,
                                alwaysLinkToLastBuild: false,
                                keepAll: true,
                                reportDir: 'coverage',
                                reportFiles: 'index.html',
                                reportName: "Test Report"
                ])    
            }         
        }  */        
       
    }
}

/* def gradlew(String... args) {
    bat "gradlew.bat ${args.join(' ')} -s"
} */
