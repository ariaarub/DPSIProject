CREATE TABLE Schedule
(
	SchedID INT NOT NULL,
	clock TIME,
	PRIMARY KEY (SchedID)
);

CREATE TABLE Patient
(
	PatID INT NOT NULL,
	Name VARCHAR(50),
	Gender VARCHAR(1),
	PRIMARY KEY (PatID)
);

CREATE TABLE Doctor
(
	DocID INT NOT NULL,
	Name VARCHAR(50),
	Specialty VARCHAR(50),
	SchedID INT,
	PRIMARY KEY (DocID),
	FOREIGN KEY (SchedID) REFERENCES Schedule(SchedID)
);

CREATE TABLE Room
(
	RoomID INT NOT NULL,
	DocID INT,
	StaffID INT,
	Section VARCHAR(50),
	PRIMARY KEY (RoomID),
	FOREIGN KEY (DocID) REFERENCES Doctor(DocID),
	FOREIGN KEY (StaffID) REFERENCES Staff(StaffID)
);

CREATE TABLE Staff
(
	StaffID INT NOT NULL,
	SchedID INT,
	DeskjobID INT,
	Name VARCHAR(50),
	PRIMARY KEY (StaffID),
	FOREIGN KEY (SchedID) REFERENCES Schedule(SchedID),
	FOREIGN KEY (DeskjobID) REFERENCES Deskjob(DeskjobID)
);

CREATE TABLE Deskjob
(
	DeskjobID INT NOT NULL,
	Name VARCHAR(45),
	Location VARCHAR(45),
	Desc VARCHAR(255),
	PRIMARY KEY (DeskjobID)
);

CREATE TABLE Appointment
(
	AppoID INT NOT NULL,
	RoomID INT,
	PatID INT,
	StaffID INT,
	Schedule TIME
);

CREATE TABLE Lab
(
	LabID INT NOT NULL,
	DocID INT,
	AppoID INT,
	Section VARCHAR(50),
	PRIMARY KEY (LabID),
	FOREIGN KEY (DocID) REFERENCES Doctor(DocID),
	FOREIGN KEY (AppoID) REFERENCES Appointment(AppoID)
);

CREATE TABLE LabResult
(
	LabresID INT NOT NULL,
	LabID INT,
	PatID INT,
	Results VARCHAR(255),
	PRIMARY KEY (LabresID),
	FOREIGN KEY (LabID) REFERENCES Lab(LabID),
	FOREIGN KEY (PatID) REFERENCES Patient(PatID)
);
