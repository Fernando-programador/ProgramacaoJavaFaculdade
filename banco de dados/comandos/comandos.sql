
						#criar tabela
create database bar;
use bar;
create table pessoas(
id int not null auto_increment,
nome varchar(30) not null,
nascimento date,
sexo enum('M', 'F'),
peso decimal(5,2),
altura decimal(3,2),
nacionalidade varchar(20) default 'Brasil',
primary key(id)


) default charset = utf8;

						#abrir banco
use bar;


						#inserir dados
insert into pessoas values
(default, 'Rafaela','1990-12-24','F','58','1.80','Alemanha'),
(default, 'Jonas','1978-10-17','M','76','1.64','Brasil'),
(default, 'Fabio','1976-08-30','M','60','1.59','Japao'),
(default, 'Josias','1981-06-29','M','94','2.02','italia'),
(default, 'Ronaldo','1986-10-14','M','110','1.98','Argentina'),
(default, 'Patricia','2008-08-01','F','78','1.64','Chile'),
(default, 'Eloa','2001-08-12','F','52','1.58','Russia'),
(default, 'Santina','1997-03-20','F','68','1.74','Brasil'),
(default, 'Maria','1998-09-10','F','58','1.70','Portugal');


						#ver tabela
select * from pessoas;

						#atributos da tabela
desc pessoas;

						#alterar tabela
alter table pessoas
add column profissao varchar(15);

alter table pessoas
add column profissao varchar(15) after nome;

alter table pessoas
add column teste varchar(15) first;

						#deletar atributo
alter table pessoas
drop column profissao;

alter table pessoas
drop column teste;

						#modificar
                        
alter table pessoas
modify column profissao varchar(20) not null default'';                      

alter table pessoas
change column altura alt decimal(3,2); 

alter table pessoinha
rename to pessoas; 

create table if not exists curso(
nome varchar(30) not null unique,
descricao text, 
cargaHoraria int, 
totalAulas int,
ano year default '2018'
) default charset = utf8;
                        
alter table curso
add column id int not null primary key first;

desc curso;

alter table curso
modify totalAulas int unsigned;

alter table curso
change id idCurso int not null;


