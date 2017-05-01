INSERT INTO Roles (Descripcion) VALUES ('Administrador');
INSERT INTO Roles (Descripcion) VALUES ('Usuario');

INSERT INTO Privacidad (Descripcion) VALUES ('Publica');
INSERT INTO Privacidad (Descripcion) VALUES ('Privada');

INSERT INTO TiposTarea (Descripcion) VALUES ('Editable');
INSERT INTO TiposTarea (Descripcion) VALUES ('Solo lectura');

INSERT INTO Estados (Descripcion) VALUES ('Pendiente');
INSERT INTO Estados (Descripcion) VALUES ('Completa');
INSERT INTO Estados (Descripcion) VALUES ('Eliminada');

INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta) VALUES ('Gonzalo', 'Ciancio', 'admin', 'password', 1, true, '2015-3-12');
INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta) VALUES ('Ramiro', 'Silva', 'ramirosilva@gmail.com', 'hola123', 2, true, '2008-11-11');
INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta) VALUES ('Pepe', 'Mujica', 'pepeMujica@gmail.com', 'pepe', 2, false, NULL);

INSERT INTO Tareas (Titulo, Descripcion, EstadoId, Privacidad, TipoTarea, UsuarioAlta, FechaAlta) VALUES ('Compras', 'Comprar Pan, Leche, Azucar y Cafe.', 1, 1, 1, 2, CURDATE());
INSERT INTO Tareas (Titulo, Descripcion, EstadoId, Privacidad, TipoTarea, UsuarioAlta, FechaAlta) VALUES ('Estudiar', 'Estudiar para Seguridad.', 1, 1, 2, 2, CURDATE());
INSERT INTO Tareas (Titulo, Descripcion, EstadoId, Privacidad, TipoTarea, UsuarioAlta, FechaAlta) VALUES ('Trabajar', 'Para conseguir dinero.', 2, 2, 2, 1, CURDATE());
INSERT INTO Tareas (Titulo, Descripcion, EstadoId, Privacidad, TipoTarea, UsuarioAlta, FechaAlta) VALUES ('Limpiar', 'Para que no haya suciedad.', 1, 2, 1, 1, CURDATE());
INSERT INTO Tareas (Titulo, Descripcion, EstadoId, Privacidad, TipoTarea, UsuarioAlta, FechaAlta) VALUES ('Transferencia', 'Para pagar auto', 2, 1, 1, 1, CURDATE());

--COMMIT;