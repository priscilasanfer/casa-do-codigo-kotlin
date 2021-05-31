## Micronaut 2.5.4 Documentation

- [User Guide](https://docs.micronaut.io/2.5.4/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.5.4/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.5.4/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

Criar o container: docker run -it --name postgres -e POSTGRES_PASSWORD=root -p 5433:5432 -d postgres  
Acessar o container: docker exec -it postgres bash   
Acessando o banco: psql -U postgres  

Comandos básicos:  
\c conectar acessar a base de dados    
\d	Lista as tabelas contidas em sua base  
\d nome da tabela	Descreve todos os atributos da tabela e suas propriedades  
\g	Executa determinada query  
\q	Sai do console psql  
\i	/caminho/pasta/script.sql   Importar um script.sql  
\timing —	Inicia ou para  o cronômetro para atividades  
\dT+ —	Lista os tipos de dados do PG com detalhes  
\cd —	Muda para outro diretório  
\dt	Lista tabelas  
\di	Lista indices  
\ds	Lista sequências  
\dv	Lista views  
\dS	Lista tabelas do sistema  
\dn	Lista esquemas  
\dp	Lista privilégios  
\e	Abre o editor vi com a última consulta  
\o	Inicia ou termina a criação de arquivo. Ex.: \o arquivo.sql  
\?	Ajuda geral dos comandos do psql  
\h *	Exibe ajuda de todos os comandos  
\encoding	Exibe codificação atual  