/****Exercicio 1****/
SELECT * from clientes

/****Exercicio 2****/
select * from FILME

/****Exercicio 3****/
select * from CATEGORIA

/****Exercicio 4****/
select * from CLIENTES where sexo = 'M'and cidade = 'Sorocaba'

/****Exercicio 5****/
select NOME, TELEFONE 
from CLIENTES
order by NOME asc

/****Exercicio 6****/
select * from clientes where sexo = 'F'

/****Exercicio 7****/
select * from CATEGORIA 
order by NOME_CATEGORIA asc

/****Exercicio 8****/ 
select * from FILME
where DIRETOR = 'Shawn Levy' and RESERVADA = 'n'

/****Exercicio 9****/ 
select * from FILME
where VALOR_LOCACAO > 5 and RESERVADA = 'n'

/****Exercicio 10****/ 
select distinct DIRETOR from filme

/****Exercicio 11****/ 
select count(reservada) from FILME
where RESERVADA = 'n'

/****Exercicio 12****/ 
select max(valor_locacao) from filme

/****Exercicio 13****/ 
select FILME, NOME_CATEGORIA from FILME,CATEGORIA
where NOME_CATEGORIA = 'Ação'

/****Exercicio 14****/ 
select FILME, NOME_CATEGORIA, RESERVADA, VALOR_LOCACAO from FILME,CATEGORIA
where RESERVADA = 's' and VALOR_LOCACAO < 5 and (NOME_CATEGORIA = 'Ação' or NOME_CATEGORIA ='Romance')

/****Exercicio 15****/ 
select FILME, NOME from CLIENTES,LOCACOES,FILME
where LOCACOES.COD_CLIENTE = CLIENTES.COD_CLIENTE AND NOME = 'Renata Cristina' AND  FILME.COD_FILME = LOCACOES.COD_FILME
 
/****Exercicio 16****/ 
select CLIENTES.COD_CLIENTE, CLIENTES.NOME, count(LOCACOES.COD_LOCACAO) as Total_Locacoes
from CLIENTES
JOIN LOCACOES  on CLIENTES.COD_CLIENTE = LOCACOES.COD_CLIENTE
group by CLIENTES.COD_CLIENTE, CLIENTES.NOME
having count(LOCACOES.COD_LOCACAO) > 3;

/****Exercicio 17****/ 
select c.NOME, sum(f.VALOR_LOCACAO) AS Total_Gasto
from CLIENTES c
JOIN LOCACOES l ON c.COD_CLIENTE = l.COD_CLIENTE
JOIN FILME f ON l.COD_FILME = f.COD_FILME
where c.NOME = 'Renata Cristina'
group by c.NOME;

/****Exercicio 18****/ 
select avg(VALOR_LOCACAO) as Media_Valor_Locacao
from FILME;

/****Exercicio 19****/ 
select min(VALOR_LOCACAO) as Menor_Valor_Locacao
from FILME;
select * from FILME

/****Exercicio 20****/ 
select c.NOME_CATEGORIA, count(f.COD_FILME) as Quantidade_Filmes
from CATEGORIA c
JOIN FILME f on c.COD_CATEGORIA = f.COD_CATEGORIA
group by c.NOME_CATEGORIA;