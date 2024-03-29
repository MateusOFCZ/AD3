# GitHub
O objetivo deste guia é ajudá-lo(a) com o GitHub e GitHub Desktop, uma maneira fácil de gerenciar os projetos sem a necessidade da utilização de linhas de comandos.

# GitHub Dekstop
Para começar, baixe o [GitHub Desktop](https://desktop.github.com/), com ele você poderá enviar as edições que você fizer no projeto direto para o GitHub. Além disso, pode facilmente verificar as edições que outras pessoas fizeram no projeto.

## Começando com o GitHub Desktop
Para começar, é necessário fazer o login no GitHub Desktop, caso você tenha se deparado com uma tela como a demonstrada abaixo, ou não sabe como fazer o login, siga os passos descritos logo abaixo da imagem.


![Primeira vez no GitHub Desktop](https://i.imgur.com/E0hgX12.png)
Se após abrir o GitHub desktop você foi direto para essa tela, é necessário fazer o login indo no menu superior no lado esquerdo em "File", selecione "Options...", veja abaixo:

![File > Options](https://i.imgur.com/kKvRrTX.png)


Depois vá em "Accounts" e clique em "Sign In" ao lado de "GitHub.com":
![Accounts > Sign In](https://i.imgur.com/XvawbfZ.png)


Aparecerá uma nova tela, clique em "Continue with browser", você será redirecionado para um "oAuth" do GitHub para permitir o GitHub Desktop o acesso a conta, pode ser necessário aguardar alguns segundos:

![Continue with browser > Authorize desktop](https://i.imgur.com/lx9UuJb.png)
Assim que liberar, clique em "Authorize desktop", dessa forma você irá autorizar o GitHub Desktop o acesso a sua conta. Lembre-se que pode ser necessário inserir a senha para confirmar.

## Clonando o projeto
Como estamos utilizando o GitHub Desktop, não é necessário nem um código para clonar o projeto, siga os passos abaixo:

Após logado deve aparecer os repositório no lado direito, como abaixo:

![GitHub Desktop repositórios](https://i.imgur.com/2mxh71d.png)


Caso não apareça, clique em "Clone a repository from the internet...", após isso, uma tela se abrirá, clique em "URL" e insira o link do projeto como na imagem abaixo:

![URL > Link do Projeto](https://i.imgur.com/rnvxBGI.png)


Se preferir, você pode alterar o local de salvamento, recomendo deixar o padrão. Depois de configurado, clique em "Clone", então uma nova tela aparecerá, e basta aguardar.
Com o fim da clonagem do projeto, aparecerá a seguinte tela:

![Repositório clonado](https://i.imgur.com/iCQ0Xum.png)


Agora veja a seguir os termos do GitHub e como executá-los.

# Termos do GitHub
## Branch
A Branch serve para quando você adicionar recursos ou faz modificações, dessa forma, será possível passar pela análise antes de implementar no repositório principal, lembre-se que é obrigatório a criação de Branch e não deve ser enviada para a Branch principal ("Main" e "Master"), veja como criar uma Branch:

Para criar uma Branch clique em "Current branch" e depois em "New branch":

![Current branch > New branch](https://i.imgur.com/6PUGME4.png)


Uma nova tela será aberta, vamos seguir o padrão "Nome/Branch" onde "Nome" é o seu nome, e "Banch" é o nome da Branch, ambos separados por uma barra (/), exemplo: "Vinicius/Strings":

![Nome/Branch](https://i.imgur.com/Kr9Cmbl.png)


Após a Branch ser criada, você precisará atualizar o GitHub Desktop, para isso, clique em "Fetch origin" e aguarde:

![Fetch origin](https://i.imgur.com/h25xsUE.png)


Assim que finalizar, volte para a mesma aba (Current branch) e selecione a Branch que você criou:

![Cureent branch](https://i.imgur.com/zGO3df9.png)


Após selecionar a branch, uma nova tela irá abrir, selecione a opção "Bring my changes to ---" (--- --- é o nome da Branch) e depois clique em "Switch branch":

![Bring my changes to --- > Switch branch](https://i.imgur.com/NDF1EaQ.png)


Sempre que fizer uma nova alteração e desejar criar uma Branch, siga os passos acima antes de fazer o Commit.

## Commit
O Commit serve para empacotar todo o código alterado, após finalizar alguma alteração, é necessário fazer o Commit, lembre-se de verificar se a alteração que você fez está completa e funcionando, veja abaixo como fazer o Commit.

![Edições feitas](https://i.imgur.com/eD5SzMx.png)

Quando algum arquivo é criado, ou feito alguma alteração no código, irá aparecer os arquivos em "Changes", você pode verificar as alterações abrindo o arquivo no menu "Changes", lembre-se que para editar é necessário ir pelo NetBeans.

Se você quiser fazer o Commit de apenas alguns arquivos, deixe selecionado o CheckBox apenas nos arquivos que deseja Commitar, em "Summary (required)", abaixo do nome dos arquivos, você deve colocar um título para a alteração, como no caso demonstrado na imagem, podemos colocar: "Edição de strings":

![Título do Commit](https://i.imgur.com/jA8hFQ4.png)


Já em "Description", coloque tudo o que foi feito de modificação, como por exemplo: "Adição de string, alteração de texto (string) na tela de login...", e assim por diante:

![Descrição da Commit](https://i.imgur.com/L37wrTV.png)


Se uma outra pessoa te ajudou nas modificações, é possível adicionar um "Co-autor", para isso clique no ícone de uma pessoa com o símbolo de mais (+), e insira o(s) nome de usuário (@username) da(s) pessoa(s) que ajudou(aram), lembre-se que você não deve adicionar o seu nome, se quiser remove-lô(s), basta clicar novamente no ícone:

![Co-autor](https://i.imgur.com/NAiIgyj.png)


Assim que finalizado, clique no botão "Commit to --- " (--- é o nome da Branch selecionada, certifique-se de que não esteja na Branch "Main" ou "Master"):

![Commit to ---](https://i.imgur.com/iSBow24.png)


Após isso, suas alterações já estarão Commitadas.

Porém caso apareça o seguinte erro:

![Erro global config](https://i.imgur.com/B7IxzHD.png)


Será necessário fazer a configuração global do Git, não se preocupe, esta configuração será necessária apenas uma única vez, siga os passos:

Abra o "Prompt de Comando" e digite os seguintes comandos:
`git config --global user.email "seuemail@seuemail.com"`, lembre-se de substitir o  "seuemail@seuemail.com" para o seu e-mail que você utilizou para fazer o login no GitHub Desktop, dê o enter e depois digite `git config --global user.name "Seu nome"`, substitua "Seu nome" apenas pelo seu primeiro nome, não é necessário ser o usuário (@username) do GitHub, e dê o enter. Após isso certifique-se de que o ícone foi alterado pela sua foto de perfil:

![Foto de perfil](https://i.imgur.com/WByhcHs.png)


E depois basta clicar novamente no botão "Commit to --- " (--- é o nome da Branch selecionada, certifique-se de que não esteja na Branch "Main" ou "Master").

## Push (Publish)
O Push será utilizado para enviar as alterações do Commit, ou seja, será necessário fazer o Push para enviar todas as alterações que você fez Commit ao repositório no GitHub, veja abaixo como fazer o Push.

Após o Commit ser concluído, uma nova tela abrirá, clique no botão "Publish branch", lembre-se que se caso você tenha deixado de fazer o Commit de algum arquivo, ainda é possível fazer o Push, basta clicar no botão do topo:

![Publish branch](https://i.imgur.com/dAd6g58.png)


Pronto, suas alterações foram publicadas.

## Pull Request
O Pull Request serve para avisar sobre as modificações feitas, para faze-lô, clique em "Create Pull Request", assim que finalizar o Push:

![Criando Pull Request](https://i.imgur.com/KTraTsD.png)


Você será redirecionado para o GitHub, onde você poderá modificar o título do Commit, e a descrição das modificações que foram feitas:

![Editando o Commit](https://i.imgur.com/COLauwc.png)


Após finalizar as modificações de texto, adicione um Reviewer, para isso clique em "Reviwers" e insira o @username do Mateus (@MateusOFCZ):

![Reviewer Mateus](https://i.imgur.com/zZEMbgT.png)


Agora adicione uma Label ao Pull Request, para isso clique em "Labels" e selecione as opções que se aplicam, se necessário, você pode adicionar mais de uma:

![Labels](https://i.imgur.com/VK4vSNb.png)


Agora, verifique que tudo está como o esperado, e crie o Pull Request, para criar, clique no botão "Create pull request":

![enter image description here](https://i.imgur.com/UjguGa2.png)


Pronto, suas alterações já estão prontas para serem analisadas e enviadas para o repositório principal.

## Pull
Após alguma alteração feita por outra pessoa, será necessário fazer o Pull, que nada mais é do que baixar todas as alterações feitas para o seu repositório local (seu PC), veja abaixo como fazer o Pull.

Para fazer o Pull, certifique-se de que você esteja na Branch principal ("Main" ou "Master"):

![Branch principal](https://i.imgur.com/4mTvyHL.png)


Se você estiver na Branch principal e deseja fazer o Pull, faça a verificação de alterações clicando em "Fetch origin":

![Fetch origin](https://i.imgur.com/5N9NL5B.png)


Se alguma alteração de código existir, aparecerá "Pull origin", clique nele para baixar as alterações de código:

![Pull origin](https://i.imgur.com/Bmatqfm.png)


Aguarde, e pronto, o seu repositório local (seu PC), estará atualizado.
Você pode fazer isso com outras Branchs, mais é recomendado sempre deixar o código atualizado com a Branch principal ("Main" ou "Master"), pois são códigos confiáveis, já que foram revisados e testados, sempre utilize-os para fazer novas modificações ou adicionar novos recursos.

# Abrindo o Projeto do Repositório no NetBeans
É necessário abrir o projeto clonado, para que qualquer alteração seja Commitada de forma mais fácil, veja os passos de como fazer isso.

Para iniciar, vamos verificar onde o projeto se encontra salvo, para isso, ao abrir o GitHub Desktop, clique em "Show in Explorer":

![Encontrando o projeto](https://i.imgur.com/ICjP8m0.png)


Uma pasta será aberta, veja se corresponde ao GitHub, e depois verifique o local em que está armazenada em seu computador, como mostra abaixo:

![Localização do projeto](https://i.imgur.com/sa175Kx.png)


No NetBeans, vá em "Arquivo" e depois em "Abrir Projeto...":

![Abrindo o projeto](https://i.imgur.com/hcuoDBw.png)


Uma pasta se abrirá, navegue até o local onde o projeto está, caso na instalação você não tenha alterado o local de armazenamento do GitHub Desktop, pode ser que esteja em "Documentos", abra a pasta "GitHub" e localize o projeto, lembre-se de entrar na pasta e navegar até aparecer uma xícara de café como ícone, selecione ele e clique em "Abrir Projeto":

![Importando o projeto](https://i.imgur.com/5psALBe.png)


Após a importação, verifique de que esteja tudo funcionando como o esperado, para isso, basta compilar o software. Em caso de erro, tente remover a pasta "AD3" que está localizado na pasta "GitHub" que vimos anteriormente, clone novamente o repositório, se o erro persistir, não deixe de nos avisar.

# Fim
Você chegou ao fim de como utilizar o GitHub e GitHub Desktop, sempre que precisar, você poderá consultar este guia, e qualquer dúvida, estamos a disposição!
