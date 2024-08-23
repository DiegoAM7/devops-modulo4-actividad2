pipeline {
    	agent any

	environment  {
		SLACK_TOKEN = credentials('Slack')
	}

	tools {
		maven 'Maven'
	}

    stages {
	stage ('Mensaje Inicial Slack') {
		steps {
			slackSend token: $SLACK_TOKEN channel: "#bootcamp-pipeline" message: "Build Started"
		}
	}
        stage('Checkout') {
            steps {
                // Clona el repositorio
                git branch: 'main', url: 'https://github.com/DiegoAM7/devops-modulo4-actividad2'
            }
        }
        stage ('SoapUI test') {
            steps {
                sh '/opt/SoapUI-5.7.2/bin/testrunner.sh -r test-soapui-project.xml'
            }
        }
    	stage ('JMeter') {
	    	steps {
				sh '/opt/apache-jmeter-5.6.3/bin/jmeter -n -t Test-Plan.jmx -l Results.jtl'
			}
		}
        stage ('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Build') {
            steps {
                // Construye el proyecto Maven
                sh 'mvn clean package'
            }
        }
        stage('Cleanup') {
            steps {
                // Limpieza despues de cada build
                cleanWs()
            }
        }
    }
}
