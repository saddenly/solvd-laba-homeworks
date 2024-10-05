SELECT customer_id, COUNT(order_id) AS total_orders
FROM `Order`
GROUP BY customer_id
HAVING COUNT(order_id) > 2;

SELECT customer_id, SUM(payment_amount) AS total_paid
FROM Payment p
join `order` o on o.order_id = p.order_id
GROUP BY customer_id
HAVING SUM(payment_amount) > 1000;

SELECT customer_id, AVG(payment_amount) AS avg_order_amount
FROM Payment p
join `order` o on o.order_id = p.order_id
GROUP BY customer_id
HAVING AVG(payment_amount) > 200;

SELECT category_id, COUNT(product_id) AS total_products
FROM Product
GROUP BY category_id
HAVING COUNT(product_id) > 5;

SELECT warehouse_id, SUM(quantity_in_stock) AS total_inventory
FROM Inventory
GROUP BY warehouse_id
HAVING SUM(quantity_in_stock) > 100;

SELECT customer_id, MAX(payment_amount) AS max_payment
FROM Payment p
join `order` o on o.order_id = p.order_id
GROUP BY customer_id
HAVING MAX(payment_amount) > 500;

SELECT category_id, MIN(unit_price) AS min_price
FROM Product
GROUP BY category_id
HAVING MIN(unit_price) > 50;
