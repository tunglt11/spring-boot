node {
    stage ('Checkout'){        
        checkout scm         
    }
    stage ('Build'){        
        sh 'ls' 
        sh 'mvn -B -DskipTests clean package'         
    }
}
