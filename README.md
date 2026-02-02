# DBMS Handling in Early Spring-Based Java Projects vs Modern Spring Boot

## 1. How DBMS Was Implemented in Earlier Spring (Pre–Spring Boot) Projects

Before Spring Boot (roughly pre-2014), Java backend projects used **Spring Framework + manual configuration**. Database integration required significant boilerplate and deep framework knowledge.

### 1.1 JDBC-Based Approach
The most basic way to interact with a database was **JDBC (Java Database Connectivity)**.

**How it worked:**
- Developers manually:
  - Loaded database drivers
  - Opened and closed connections
  - Wrote SQL queries
  - Handled `ResultSet`, `PreparedStatement`
  - Managed transactions

**Example:**
```java
Connection conn = DriverManager.getConnection(url, user, pass);
PreparedStatement ps = conn.prepareStatement("SELECT * FROM users");
ResultSet rs = ps.executeQuery();
```

# Modern ORM Solutions in Spring Boot Applications

Modern Spring Boot applications provide multiple ways to interact with databases. ORMs have evolved to reduce boilerplate, improve performance, and give developers flexibility between abstraction and control.

---

## 1. Hibernate (with JPA) – Industry Standard ORM

### Overview
Hibernate is the most widely used ORM and the default JPA implementation in Spring Boot.

### Key Features
- Automatic object–table mapping
- Lazy and eager loading
- First-level and second-level caching
- JPQL and Criteria API
- Transaction management integration

### Why It’s Modern
- Auto-configured by Spring Boot
- Annotation-driven configuration
- Mature ecosystem and tooling

### Typical Use Case
- Enterprise applications
- Standard CRUD-heavy systems

---

## 2. Spring Data JPA – ORM Abstraction Layer

### Overview
Spring Data JPA is an abstraction over JPA that simplifies data access.

### Key Features
- Repository interfaces (`JpaRepository`)
- Auto-generated CRUD and pagination
- Query derivation from method names
- Support for JPQL and native queries

```java
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
```

As we know, springboot applications have 3 parts: 
- Controllers
- Services
- Repository 

The database connection and operations is handled in the repository layer. 
To do this, we need to add a few dependencies form spring initialzr. 
- Spring web
- Spring JPA
- Spring H2 (this is the DB being used in this project)