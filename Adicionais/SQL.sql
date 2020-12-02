use u810777998_ad3;

CREATE TABLE `tb_usuario` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT UNIQUE,
  `email` varchar(100) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `nome_completo` varchar(200) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `rg` varchar(7) NOT NULL,
  `endereco` varchar(200) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `score` int NOT NULL default 100,
  `nivel_acesso` int(11) NOT NULL DEFAULT 1
);

CREATE TABLE `tb_denuncia` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `endereco` varchar(200) NOT NULL,
  `descricao` varchar(500) NOT NULL,
  `status` varchar(20) NOT NULL DEFAULT "Não Verificado" COMMENT 'Não Verificado - Verificado - Descartado',
  `prioridade` varchar(20) NOT NULL DEFAULT "Baixa" COMMENT 'Baixa - Média - Alta',
  `usuario` int NOT NULL,
  foreign key (`usuario`) references `tb_usuario` (`id`)
);

CREATE TABLE `tb_registro_codigos` (
`id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
`nivel_acesso` int(11) NOT NULL DEFAULT 1,
`usos` int NOT NULL DEFAULT 1,
`codigo` varchar(6) DEFAULT NULL
);