The `School Management Apllication` project is an  School Web Application built using Spring Boot. Below are the detailed functionalities and features it provides:

### Project Overview
- **Name**: Eazy School Web Application
- **Description**: A web application designed for managing school-related functionalities for students and administrators.
- **Technology Stack**: 
  - **Backend**: Spring Boot (version 3.3.1)
  - **Database**: MySQL
  - **Frontend**: Thymeleaf for rendering views
  - **Security**: Spring Security for authentication and authorization
  - **Validation**: Jakarta Bean Validation for input validation

### Key Features and Functionalities

1. **User Authentication and Authorization**:
   - Users can register and log in to the application.
   - Different roles (e.g., ADMIN, STUDENT) are defined, with specific access rights to various parts of the application.
   - Passwords are securely hashed using BCrypt.

2. **Dashboard**:
   - A personalized dashboard for users after logging in, displaying relevant information based on their role.

3. **Class Management**:
   - Admins can create, view, and delete classes.
   - Each class can have multiple students associated with it.

4. **Student Management**:
   - Admins can add students to classes, view student details, and delete students from classes.
   - Students can view their enrolled classes and associated details.

5. **Course Management**:
   - Admins can manage courses, including adding new courses and viewing existing ones.
   - Students can view courses they are enrolled in.

6. **Contact Management**:
   - A contact page where users can submit messages or inquiries.
   - Admins can view and manage submitted messages.

7. **Profile Management**:
   - Users can view and update their profile information, including personal details and address.

8. **Holidays Management**:
   - Admins can manage holidays, categorizing them as federal or festival holidays.
   - Users can view holidays based on their type.

9. **Error Handling**:
   - Global exception handling is implemented to manage errors gracefully and provide user-friendly error messages.

10. **Logging and Auditing**:
    - The application logs method execution times and exceptions using Aspect-Oriented Programming (AOP).
    - Auditing is implemented to track changes made by users.

11. **Responsive Design**:
    - The application uses CSS for styling, ensuring a responsive layout that works well on various devices.

### Code Structure
- **Controllers**: Handle incoming requests and return appropriate views or data.
  - Examples: `AdminController`, `StudentController`, `ContactController`, etc.
  
- **Models**: Represent the data structure of the application.
  - Examples: `Person`, `EazyClass`, `Courses`, `Holiday`, etc.

- **Repositories**: Interface with the database using Spring Data JPA.
  - Examples: `PersonRepository`, `CoursesRepository`, etc.

- **Configuration**: Contains configuration classes for security, application properties, and other settings.
  - Examples: `ProjectSecurityConfig`, `WebConfig`, etc.

- **Validation**: Custom annotations for validating user inputs, such as password strength and matching fields.

### Additional Features
- **Thymeleaf Templates**: Used for rendering dynamic HTML pages.
- **Actuator**: Spring Boot Actuator is included for monitoring and managing the application.
- **DevTools**: Spring Boot DevTools for enhanced development experience with automatic restarts and live reload.

### Conclusion
The `School Management Apllication` project is a comprehensive web application that provides essential functionalities for managing school operations, catering to both students and administrators. It emphasizes security, user experience, and maintainability, making it a robust solution for educational institutions. 

If you need more specific details about any particular feature or functionality, feel free to ask!
