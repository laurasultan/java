create database if not exists loja_laura;
use loja_laura;
create table if not exists vendedores(
	codigo int primary key auto_increment,
    nome varchar(20) not null,
    cpf char(14) not null unique key,
    salario decimal(6,2) not null
);

create table if not exists clientes(
	codigo int primary key auto_increment,
    nome varchar(20) not null,
    cpf char(14) not null unique key,
    pontos_de_fidelidade mediumint
);

create table if not exists produtos(
	sku varchar(15) primary key,
    codigo_de_barra bigint not null unique key,
    nome varchar(20) not null,
    preco decimal(6,2) not null,
    qtd_em_estoque smallint not null
);

create table if not exists vendas(
	codigo int primary key auto_increment,
    data_da_venda date not null,
    codigo_do_vendedor int not null,
    codigo_do_cliente int not null,
    constraint fk_codigo_vendedor foreign key (codigo_do_vendedor) references vendedores(codigo),
    constraint fk_codigo_cliente foreign key  (codigo_do_cliente) references clientes(codigo)
);

create table if not exists itens(
	codigo_produto varchar(15) not null,
    codigo_venda int not null,
    quantidade tinyint not null,
    primary key (codigo_produto, codigo_venda),		-- constraint pk_itens
    constraint fk_produto_item foreign key (codigo_produto) references produtos(sku),
    constraint fk_venda_item foreign key (codigo_venda) references vendas(codigo)
);