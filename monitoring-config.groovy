return [

    SLACK_CHANNEL_NAME  : "jenkins-alerts",

    ENVIRONMENT         : "prod",

    CODE_BASE_PATH      : "ansible",

    PLAYBOOK_NAME       : "install-prometheus.yml",
    
    PLAYBOOK_NAME       : "install-grafana.yml",

    ACTION_MESSAGE      : "Prometheus deployment completed successfully",

    KEEP_APPROVAL_STAGE : true

]
