# Spring Boot Project in VS Code

## Setting Up the Project

### Prerequisites
1. **Install JDK**: Ensure you have Java Development Kit (JDK) installed on your system.
2. **Install Required Extensions in VS Code**:
   - [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
   - [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-spring-boot)

### Creating the Spring Boot Project
1. Open **VS Code**.
2. In the **Explorer** panel, click on **Create Java Project**.
3. Select **Spring Boot** as the type of project.
4. Choose **Maven Project**.
5. Select the desired Spring Boot version (e.g., `3.1.4`).
6. Choose the language as **Java**.
7. Provide the **Group ID** (e.g., `com.example`).  
   *(Example: `com.dhirajfirstcode`)*
8. Enter the **Artifact ID** in lowercase (e.g., `dhirajfirst`).
9. Choose the packaging type as **JAR**.
10. Select the **Java version** (e.g., `17`).
11. Add dependencies:
    - Select **Spring Web**.
12. Choose the location to save your project.
13. Click **Done** to generate the project.

### Opening the Project
1. When prompted in VS Code, click **Open** to open the newly created project.

---

## Creating a REST Controller

1. Navigate to `src > main > java > com.dhirajfirstcode.dhirajfirst`.
2. Create a new file named `HelloController.java`.
3. Add the following code:

```java
package com.dhirajfirstcode.dhirajfirst;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String getName() {
        return "Hello Dhiraj!";
    }
}
```

---

## Running the Application

1. Click the **Run** button in the top-right corner of VS Code.
2. Observe the terminal for the application running on a port (default: `8080`).

---

## Testing the Application

1. Open your web browser.
2. Go to: `http://localhost:8080/hello`
3. You should see the response:  
   **Hello Dhiraj!**

---

## Summary of Steps

1. Install **JDK** and required VS Code extensions.
2. Create a **Spring Boot Maven project**.
3. Add dependencies and configure the project.
4. Create a REST controller (`HelloController.java`).
5. Run the application and access the endpoint in a browser.

---

Feel free to fork or clone this repository for your own Spring Boot projects!
