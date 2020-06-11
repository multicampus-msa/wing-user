node {
     stage('Clone repository') {
         checkout scm
     }
     stage('chmod') {
         sh 'chmod +x server/gradlew'
     }
     stage('Gradle Build') {
         sh 'server/gradlew bootjar'
         sh 'cp /var/lib/jenkins/workspace/wing-user/server/build/libs/*.jar server/*.jar'
     }
     stage('Build & Push image') {
          docker.withRegistry('https://registry.hub.docker.com', 'midaslmg94-docker') {
             def image = docker.build("midaslmg94/wing-user:latest")
             image.push()
             sh 'sudo docker service update --image midaslmg94/wing-user wing-user'
         }
     }
 }
