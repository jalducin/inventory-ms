# Inventory Microservices System (`inventory-ms`)

Este proyecto implementa un sistema de inventarios basado en microservicios usando Java 21, Spring Boot, MySQL y Docker. También incluye una estrategia de DevOps con Jenkins y Git para CI/CD.

---

## 🧱 Microservicios

- **product-service**: Gestión de productos.
- **inventory-service**: Control de inventario.
- **order-service**: Gestión de pedidos.

Cada microservicio tiene su propia base de datos y API REST independiente.

---

## 🧩 Estructura del proyecto

```
inventory-ms/
├── product-service/
│   ├── Dockerfile
│   └── pom.xml
├── inventory-service/
│   ├── Dockerfile
│   └── pom.xml
├── order-service/
│   ├── Dockerfile
│   └── pom.xml
├── docker-compose.yml
└── README.md
```

---

## 🛠️ Tecnologías utilizadas

- Java 21
- Spring Boot
- MySQL (bases de datos por servicio)
- Docker y Docker Compose
- Jenkins (CI/CD)
- Git
- JUnit (para pruebas)

---

## ⚙️ CI/CD con Jenkins

1. **Instalación de Jenkins**
2. **Configuración de plugins (Maven, Docker, Git)**
3. **Pipeline CI/CD**:
   - Compilación y pruebas
   - Creación de imágenes Docker
   - Despliegue en entornos de prueba y producción
4. **Webhooks Git**
5. **Monitoreo y alertas** con Prometheus, Grafana y ELK Stack

---

## 🧪 Esquema de Base de Datos

### product_service

```sql
CREATE DATABASE product_service;
USE product_service;

CREATE TABLE products (
    id BIGINT AUTO_INCREMENT,
    name VARCHAR(255),
    description TEXT,
    price DECIMAL(10,2),
    PRIMARY KEY (id)
);
```

### inventory_service

```sql
CREATE DATABASE inventory_service;
USE inventory_service;

CREATE TABLE inventories (
    id BIGINT AUTO_INCREMENT,
    product_id BIGINT,
    quantity INT,
    PRIMARY KEY (id)
);
```

### order_service

```sql
CREATE DATABASE order_service;
USE order_service;

CREATE TABLE orders (
    id BIGINT AUTO_INCREMENT,
    customer_id BIGINT,
    order_date DATE,
    PRIMARY KEY (id)
);

CREATE TABLE order_details (
    id BIGINT AUTO_INCREMENT,
    order_id BIGINT,
    product_id BIGINT,
    quantity INT,
    PRIMARY KEY (id)
);
```

---

## 📦 Ejecución con Docker Compose

```bash
docker compose up --build
```

Servicios disponibles en:

- http://localhost:8081/api/products
- http://localhost:8082/api/inventories
- http://localhost:8083/api/orders

---

## 🔐 Configuración `.properties` por servicio

```properties
spring.datasource.url=jdbc:mysql://localhost:3307/product_service
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
```

Ajustar el puerto y base de datos según el servicio (`inventory_service`, `order_service`, etc).

---

## 👨‍💻 Autor

**Elaborado por ISC Juan Valentín Alducin Vázquez**  
📅 Mayo 2025  
🔗 [GitHub](https://github.com/jalducin)
## Git
git add .
git commit -m "Actualización INVENTORY-MS"
git push origin main

