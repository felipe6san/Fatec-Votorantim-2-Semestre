/****Exercicio 1****/
Create Table Professores
(
Id_Professores int not null,
Nome varchar(50) not null,
Disciplina varchar(15) not null,
Constraint PK_Professores Primary Key(Id_Professores)
)

/****Exercicio 2****/
Insert Into Professores
Values
('1','Ana Oliveira','Português');

/****Exercicio 3****/
Update Professores
Set Nome = 'Ana Silva'
Where Id_Professores = '1'

/****Exercicio 4****/
Insert Into Professores
Values
('2','Lúis Pedro','História'),('3','André Damasco','Matemática'),
('4','Jesus Silva','Sociologia'),('5','Bob Marley','Filosofia'),
('6','Thomas Tur','Educação Física'),('7','Lousa Table','Descrição'),
('8','Little Stitch','Ohana'),('9','DJ Arana','Sexologia'),
('10','Toninho Tornado','Samsumgo'),('11','Jones','Banco de Dados');

/****Exercicio 5****/
Delete From Professores
Where Id_Professores = '2'

/****Exercicio 6****/
Create Table Turmas
(
Id_Turmas int not null,
Nome varchar(50) not null,
Professor_Responsavel int not null,
Constraint PK_Turmas Primary Key(Id_Turmas),
Constraint FK_Professor Foreign Key(Professor_Responsavel) References Professores(Id_Professores)
)

/****Exercicio 7****/
Insert Into Turmas
Values
('1','9A','1');

/****Exercicio 8****/
Insert Into Turmas
Values
('11','9B','1'),('2','8A','3'),('3','8B','4'),('4','7A','5'),('5','7B','6'),
('6','6A','7'),('7','6B','8'),('8','5A','9'),('9','5B','3'),('10','5C','11');

/****Exercicio 9****/
Create Table Alunos
(
Id_Alunos int not null,
Nome varchar(50) not null,
Data_Nascimento date not null,
Turmas_Id int not null,
Constraint PK_Alunos Primary Key(Id_Alunos),
Constraint FK_Turmas Foreign Key(Turmas_Id) References Turmas(Id_Turmas)
)

/****Exercicio 10****/
Insert Into Alunos
Values
('1','Maria Souza','2005-10-15','1')

/****Exercicio 11****/
Update Alunos
Set Nome = 'Maria da Silva'
Where Id_Alunos = '1'

/****Exercicio 12****/
Insert Into Alunos
Values
('2','João Pedro','2002-10-13','2'),('3','Augusto Silva','1999-07-22','3'),
('4','Pedro Oliveira','2003-12-02','4'),('5','Jailson Mendez','2009-03-22','5'),
('6','Bob Esponja','2006-08-11','6'),('7','Timmy Turner','2000-11-17','7'),
('8','Pablo Escobar','2022-04-18','8'),('9','Nelson Mandela','1992-01-27','9'),
('10','Osama Bin Laden','1957-03-10','10'),('11','Oscar Alho','2001-06-29','11')

/****Exercicio 13****/
Delete From Alunos
Where Id_Alunos = '2'

/****Exercicio 14****/
Create Table Notas
(
Id_Notas int not null,
Alunos_Id int not null,
Disciplina varchar(15) not null,
Notas decimal(5,2) not null,
Constraint PK_Notas Primary Key(Id_Notas),
Constraint FK_Alunos Foreign Key(Alunos_Id) References Alunos(Id_Alunos)
)

/****Exercicio 15****/
Insert Into Notas
Values
('1','1','Matemática','8.5')

/****Exercicio 16****/
Update Notas
Set Notas = '9.0'
Where Alunos_Id = '1'

/****Exercicio 17****/
Insert Into Notas
Values
('2','5','Matemática','6.5'),('3','3','História','3.2'),
('4','4','Sociologia','4.5'),('5','5','Banco de Dados','4.4'),
('6','6','Sexologia','8.0'),('7','7','Ohana','9.0'),
('8','8','Matemática','9.6'),('9','9','Samsumgo','10.0'),
('10','10','Filosofia','8.7'),('11','11','História','1.0')

/****Exercicio 18****/
Delete From Notas
Where Alunos_Id = '1' and Disciplina = 'Matemática'

/****Exercicio 19****/
Create Table Matriculas
(
Id_Matriculas int not null,
Alunos_Id int not null,
Turmas_Id int not null,
Data_Matricula date not null,
Constraint PK_Matriculas Primary Key(Id_Matriculas),
Constraint FK_Aluno Foreign Key(Alunos_Id) References Alunos(Id_Alunos),
Constraint FK_Turma Foreign Key(Turmas_Id) References Turmas(Id_Turmas)
)

/****Exercicio 20****/
Insert Into Matriculas
Values
('1','1','1','2022-02-15')

/****Exercicio 21****/
Insert Into Matriculas
Values
('2','11','2','2002-10-13'),('3','3','3','1999-07-22'),
('4','4','4','2003-12-02'),('5','5','5','2009-03-22'),
('6','6','6','2006-08-11'),('7','7','7','2000-11-17'),
('8','8','8','2022-04-18'),('9','9','9','1992-01-27'),
('10','10','10','1957-03-10'),('11','11','11','2001-06-29')



select * from Matriculas
select * from Notas
select * from Alunos
select * from Professores
select * from Turmas
