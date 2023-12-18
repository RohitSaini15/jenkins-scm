def call(String buildStack = null,String hookType = null, String buildSchedule = null){
    pipeline {
        agent none
        stages{
            stage('Prepare'){
                script {
                    println "running prepare script"
                }
            }
        }
    }
}