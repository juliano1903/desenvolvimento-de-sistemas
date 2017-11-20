insert into tipo_lance values (tipo_lance_id_seq.nextval, 'A qualquer momento é possível verificar o valor de todos os lances já gerados e qual o lance vencedor
no momento da consulta', 'Aberto');

insert into tipo_lance values (tipo_lance_id_seq.nextval,'Não é possível saber os lances já realizados. Apenas ao final do leilão os valores são tornados
públicos e o vencedor conhecido', 'Fechado');

insert into natureza_leilao values (natureza_leilao_id_seq.nextval, 'Usuários fazem lance de demanda para comprar um lote que um usuário pretende
disponibilizar pelo maior preço. Vence o participante que fez o maior lance de demanda primeiro entre todos
os lances, desde que seu lance seja maior do que o preço mínimo estabelecido pelo usuário responsável pelo
lote', 'Leilão de demanda');

insert into natureza_leilao values (natureza_leilao_id_seq.nextval, 'Usuário oferta um lote que outro usuário pretende adquirir pelo menor preço. Vence o
participante que fez o menor lance de oferta primeiro entre todos os lances, desde que seu valor seja inferior
ao preço máximo estabelecido pelo usuário responsável pelo lote', 'Leilão de oferta');

insert into categoria_item values (categoria_item_id_seq.nextval, 'Informática');

insert into categoria_item values (categoria_item_id_seq.nextval, 'Vestuário');

insert into categoria_item values (categoria_item_id_seq.nextval, 'Imóvel');

insert into categoria_item values (categoria_item_id_seq.nextval, 'Veículo');

insert into categoria_item values (categoria_item_id_seq.nextval, 'Mobiliário');

insert into item values (item_id_seq.nextval, 'Mouse gamer XYZ', 'Mouse', 1);

insert into item values (item_id_seq.nextval, 'Teclado gamer XYZ','Teclado', 1);

insert into item values (item_id_seq.nextval, 'Camaro 1979', 'Camaro', 4);

insert into item values (item_id_seq.nextval, 'Ford antigo','Ford Modelo T', 4);

insert into item values (item_id_seq.nextval, 'Motor V8 small block 5.4 de 250 cv brutos e, de 1965 em diante, um big block de 425 cv', 'Chevrolet Corvette', 4);

insert into item values (item_id_seq.nextval, 'SVT Cobra e seu V8 supercharged de 4,6 litros e 390 cv','Ford Mustang', 4);

insert into lote values (lote_id_seq.nextval, 'Lote de Itens e Informática');

insert into lote values (lote_id_seq.nextval, 'Lote de Carros Clássicos');

insert into usuario values (usuario_id_seq.nextval, '01386283002', 'llara.juliano@gmail.com', 'Juliano', '1');

insert into leilao values (leilao_id_seq.nextval, sysdate, sysdate, 123456, '123,456', 1, 1, 1, 1);

insert into leilao values (leilao_id_seq.nextval, sysdate, sysdate, 10456, '10,456', 2, 2, 2, 1);

insert into lance values (lance_id_seq.nextval, sysdate, 123456, '123.456', 1, 1);

insert into lance values (lance_id_seq.nextval, sysdate, 100456, '100.456', 1, 1);

insert into lance values (lance_id_seq.nextval, sysdate, 900456, '900.456', 1, 1);