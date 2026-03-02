SELECT customer_name, total_order_amount_per_customer 
FROM (
    SELECT c.customer_name,
        SUM(c.order_amount) OVER (PARTITION BY c.customer_id) AS total_order_amount_per_customer
    FROM customer c
    WHERE c.order_placed_date >= CURDATE() - INTERVAL 1 YEAR
) AS temp_customer
WHERE total_order_amount_per_customer >= 1000;

