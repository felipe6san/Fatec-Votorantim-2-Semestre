/*
Create Table Cliente
(
Cod_Cli int not null,
Nome_Cli varchar(40) not null,
Endereço_Cli varchar(30) not null,
Bai_Cli varchar(20) not null,
Cid_Cli varchar(20) not null,
Uf_Cli char(3) not null,
Tel_Cli varchar(15) null,
Constraint PK_Cliente Primary Key(Cod_Cli)
)
CRIAÇÃO DE TABELA CLIENTE*/

/*
Create Table NotaFiscal
(
Num_Nota int not null,
Cod_Cli int not null,
Serie_Nota varchar(10) not null,
Emissao_Nota smalldatetime null,
Vtot_Nota SmallMoney not null,
Constraint PK_NotaFiscal Primary Key(Num_Nota),
Constraint FK_Cliente Foreign Key(Cod_Cli) References Cliente(Cod_Cli)
)
CRIAÇÂO TABELA NOTA FISCAL*/

Create Table Cidade
(
Codcidade varchar(2) not null,
Nomecidade varchar(40)
)

Create Table Empregado
(
Nrmatricula int,
Nome varchar(50),
Data_demissao datetime,
Salario float
)

Create Table Estado
(
cdestado varchar(2) not null,
Nomeestado varchar(30)
)

Alter Table Cidade
Add Primary Key(Codcidade)

Alter Table Cidade
Add Cid_Estado char(2) not null,
teste varchar(1) null;

Alter Table Cidade
Drop Column teste;

Alter Table Cidade
Alter Column Cid_Estado varchar(2);

Alter Table Cidade
Drop Constraint PK__Cidade__9ED2CA96F3FAFDB2

Alter Table Cidade
Add Constraint PK_Cod_Cidade Primary Key (Codcidade);

Alter Table Estado
Add Primary Key (cdestado)

Alter Table Cidade
Add Foreign Key (Cid_Estado) References Estado (cdestado)

Drop Table Empregado