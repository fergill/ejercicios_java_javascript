


SELECT Tiendas.NOMBRE, Pedidos.FECHAENTREGA, Pedidos.TOTALPEDIDOS
FROM empresa.Tiendas
inner join empresa.Pedidos
	on Pedidos.TIENDA_ID = Tiendas.ID
ORDER BY Pedidos.FECHAENTREGA, Tiendas.NOMBRE ASC;