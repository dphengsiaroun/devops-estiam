# Devops Estiam Evaluation

Ce tutoriel a pour but de faire une intégration de Jenkins avec Github.

# Get started

Cloner le projet suivant :
````
git clone https://github.com/dphengsiaroun/devops-partie-2.git
cd devops-partie-2
````

Démarrer docker et lancer cette commande pour démarrer un docker Jenkins 
```
$ docker container run -d -p 8080:8080 -p 50000:50000 -v `pwd`/jenkins:/var/jenkins_home -v /var/run/docker.sock:/var/run/docker.sock:rw --restart=always --name jenkins --privileged=true overpower/jenkins
```

- Allez sur l'interface Jenkins (http://localhost:8080) et suivez les étapes de l'installation de Jenkins, choisissez les installations suggérées puis patientez.
- Allez dans Manage Jenkins > Manage plugins puis dans l'onglet `Available` puis recherchez JobDSL et CloudBees Docker build and publish puis installez-les.

- Générer des credentials avec vos identifiants docker hub
- Modifier le fichier devops.groovy avec les crédentials que vous venez de générer.
````
dockerBuildAndPublish {
    ...
    registryCredentials('5ce9d9bd-c50f-4f9f-91d6-185c5d1cae6f')
    ...         
}
````

