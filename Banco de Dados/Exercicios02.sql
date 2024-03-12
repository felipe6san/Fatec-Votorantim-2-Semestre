/****Exercicio 1****/
Create Table Tbl_Clientes
(
Id_Clientes int not null,
Nome varchar(50) not null,
Email varchar(100) not null,
Telefone varchar(15) not null,
Constraint PK_Clientes Primary Key(Id_Clientes)
)

/****Exercicio 2****/
Insert Into Tbl_Clientes
Values
('1','João Silva','joao@email.com','(11) 1234-5678')

/****Exercicio 3****/
Insert Into Tbl_Clientes
Values
('2','Lorena Oliveira Filho','lorena_oliveira_filho@aol.com','(27) 3375-6812'),('3','Roberto Xavier','roberto_xavier@outlook.com','(46) 3557-6863'),
('4','Márcia Braga','márcia_braga@yahoo.com','(67) 2682-8441'),('5','Eduarda Albuquerque','eduarda_albuquerque@yandex.com','(82) 3973-6684'),
('6','Lucca Santos','lucca_santos@yahoo.com','(28) 3769-6555'),('7','Aline Batista','aline_batista@gmail.com','(11) 2414-8005'),
('8','Marcela Reis','marcela_reis@outlook.com','(65) 2945-9499'),('9','Sophia Saraiva','sophia_saraiva@protonmail.com','(82) 2138-3660'),
('10','Daniel Melo Jr.','daniel_melo_jr@yahoo.com','(83) 3081-6188'),('11','Isabelly Batista','isabelly_batista@zohomail.com','(64) 2654-2633')


/****Exercicio 4****/
Update Tbl_Clientes
Set Telefone = '(11) 8765-4321'
Where Id_Clientes = '1'

/****Exercicio 5****/
Create Table Tbl_Produtos
(
Id_Produtos int not null,
Nome varchar(50) not null,
Preco decimal(5,2) not null,
Estoque int not null,
Constraint PK_Produtos Primary Key(Id_Produtos)
)

/****Exercicio 6****/
Insert Into Tbl_Produtos
Values
('1','Camiseta','29.99','100')

/****Exercicio 7****/
Insert Into Tbl_Produtos
Values
('2','Calça','39.99','100'),('3','Bermuda','19.99','100'),
('4','Jaqueta','229.99','100'),('5','Cueca','9.99','100'),
('6','Meia','3.99','100'),('7','Moletom','149.99','100'),
('8','Luvas','49.99','100'),('9','Sobretudo','399.99','100'),
('10','Camisa','19.99','100'),('11','Camiseta Regata','29.99','100')

/****Exercicio 8****/
Update Tbl_Produtos
Set Preco = '39.99'
Where Id_Produtos = '1'

/****Exercicio 9****/
Create Table Tbl_Pedidos
(
Id_Pedidos int not null,
Clientes_Id int not null,
Produtos_Id int not null,
Quantidade int not null,
Data_Pedido date not null,
Constraint PK_Pedidos Primary Key(Id_Pedidos),
Constraint FK_Clientes Foreign Key(Clientes_Id) References Tbl_Clientes(Id_Clientes),
Constraint FK_Produtos Foreign Key(Produtos_Id) References Tbl_Produtos(Id_Produtos)
)

/****Exercicio 10****/
Insert Into Tbl_Pedidos
Values
('1','1','1','2','2024-03-12')

/****Exercicio 11****/
Update Tbl_Pedidos
Set Quantidade = '3'
Where Id_Pedidos = '1'

/****Exercicio 12****/
Insert Into Tbl_Pedidos
Values
('2','2','2','5','2002-10-13'),('3','3','3','4','1999-07-22'),
('4','4','4','9','2003-12-02'),('5','5','5','8','2009-03-22'),
('6','6','6','20','2006-08-11'),('7','7','7','20','2000-11-17'),
('8','8','8','23','2022-04-18'),('9','9','9','10','1992-01-27'),
('10','10','10','4','1957-03-10'),('11','11','11','3','2001-06-29')

/****Exercicio 13****/
Create Table Tbl_Funcionarios
(
Id_Funcionarios int not null,
Nome varchar(50) not null,
Cargo varchar(50) not null,
Salario decimal(8,2) not null,
Constraint PK_Funcionarios Primary Key(Id_Funcionarios)
)

/****Exercicio 14****/
Insert Into Tbl_Funcionarios
Values
('1','Maria Santos','Gerente','5000.00')

/****Exercicio 15****/
Update Tbl_Funcionarios
Set Salario = '6000.00'
Where Id_Funcionarios = '1'

/****Exercicio 16****/
Insert Into Tbl_Funcionarios
Values
('2','Lorena Oliveira Filho','Vendedor','1000.00'),('3','Roberto Xavier','Vendedor','1400.00'),
('4','Márcia Braga','Vendedor','1000.00'),('5','Eduarda Albuquerque','Vendedor','1000.00'),
('6','Lucca Santos','Consultor','2000.00'),('7','Aline Batista','Atendimento ao cliente','1500.00'),
('8','Marcela Reis','Atendimento ao cliente','1500.00'),('9','Sophia Saraiva','Supervisor','3000.00'),
('10','Daniel Melo Jr.','Coordenador','4000.00'),('11','Isabelly Batista','Diretor','15000.00')

/****Exercicio 17****/
Create Table Tbl_Vendas
(
Id_Vendas int not null,
Produto_Id int not null,
Quantidade int not null,
Valor_Total decimal(5,2) not null,
Data_Venda date not null,
Constraint PK_Vendas Primary Key(Id_Vendas),
Constraint FK_Produ_Venda Foreign Key(Produto_Id) References Tbl_Produtos(Id_Produtos)
)

/****Exercicio 18****/
Insert Into Tbl_Vendas
Values
('1','1','2','79.98','2024-03-12')

/****Exercicio 19****/
Delete From Tbl_Vendas
Where Id_Vendas = '1'

/****Exercicio 20****/
Insert Into Tbl_Vendas
Values
('2','2','5','79.90','2002-10-13'),('3','3','3','49.99','1999-07-22'),
('4','4','7','89.00','2003-12-02'),('5','5','42','69.99','2009-03-22'),
('6','6','9','39.99','2006-08-11'),('7','7','1','129.99','2000-11-17'),
('8','8','20','19.99','2022-04-18'),('9','9','8','159.99','1992-01-27'),
('10','10','12','29.99','1957-03-10'),('11','11','16','200.00','2001-06-29')

select * from Tbl_Vendas
select * from Tbl_Funcionarios
select * from Tbl_Pedidos
select * from Tbl_Produtos
select * from Tbl_Clientes
