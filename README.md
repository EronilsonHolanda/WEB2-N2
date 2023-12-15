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

- Listar todos os eventos: GET http://localhost:8080/api/eventos

- Obter um evento específico: GET http://localhost:8080/api/eventos/{id}

- Criar um novo evento: POST http://localhost:8080/api/eventos (com o corpo da requisição contendo os dados do evento)

- Atualizar um evento existente: PUT http://localhost:8080/api/eventos/{id} (com o corpo da requisição contendo os dados atualizados do evento)

- Excluir um evento: DELETE http://localhost:8080/api/eventos/{id}

# Front-End:

- A Interface do Usuário proporciona uma experiência amigável para interação com o sistema de gerenciamento de eventos.
  
- Permite aos usuários criar novos eventos, visualizar uma lista de eventos existentes e acessar formulários para editar ou excluir eventos específicos.
  
- Utiliza páginas Thymeleaf para renderização dinâmica do conteúdo HTML, tornando a interface responsiva e interativa.

# Back-End:

- A Lógica de Negócios, gerenciada pelo Back-End, implementa operações CRUD para manipular eventos.
  
- O EventoController gerencia as interações com a interface web, enquanto o EventoRestController fornece uma API RESTful para operações externas.
  
- A segurança básica é implementada com um usuário "admin" e senhas criptografadas.
  
- A persistência de dados é realizada por meio do Spring Data JPA, permitindo uma integração fácil com o banco de dados MySQL.

# Banco de Dados:

- O Banco de Dados armazena e recupera dados relacionados a eventos, proporcionando uma fonte confiável de informações persistidas.
  
- A estrutura do banco de dados é gerenciada automaticamente pelo Spring Boot, garantindo consistência e integridade dos dados.

# API RESTful:

- O EventoRestController expõe uma API RESTful para interação externa com os recursos de eventos.
  
- A API permite a listagem de todos os eventos, obtenção de detalhes de eventos específicos, criação de novos eventos, atualização de informações de eventos existentes e exclusão de eventos.
  
- As respostas da API são formatadas em JSON, seguindo boas práticas de design RESTful.

