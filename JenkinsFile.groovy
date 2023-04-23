@Library('CICD-Shared-Libraries@main') _
node {
    BuildPipeline {
        projectName = 'TEST-PROJECT'
    }// BuildPipeline
}//node
