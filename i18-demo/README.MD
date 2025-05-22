# 🌐 Spring Boot + Thymeleaf Internationalization (i18n) Example

This project demonstrates how to implement **Internationalization (i18n)** in a Spring Boot web application using **Thymeleaf**. It allows users to dynamically switch between languages (e.g., English and Hindi) from a dropdown on the UI.

---

## 🚀 Features

- Language switch (English ↔ Hindi)
- Uses `messages.properties` for localization
- Dynamically loads language content without restarting the app
- Thymeleaf-based frontend

---

## 📂 Project Structure
````
src/
├── main/
│ ├── java/
│ │ └── com.example.i18n
│ │ ├── controller/
│ │ │ └── HomeController.java
│ │ └── I18nApplication.java
│ └── resources/
│ ├── templates/
│ │ └── index.html
│ ├── static/
│ │ └── i18n.js
│ ├── messages.properties
│ ├── messages_hi.properties
│ └── application.properties

````


## 🛠️ Configuration

### `application.properties`
```properties
spring.messages.basename=messages
spring.mvc.locale-resolver=fixed
spring.mvc.locale=en


messages.properties (English - Default)

welcome.message=Welcome to the i18n Example
change.language=Change Language
language.english=English
language.hindi=Hindi


messages_hi.properties (Hindi)
welcome.message=आई18एन उदाहरण में आपका स्वागत है
change.language=भाषा बदलें
language.english=अंग्रेज़ी
language.hindi=हिंदी


```

### `index.html (Thymeleaf Template)`
```properties

<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>i18n Example</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="/i18n.js"></script>
</head>
<body>
    <h1 th:text="#{welcome.message}">Welcome</h1>
    <br/>
    <label th:text="#{change.language}">Change Language</label>
    <select id="locales">
        <option value="en" th:text="#{language.english}">English</option>
        <option value="hi" th:text="#{language.hindi}">Hindi</option>
    </select>
</body>
</html>

```
### `LocaleController.java`
```properties
@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
```

### `i18n.js (Client-side language change)`
```properties
$(document).ready(function () {
    $("#locales").change(function () {
        let selectedLang = $(this).val();
        if (selectedLang) {
            window.location.href = "/?lang=" + selectedLang;
        }
    });
});
```

## How to Run
````
git clone https://github.com/shreyamahalle/spring-boot-examples.git
cd i18n-demo
````
## Build and run:
````
mvn spring-boot:run
````
## Open in browser:
````
http://localhost:8080/

````
## `How to Use`
- The default language is English.

- Use the dropdown to switch to Hindi or back to English.

- The content updates based on your language selection.

## Notes
- Add more messages_xx.properties files for additional languages.

- You can also store language files in classpath:/i18n/messages_xx.properties.

