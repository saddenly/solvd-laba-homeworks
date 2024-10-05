SELECT customer_id, COUNT(order_id) AS total_orders
FROM `Order`
GROUP BY customer_id;

SELECT customer_id, SUM(payment_amount) AS total_paid
FROM Payment p
join `order` o on o.order_id = p.order_id
GROUP BY customer_id;

SELECT customer_id, AVG(payment_amount) AS avg_order_amount
FROM Payment p
join `order` o on o.order_id = p.order_id
GROUP BY customer_id;

SELECT category_id, COUNT(product_id) AS total_products
FROM Product
GROUP BY category_id;

SELECT warehouse_id, SUM(quantity_in_stock) AS total_inventory
FROM Inventory
GROUP BY warehouse_id;

SELECT customer_id, MAX(payment_amount) AS max_payment
FROM Payment p
join `order` o on o.order_id = p.order_id
GROUP BY customer_id;

SELECT category_id, MIN(unit_price) AS min_price
FROM Product
GROUP BY category_id;
