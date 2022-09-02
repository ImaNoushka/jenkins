pipeline {
  agent {node{label "agent1"}}
  stages {
    stage('BUILD') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('POST BUILD') {
      steps {
        archiveArtifacts(artifacts: 'target/*.war', onlyIfSuccessful: true)
      }
    }

    stage('DEPLOY') {
      steps {
        sh 'deploy adapters: [tomcat9(credentialsId: '638ffdcd-7604-4ce0-9044-716bd07a47d5', path: '', url: 'http://172.17.0.3:8080')], contextPath: '/spark', onFailure: false, war: '*/*.war'
}}}}
