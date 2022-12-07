DROP DATABASE IF EXISTS hokimart;
CREATE DATABASE hokimart;
USE hokimart;
CREATE TABLE employee(
    id_employee INT(20) AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    username VARCHAR(25) NOT NULL,
    password VARCHAR(30) NOT NULL,
    age INT(3) NOT NULL,
    salary FLOAT(2) NOT NULL,
    years_experienced INT(3) NOT NULL
);
CREATE TABLE manager(
    id_employee INT(20),
    role_title VARCHAR(50) NOT NULL,
    CONSTRAINT employeemanager FOREIGN KEY(id_employee) REFERENCES employee(id_employee)
);
CREATE TABLE cashier(
    id_employee INT(20),
    transaction_handled INT(30),
    CONSTRAINT employeecashier FOREIGN KEY(id_employee) REFERENCES employee(id_employee)
);
CREATE TABLE category(
    id_category INT(30) AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(50) NOT NULL
);
CREATE TABLE item(
    id_item INT(30) AUTO_INCREMENT PRIMARY KEY,
    id_category INT(30),
    title VARCHAR(50) NOT NULL,
    description TEXT,
    price FLOAT(2) NOT NULL,
    in_stock INT(10),
    CONSTRAINT categoryitem FOREIGN KEY(id_category) REFERENCES category(id_category)
);
CREATE TABLE transaction(
    id_transaction INT(100) AUTO_INCREMENT PRIMARY KEY,
    id_employee INT(20),
    customer_name VARCHAR(50) NOT NULL,
    transaction_date DATE DEFAULT NOW(),
    total FLOAT(2),
    CONSTRAINT cashiertransaction FOREIGN KEY(id_employee) REFERENCES employee(id_employee)
);
CREATE TABLE detail_transaction(
    id_detail_transaction INT(100) AUTO_INCREMENT PRIMARY KEY,
    id_transaction INT(100),
    id_item INT(30),
    quantity INT(5),
    subtotal FLOAT(2),
    CONSTRAINT transactiondetail FOREIGN KEY(id_transaction) REFERENCES transaction(id_transaction),
    CONSTRAINT transactionitem FOREIGN KEY(id_item) REFERENCES item(id_item)
);
INSERT INTO employee(
        name,
        username,
        password,
        age,
        salary,
        years_experienced
    )
VALUES ("Donald", "oconnell", "doconnel", 21, 2600, 5),
    ("Douglas", "grant", "dgrant", 30, 2600, 15),
    ("Jennifer", "whalen", "jwhalen", 25, 4400, 7),
    (
        "Michael",
        "hartstein",
        "mhartste",
        27,
        13000,
        10
    ),
    ("Pat", "fay", "pfay", 42, 6000, 23),
    ("Susan", "mavris", "smavris", 19, 6500, 6),
    ("Hermann", "baer", "hbaer", 21, 10000, 12),
    ("Shelley", "higgins", "shiggins", 25, 12008, 8),
    ("William", "gietz", "wgietz", 28, 8300, 6),
    ("Steven", "king", "sking", 32, 9000, 3),
    ("Neena", "kochhar", "nkochhar", 22, 17000, 2),
    ("Lex", "de", "haan", 41, 17000, 17),
    ("Alexander", "hunold", "ahunold", 52, 9000, 32),
    ("Bruce", "ernst", "bernst", 31, 6000, 2),
    ("David", "austin", "daustin", 45, 4800, 8),
    ("Valli", "pataballa", "vpatabal", 27, 4800, 1),
    ("Diana", "lorentz", "dlorentz", 29, 4200, 3),
    ("Nancy", "greenberg", "ngreenbe", 48, 12008, 12),
    ("Daniel", "faviet", "dfaviet", 39, 9000, 14),
    ("John", "chen", "jchen", 32, 8200, 17);
INSERT INTO manager(id_employee, role_title)
VALUES (1, "Top Manager"),
    (2, "Middle Manager"),
    (3, "First Lane Manager");
INSERT INTO cashier(id_employee, transaction_handled)
VALUES (4, 4),
    (5, 8),
    (6, 12),
    (7, 128),
    (8, 64),
    (9, 32),
    (10, 8),
    (11, 12),
    (12, 17),
    (13, 28),
    (14, 19),
    (15, 81),
    (16, 90),
    (17, 100),
    (18, 52),
    (19, 67),
    (20, 32);
INSERT INTO category(title)
VALUES ("Snacks"),
    ("Beverages");
INSERT INTO item(
        id_category,
        title,
        description,
        price,
        in_stock
    )
VALUES (1, "Hanzel", "Nabati Hanzel 28g", 6, 50),
    (1, "Top Wafer", "Wafer", 5, 50),
    (1, "Snackit", "Pia", 8, 50),
    (1, "Twister Chocolate", "Twister 600g", 13, 50),
    (
        1,
        "Tic Tac",
        "Dua Kelinci Tic Tac Original 90g",
        32,
        50
    ),
    (
        2,
        "Pure Life",
        "Pure Life Mineral Water 330ml",
        3,
        50
    ),
    (2, "Jungle Juice Guava", "Juice 200ml", 6, 50),
    (2, "Pristine", "Bottle 600ml", 2, 50),
    (
        2,
        "Mizone Mood Up",
        "Mizone Mood Up Cranberry 500ml",
        5,
        50
    ),
    (2, "Coolant Star Fruit", "Coolant 350ml", 2, 50);
INSERT INTO transaction(id_employee, customer_name, total)
VALUES (1, "Yanto", 10);
INSERT INTO detail_transaction(id_transaction, id_item, quantity, subtotal)
VALUES (1, 7, 1, 6),
    (1, 8, 2, 2);