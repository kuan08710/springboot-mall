  # Spring Boot mall

## 項目簡介

這是一個練習商品、帳號、訂單功能的API建立的Spring Boot項目，旨在熟悉API開發流程和資料庫操作。項目主要特點包括：

- 使用JDBC串接MySQL資料庫進行數據操作
- 通過Spring Boot構建RESTful API
- 使用H2資料庫進行單元測試

此項目涵蓋了基本的商品管理、帳號管理和訂單管理功能，並提供了完整的CRUD（創建、讀取、更新、刪除）操作。

### 功能描述

- **商品管理**
  - 創建新商品
  - 獲取所有商品
  - 根據ID獲取商品訊息
  - 更新商品信息
  - 刪除商品

- **帳號管理**
  - 創建新帳號
  - 登入帳號

- **訂單管理**
  - 創建新訂單
  - 獲取所有訂單

### 使用技術和版本

- **Spring Boot**: 2.3.7.RELEASE
- **MySQL**: 8.3.0
- **NamedParameterJdbcTemplate**: 數據庫訪問
- **H2 Database**: 單元測試資料庫
- **Maven**: 項目構建和依賴管理
- **Lombok**: 簡化程式碼

## 項目結構

```plaintext
├── src/main/java
│   └── com/louis/springbootmall
│       ├── constant
│       │   └── ProductCategory.java
│       ├── controller
│       │   ├── OrderController.java
│       │   ├── ProductController.java
│       │   └── UserController.java
│       ├── dao
│       │   ├── impl
│       │   │   ├── OrderDaoImpl.java
│       │   │   ├── ProductImpl.java
│       │   │   └── UserDaoImpl.java
│       │   ├── OrderDao.java
│       │   ├── ProductDao.java
│       │   └── UserDao.java
│       ├── dto
│       │   ├── BuyItem.java
│       │   ├── CreateOrderRequest.java
│       │   ├── OrderQueryParams.java
│       │   ├── ProductQueryParams.java
│       │   ├── ProductRequest.java
│       │   ├── UserLoginRequest.java
│       │   └── UserRegisterRequest.java
│       ├── mdoel
│       │   ├── Order.java
│       │   ├── OrderItem.java
│       │   ├── Product.java
│       │   └── User.java
│       ├── rowmapper
│       │   ├── OrderItemRowMapper.java
│       │   ├── OrderRowMapper.java
│       │   ├── ProductRowMapper.java
│       │   └── UserRowMapper.java
│       ├── serivce
│       │   ├── impl
│       │   │   ├── OrderSerivceImpl.java
│       │   │   ├── ProductServiceImpl.java
│       │   │   └── UserSerivceImpl.java
│       │   ├── OrderService.java
│       │   ├── ProductService.java
│       │   └── UserService.java
│       ├── util
│       │   └── Page.java
│       └── SpringbootMallApplication.java
├── src/main/resources
│   └── application.properties
├── src/test/java
│   └── com/louis/springbootmall
│       ├── controller
│       │   ├── OrderControllerTest.java
│       │   ├── ProductControllerTest.java
│       │   └── UserControllerTest.java
│       └── SpringbootMallApplicationTests.java
├── .gitignore
├── pom.xml
└── README.md
