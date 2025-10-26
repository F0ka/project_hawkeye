# Project Hawkeye 🦅

A modern multi-module Spring Boot application demonstrating enterprise-grade architecture patterns and clean code principles.

## 📋 Table of Contents

- [Overview](#overview)
- [Architecture](#architecture)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [Module Structure](#module-structure)
- [Development](#development)
- [Contributing](#contributing)

## 🎯 Overview

Project Hawkeye is designed as a learning platform for mastering Spring Boot multi-module architecture. It demonstrates clean architecture principles, separation of concerns, and modern enterprise development practices.

### Key Learning Objectives
- Master Spring Boot 3.x with Java 21
- Understand multi-module project architecture
- Implement clean architecture patterns
- Practice test-driven development
- Learn enterprise security patterns
- Explore microservices preparation

## 🏗️ Architecture

The project follows a layered architecture with clear separation of concerns:

```
┌─────────────────┐
│   hawkeye-api   │ ← REST API Layer (Controllers, DTOs)
├─────────────────┤
│ hawkeye-service │ ← Business Logic Layer (Services)
├─────────────────┤
│hawkeye-repository│ ← Data Access Layer (Repositories)
├─────────────────┤
│ hawkeye-domain  │ ← Domain Models (Entities, Value Objects)
├─────────────────┤
│  hawkeye-core   │ ← Shared Utilities and Common Code
└─────────────────┘
```

### Module Dependencies
- `hawkeye-api` depends on all other modules
- `hawkeye-service` depends on `repository`, `domain`, and `core`
- `hawkeye-repository` depends on `domain` and `core`
- `hawkeye-domain` is independent (only JPA dependencies)
- `hawkeye-core` is independent (shared utilities)

## 🛠️ Technologies

### Core Framework
- **Spring Boot 3.2.0** - Main application framework
- **Java 21** - Programming language with latest features
- **Gradle 8.x** - Build automation tool

### Data & Persistence
- **Spring Data JPA** - Data access abstraction
- **H2 Database** - In-memory database for development
- **Hibernate** - ORM implementation

### API & Documentation
- **Spring Web** - REST API framework
- **OpenAPI 3.0** - API documentation
- **Swagger UI** - Interactive API documentation

### Monitoring & Operations
- **Spring Boot Actuator** - Production monitoring
- **Spring Boot DevTools** - Development productivity

### Testing
- **JUnit 5** - Testing framework
- **Spring Boot Test** - Integration testing
- **Mockito** - Mocking framework

## 🚀 Getting Started

### Prerequisites
- Java 21 or higher
- Gradle 8.x (or use included wrapper)
- Git
- Your favorite IDE (IntelliJ IDEA recommended)

### Quick Start

1. **Clone the repository**
   ```bash
   git clone https://github.com/F0ka/project_hawkeye.git
   cd project_hawkeye
   ```

2. **Build the project**
   ```bash
   ./gradlew build
   ```

3. **Run the application**
   ```bash
   ./gradlew :hawkeye-api:bootRun
   ```

4. **Access the application**
   - Application: http://localhost:8080
   - API Documentation: http://localhost:8080/swagger-ui.html
   - H2 Console: http://localhost:8080/h2-console

### Verification
Check that everything is working:
```bash
# Health check
curl http://localhost:8080/actuator/health

# Expected response: {"status":"UP"}
```

## 📦 Module Structure

### hawkeye-api
**Purpose**: REST API layer and main application entry point

**Key Components**:
- `HawkeyeApplication.java` - Spring Boot main class
- Controllers for REST endpoints
- DTOs for request/response objects
- Global exception handling
- Security configuration

**Dependencies**: All other modules

### hawkeye-service  
**Purpose**: Business logic and service implementations

**Key Components**:
- Service classes with business logic
- Transaction management
- Business validation
- Service interfaces

**Dependencies**: `repository`, `domain`, `core`

### hawkeye-repository
**Purpose**: Data access layer with JPA repositories

**Key Components**:
- JPA repository interfaces
- Custom query implementations
- Database configuration
- Data access objects

**Dependencies**: `domain`, `core`

### hawkeye-domain
**Purpose**: Domain entities and data models

**Key Components**:
- JPA entities
- Value objects
- Domain exceptions
- Entity relationships

**Dependencies**: None (pure domain layer)

### hawkeye-core
**Purpose**: Shared utilities and common functionality

**Key Components**:
- Utility classes
- Common exceptions
- Shared constants
- Helper methods

**Dependencies**: None (shared across all modules)

## 🔧 Development

### Building
```bash
# Build all modules
./gradlew build

# Build specific module
./gradlew :hawkeye-api:build

# Clean build
./gradlew clean build
```

### Testing
```bash
# Run all tests
./gradlew test

# Run tests for specific module
./gradlew :hawkeye-service:test

# Generate test coverage report
./gradlew jacocoTestReport
```

### Code Quality
```bash
# Check code style (when configured)
./gradlew checkstyleMain

# Static analysis (when configured)
./gradlew spotbugsMain
```

### Development Profiles

#### Default Profile
- Uses H2 in-memory database
- Debug logging enabled
- DevTools active for hot reload

#### Test Profile  
- Separate H2 database for tests
- Test-specific configurations
- Mock external dependencies

### IDE Setup

#### IntelliJ IDEA
1. Import as Gradle project
2. Enable annotation processing
3. Set Project SDK to Java 21
4. Install recommended plugins:
   - Spring Boot
   - Lombok (if used)
   - Gradle

#### VS Code
1. Install Java Extension Pack
2. Install Spring Boot Extension Pack
3. Open project folder
4. Configure Java 21 in settings

## 📈 Learning Path

### Phase 1: Foundation (Weeks 1-2)
- [ ] Set up development environment
- [ ] Understand project structure
- [ ] Implement basic testing
- [ ] Add comprehensive logging

### Phase 2: Core Features (Weeks 3-4)  
- [ ] Create domain entities
- [ ] Implement repositories
- [ ] Build service layer
- [ ] Develop REST APIs

### Phase 3: Advanced Features (Weeks 5-6)
- [ ] Add authentication & authorization
- [ ] Implement caching
- [ ] Create async processing
- [ ] Add monitoring

### Phase 4: Production Ready (Weeks 7-8)
- [ ] Containerization
- [ ] CI/CD pipeline
- [ ] Performance optimization
- [ ] Security hardening

## 📝 API Documentation

Once the application is running, you can explore the API documentation:

- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **OpenAPI JSON**: http://localhost:8080/v3/api-docs

## 🔍 Monitoring

Spring Boot Actuator provides production-ready monitoring endpoints:

- **Health**: `/actuator/health`
- **Metrics**: `/actuator/metrics`
- **Info**: `/actuator/info`
- **Environment**: `/actuator/env`

## 🤝 Contributing

This project is designed for learning. Contributions that enhance the educational value are welcome!

### Getting Started
1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests for new functionality
5. Submit a pull request

### Code Standards
- Follow Spring Boot best practices
- Write comprehensive tests
- Use clear, descriptive naming
- Add JavaDoc for public APIs
- Follow existing code patterns

## 📚 Learning Resources

- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Spring Framework Reference](https://docs.spring.io/spring-framework/docs/current/reference/html/)
- [Baeldung Spring Tutorials](https://www.baeldung.com/spring-tutorial)
- [Spring Academy](https://spring.academy/)

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🎯 Next Steps

1. **Start Development**: Begin with GitHub Issues #1-4
2. **Join Community**: Engage with Spring Boot community
3. **Build Portfolio**: Document your learning journey
4. **Share Knowledge**: Write about your experiences

---

**Happy Coding! 🚀**

*Remember: The best way to learn is by building. Take it step by step, and don't hesitate to experiment!*