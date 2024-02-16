-- Active: 1698029446168@@127.0.0.1@3306@mybatis-example

CREATE TABLE
    schedule (
        id INT NOT NULL AUTO_INCREMENT,
        title VARCHAR(255) NOT NULL,
        completed BOOLEAN NOT NULL,
        PRIMARY KEY (id)
    );

INSERT INTO
    schedule (title, completed)
VALUES ('学习java', true), ('学习Python', false), ('学习C++', true), ('学习JavaScript', false), ('学习HTML5', true), ('学习CSS3', false), ('学习Vue.js', true), ('学习React', false), ('学习Angular', true), ('学习Node.js', false), ('学习Express', true), ('学习Koa', false), ('学习MongoDB', true), ('学习MySQL', false), ('学习Redis', true), ('学习Git', false), ('学习Docker', true), ('学习Kubernetes', false), ('学习AWS', true), ('学习Azure', false);