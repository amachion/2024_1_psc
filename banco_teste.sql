CREATE database db_teste;
use db_teste;

create table tb_pessoa (
	codigo int not null auto_increment primary key,
    nome varchar(40)
);

insert into tb_pessoa (nome) 
    values ('Ana');
insert into tb_pessoa (nome)
	values ('Caio'),
           ('Johnny');
           
select * from tb_pessoa;
select * from tb_pessoa
	where codigo = 1;
    
select nome from tb_pessoa;
select codigo from tb_pessoa
	where nome='Caio';
    
delete from tb_pessoa
    where codigo=1;

insert into tb_pessoa (nome) values ('Rose');

create table tb_livro (
	isbn int not null primary key,
    titulo varchar(100),
    id_biblioteca varchar(12) unique
);

insert into tb_livro (isbn, titulo, id_biblioteca) 
    values (45678, 'UML - o livro', 'a1'),
           (34567, 'Bancos de dados', 'b2');
           
select * from tb_livro order by id_biblioteca;

delete from tb_livro where isbn = 12345;

insert into tb_livro (isbn, titulo, id_biblioteca) 
    values (98765, 'Boas praticas de programacao', 'a1');
    
update tb_livro set id_biblioteca='z5' where isbn = 34567;

CREATE TABLE `db_teste`.`autoria` (
  `codigo_autor` INT NOT NULL,
  `isbn_livro` INT NOT NULL,
  PRIMARY KEY (`codigo_autor`, `isbn_livro`),
  CONSTRAINT `FK_autor`
    FOREIGN KEY (`codigo_autor`)
    REFERENCES `db_teste`.`tb_pessoa` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_livro`
    FOREIGN KEY (`isbn_livro`)
    REFERENCES `db_teste`.`tb_livro` (`isbn`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE);

ALTER TABLE autoria RENAME tb_autoria;
insert into tb_autoria (codigo_autor, isbn_livro) values (3, 12345);
insert into tb_autoria (codigo_autor, isbn_livro) values (4, 34567);
select * from tb_autoria;