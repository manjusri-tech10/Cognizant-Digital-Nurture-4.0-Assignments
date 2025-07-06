INSERT INTO department (id, name) VALUES (1,'HR'),(2,'Engineering');
INSERT INTO skill (id,name) VALUES (1,'Java'),(2,'SQL'),(3,'Spring Boot');
INSERT INTO employee (id,name,salary,permanent,date_of_birth,department_id)
VALUES (1,'Alice',60000,1,'1990-05-01',2),
       (2,'Bob',55000,1,'1985-08-15',2),
       (3,'Charlie',45000,0,'1992-03-10',1);
INSERT INTO employee_skill (employee_id,skill_id) VALUES (1,1),(1,3),(2,2);
INSERT INTO user (id,username) VALUES (1,'john_doe');
INSERT INTO question (id,text) VALUES (1,'What is the extension of HTML file?'),
    (2,'Max heading tag in HTML?'),
    (3,'HTML starts and ends with?');
INSERT INTO option (id,text,correct,score,question_id) VALUES
(1,'.xhtm',false,0.0,1),(2,'.ht',false,0.0,1),(3,'.html',true,1.0,1),(4,'.htmx',false,0.0,1),
(5,'5',false,0.0,2),(6,'3',true,0.0,2),(7,'4',false,0.0,2),(8,'6',false,1.0,2),
(9,'false',false,0.0,3),(10,'true',true,1.0,3);
INSERT INTO attempt (id,attempted_on,user_id) VALUES (1,NOW(),1);
INSERT INTO attempt_question (attempt_id,question_id) VALUES (1,1),(1,2),(1,3);
INSERT INTO attempt_option (attempt_question_id,option_id,selected)
 VALUES (1,3,true),(2,6,true),(3,10,true);
