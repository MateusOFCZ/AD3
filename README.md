# Como Utilizar
Para utilizar este projeto é preciso configurar todas as classes do pacote "DAO", altere as informações do banco de dados no método "getConexao", não se esqueça de inserir o [SQL](https://github.com/MateusOFCZ/AD3/blob/main/Adicionais/SQL.sql) em seu servidor!
É necessário o Plugin "Regex" e o "MySQLConnector" disponível em [ADICIONAIS](https://github.com/MateusOFCZ/AD3/tree/main/Adicionais).

# Informações de Teste
Este projeto já está com um banco de dados para testes, utilize as informações de login abaixo:
 
|   Nível de Acesso   |       E-Mail        | Senha |        Tipo        |                               Descrição                               |
|:-------------------:|:-------------------:|:-----:|:------------------:|:---------------------------------------------------------------------:|
|          0          |    ad3_0@unisul.br  |  123  |  Usuário Suspenso  | O usuário não poderá fazer o login, irá exibir uma mensagem de aviso. |
|          1          |    ad3_1@unisul.br  |  123  |       Usuário      |            Pode fazer denúncias e gerenciar suas denúncias.           |
|          2          |    ad3_2@unisul.br  |  123  |     Colaborador    |                     Pode gerenciar denúncias.                         |
|          3          |    ad3_3@unisul.br  |  123  |     Colaborador    |                  Pode gerenciar denúncias e usuários.                 |
|          4          |    ad3_4@unisul.br  |  123  |     Colaborador    |        Pode gerenciar denúncias, usuários e código de registro.       |
