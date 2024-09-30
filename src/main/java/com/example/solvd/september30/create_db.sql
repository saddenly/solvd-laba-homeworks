CREATE DATABASE Production;

USE Production;

CREATE TABLE Customer (
                          customer_id INT PRIMARY KEY AUTO_INCREMENT,
                          first_name VARCHAR(50),
                          last_name VARCHAR(50),
                          email VARCHAR(100),
                          phone VARCHAR(20),
                          address VARCHAR(255)
);

CREATE TABLE EmployeeRole (
                              role_id INT PRIMARY KEY AUTO_INCREMENT,
                              role_name VARCHAR(50)
);

CREATE TABLE Employee (
                          employee_id INT PRIMARY KEY AUTO_INCREMENT,
                          first_name VARCHAR(50),
                          last_name VARCHAR(50),
                          email VARCHAR(100),
                          phone VARCHAR(20),
                          role_id INT,
                          FOREIGN KEY (role_id) REFERENCES EmployeeRole(role_id)
);

CREATE TABLE `Order` (
                         order_id INT PRIMARY KEY AUTO_INCREMENT,
                         customer_id INT,
                         employee_id INT,
                         order_date DATE,
                         FOREIGN KEY (customer_id) REFERENCES Customer(customer_id),
    FOREIGN KEY (employee_id) REFERENCES Employee(employee_id)
);

CREATE TABLE Category (
                          category_id INT PRIMARY KEY AUTO_INCREMENT,
                          category_name VARCHAR(50)
);

CREATE TABLE Supplier (
                          supplier_id INT PRIMARY KEY AUTO_INCREMENT,
                          supplier_name VARCHAR(100),
                          contact_name VARCHAR(100),
                          phone VARCHAR(20),
                          address VARCHAR(255)
);

CREATE TABLE Product (
                         product_id INT PRIMARY KEY AUTO_INCREMENT,
                         product_name VARCHAR(100),
                         category_id INT,
                         supplier_id INT,
                         unit_price DECIMAL(10, 2),
                         FOREIGN KEY (category_id) REFERENCES Category(category_id),
                         FOREIGN KEY (supplier_id) REFERENCES Supplier(supplier_id)
);

CREATE TABLE OrderDetails (
                              order_details_id INT PRIMARY KEY AUTO_INCREMENT,
                              order_id INT,
                              product_id INT,
                              quantity INT,
                              unit_price DECIMAL(10, 2),
                              FOREIGN KEY (order_id) REFERENCES `Order`(order_id),
                              FOREIGN KEY (product_id) REFERENCES Product(product_id)
);

CREATE TABLE Shipment (
                          shipment_id INT PRIMARY KEY AUTO_INCREMENT,
                          order_id INT,
                          shipment_date DATE,
                          shipment_status VARCHAR(50),
                          tracking_number VARCHAR(100),
                          FOREIGN KEY (order_id) REFERENCES `Order`(order_id)
);

CREATE TABLE Payment (
                         payment_id INT PRIMARY KEY AUTO_INCREMENT,
                         order_id INT,
                         payment_date DATE,
                         payment_amount DECIMAL(10, 2),
                         payment_method VARCHAR(50),
                         FOREIGN KEY (order_id) REFERENCES `Order`(order_id)
);

CREATE TABLE Warehouse (
                           warehouse_id INT PRIMARY KEY AUTO_INCREMENT,
                           warehouse_name VARCHAR(100),
                           location VARCHAR(255)
);

CREATE TABLE Inventory (
                           inventory_id INT PRIMARY KEY AUTO_INCREMENT,
                           warehouse_id INT,
                           product_id INT,
                           quantity_in_stock INT,
                           FOREIGN KEY (warehouse_id) REFERENCES Warehouse(warehouse_id),
                           FOREIGN KEY (product_id) REFERENCES Product(product_id)
);
