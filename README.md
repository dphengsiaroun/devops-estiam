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

- Générer des credentials avec vos identifiants docker hub dans Docker Build and Publish puis allez dans Crédentials et copier-les.
- Modifier le fichier devops.groovy avec les crédentials que vous venez de générer.
````
dockerBuildAndPublish {
    ...
    registryCredentials('d8ffb529-4cde-48c8-b14e-6db3f217306e')
    ...         
}
````

- Créer un job "Job 1" en ajoutant le lien suivant dans `https://github.com/dphengsiaroun/devops-partie-2.git` dans la partie Gestion de code source > sélectionner git puis collez le lien ci-dessus.
- Plus bas, ajoutez un build Process Job DSL > sélectionner Look on File System et dans DSL Scripts ajouter `*.groovy` puis sauver.
- Lancer un build qui sera en échec puis rendez-vous dans Manage Jenkins > Cliquez dans In-process Script Approval > cliquez sur Approve
- Relancer le build du Job 1.
