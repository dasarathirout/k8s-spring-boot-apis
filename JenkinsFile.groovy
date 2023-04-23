@Library('CICD-Shared-Libraries@main') _

pipeline {

    agent any

    environment {
        USER_ENV_VAR = "TEST VALUE USER ENV VALUE"
    }//environment

    stages {

        stage('CLEAN') {
            steps([$class: 'WsCleanup'])
        }
        stage("CLONE") {
            steps {
                println("Running Git Clone")
                BuildPipeline.startJobBuild('TEST-PROJECT')
            }
        }

        stage("BUILD") {
            steps {
                println("Running Gradle Build")
            }
        }

        stage("PUBLISH") {
            steps {
                println("Running Gradle BootJar & Docker Image Publish")
            }
        }

        stage("DEPLOY") {
            steps {
                println("Running Docker Image K8S Deploy")
            }
        }
    }// stages
}//pipeline
