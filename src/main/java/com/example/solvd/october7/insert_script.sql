INSERT INTO Customer (first_name, last_name, email, phone, address)
VALUES ('John', 'Doe', 'johndoe@gmail.com', '123-456-7890', '123 Main St');

INSERT INTO Customer (first_name, last_name, email, phone, address)
VALUES ('Jane', 'Smith', 'janesmith@yahoo.com', '987-654-3210', '456 Oak St');

INSERT INTO Category (category_name)
VALUES ('Electronics');

INSERT INTO Category (category_name)
VALUES ('Clothing');

INSERT INTO Supplier (supplier_name, contact_name, phone, address)
VALUES ('TechCorp', 'Alice Johnson', '555-123-4567', '789 Tech Park');

INSERT INTO Supplier (supplier_name, contact_name, phone, address)
VALUES ('FashionWare', 'Bob Williams', '555-987-6543', '321 Fashion Ave');

INSERT INTO Product (product_name, category_id, supplier_id, unit_price)
VALUES ('Smartphone', 1, 1, 499.99);

INSERT INTO Product (product_name, category_id, supplier_id, unit_price)
VALUES ('Laptop', 1, 1, 999.99);

INSERT INTO Product (product_name, category_id, supplier_id, unit_price)
VALUES ('T-shirt', 2, 2, 19.99);

INSERT INTO EmployeeRole (role_name)
VALUES ('Sales Manager');
