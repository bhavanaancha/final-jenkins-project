pipeline {

    agent any
    tools {
maven "Maven"
}



       stages {


       stage("Build Modules & Build Docker Images") {

       steps {

       script {

       def modules = ['GymApplication', 'ReportingService','NotificationApp','GymAuthenticationService-1','EurekaServer','GatewayServer','GymCommons']

       for (def module in modules) {

       dir("${module}") {

       echo "Building ${module}..."

       bat "mvn clean install"
       }
       }
       }
       }
       }
       }
       }
