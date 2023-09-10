# CONESP
 PROJETO CHALENGE FIAP

# Banco de Dados:

Primeiro, crie o banco de dados:
CREATE DATABASE CONESP;

Selecione esse banco de dados:
USE CONESP;

Agora, crie a tabela "CONTRATOS":
CREATE TABLE CONTRATOS (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NOME_COMPLETO VARCHAR(255) NOT NULL,
    DOCUMENTO VARCHAR(18) NOT NULL, 
    NUMERO_APOLICE VARCHAR(50) NOT NULL, 
    VIGENCIA_INICIO DATE NOT NULL,
    VIGENCIA_FIM DATE NOT NULL,
    DATA_CADASTRO DATETIME DEFAULT CURRENT_TIMESTAMP, 
    STATUS CHAR(1) NOT NULL 
);
