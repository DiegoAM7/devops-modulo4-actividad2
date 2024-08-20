pipeline {
    agent any

	tools {
    	maven 'Maven'
	}

    stages {
        stage('Checkout') {
            steps {
                // Clona el repositorio
                git branch: 'main', url: 'https://github.com/DiegoAM7/devops-modulo4-actividad2'
            }
        }
        stage ('Prueba de Polling') {
            steps {
                sh 'Prueba de auto polling'
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