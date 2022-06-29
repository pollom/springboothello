pipeline {
    agent any

    stages {
        stage ('Unit Tests') {
            steps {
 

                realtimeJUnit('**/build/test-results/test/TEST-*.xml') {
                    //sh 'mvn -Dmaven.test.failure.ignore=true clean verify'
                    bat 'gradlew clean test'
                }
                
                //step( [ $class: 'JacocoPublisher' ] )

                //post {
                //    always {
                //        junit '**/build/test-results/test/TEST-*.xml'
                        //bat 'docker run -d --name webapp hello-spring-boot-docker'
                //    }
                //}  
                
            }

           
 
            
        }



        stage('Web App Launch') {
            steps {
                bat 'docker run -d --name webapp hello-spring-boot-docker'    
            }
        }


/*         stage('Playwright Tests') {
            steps {
                docker.image('test:latest').run() { c ->
                    /* Wait until mysql service is up */
                    //sh 'while ! mysqladmin ping -h0.0.0.0 --silent; do sleep 1; done'
                    /* Run some tests which require MySQL */
                    //sh 'make check'
                    //sh 'cp ./app/app/build/test-results/test/TEST-PlayDemo.AppTest.xml ./build/test-results/test'
                    //sh "docker logs ${c.id}"
                //}
            //}
        //} */

            //stage('Playwright Tests') {
            //    agent {
            //        docker { image 'test:latest' }
            //    }
            //    steps {
                    //sh 'cp ./app/app/build/test-results/test/TEST-PlayDemo.AppTest.xml ./build/test-results/test'
                    //echo "docker image step for playwright tests"
                    //bat 'docker run -d --name testapp test:latest'
                    //sh './gradle build'
                    //sh 'docker exec -it '
                //}
            //}

            stage ('Playwright Tests') {
                steps {
                    bat 'docker run -d --name testapp test:latest'
                    bat 'docker exec -it testapp winpty ./gradlew build'
                    bat 'docker cp testapp:/app/app/build/test-results/test/TEST-*.xml ./build/test-results/test/'
                }
            }

            //stage ('Env Vars') {
            //    steps {
            //        bat 'echo $WORKSPACE'
            //    }
            //}



        //stage('Playwright Tests') {
/*             agent {
                docker { image 'test:latest' }
            } */
            //steps {
                //bat 'docker run -d --name testapp test:latest'
                //sh './gradlew test'

                //step( [ $class: 'JacocoPublisher' ] )
            //}
        //}


/*         stage ('Playwright Tests') {
            agent {
                docker {
                    image 'test:latest'
                }
            }

            stages {
                stage ('Web Tests') {
                    steps {
                        sh './gradlew test'
                    }
                    
                }
            }
        } */


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

        stage ('Test Report') {
            steps {
                step( [ $class: 'JacocoPublisher' ] )
            }
        }     
       
    }
}

/* def gradlew(String... args) {
    bat "gradlew.bat ${args.join(' ')} -s"
} */
