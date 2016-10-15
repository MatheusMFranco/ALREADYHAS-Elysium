CREATE TABLE Invoice(
	id 		SERIAL PRIMARY KEY NOT NULL,
	date_due 	DATE NOT NULL,
	date_register 	TIMESTAMP NOT NULL,
	enterprise 	VARCHAR(100) NOT NULL,
	name_invoice 	VARCHAR(100) NOT NULL,
	price 		DECIMAL NOT NULL,
	situation 	VARCHAR(20) NOT NULL,
	date_pay	DATE
);
	
CREATE TABLE Type_Consultation(
	id 		SERIAL PRIMARY KEY NOT NULL,
	date_register 	TIMESTAMP NOT NULL,
	name_type	VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Type_Employee(
	id 		SERIAL NOT NULL PRIMARY KEY,
	date_register	TIMESTAMP NOT NULL,
	name_type	VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Patient(
	id		SERIAL PRIMARY KEY NOT NULL,
	enterprise	VARCHAR(100),
	agreement	VARCHAR(100),
	particulars	VARCHAR(255),
	responsible	VARCHAR(100)
);

CREATE TABLE Employee(
	id		SERIAL PRIMARY KEY NOT NULL,
	fk_te		INTEGER REFERENCES Type_Employee(id), 
	date_contract 	DATE NOT NULL,
	salary		DECIMAL NOT NULL,
	working_papers	INTEGER NOT NULL,
	date_closing	DATE,
	situation	VARCHAR(20),
	supervisor	VARCHAR(100)
);

CREATE TABLE Person(
	id 		SERIAL PRIMARY KEY NOT NULL,
	fk_Emp		INTEGER REFERENCES Employee(id) NOT NULL,
	fk_Pat		INTEGER REFERENCES Patient(id) NOT NULL,
	cpf		INTEGER NOT NULL UNIQUE,
	date_birth	DATE NOT NULL,
	date_register	TIMESTAMP NOT NULL,
	gender		VARCHAR(1) NOT NULL,
	name_person	VARCHAR(100) NOT NULL,
	last_name	VARCHAR(100) NOT NULL,
	marital_status	VARCHAR(50) NOT NULL,
	naturalness	VARCHAR(50) NOT NULL,
	occupation	VARCHAR(100) NOT NULL,
	user_password	VARCHAR(32) NOT NULL UNIQUE,
	registration	VARCHAR(4) NOT NULL UNIQUE,
	user_type	VARCHAR(10) NOT NULL,
	date_issuer_RG	DATE,
	identity_RG	INTEGER,
	organ_issuer_RG	VARCHAR(20),
	photo		BYTEA,
	spouse		VARCHAR(100)
);

CREATE TABLE Address(
	id		SERIAL PRIMARY KEY NOT NULL,
	fk_Person	INTEGER REFERENCES Person(id) NOT NULL,
	city		VARCHAR(100) NOT NULL,
	full_Address	VARCHAR(100) NOT NULL,
	state		VARCHAR(2) NOT NULL,
	cep		INTEGER
);

CREATE TABLE Contact(
	id		SERIAL PRIMARY KEY NOT NULL,
	fk_Person	INTEGER REFERENCES Person(id) NOT NULL,
	name_contact	VARCHAR(20) NOT NULL,
	number_DDD	INTEGER NOT NULL,
	number_phone	INTEGER NOT NULL,
	type_contact	VARCHAR(20) NOT NULL
);

CREATE TABLE Email(
	id 		SERIAL PRIMARY KEY NOT NULL,
	fk_Person	INTEGER REFERENCES Person(id) NOT NULL,
	email_Address 	VARCHAR(50) NOT NULL UNIQUE,
	name_email	VARCHAR(20) NOT NULL,
	type_email	VARCHAR(20) NOT NULL
);

CREATE TABLE Consultation(
	id		SERIAL PRIMARY KEY NOT NULL,
	fk_Emp		INTEGER REFERENCES Employee(id) NOT NULL,
	fk_Pat		INTEGER REFERENCES Patient(id) NOT NULL,
	fk_TC		INTEGER REFERENCES Type_Consultation(id) NOT NULL,
	fk_Invo		INTEGER REFERENCES Invoice(id),
	anotation 	VARCHAR(255) NOT NULL,
	date_register	TIMESTAMP NOT NULL,
	date_scheduling TIMESTAMP NOT NULL,
	type_payment	VARCHAR(20) NOT NULL,
	attendance 	BOOLEAN,
	date_return	TIMESTAMP
);

CREATE TABLE Exam(
	id 		SERIAL PRIMARY KEY NOT NULL,
	fk_Cons		INTEGER REFERENCES Consultation(id),
	description	VARCHAR(255) NOT NULL,
	name_exam	VARCHAR(20) NOT NULL,
	file_exam	BYTEA
);

CREATE TABLE Photo(
	id		SERIAL PRIMARY KEY NOT NULL,
	fk_Cons		INTEGER REFERENCES Consultation(id) NOT NULL,
	description	VARCHAR(255) NOT NULL,
	name_photo	VARCHAR(20) NOT NULL,
	file_photo	BYTEA NOT NULL
);

CREATE TABLE Medicament(
	id 		SERIAL PRIMARY KEY NOT NULL,
	fk_Cons		INTEGER REFERENCES Consultation(id),
	amount		INTEGER NOT NULL,
	date_register	TIMESTAMP NOT NULL,
	leaflet		VARCHAR(255) NOT NULL,
	name_Medicament	VARCHAR(20) NOT NULL,
	reason		VARCHAR(100) NOT NULL,
	interval_days	INTEGER,
	interval_hours	TIMESTAMP
);

CREATE TABLE Equipment(
	id		SERIAL PRIMARY KEY NOT NULL,
	fk_Cons		INTEGER REFERENCES Consultation(id),
	date_register	TIMESTAMP NOT NULL,
	description	VARCHAR(255) NOT NULL,
	name_equipment	VARCHAR(20) NOT NULL
);

CREATE TABLE Holiday(
	id		SERIAL PRIMARY KEY NOT NULL,
	country		VARCHAR(100) NOT NULL,
	date_holiday	DATE NOT NULL,
	date_register	TIMESTAMP NOT NULL,
	name_holiday	VARCHAR(100) NOT NULL,
	state		VARCHAR(100) NOT NULL
);