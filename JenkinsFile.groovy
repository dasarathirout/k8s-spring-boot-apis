@Library('CICD-Shared-Libraries@main') _

pipeline {

    agent any

    environment {
        USER_ENV_VAR = "TEST VALUE USER ENV VALUE"
    }//environment

    ansiColor('xterm') {
        timeout(60) {
            timestamps {
                stages {
                    stage('CLEAN') {
                        step([$class: 'WsCleanup'])
                    }
                    stage("CLONE") {
                        steps {
                            println("Running Git Clone")
                            BuildPipeline.{'TEST-PROJECT'}
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
                }//stages
            }// timestamps
        }// timeout
    }// ansiColor
}//pipeline
