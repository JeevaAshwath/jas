# jas
# JAS – Community Platform 

JAS is a full-stack community platform that allows users to register, create or join communities, make posts, and engage with other members. It also supports email notifications and admin moderation.

## 🚀 Features

* 🔐 User Authentication (JWT-based)
* 🧑‍🤝‍🧑 Community Creation & Management
* 📝 Posts & Discussions
* 📦 RESTful API (Spring Boot)
* ⚛️ Modern UI (React + TailwindCSS)
* 📧 Email Notifications
* ⭐ Ratings and Reviews (Optional)
* 🛒 Payment Gateway Integration (Coming Soon)

---

## 🛠️ Tech Stack

| Frontend | Backend            | Database | Auth              | Notifications  |
| -------- | ------------------ | -------- | ----------------- | -------------- |
| React.js | Java + Spring Boot | MongoDB  | JWT (or Firebase) | JavaMailSender |

---

## 📁 Project Structure

```
jas-fullstack/
├── jas-frontend/        # React + Tailwind frontend
├── jas-backend/         # Java Spring Boot backend
└── README.md
```

---

## ⚙️ Setup Instructions

### 📦 Backend (Java + Spring Boot)

```bash
cd jas-backend
mvn clean install
mvn spring-boot:run
```

🔐 Configure `application.properties`:

```properties
spring.data.mongodb.uri=mongodb_connection_string
jwt.secret=jwt_secret
email.username=your_email@example.com
email.password=your_email_password
```

---

### 💻 Frontend (React.js)

```bash
cd jas-frontend
npm install
npm run dev
```

🔧 Add `.env`:

```env
REACT_APP_API_URL=http://localhost:8080/api
```

---

## 🧪 Example API Endpoints

* `POST /api/auth/register`
* `POST /api/auth/login`
* `GET /api/communities`
* `POST /api/posts/create`
* `GET /api/user/profile`

---

## 📬 Contact

For questions or contributions, open an issue or pull request.

> Built with ❤️ – 2025
