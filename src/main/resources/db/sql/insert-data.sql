INSERT INTO Roles (Descripcion) VALUES ('Administrador');
INSERT INTO Roles (Descripcion) VALUES ('Usuario');

INSERT INTO TipoTarea (Descripcion) VALUES ('Publica');
INSERT INTO TipoTarea (Descripcion) VALUES ('Privada');

INSERT INTO Estado (Descripcion) VALUES ('Pendiente');
INSERT INTO Estado (Descripcion) VALUES ('Completa');
INSERT INTO Estado (Descripcion) VALUES ('Eliminada');

INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta, Aprobado) VALUES ('Admin', 'Admin', 'admin', 'admin', 1, true, '2010-3-12',true);
INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta, Aprobado) VALUES ('Usuario', 'Usuario', 'usuario@gmail.com', '123', 2, true, '2011-11-11',false);
INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta, Aprobado) VALUES ('TestNombre', 'TestApellido', 'testEmail@gmail.com', 'test', 2, false, '2014-11-11',false);
INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta, Aprobado) VALUES ('Juan', 'Lopez', 'juanlopez@gmail.com', 'password', 2, true, CURDATE(),false);


INSERT INTO Tarea (Titulo, Descripcion, EstadoId, TipoTarea, UsuarioAlta, UsuarioAsignado, FechaAlta) VALUES ('Compras', 'Comprar Pan, Leche, Azucar y Cafe.', 1, 1, 2, 2, '2012-11-11');
INSERT INTO Tarea (Titulo, Descripcion, EstadoId, TipoTarea, UsuarioAlta, UsuarioAsignado, FechaAlta) VALUES ('Estudiar', 'Estudiar para Seguridad.', 1, 1, 2, 2, '2013-01-10');
INSERT INTO Tarea (Titulo, Descripcion, EstadoId, TipoTarea, UsuarioAlta, UsuarioAsignado, FechaAlta) VALUES ('Trabajar', 'Para conseguir dinero.', 2, 2, 2, 2, CURDATE());
INSERT INTO Tarea (Titulo, Descripcion, EstadoId, TipoTarea, UsuarioAlta, UsuarioAsignado, FechaAlta) VALUES ('Limpiar', 'Para que no haya suciedad.', 1, 2, 3, 3, CURDATE());
INSERT INTO Tarea (Titulo, Descripcion, EstadoId, TipoTarea, UsuarioAlta, UsuarioAsignado, FechaAlta) VALUES ('Transferencia', 'Para pagar auto', 2, 1, 3, 3, CURDATE());

--COMMIT;