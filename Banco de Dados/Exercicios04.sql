/****Exercicio 1****/
select f.COD_FILME, count(l.DATA_RETIRADA) as Vezes_Retirada from FILME f
inner Join LOCACOES l on f.COD_FILME = l.COD_FILME
group by f.COD_FILME

/****Exercicio 2****/
select f.FILME, l.DATA_DEVOLUCAO from FILME f
inner Join LOCACOES l on f.COD_FILME = l.COD_FILME
inner join CLIENTES c on c.COD_CLIENTE = l.COD_CLIENTE
where c.NOME = 'Edson Martin Feitosa' and f.DIRETOR = 'Richard Donner'

/****Exercicio 3****/
select FILME, (VALOR_LOCACAO * 0.10) as DESCONTO,
(VALOR_LOCACAO - (VALOR_LOCACAO * 0.10)) as VALOR_FINAL
from FILME

/****Exercicio 4****/
select distinct f.FILME from FILME f
inner Join LOCACOES l on f.COD_FILME = l.COD_FILME
inner join CLIENTES c on c.COD_CLIENTE = l.COD_CLIENTE
where c.CIDADE = 'Votorantim'

/****Exercicio 5****/
select f.FILME from FILME f
inner Join LOCACOES l on f.COD_FILME = l.COD_FILME
where l.DATA_RETIRADA = GETDATE()

/****Exercicio 6****/
select f.FILME, (f.VALOR_LOCACAO * count(*)) as Lucro from FILME f
inner Join LOCACOES l on f.COD_FILME = l.COD_FILME
where f.FILME = 'A vida é bela'
group by f.FILME, f.VALOR_LOCACAO

/****Exercicio 7****/
select f.DIRETOR, count(l.DATA_RETIRADA) as Saidas from FILME f
inner Join LOCACOES l on f.COD_FILME = l.COD_FILME
group by f.DIRETOR

/****Exercicio 8****/
select f.FILME, cat.NOME_CATEGORIA from CATEGORIA cat
inner join FILME f on f.COD_CATEGORIA = cat.COD_CATEGORIA
inner join LOCACOES l on l.COD_FILME = f.COD_FILME
inner join CLIENTES c on l.COD_CLIENTE = c.COD_CLIENTE
where c.NOME = 'Maria Chiquinha'


/****Exercicio 9****/
select c.NOME, c.TELEFONE from CLIENTES c
inner join LOCACOES l on l.COD_CLIENTE = c.COD_CLIENTE
inner Join FILME f on f.COD_FILME = l.COD_FILME
where f.FILME = 'Constantine'

/****Exercicio 10****/
select cat.NOME_CATEGORIA from CATEGORIA cat
left join FILME f on f.COD_CATEGORIA = cat.COD_CATEGORIA
where f.COD_CATEGORIA is null