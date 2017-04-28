INSERT INTO Roles (Descripcion) VALUES ('Administrador');
INSERT INTO Roles (Descripcion) VALUES ('Usuario');

INSERT INTO TiposTarea (Descripcion) VALUES ('Publica');
INSERT INTO TiposTarea (Descripcion) VALUES ('Privada');

INSERT INTO Estados (Descripcion) VALUES ('Pendiente');
INSERT INTO Estados (Descripcion) VALUES ('Finalizada');
INSERT INTO Estados (Descripcion) VALUES ('Eliminada');

INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta) VALUES ('Gonzalo', 'Ciancio', 'admin', 'password', 1, true, CURDATE());
INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta) VALUES ('Ramiro', 'Silva', 'ramirosilva@gmail.com', 'hola123', 1, true, CURDATE());

--COMMIT;