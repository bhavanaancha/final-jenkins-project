pipeline {

    agent any
    tools {
maven "Maven"
}



       stages {


       stage("Build Modules & Build Docker Images") {

       steps {

       script {

       def modules = ['ReportingService','NotificationApp','GymAuthenticationService-1','EurekaServer','GymApplication','GatewayServer','GymCommons']

       for (def module in modules) {

       dir("${module}") {

       echo "Building ${module}..."

       sh 'mvn clean install'
       }
       }
       }
       }
       }
       }
       }
