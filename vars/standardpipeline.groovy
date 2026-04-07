def call() {
    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    echo "Building Application..."
                }
            }
            stage('Test') {
                steps {
                    echo "Running Unit Tests..."
                }
            }
            stage('Deploy') {
                steps {
                    echo "Deploying Application..."
                }
            }
        }
    }
}
