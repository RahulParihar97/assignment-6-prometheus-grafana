@Library('monitoring-library') _

pipeline {

    agent any

    stages {

        stage('Load Config') {

            steps {

                script {

                    def cfg = load 'monitoring-config.groovy'

                    prometheusGrafanaDeploy(cfg)

                }
            }
        }
    }
}
