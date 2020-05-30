pipeline {
   agent any

   stages {
      stage('checkout') {
         steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url:'https://github.com/BabuShoban/Shoban']]])
         }
      }

      stage('Maven installation') {
         steps {
             sh 'mvn clean test'
        }
      }
   }
}