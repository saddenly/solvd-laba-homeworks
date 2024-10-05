UPDATE Customer
SET email = 'john_new_email@gmail.com'
WHERE customer_id = 1;

UPDATE Product
SET unit_price = 899.99
WHERE product_name = 'Laptop';

UPDATE Supplier
SET phone = '555-555-5555'
WHERE supplier_name = 'TechCorp';

UPDATE Customer
SET address = '789 New Address St'
WHERE customer_id = 2;

UPDATE Employee
SET role_id = 2
WHERE employee_id = 3;

UPDATE Product
SET category_id = 2
WHERE product_id = 2;

UPDATE Shipment
SET shipment_status = 'Delivered'
WHERE shipment_id = 1;

UPDATE Payment
SET payment_amount = 450.00
WHERE payment_id = 1;

UPDATE Inventory
SET quantity_in_stock = 50
WHERE product_id = 3;

UPDATE Warehouse
SET location = 'New Location Area 101'
WHERE warehouse_id = 1;
