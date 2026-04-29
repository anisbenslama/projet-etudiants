# Projet Étudiants - API REST Spring Boot + React Native

## 📱 Description

Ce projet est une application complète de gestion des étudiants composée de :
- Une API REST développée avec **Spring Boot 3**
- Une base de données **PostgreSQL** conteneurisée avec Docker
- Une application mobile **React Native** (Expo)
- Orchestration avec **Docker Compose**

## 🏗️ Architecture
┌─────────────────┐ ┌─────────────────┐ ┌─────────────────┐
│ React Native │────▶│ Spring Boot │────▶│ PostgreSQL │
│ Mobile App │HTTP │ API REST │JDBC │ Database │
└─────────────────┘ └─────────────────┘ └─────────────────┘
│ │ │
└────────────────────────┴────────────────────────┘

# Compiler l'API Spring Boot
cd api-spring-boot
mvn clean package
cd ..

# Démarrer les conteneurs
docker compose up --build
# Compiler L'app React Native
cd mobile-app
npm install
npm start

# Structure du projet

projet-etudiants/
├── api-spring-boot/          # API Spring Boot
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
├── mobile-app/               # App React Native
│   ├── src/
│   ├── App.js
│   └── package.json
├── docker-compose.yml        # Orchestration Docker
└── README.md                 # Documentation

# Technologies utilisées
Composant	Technologies
Backend	Spring Boot 3, Spring Data JPA, PostgreSQL
Frontend Mobile	React Native, Expo, Axios
Containerisation	Docker, Docker Compose
Build Tool	Maven

