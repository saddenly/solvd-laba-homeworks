SELECT
    c.first_name, c.last_name, o.order_id, o.order_date, od.quantity, od.unit_price,
    p.product_name, s.supplier_name, cat.category_name, e.first_name AS employee_name,
    sh.shipment_status, pay.payment_amount, w.warehouse_name, i.quantity_in_stock
FROM
    Customer c
        JOIN
    `Order` o ON c.customer_id = o.customer_id
    JOIN
    OrderDetails od ON o.order_id = od.order_id
    JOIN
    Product p ON od.product_id = p.product_id
    JOIN
    Supplier s ON p.supplier_id = s.supplier_id
    JOIN
    Category cat ON p.category_id = cat.category_id
    JOIN
    Employee e ON o.employee_id = e.employee_id
    JOIN
    Shipment sh ON o.order_id = sh.order_id
    JOIN
    Payment pay ON o.order_id = pay.order_id
    JOIN
    Inventory i ON p.product_id = i.product_id
    JOIN
    Warehouse w ON i.warehouse_id = w.warehouse_id;
