# Bootcamp Orange Talents 

Conteúdo: https://github.com/zup-academy/nosso-cartao-documentacao/tree/master/orange-talent-4

## Desafio Casa do Código

Implementar uma API que simule a editora Casa do Código.

Requisitos: https://github.com/zup-academy/nosso-cartao-documentacao/tree/master/orange-talent-4/treino-casa-do-codigo  

## Tecnologias utilizadas:
- Kotlin
- Micronaout
- Gradle
- Postgres


### Curso oferecido pela Zup Edu
- [O que é Micronaut?](https://www.youtube.com/watch?v=FdxStVYU8xM&feature=youtu.be)
- [Setup de um projeto utilizando Micronaut](https://www.youtube.com/watch?v=vojSldrKV8Y&feature=youtu.be)
- [Configuração do IntelliJ para o Micronaut](https://www.youtube.com/watch?v=dBXbbrG_UWU&feature=youtu.be)
- [Recebendo dados via JSON](https://www.youtube.com/watch?v=PWBEwECz4y4&feature=youtu.be)
- [Validando os dados de entrada de uma requisição](https://www.youtube.com/watch?v=Vw1uB_8EeX4&feature=youtu.be)
- [Conversão de um objeto de entrada para um objeto de domínio](https://www.youtube.com/watch?v=Hoi3-Plm0uo&feature=youtu.be)
- [Gravando os dados com Micronaut Data](https://www.youtube.com/watch?v=pWu2mqaKFEc&feature=youtu.be)
- [Fluxo completo para salvar um objeto no banco de dados](https://www.youtube.com/watch?v=cACkiymv-2Q&feature=youtu.be)
- [Retornando dados em JSON](https://youtu.be/PML9YWZUnbk)
- [Definindo headers e status customizados](https://youtu.be/wgvIFkR5ea0)
- [Recebendo dados via PUT](https://youtu.be/awdppj2o7J0)
- [Recebendo dados via DELETE](https://youtu.be/plojIuEWIPM)
- [Métodos que geram queries no Micronaut Data](https://youtu.be/cph_Ei7tulY)
- [Mapeando queries explicitamente no Micronaut Data](https://youtu.be/58rBJ1EmJ3o)
- [Demarcação de transação](https://youtu.be/DS5g3ZNZHRc)
- [Consumindo um endpoint REST com Micronaut de forma declarativa](https://www.youtube.com/watch?v=9nPRHbToxAc&feature=youtu.be)
- [Configurando seu HTTP client com Micronaut para trabalhar com XML em vez de JSON](https://www.youtube.com/watch?v=4MG_H-lKydI&feature=youtu.be)
- [Implementando Validação customizada com Micronaut Validation](https://www.youtube.com/watch?v=UCHFApcJVW0&feature=youtu.be)
- [Micronaut Testing - como testar uma API REST](https://www.youtube.com/watch?v=eTA32xkQiLI)
- [Micronaut Testing - como criar mocks com Micronaut](https://www.youtube.com/watch?v=2bx1cgZEZuw)
- [Micronaut Testing - como criar mocks com Micronaut](https://www.youtube.com/watch?v=gARN_7QtNfM)


*Comandos Docker*

- Criar o container: docker run -it --name postgres -e POSTGRES_PASSWORD=root -p 5433:5432 -d postgres    
- Acessar o container: docker exec -it postgres bash     
- Acessando o banco: psql -U postgres    

*Comandos Postgres*

- \c conectar acessar a base de dados    
- \d	Lista as tabelas contidas em sua base  
- \d nome da tabela	Descreve todos os atributos da tabela e suas propriedades  
- \g	Executa determinada query  
- \q	Sai do console psql  
- \i	/caminho/pasta/script.sql   Importar um script.sql  
- \timing —	Inicia ou para  o cronômetro para atividades  
- \dT+ —	Lista os tipos de dados do PG com detalhes  
- \cd —	Muda para outro diretório  
- \dt	Lista tabelas  
- \di	Lista indices  
- \ds	Lista sequências  
- \dv	Lista views  
- \dS	Lista tabelas do sistema  
- \dn	Lista esquemas  
- \dp	Lista privilégios  
- \e	Abre o editor vi com a última consulta  
- \o	Inicia ou termina a criação de arquivo. Ex.: \o arquivo.sql  
- \?	Ajuda geral dos comandos do psql  
- \h *	Exibe ajuda de todos os comandos  
- \encoding	Exibe codificação atual  
