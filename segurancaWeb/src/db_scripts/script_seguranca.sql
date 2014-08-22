 CREATE TABLE Usuario  (
 						nome varchar(255) NOT NULL,
 						senha varchar(255) NOT NULL,
						PRIMARY KEY (nome )
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8

 CREATE TABLE Grupo (
						nome varchar(255) NOT NULL,
						PRIMARY KEY (nome )
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8
 
 CREATE TABLE Usuario_Grupo  (
						Usuario_nome  varchar(255) NOT NULL,
						grupos_nome  varchar(255) NOT NULL,
						KEY fk_Usuario_Grupo_1  (Usuario_nome ),
						KEY fk_Usuario_Grupo_2  (grupos_nome ),
						CONSTRAINT fk1 FOREIGN KEY (Usuario_nome ) REFERENCES Usuario  (nome ),
						CONSTRAINT fk2 FOREIGN KEY (grupos_nome ) REFERENCES Grupo (nome )
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8


 INSERT INTO Usuario (nome, senha) VALUES ("K19", md5("K19"));
 INSERT INTO Usuario (nome, senha) VALUES ("keizo", md5("keizo"));
 INSERT INTO Usuario (nome, senha) VALUES ("afk", md5("afk"));

 INSERT INTO Grupo (nome) VALUES("admin");
 INSERT INTO Grupo (nome) VALUES("users");

 INSERT INTO Usuario_Grupo (Usuario_nome , grupos_nome) VALUES("K19", "admin");
 INSERT INTO Usuario_Grupo (Usuario_nome , grupos_nome) VALUES("keizo", "admin");
 INSERT INTO Usuario_Grupo (Usuario_nome , grupos_nome) VALUES("afk", "users");
