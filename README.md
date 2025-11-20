# 🚀 Projet Spring Boot + React + MariaDB + Prometheus + Grafana

## 🧱 Architecture des conteneurs
| Service | Port | Description |
|----------|------|-------------|
| React Frontend | 3000 | Interface utilisateur |
| Spring Boot Backend | 8080 | API REST |
| MariaDB | 3306 | Base de données |
| Prometheus | 9090 | Monitoring des métriques |
| Grafana | 3001 | Visualisation des métriques |

---

## 🧩 Prérequis
- Docker et Docker Compose installés sur la machine.

---

## ⚙️ Étapes d’exécution

1️⃣ **Cloner le dépôt :**
```bash
git clone https://github.com/202422/Implementation-and-Deploiement-of-car-rental-application.git
cd Implementation-and-Deploiement-of-car-rental-application

3️⃣ Accéder aux services :

Service	URL
Frontend	http://localhost:3000

Backend	http://localhost:8080/api/
...
Prometheus	http://localhost:9090

Grafana	http://localhost:3001

4️⃣ Connexion Grafana :

Identifiants par défaut : admin / admin

Ajouter une source de données :

Type : Prometheus

URL : http://prometheus:9090

📊 Visualisation

Une fois la source connectée, importer un dashboard Grafana (ex: Spring Boot Metrics Dashboard ID 4701).

🧹 Nettoyage

Pour stopper et supprimer tous les conteneurs :

docker-compose down


👨‍💻 Auteurs : Boureima Ibringo| Compaoré Harold
🧭 Encadrant : Prof. Nafil
📅 Année : 2025
