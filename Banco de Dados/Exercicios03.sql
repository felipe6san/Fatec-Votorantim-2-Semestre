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

FROM CLIENTES

ORDER BY NOME ASC

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

select FILME, NOME_CATEGORIA, RESERVADA, VALOR_LOCACAO FROM FILME,CATEGORIA

WHERE RESERVADA = 's' and VALOR_LOCACAO < 5 and (NOME_CATEGORIA = 'Ação' or NOME_CATEGORIA ='Romance')

/****Exercicio 15****/ 

select FILME, NOME from CLIENTES,LOCACOES,FILME

where LOCACOES.COD_CLIENTE = CLIENTES.COD_CLIENTE AND NOME = 'Renata Cristina' AND  FILME.COD_FILME = LOCACOES.COD_FILME
 
/****Exercicio 16****/ 

SELECT CLIENTES.COD_CLIENTE, CLIENTES.NOME, COUNT(LOCACOES.COD_LOCACAO) AS Total_Locacoes

FROM CLIENTES

JOIN LOCACOES  ON CLIENTES.COD_CLIENTE = LOCACOES.COD_CLIENTE

GROUP BY CLIENTES.COD_CLIENTE, CLIENTES.NOME

HAVING COUNT(LOCACOES.COD_LOCACAO) > 3;

/****Exercicio 17****/ 

SELECT c.NOME, SUM(f.VALOR_LOCACAO) AS Total_Gasto

FROM CLIENTES c

JOIN LOCACOES l ON c.COD_CLIENTE = l.COD_CLIENTE

JOIN FILME f ON l.COD_FILME = f.COD_FILME

WHERE c.NOME = 'Renata Cristina'

GROUP BY c.NOME;

/****Exercicio 18****/ 

SELECT AVG(VALOR_LOCACAO) AS Media_Valor_Locacao

FROM FILME;

/****Exercicio 19****/ 

SELECT MIN(VALOR_LOCACAO) AS Menor_Valor_Locacao

FROM FILME;

select * from FILME

/****Exercicio 20****/ 

SELECT c.NOME_CATEGORIA, COUNT(f.COD_FILME) AS Quantidade_Filmes

FROM CATEGORIA c

JOIN FILME f ON c.COD_CATEGORIA = f.COD_CATEGORIA

GROUP BY c.NOME_CATEGORIA;