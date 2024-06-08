/*****Exercicio 1*****/
Select f.nrfatura, f.datafatura, c.codcliente, c.nome
From fatura f
JOIN cliente c On f.codcliente = c.codcliente
Order By c.nome;

/*****Exercicio 2*****/
Select p.codproduto, p.descricao, p.preco, f.nomeforn, p.saldo
From produto p
JOIN fornecedor f On p.codforn = f.codforn
Order By  p.descricao;

/*****Exercicio 3*****/
Select i.nrfatura, Sum(i.qtde * i.valor) As valor_total
From itens_fatura i
Group By  i.nrfatura;

/*****Exercicio 4*****/
Select f.nomeforn, Sum(p.saldo) As quantidade_de_produtos
From fornecedor f
JOIN produto p On f.codforn = p.codforn
Group By  f.nomeforn;

/*****Exercicio 5*****/
Select i.nrfatura, Count(*) As quantidade_de_itens
From itens_fatura i
Group By i.nrfatura;

/*****Exercicio 6*****/
Select c.nome, Sum(i.qtde * i.valor) As valor_total_comprado_cliente
From itens_fatura i
Join fatura f On i.nrfatura = f.nrfatura
Join cliente c On f.codcliente = c.codcliente
Group By c.nome;

/*****Exercicio 7*****/

/*****Exercicio 8*****/

/*****Exercicio 9*****/

/*****Exercicio 10*****/


select * from cliente
select * from produto
select * from fornecedor
select * from fatura
select * from itens_fatura
