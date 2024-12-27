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
  
  ![Surveillance en temps réel](assets/screenshots/realtime-monitoring.png)

---

### 2. Historique des Mesures
- **Description** : Accédez aux données passées pour une prise de décision éclairée.
- **Capture d'écran** :
  
  ![Historique des mesures](assets/screenshots/measurement-history.png)

---

### 3. Alertes en Temps Réel
- **Description** : Notifications instantanées pour des événements critiques comme une chute ou une anomalie.
- **Capture d'écran** :
  
  ![Alertes en temps réel](assets/screenshots/alerts.png)

---

### 4. Chatbot Intégré
- **Description** : Obtenez des réponses instantanées à des questions médicales courantes.
- **Capture d'écran** :
  
  ![Chatbot intégré](assets/screenshots/chatbot.png)

---

## Démonstration Vidéo
Découvrez BeatsGuard en action dans cette vidéo :

[![Regardez la vidéo](assets/screenshots/video-thumbnail.png)](https://www.youtube.com/watch?v=example)

> Cliquez sur l'image pour voir la démonstration complète sur [YouTube](https://www.youtube.com/watch?v=example).


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

## Comment Utiliser

1. **Configuration Initiale** :
   - Cloner les dépôts :
     - Backend : [Backend Repository](https://github.com/hellodikki/beatsguard-backend)
     - Frontend : [Frontend Repository](https://github.com/hellodikki/beatsguard-frontend)
     - Mobile : [Mobile Repository](https://github.com/AhmedFatrah2001/beatsguard-mobile)
   - Configurer les services backend et frontend.
2. **Conteneurisation** :
   - Construire et démarrer les services avec Docker :
     ```bash
     docker-compose up
     ```
3. **Surveillance** :
   - Configurer Prometheus et Grafana pour le suivi des performances.
4. **Tests** :
   - Activer les pipelines Jenkins pour valider les commits avec SonarQube.

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

Pour toute question, contactez-nous : [dahbiayoub2001@gmail.com](mailto:dahbiayoub2001@gmail.com).
