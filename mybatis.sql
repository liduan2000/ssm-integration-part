-- Active: 1698029446168@@127.0.0.1@3306@mybatis-example

USE `mybatis-example`;

CREATE TABLE
    `t_emp`(
        emp_id INT AUTO_INCREMENT,
        emp_name CHAR(100),
        emp_salary DOUBLE(10, 5),
        PRIMARY KEY(emp_id)
    );

CREATE TABLE
    `t_stu`(
        stu_id VARCHAR(64),
        stu_name VARCHAR(20)
    );

CREATE TABLE
    `t_customer`(
        customer_id INT NOT NULL AUTO_INCREMENT,
        customer_name VARCHAR(20),
        PRIMARY KEY(customer_id)
    );

CREATE TABLE
    `t_order`(
        order_id INT NOT NULL AUTO_INCREMENT,
        order_name VARCHAR(20),
        customer_id INT,
        PRIMARY KEY(order_id)
    );

INSERT INTO t_customer (customer_name) VALUES('c01');

INSERT INTO t_order (order_name,customer_id) VALUES ('o1','1');

INSERT INTO t_order (order_name,customer_id) VALUES ('o2','1');

INSERT INTO t_order (order_name,customer_id) VALUES ('o3','1');

select *
from t_order as tor
    join t_customer as tcu on tor.customer_id = tcu.customer_id
where tor.order_id = 1;