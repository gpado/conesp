# CONESP
O projeto CONESP é um sistema desenvolvido como parte de um desafio proposto pela FIAP. Este README fornece instruções sobre como configurar o banco de dados necessário para o projeto.

## Banco de Dados:

### Primeiro, crie o banco de dados:
CREATE DATABASE CONESP;

### Selecione esse banco de dados:
USE CONESP;

Agora, crie a tabela "CONTRATOS":  
CREATE TABLE CONTRATOS (  
    ID INT PRIMARY KEY AUTO_INCREMENT,  
    NOME VARCHAR(255) NOT NULL,  
    DOCUMENTO VARCHAR(18) NOT NULL,   
    NUMERO_APOLICE VARCHAR(50) NOT NULL,   
    VIGENCIA_INICIO DATE NOT NULL,  
    VIGENCIA_FIM DATE NOT NULL,  
    DATA_CADASTRO DATETIME DEFAULT CURRENT_TIMESTAMP,   
    STATUS CHAR(1) NOT NULL   
);


### Recomendações
Garanta que você tenha as permissões necessárias para criar e modificar bancos de dados.
Mantenha backups regulares do seu banco de dados para evitar perda de dados.
Certifique-se de usar um ambiente de desenvolvimento ao testar, evitando fazer alterações diretas em um ambiente de produção.
