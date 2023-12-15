# WEB2-N2

## Projeto de Eventos

Este é um projeto de eventos que é composto por frontend e backend desenvolvido em HTML/CSS, Java Spring Boot e API REST.

## Configurando o Banco de Dados

Para executar este projeto, você precisará iniciar um banco de dados MySQL e executar o seguinte script:

```sql
CREATE USER 'eron'@localhost IDENTIFIED BY 'eron' ;

CREATE DATABASE evento ;

GRANT ALL ON evento.* TO 'eron' @localhost

    WITH GRANT OPTION ;
    
FLUSH PRIVILEGES ;

use evento ;

create table evento (

id bigint not null auto_increment ,

nome varchar ( 150 ) not null ,

local varchar ( 150 ) not null ,

agencia varchar ( 150 ) not null,

data varchar ( 150 ) not null ,

primary key ( id )
) ;
