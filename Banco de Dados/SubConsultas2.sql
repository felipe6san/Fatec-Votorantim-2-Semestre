Select NomeCategoria From Categoria
Where CategoriaID in (Select CategoriaID From Produto Where Preco > 1000)
Union
Select NomeCategoria From Categoria
Where CategoriaID In (Select Produto.CategoriaID From Produto Join Pedido On Produto.ProdutoID = Pedido.ProdutoID);

Select NomeProduto From Produto Where Preco < 100
Union All
Select NomeProduto From Produto Where Preco > 1000;

Select NomeCategoria From Categoria
Where CategoriaID in (Select CategoriaID From Produto Where Preco > 1000)
Intersect
Select NomeCategoria From Categoria
Where CategoriaID In (Select Produto.CategoriaID From Produto Join Pedido On Produto.ProdutoID = Pedido.ProdutoID);

Select NomeCategoria From Categoria
Where CategoriaID in (Select CategoriaID From Produto Where Preco > 100)
Except
Select NomeCategoria From Categoria
Where CategoriaID In (Select Produto.CategoriaID From Produto Join Pedido On Produto.ProdutoID = Pedido.ProdutoID);

Create View ProdutosCaros As
Select NomeProduto, Preco From Produto
Where Preco > 1000;

Create View ProdutosMaisCarosPorCategoria As
Select Categoria.NomeCategoria,Produto.NomeProduto,Produto.CategoriaID From Categoria
Inner Join Produto On Categoria.CategoriaID = Produto.CategoriaID
Where Produto.Preco = (Select MAX(Preco) From Produto As P
	Where P.CategoriaID = Categoria.CategoriaID);

Select * From ProdutosCaros;
Select * From ProdutosMaisCarosPorCategoria