CREATE TABLE Customer (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT,
    email TEXT
);

CREATE TABLE Order_Shop (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    customerId INTEGER,
    product TEXT,
    quantity INTEGER,
    FOREIGN KEY (customerId) REFERENCES Customer(id)
);

INSERT INTO Customer (name, email) VALUES
('Juan', 'juan@example.com'),
('Maria', 'maria@example.com');

INSERT INTO Order_Shop (customerId, product, quantity) VALUES
(1, 'Product A', 2),
(1, 'Product B', 1),
(2, 'Product C', 3);

