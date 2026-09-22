package com.codealpha.ai_chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatbotService {
        public String generateResponse(String message) {

    
    String input = message.toLowerCase().trim();

    // Remove punctuation
    input = input.replaceAll("[^a-zA-Z0-9\\s]", "");

    // 2. Identify intent

    if (isGreeting (input)) {
        return "Hello! 👋 I am your AI Chatbot. How can I help you?";
    }

    if (isJavaQuestion(input)) {
        return "Java is a popular object-oriented, class-based programming "
                + "language used to build desktop, web and backend applications.";
    }

    if (isOOPQuestion(input)) {
        return "OOP stands for Object-Oriented Programming. Its four main "
                + "concepts are Encapsulation, Inheritance, Polymorphism and Abstraction.";
    }

    if (isSpringBootQuestion(input)) {
        return "Spring Boot is a Java framework used to build "
                + "production-ready applications and REST APIs with less configuration.";
    }

    if (isSQLQuestion(input)) {
        return "SQL stands for Structured Query Language. It is used to "
                + "store, retrieve and manage data in relational databases.";
    }

    if (isDBMSQuestion(input)) {
        return "DBMS stands for Database Management System. It is software "
                + "used to create, store, manage and retrieve data from databases.";
    }

    if (isDSAQuestion(input)) {
        return "DSA stands for Data Structures and Algorithms. It helps "
                + "programmers organize data efficiently and solve problems.";
    }


    if (isNLPQuestion(input)) {
        return "NLP stands for Natural Language Processing. It helps computers "
                + "process and understand human language.";
    }
    if (isPythonQuestion(input)) {
    return "Python is a high-level, general-purpose programming language "
            + "known for its simple syntax and wide use in web development, "
            + "automation, data science and artificial intelligence.";
}

if (isHTMLQuestion(input)) {
    return "HTML stands for HyperText Markup Language. "
            + "It is used to structure content on web pages.";
}

if (isCSSQuestion(input)) {
    return "CSS stands for Cascading Style Sheets. "
            + "It is used to style and design web pages.";
}

if (isGitQuestion(input)) {
    return "Git is a distributed version control system used to track "
            + "changes in source code. GitHub is a platform for hosting "
            + "and collaborating on Git repositories.";
}

if (isProgrammingQuestion(input)) {
    return "Programming is the process of writing instructions that "
            + "a computer can execute to solve a problem or perform a task.";
}
    
   if (input.contains("how are you")) {
        return "I'm doing great! 😊 Thanks for asking.";
    }

    if (input.contains("thank") || input.contains("thanks")) {
        return "You're welcome! 😊";
    }

    if (input.equals("help") || input.contains("what can you do")) {
        return "I can answer questions about Java, OOP, Spring Boot, SQL, "
                + "DBMS, DSA and NLP.";
    }

    if (input.equals("bye") || input.equals("goodbye")
            || input.contains("see you")) {
        return "Goodbye! 👋 Have a great day!";
    }

    // Unknown question
    return "Sorry, I don't understand that yet. "
            + "Try asking me about Java, OOP, Spring Boot, SQL, DBMS, DSA or NLP.";
}
private boolean isGreeting(String input) {

    return input.contains("hello")
            || input.contains("hi")
            || input.contains("hey");
}
private boolean isJavaQuestion(String input) {

    return input.contains("java")
            || input.contains("programming language");
}
private boolean isOOPQuestion(String input) {

    return input.contains("oop")
            || input.contains("oops")
            || input.contains("object oriented");
}
private boolean isSpringBootQuestion(String input) {

    return input.contains("spring boot");
}
private boolean isSQLQuestion(String input) {

    return input.contains("sql")
            || input.contains("structured query language");
}
private boolean isDBMSQuestion(String input) {

    return input.contains("dbms")
            || input.contains("database management system");
}
private boolean isDSAQuestion(String input) {

    return input.contains("dsa")
            || input.contains("data structure")
            || input.contains("algorithm");
}
private boolean isNLPQuestion(String input) {

    return input.contains("nlp")
            || input.contains("natural language processing");
}
private boolean isPythonQuestion(String input) {

    return input.contains("python");
}
  private boolean isHTMLQuestion(String input) {

    return input.contains("html")
            || input.contains("hypertext markup language");
}
private boolean isCSSQuestion(String input) {

    return input.equals("css")
            || input.contains("cascading style sheets");
}
private boolean isGitQuestion(String input) {

    return input.contains("git")
            || input.contains("github");
}
private boolean isProgrammingQuestion(String input) {

    return input.contains("what is programming")
            || input.contains("what is programming language");
}
}