# ECF 3




```
### Sujet ECF:  Reconstruction d'architecture et dockerisation d'une application microservices

**Objectif :** Cet exercice a pour but de vous familiariser avec les principes de l'architecture microservices, le développement d'un microservice avec Spring Boot, l'intégration d'une interface utilisateur React, ainsi que la pratique de la dockerisation et de l'orchestration avec Docker et Docker Compose.

#### **Contexte**

Dans le cadre de cet exercice, vous avez accès au code source de plusieurs microservices d'une application ecommerce, à l'exception du microservice de recherche que vous devrez développer. Votre mission est de comprendre et reconstruire l'architecture de l'application, développer le microservice de recherche manquant, et dockeriser l'ensemble de l'application pour un déploiement simplifié.

#### **Description de l'application**

L'application est structurée autour de plusieurs microservices développés avec Spring Boot, complétée par une interface utilisateur développée avec React.

- **Microservice à développer :**
  - **Service de suggestions de eecherche :** Ce service, que vous devez implémenter, proposera des suggestions de recherche.

- **Interface utilisateur (UI) React :** Consomme les API fournies par les microservices.

#### **Instructions**

1. **Analyse et reconstruction de l'architecture :**
   - Analysez le code source fourni pour comprendre l'architecture existante de l'application.
   - Identifiez les interactions entre les microservices et déterminez comment intégrer le nouveau service de recherche.

2. **Développement du microservice de recherche :**
   - Développez le microservice de suggestions de recherche en utilisant Spring Boot.
   - Assurez-vous que le service est capable de communiquer efficacement avec les autres microservices et l'interface utilisateur.

3. **Dockerisation de l'application :**
   - Créez un Dockerfile pour chaque microservice, y compris le service de recherche que vous avez développé, en utilisant l'image officielle de Java comme base.
   - Dockerisez l'interface utilisateur React.
   - Réalisez un fichier Docker Compose définissant les services pour tous les microservices et pour l'UI, en configurant les dépendances, les volumes pour la persistance des données, et les variables d'environnement nécessaires.

4. **Documentation :**
   - Documentez les étapes nécessaires pour construire et démarrer l'application à l'aide de Docker et Docker Compose.
   - Fournissez des instructions sur comment accéder à l'interface utilisateur et tester la communication avec les microservices.

#### **Livrables**

- Dockerfile pour chaque microservice et pour l'interface utilisateur.
- Fichier Docker Compose ou resources kubernetes pour l'orchestration de l'ensemble de l'application.
- Code source du microservice de recherche développé.
- Documentation sur le processus de déploiement.
- Ajouter des tests e2e (en option)
```

## Contexte

Application e-commerce basée sur Spring Boot pour le côté serveur, ReactJS pour le côté client, MySQL pour la base de données, Redis pour le cache et Docker pour la containarisation.

Principales fonctionnalités: s'authentifier, parcourir des produits, ajouter un produit au panier, paiement, faire des recherches.

## Lancer l'application

### Prérequis

- Docker
- Node.js
- Java

### Démarrer avec docker-compose

```
docker-compose build

docker-compose up
```

ou
```
docker-compose up --build
```

Accès à l'interface utilisateur : http://localhost:3000

## Architecture

### Base de données

- MySQL : Occupe le port 3306

### Microservices

L’application est composée des services suivants :

 - Client React : Interface utilisateur construite avec ReactJS. Occupe le port 3000.
 - authentication-service => Service d’authentification : Gère l’inscription, la connexion et l’authentification des utilisateurs. Occupe le port 7000.
 - common-data-service => Service de données communes : Fournit des données sur les produits. Occupe le port 9000.
 - payment-service => Service de paiement : Gère le paiement de produits. Occupe le port 9050.
 - search-service => Service de recherche : recherche à partir des entrées de l'utilisateur. Occupe le port 10000





