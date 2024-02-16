insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Mexicana');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Mar do caribe', '13.99', 2);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Bozzano', '10.99', 1);

insert into forma_pagamento (id, descricao) values (1, 'Cartão de crédito');

insert into permissao (id, nome, descricao) values (1, 'Consultar Produtos', 'Permite   consultar os produtos cadastrados');

insert into estado (id, nome) values (1, 'Minas Gerais');
insert into estado (id, nome) values (2, 'São Paulo');
insert into estado (id, nome) values (3, 'Ceará');

insert into cidade (id, nome, estado_id) values (1, 'Uberlândia', 1);
insert into cidade (id, nome, estado_id) values (2, 'Belo Horizonte', 1);
insert into cidade (id, nome, estado_id) values (3, 'São Paulo', 2);
insert into cidade (id, nome, estado_id) values (4, 'Campinas', 2);
insert into cidade (id, nome, estado_id) values (5, 'Fortaleza', 3);