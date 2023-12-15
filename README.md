# WEB2-N2

## Descrição da Aplicação:

A aplicação é um sistema de gerenciamento de eventos desenvolvido em Java com Spring Boot, projetado para facilitar operações essenciais relacionadas a eventos. 
A estrutura da aplicação adere a uma arquitetura de três camadas, compreendendo Front-End, Back-End e Banco de Dados, garantindo uma separação clara de responsabilidades e promovendo a modularidade e escalabilidade.

## Configurando o Banco de Dados

Para executar este projeto, você precisará iniciar um banco de dados MySQL e executar o seguinte script:

~~~sql
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
~~~

# Diagrama de Componentes

![Diagrama de Componentes](https://github.com/EronilsonHolanda/WEB2-N2/assets/127308928/2103d3f2-9843-48dd-b5e4-4d9561df420b)

# Endpoints da API Rest

Listar todos os eventos: GET http://localhost:8080/api/eventos

Obter um evento específico: GET http://localhost:8080/api/eventos/{id}

Criar um novo evento: POST http://localhost:8080/api/eventos (com o corpo da requisição contendo os dados do evento)
![post](https://github.com/EronilsonHolanda/WEB2-N2/assets/127308928/f11e7ffb-551e-480c-a243-b00d98f50bdd)

Atualizar um evento existente: PUT http://localhost:8080/api/eventos/{id} (com o corpo da requisição contendo os dados atualizados do evento)

Excluir um evento: DELETE http://localhost:8080/api/eventos/{id}


