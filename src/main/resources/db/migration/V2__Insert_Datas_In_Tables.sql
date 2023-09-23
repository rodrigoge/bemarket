INSERT INTO public.market(
	id, name, opening_time, closing_time, phone_number, mobile_number) VALUES
	(1, 'Supermercado MaxSul', '2022-01-01 07:00:00.000', '2022-01-01 18:00:00.000', '(35) 3651-1415', '(35) 9 9100-9100');

INSERT INTO public.market(
	id, name, opening_time, closing_time, phone_number, mobile_number) VALUES
	(2, 'Supermercado Unissul SA', '2022-01-01 07:00:00.000', '2022-01-01 20:00:00.000', '(35) 3651-1010', '(35) 9 9101-9101');

INSERT INTO public.market(
	id, name, opening_time, closing_time, phone_number, mobile_number) VALUES
	(3, 'Mercadinho Eldorado', '2022-01-01 07:00:00.000', '2022-01-01 20:00:00.000', '(35) 3651-1111', '(35) 9 9102-9102');

INSERT INTO public.market(
	id, name, opening_time, closing_time, phone_number, mobile_number) VALUES
	(4, 'Mercadinho Azul', '2022-01-01 07:00:00.000', '2022-01-01 20:00:00.000', '(35) 3651-1212', '(35) 9 9103-9103');

INSERT INTO public.market(
	id, name, opening_time, closing_time, phone_number, mobile_number) VALUES
	(5, 'Mercadinho Dois Irmãos', '2022-01-01 07:00:00.000', '2022-01-01 20:00:00.000', '(35) 3651-1313', '(35) 9 9104-9104');

INSERT INTO public.product(
	id, name, price)
	VALUES (1, 'Biscoito Passatempo Pacote 130g', 3.99);

INSERT INTO public.product(
	id, name, price)
	VALUES (2, 'Biscoito Passatempo Pacote 130g', 3.69);

INSERT INTO public.product(
	id, name, price)
	VALUES (3, 'Pão de Forma Tradicional Visconti Pacote 400g', 5.99);

INSERT INTO public.product(
	id, name, price)
	VALUES (4, 'Refrigerante Coca-Cola sem Açúcar 350ml', 3.99);

INSERT INTO public.product(
	id, name, price)
	VALUES (5, 'Arroz Prato Fino Tipo 1 - 5 Kg', 19.89);

INSERT INTO public.product(
	id, name, price)
	VALUES (6, 'Arroz Prato Fino Tipo 1 - 5 Kg', 16.39);

INSERT INTO public.product(
	id, name, price)
	VALUES (7, 'Arroz Unissul - 5 Kg', 16.89);

INSERT INTO public.product(
	id, name, price)
	VALUES (8, 'Café Brasópolis - 1 Kg', 7.99);

INSERT INTO public.market_product(
	id, market_id, product_id)
	VALUES (1, 1, 1);

INSERT INTO public.market_product(
	id, market_id, product_id)
	VALUES (2, 2, 2);

INSERT INTO public.market_product(
	id, market_id, product_id)
	VALUES (3, 3, 5);

INSERT INTO public.market_product(
	id, market_id, product_id)
	VALUES (4, 2, 4);

INSERT INTO public.market_product(
	id, market_id, product_id)
	VALUES (5, 5, 6);

INSERT INTO public.market_product(
	id, market_id, product_id)
	VALUES (6, 1, 8);

INSERT INTO public.market_product(
	id, market_id, product_id)
	VALUES (7, 1, 3);

INSERT INTO public.market_product(
	id, market_id, product_id)
	VALUES (8, 1, 6);

INSERT INTO public.market_product(
	id, market_id, product_id)
	VALUES (9, 1, 7);

INSERT INTO public.market_product(
	id, market_id, product_id)
	VALUES (10, 4, 8);