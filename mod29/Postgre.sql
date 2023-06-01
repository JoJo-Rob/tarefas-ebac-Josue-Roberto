create table tb_cliente_2 (
    id bigint,
    nome varchar(50) not null,
    codigo varchar(50) not null,
    constraint pk_id_cliente primary key(id)
);

create sequence sq_cliente_2
start 1
increment 1
owned by tb_cliente_2.id;

select * from tb_cliente_2;
drop table tb_cliente_2;

insert into tb_cliente_2 values(1,'Josué','jo099');

create table tb_produto (
    id bigint,
    nome varchar(50) not null,
    codigo varchar(50) not null,
    constraint pk_id_produto primary key(id)
);

create sequence sq_produto
start 1
increment 1
owned by tb_produto.id;

select * from tb_produto;
drop table tb_produto;

insert into tb_produto values(1,'Josué1','jo099');
