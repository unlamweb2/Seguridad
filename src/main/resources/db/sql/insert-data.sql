INSERT INTO Roles (Descripcion) VALUES ('Administrador');
INSERT INTO Roles (Descripcion) VALUES ('Usuario');

INSERT INTO TipoTarea (Descripcion) VALUES ('Publica');
INSERT INTO TipoTarea (Descripcion) VALUES ('Privada');

INSERT INTO Estado (Descripcion) VALUES ('Pendiente');
INSERT INTO Estado (Descripcion) VALUES ('Completa');
INSERT INTO Estado (Descripcion) VALUES ('Eliminada');


INSERT INTO Usuario (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta, Aprobado) VALUES ('Admin', 'Admin', 'admin', 'admin', 1, true, '2010-3-12',true);
INSERT INTO Usuario (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta, Aprobado) VALUES ('Usuario', 'Usuario', 'usuario@gmail.com', '123', 2, true, '2011-11-11',false);



INSERT INTO Tarea (Titulo, Descripcion, EstadoId, TipoTarea, UsuarioAlta, UsuarioAsignado, FechaAlta) VALUES ('Compras', 'Comprar Pan, Leche, Azucar y Cafe.', 1, 1, 2, 2, '2012-11-11');
INSERT INTO Tarea (Titulo, Descripcion, EstadoId, TipoTarea, UsuarioAlta, UsuarioAsignado, FechaAlta) VALUES ('Estudiar', 'Estudiar para Seguridad.', 1, 1, 2, 2, '2013-01-10');

--COMMIT;

