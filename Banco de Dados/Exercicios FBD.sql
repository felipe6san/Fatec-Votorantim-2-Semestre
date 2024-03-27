create table Setor (
codSetor int identity(1,1),
nomeSetor varchar(30) not null,
constraint PK_Setor Primary Key (codSetor));

create table Funcionario (
nrMatricula int identity(1,1),
primeiroNome varchar(20),
ultimoNome varchar(50),
email varchar(200),
telefone varchar(20),
dataAdmissao date,
salario decimal(7,2),
codSetor int,
constraint PK_Funcionario Primary Key (nrMatricula),
constraint FK_Func_Setor Foreign Key(codSetor) references Setor(codSetor));

insert into Setor values
('Demacia'),
('Noxus'),
('Freljord'),
('Shurima'),
('Piltover');
 
insert into Funcionario values
('Darius', 'Noxus', 'darius@example.com', '123456789', '2022-01-15', 4000.00, 1),
('Garen', 'Demacia', 'garen@example.com', '987654321', '2022-02-28', 3500.00, 1),
('Katarina', 'Noxus', 'katarina@example.com', '456789123', '2022-03-10', 3200.00, 1),
('Ashe', 'Freljord', 'ashe@example.com', '321654987', '2022-04-05', 3800.00, 4),
('Azir', 'Shurima', 'azir@example.com', '789123456', '2022-05-20', 4200.00, 5),
('Caitlyn', 'Piltover', 'caitlyn@example.com', '654987321', '2022-06-15', 4500.00, 5),
('Jinx', 'Piltover', 'jinx@example.com', '123789456', '2022-07-02', 3000.00, 3),
('Lux', 'Demacia', 'lux@example.com', '789456123', '2022-08-10', 3200.00, 3);


select * from Funcionario

select primeiroNome, salario
from Funcionario
where salario between 3000 and 4000


select cod_produto, descricao
from produto
where Valor_unitario between 0.32 and 2.00

select primeiroNome, salario, codSetor
from Funcionario
where primeiroNome like '%a%'

select primeiroNome, salario, codSetor
from Funcionario
where primeiroNome like 'a%'

select cod_produto, descricao, Unidade
from produto
where Unidade like 'K%'

select nome_vendedor
from vendedor
where faixa_comissao in ('A','B')

select primeiroNome, salario, codSetor
from Funcionario
where codSetor in (1,3)

select *
from Funcionario f
where codSetor Not in(1,3)

select *
from cliente
where IE is not null

select primeiroNome, salario, codSetor
from Funcionario
where email is null

select primeiroNome, salario, codSetor
from Funcionario
where email is not null

select nrMatricula, ultimoNome, salario
from Funcionario
where salario > 1000 and nrMatricula >= 3

select *
from Funcionario
where salario > 2500 or codSetor = 4

select descricao
from produto
where Unidade = 'M' and Valor_unitario = 1.05

select descricao
from produto
where Unidade = 'UN' and Valor_unitario = 4

select nome_vendedor, salario_fixo
from vendedor
order by nome_vendedor

select *
from Funcionario f
where codSetor not in (2,4)
order by codSetor

select *
from Funcionario f
where codSetor not in (2,4)
order by codSetor desc

select *
from Funcionario f
where codSetor not in (2,4)
order by codSetor, primeiroNome

create table Pessoa
(
id_pessoa integer primary key,
nome varchar(20),
cpf varchar(14)
);

create table Pessoa_Fisica
(
id_pessoa integer primary key,
nome varchar(20),
cpf varchar(14)
);

Insert Into Pessoa
Values
('1','Pedro Cabral','123456789')


Insert Into Pessoa
Values
('2','Andre Lima','123456798')

Insert Into Pessoa_Fisica
Select Id_Pessoa, nome, cpf 
from Pessoa

select * from Pessoa_Fisica

select Funcionario.primeiroNome,Funcionario.salario, Setor.nomeSetor
from Funcionario, Setor

select Funcionario.primeiroNome,Funcionario.salario, Setor.nomeSetor
from Funcionario, Setor
where Funcionario.codSetor = Setor.codSetor

select f.primeiroNome,f.salario, s.nomeSetor
from Funcionario f, Setor s
where f.codSetor = s.codSetor