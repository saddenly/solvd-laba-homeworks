SELECT c.first_name, c.last_name, o.order_id
FROM Customer c
         LEFT JOIN `Order` o ON c.customer_id = o.customer_id;

SELECT c.first_name, c.last_name, o.order_id
FROM Customer c
         RIGHT JOIN `Order` o ON c.customer_id = o.customer_id;

SELECT c.first_name, c.last_name, o.order_id
FROM Customer c
         INNER JOIN `Order` o ON c.customer_id = o.customer_id;

SELECT c.first_name, c.last_name, o.order_id
FROM Customer c
         JOIN `Order` o ON c.customer_id = o.customer_id;

SELECT p.product_name, s.supplier_name
FROM Product p
         LEFT JOIN Supplier s ON p.supplier_id = s.supplier_id;
