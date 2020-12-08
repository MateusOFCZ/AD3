

# Como Utilizar
Para utilizar este projeto em é preciso configurar todas as classes do pacote *DAO*, altere as informações do banco de dados no método *getConexao*, não se esqueça de inserir o *[SQL](https://github.com/MateusOFCZ/AD3/blob/main/Adicionais/SQL.sql)* em seu servidor!
É necessário o Plugin [*Regex*](https://github.com/MateusOFCZ/AD3/raw/main/Adicionais/Regex.nbm) e o [*MySQLConnector*](https://github.com/MateusOFCZ/AD3/raw/main/Adicionais/mysql-connector-java-8.0.22.jar).
> Recomendamos a utilização do [*MySQLConnector*](https://github.com/MateusOFCZ/AD3/raw/main/Adicionais/mysql-connector-java-8.0.22.jar) e do Plugin [*Regex*](https://github.com/MateusOFCZ/AD3/raw/main/Adicionais/Regex.nbm), para evitar erros na execução do projeto!
> 
> Fique a vontade para abrir uma *issue* para tirar dúvidas ou obter ajuda!

# Possíveis Problemas
 - **Erro no driver de conexão:**
	 1. Importe o *[*MySQLConnector*](https://github.com/MateusOFCZ/AD3/raw/main/Adicionais/mysql-connector-java-8.0.22.jar)*.
	 2. Se o erro persistir faça a depuração e verifique o console de debug.
	 3. Caso aconteça algum outro problema, ou não consiga resolver baixe o [*AD3.zip*](https://github.com/MateusOFCZ/AD3/raw/main/Adicionais/AD3.zip), onde contém o projeto com todos os arquivos disponíveis.

# Instalar Plugin *Regex*
Abra o NetBeans, clique em *Tools*/*Ferramentas* selecione *Plugin*/*Plug-ins*.
!["Tools"/"Ferramentas" > "Plugin"/"Plug-ins"](https://i.imgur.com/HgOzFo0.png)

Selecione *Downloaded*/*Obtidos Por Download* clique em *Add Plugins...*/*Adicionar Plug-ins...* adicione o arquivo [*Regex.nbm*](https://github.com/MateusOFCZ/AD3/blob/main/Adicionais/Regex.nbm)!
!["Downloaded"/"Obtidos Por Download" > "Add Plugins..."/"Adicionar Plug-ins..." > "Regex.nbm"](https://i.imgur.com/v1JYg5F.png)

# Informações de Teste
Este projeto já está com um banco de dados para testes, utilize as informações de login abaixo:
|   Nível de Acesso   |       E-Mail        | Senha |        Tipo        |                               Descrição                               |
|:-------------------:|:-------------------:|:-----:|:------------------:|:----------------------------------------------------------------------|
|          0          |    ad3_0@unisul.br  |  123  |  Usuário Suspenso  | O usuário não poderá fazer o login, irá exibir uma mensagem de aviso. |
|          1          |    ad3_1@unisul.br  |  123  |       Usuário      |            Pode fazer denúncias e gerenciar suas denúncias.           |
|          2          |    ad3_2@unisul.br  |  123  |     Colaborador    |                     Pode gerenciar denúncias.                         |
|          3          |    ad3_3@unisul.br  |  123  |     Colaborador    |                  Pode gerenciar denúncias e usuários.                 |
|          4          |    ad3_4@unisul.br  |  123  |     Colaborador    |        Pode gerenciar denúncias, usuários e código de registro.       |
