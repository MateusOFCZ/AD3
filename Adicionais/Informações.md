# **MODEL, VIEW, CONTROLLER e DAO:**
**Localização:** Pacotes do Projeto.

- **VIEW:** Instância objetos da camada *CONTROL* e envia dados brutos informados pelo usuário ou ações solicitadas pelo mesmo.
- **CONTROL:** Instancia objetos de camada *MODEL* e envia objetos completos para processamento.
- **MODEL:** Trata os dados, chama métodos de DAO e envia objetos para pessistência.
- **DAO:** Manipula o *Banco de Dados* para efetuar a persistência de dados.
	- **Chamada:** VIEW > CONTROL > MODEL > DAO

# **Public, Private e Protected:**
**Localização:** ``MODEL.LoginM`` linhas 17, 7 e 6.

- **+Public:** Visibilidade externa total.
- **-Private:** Nenhuma visibilidade externa.
- **#Protected:** Visibilidade externa limitada.

# **Herança: (SUPERCLASSE e SUBCLASSE - Extends e Super):**
**Localização:** ``CONTROLLER.InicioColaboradorC`` linha 3.

- **SUPERCLASE:** Classe existente.
- **SUBCLASSE:** Classe derivada.
	- A *SUBCLASSE* herda as características da *SUPERCLASSE*, ou seja, a *SUBCLASSE* herda os métodos e os atributos definidos pela *SUPERCLASSE*.

- **Extends:** Estabelece relação de herança, herda o código da classe estendida.
- **Super:** A fornecedora do código estendido passa a ser a *Super*.

# **OVERLOADING:**
**Localização:** ``MODEL.RegistroM`` linhas 29 e 35.

- Sobrecarrega métodos dentro da mesma classe, ou seja, métodos iguais com parâmetros diferentes.

# **OVERRIDING:**
**Localização:** ``CONTROLLER.InicioColaboradorC`` linha 4.
**Localização:** ``CONTROLLER.ConfiguracoesC`` linha 25.

- Sobrescreve os métodos entre a *SUBCLASSE* e *SUPERCLASSE*.

# **Modificador FINAL**
**Localização:** ``MODEL.ConfiguracoesM`` linha 5.

- Não pode ser estendida, ou seja, ninguém pode ser herdeiro da classe/método.

# **Modificador STATIC:**
**Localização:** ``MODEL.LoginM`` linha 6.

- Pode ser chamados sem a necessidade de instanciar um objeto.

# **Modificador ABSTRACT:**
**Localização:** Não implementado.

- São classes "modelo" para outras subclasses que herdam, no entanto, não podem ser instanciadas.

# **COLLECTIONS, ArrayList, Stack (Pilha), Queue (Fila):**
**Localização:** ``VIEW.MinhasDenuncias`` linha 305.

- **Collections:** São estruturas de dados pré-definidas, fornecidas pela API do Java, que são empregadas para armazenar grupos de objetos.
- **ArrayList:** A classe ArrayList é uma implementação da interface List que utiliza um vetor para armazenar elementos.
- **Stack (Pilha):** É um tipo abstrato de dado que consiste em uma coleção de coisas munida de duas operações: push, que insere uma coisa na coleção, e pop, que remove a coisa mais recente da coleção. (Portanto, a última coisa a entrar é a primeira a sair.)
- **Queue (Fila):** é uma forma especial linear, que permite apenas a eliminação na mesa dianteira e a extremidade traseira da operação de inserção tabela.

# **POLIMORFISMO:**
**Localização:** ``CONTROLLER.InicioColaboradorC`` linha 4.
**Localização:** ``CONTROLLER.ConfiguracoesC`` linha 25.

- *Polimorfismo* é um princípio a partir do qual as classes derivadas de uma única classe base são capazes de invocar os métodos que, embora apresentem a mesma assinatura, comportam-se de maneira diferente para cada uma das classes derivadas.
- Podemos dizer também que o *Polimorfismo* implementa a seleção correta dos métodos em tempo de execução. Exemplo *Override*.
- Para utilizarmos *Polimorfismo* não é obrigatório o uso de herança, porém os conceitos estão diretamente ligados.
