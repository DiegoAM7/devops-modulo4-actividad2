pipeline {
    agent any

	tools {
		maven 'Maven'
		jdk 'JAVA11'
	}

    stages {
        stage('Checkout') {
            steps {
                // Clona el repositorio
                git branch: 'main', url: 'https://github.com/DiegoAM7/devops-modulo4-actividad2'
            }
        }
        stage ('SoapUI test') {
            steps {
                sh '/opt/SoapUI-5.4.0/bin/testrunner.sh -r test-soapui-project.xml'
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
