SELECT customers.name,order_date,sku,quan,state
FROM customers,orders,items,addresses
WHERE customers.cid = orders.cid
AND orders.oid = items.oid
AND customers.cid = addresses.cid
