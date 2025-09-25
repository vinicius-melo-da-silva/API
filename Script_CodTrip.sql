create database Codetrip;

use Codetrip;

CREATE TABLE Usuario (
Id_Usuario INT AUTO_INCREMENT,
Nome_Usuario VARCHAR(100),
Email_Usuario VARCHAR(255) UNIQUE,
Senha_Usuario VARCHAR(255),
PRIMARY KEY (Id_Usuario));

INSERT INTO Usuario (Nome_Usuario, Email_Usuario, Senha_Usuario) VALUES 
('João Silva', 'joao.silva@example.com', 'senha123'),
('Maria Oliveira', 'maria.oliveira@example.com', 'senha456'),
('Carlos Souza', 'carlos.souza@example.com', 'senha789'),
('Ana Costa', 'ana.costa@example.com', 'senha321'),
('Pedro Santos', 'pedro.santos@example.com', 'senha654');

select * from Usuario;