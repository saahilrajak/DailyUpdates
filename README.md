A Spring Boot–based backend application that fetches top news headlines by country and category using the NewsAPI.
The project demonstrates REST API design, external API integration, and proper use of ResponseEntity in Spring Boot.

🚀 Tech Stack

Java
Spring Boot
REST APIs
RestTemplate
Maven
NewsAPI (External API)


📁 Project Structure

com.example.DailyUpdates
├── Controller
│    └── NewsController.java
├── Service
│    └── NewsService.java
└── DailyUpdatesApplication.java

⚙️ Prerequisites

Java 17+ (or compatible with your Spring Boot version)

Maven

Internet connection (to call NewsAPI)

NewsAPI key (free tier)

🔑 API Key Configuration

Currently, the API key is configured directly in the service class:

private static final String API_KEY = "YOUR_NEWS_API_KEY";


⚠️ Note:
For production-ready applications, move the API key to application.properties or environment variables.

▶️ How to Run the Application

Clone the repository:

git clone <your-repo-url>


Navigate to the project directory:

cd DailyUpdates


Run the application:

mvn spring-boot:run


The server will start on:

http://localhost:8080

📌 API Endpoints
1️⃣ Get Top Headlines by Country

Endpoint

GET /api/v1/news


Query Parameter

country (optional, default = us)

Example

http://localhost:8080/api/v1/news?country=in

2️⃣ Get Top Headlines by Category

Endpoint

GET /api/v1/news/category/{category}


Valid Categories

business

entertainment

general

health

science

sports

technology

Example

http://localhost:8080/api/v1/news/category/technology

🔄 How It Works

Client sends a request to the controller.

Controller forwards the request to the service layer.

Service constructs the correct NewsAPI URL:

https://newsapi.org/v2/top-headlines


External API is called using RestTemplate.

Response is returned to the client using ResponseEntity.

❗ Common Issues & Fixes
❌ Invalid API URL

Ensure the URL includes:

/top-headlines

? before query parameters

& between parameters

✅ Correct format:

/top-headlines?country=in&apiKey=YOUR_API_KEY

❌ 401 / 403 Errors

Check if API key is valid

Ensure API key is correctly appended

🧪 Testing

You can test the APIs using:

Browser

Postman

cURL

Example cURL command:

curl http://localhost:8080/api/v1/news/category/business

📈 Future Improvements

Move API key to application.properties

Add global exception handling using @ControllerAdvice

Replace RestTemplate with WebClient

Add Swagger/OpenAPI documentation

Map responses to DTOs instead of Object

👨‍💻 Author
Sahil Rajak
Full Stack Software Developer
GitHub: https://github.com/saahilrajak
LinkedIn: https://www.linkedin.com/in/sahilrajak/