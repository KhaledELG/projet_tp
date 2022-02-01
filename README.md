# TP noté pour le cours de MEDEV

## Description :
Le but de se devoir est de coder le jeu Mastermind avec une interface texte permettant de jouer à 2. Le jeu s’arrête à l'issue du nombre de partie que les joueur ont décidé d'effectuer. 

## Lancement :
Tout d'abord, il est nécéssaire de télécharger puis installer le serveur sonarQube pour ensuite pouvoir analyser le code présent dans se repository à l’aide du SonarQube Scanner et afficher les résultats de l’analyse.  
Pour se faire, suivez les instructions de la page suivante : [Get started in two minutes](https://docs.sonarqube.org/latest/setup/get-started-2-minutes/) pour mettre en place l'environnement server en local.  
Une fois dans le dossier sonarqube-*.*.*.*, ouvrez le cmd et inscrivez la commande suivante :  
./StartSonar.bat  
Puis, ouvrer sur votre navigateur la page suivant :  
http://localhost:9000/  
--> Créer un projet avec pour nom : projet_tp.
--> Récuperer le token associé et l'inserer dans le build.xml à l'emplacement dédié ligne 41.  
Ensuite, allez dans le dossier du projet, ouvrez le cmd et inscrivez la commande suivante :  
ant all
Le projet va alors être compilé, la javadoc générée, les fichiers tests lancé avec les rapports de tests stocké dans le dossier approprié et l'éxécutable généré.

## Axes d'amélioration :
Intégration d'une manière de faire pour cacher le code secret du codifiacteur.  

