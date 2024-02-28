/*Insert into Estado
Values
('SP','São Paulo');

Insert into Cidade
Values
('1','Votorantim','SP')

Insert into Cidade(Codcidade,Nomecidade,Cid_Estado)
Values ('2','Sorocaba','SP');
*/

/*Insert into Cidade(Codcidade,Nomecidade,Cid_Estado)
Values ('3','Itu','NN');

Insert into Cidade(Codcidade,Nomecidade,Cid_Estado)
Values ('4','Itapira','NN');

Insert into Estado
Values
('NN','Não Cadastrado');

Update Cidade
Set Cid_Estado = 'SP'
Where Cid_Estado = 'NN'

Insert into Estado
Values
('RJ','Rio de Janeiro');

Insert into Cidade(Codcidade,Nomecidade,Cid_Estado)
Values ('5','Rio de Janeiro','RJ');
*/

/*where Cid_Estado = 'SP'
Where para selecionar o Estado*/

select * from Estado
select * from cidade

/*Update Cidade
Set Cid_Estado = 'RJ'
Where Cid_Estado = 'Rj'*/

Create Table Tb1_Clientes(
Codigo Int Identity(1,1) Primary Key,
Nome Varchar(100),
UF Varchar(2)
)

Insert Into Tb1_Clientes
(Nome,UF)
Values
('Nicholas','RS');

Insert Into Tb1_Clientes
(Nome,UF)
Values
('Felipe','SP');

Insert Into Tb1_Clientes
(Nome,UF)
Values
('André','RS');

Insert Into Tb1_Clientes
(Nome,UF)
Values('Bruce Wayne','SP'),('Tony Stark','RS'),('Diana Prince','PR')

select * from Tb1_Clientes
select IDENT_CURRENT('Tb1_Clientes') as Ultimo_registro;
