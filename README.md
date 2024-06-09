# Spring Boot Project

## 項目簡介

這是一個基於Spring Boot的項目，旨在提供一個簡單且可擴展的基礎架構，方便快速開發企業級應用程序。

## 功能

- 用戶管理
- 身份驗證與授權
- RESTful API
- 數據庫操作

## 技術棧

- **Spring Boot**: 核心框架
- **Spring Security**: 安全性管理
- **Spring Data JPA**: 數據庫訪問
- **H2 Database**: 內存數據庫（開發和測試環境）
- **Maven**: 項目構建和依賴管理
- **Lombok**: 簡化Java代碼

## 項目結構

```plaintext
├── src/main/java
│   └── com/example/demo
│       ├── controller
│       ├── entity
│       ├── repository
│       ├── service
│       └── DemoApplication.java
├── src/main/resources
│   ├── application.properties
│   └── static
│       └── index.html
├── src/test/java
│   └── com/example/demo
│       └── DemoApplicationTests.java
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
