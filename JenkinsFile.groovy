@Library('CICD-Shared-Libraries@main') _
node {
    BuildPipeline {
        ENV= 'DEV'
        PROJECT_NAME ='TEST-PROJECT'
        REPORT=true
        DEPLOY=true
    }// BuildPipeline
}//node
