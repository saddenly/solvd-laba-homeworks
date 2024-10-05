ALTER TABLE Customer
    ADD COLUMN date_of_birth DATE;

ALTER TABLE Customer
    ADD CONSTRAINT unique_email UNIQUE (email);

ALTER TABLE Inventory
    ADD CONSTRAINT fk_warehouse_id FOREIGN KEY (warehouse_id) REFERENCES Warehouse(warehouse_id);

ALTER TABLE Supplier
    MODIFY COLUMN phone VARCHAR(30);

ALTER TABLE Employee
    DROP COLUMN phone;
