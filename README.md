# BeatsGuard

## Aperçu

BeatsGuard est une solution innovante basée sur une architecture de microservices pour le suivi des patients à domicile. Elle combine des technologies modernes telles que Spring Boot, React, Flutter et l'IoT, offrant une surveillance en temps réel des indicateurs de santé et un système d'alertes intelligentes. Son architecture modulaire assure évolutivité et intégration transparente.

---

## Architecture 

### Microservices
- **Backend** : Spring Boot pour un développement robuste et sécurisé.
- **Frontend** : React pour des interfaces utilisateur interactives.
- **Mobile** : Flutter pour une accessibilité multiplateforme.
- **API Gateway** : Spring Cloud Gateway pour centraliser les communications entre services.
- **Bases de données** : Chaque microservice a sa propre base de données (MySQL, MongoDB).

### Surveillance IoT
- **Matériel** :
  - **ESP32** : Collecte des données des capteurs.
  - **Capteurs** :
    - MPU6050 : Détection des mouvements et des chutes.
    - MAX30102 : Mesure de la fréquence cardiaque et du taux d'oxygène.
    - DHT11 : Suivi de la température et de l'humidité.
- **Communication** : Transmission sécurisée des données au backend.

## Fonctionnalités Principales

### 1. Surveillance en Temps Réel
- **Description** : Surveillance constante de l'état des patients grâce aux capteurs IoT.
- **Capture d'écran** :
  
  ![Surveillance en temps réel](./assets/screenshots/measurement_page.jpg)

---

### 2. Historique des Mesures
- **Description** : Accédez aux données passées pour une prise de décision éclairée.
- **Capture d'écran** :
  
  ![Historique des mesures](./assets/screenshots/measurement_history.jpg)

---

### 3. Chatbot Intégré
- **Description** : Obtenez des réponses instantanées à des questions médicales courantes.
- **Capture d'écran** :
  
  ![Chatbot intégré](./assets/screenshots/chat_with_chatbot.jpg)

---

## Démonstration Vidéo
Découvrez BeatsGuard en action dans cette vidéo :

[![Regardez la vidéo](assets/screenshots/Screenshot%202024-12-27%20182748.png)](https://www.youtube.com/watch?v=example)

> Cliquez sur l'image pour voir la démonstration complète sur [Streamable](https://www.youtube.com/watch?v=example).


### Sécurité et Qualité
- **JWT** : Protection des API.
- **SonarQube** : Analyse et amélioration continue de la qualité du code.

### Conteneurisation et Déploiement
- **Docker** : Conteneurisation des microservices.
- **Kubernetes** : Gestion avancée des conteneurs.
- **CI/CD** : Automatisation avec Jenkins pour les tests, l'intégration et le déploiement.

### Interfaces Utilisateur
- **Mobile (Flutter)** :
  - Visualisation des données en temps réel.
  - Réception d'alertes critiques.
  - Chatbot interactif pour des conseils de santé.
- **Web (React)** :
  - Tableau de bord pour les soignants.
  - Historique des alertes et des comportements.

---

## Impact et Valeur

- **Amélioration des Soins** :
  - Surveillance proactive des patients.
  - Réduction de la charge de travail des soignants.
- **Innovations Techniques** :
  - Détection des anomalies avec apprentissage automatique.
  - Assistance intelligente via un chatbot interactif.
- **Flexibilité** :
  - Adaptabilité à différents environnements et besoins spécifiques.

---

## Contributeurs
- FATRAH Ahmed ([GitHub](https://github.com/AhmedFatrah2001))
- DAHBI Ayoub ([GitHub](https://github.com/hellodikki))
- BOUFARRA Oussama ([GitHub](https://github.com/BOUFARRA-OUSSAMA))

---

Pour toute question, contactez-nous : [dahbiayoub2001@gmail.com](mailto:dahbiayoub2001@gmail.com).
