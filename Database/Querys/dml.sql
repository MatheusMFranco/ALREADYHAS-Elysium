/* Type of Employee */
INSERT INTO type_employee(date_register, name_type)
VALUES(current_timestamp, 'CEO');

INSERT INTO type_employee(date_register, name_type)
VALUES(current_timestamp, 'Administrator');

INSERT INTO type_employee(date_register, name_type)
VALUES(current_timestamp, 'Secretary');

INSERT INTO type_employee(date_register, name_type)
VALUES(current_timestamp, 'Dentist');

INSERT INTO type_employee(date_register, name_type)
VALUES(current_timestamp, 'Internship');

INSERT INTO type_employee(date_register, name_type)
VALUES(current_timestamp, 'Auxiliary');

INSERT INTO type_employee(date_register, name_type)
VALUES(current_timestamp, 'Cleaning Assistant');

INSERT INTO type_employee(date_register, name_type)
VALUES(current_timestamp, 'Technical Support');

select * from type_employee;

/* Type Consultation */
INSERT INTO type_consultation(date_register, name_type)
VALUES(current_timestamp, 'Anamnese');

INSERT INTO type_consultation(date_register, name_type)
VALUES(current_timestamp, 'Restoration');

INSERT INTO type_consultation(date_register, name_type)
VALUES(current_timestamp, 'Extraction');

INSERT INTO type_consultation(date_register, name_type)
VALUES(current_timestamp, 'Pediatric Dentistry');

INSERT INTO type_consultation(date_register, name_type)
VALUES(current_timestamp, 'Cleaning');