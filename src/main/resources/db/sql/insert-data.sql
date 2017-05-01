INSERT INTO Roles (Descripcion) VALUES ('Administrador');
INSERT INTO Roles (Descripcion) VALUES ('Usuario');

INSERT INTO TiposTarea (Descripcion) VALUES ('Publica');
INSERT INTO TiposTarea (Descripcion) VALUES ('Privada');

INSERT INTO Estados (Descripcion) VALUES ('Pendiente');
INSERT INTO Estados (Descripcion) VALUES ('Completa');
INSERT INTO Estados (Descripcion) VALUES ('Eliminada');

INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta) VALUES ('Gonzalo', 'Ciancio', 'admin', 'password', 1, true, '2015-3-12');
INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta) VALUES ('Ramiro', 'Silva', 'ramirosilva@gmail.com', 'hola123', 2, true, '2008-11-11');
INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta) VALUES ('Pepe', 'Mujica', 'pepeMujica@gmail.com', 'pepe', 2, false, NULL);

INSERT INTO Tareas (Titulo, Descripcion, EstadoId, TipoTarea, Editable, UsuarioAlta, FechaAlta) VALUES ('Compras', 'Comprar Pan, Leche, Azucar y Cafe.', 1, 1, true, 2, CURDATE());
INSERT INTO Tareas (Titulo, Descripcion, EstadoId, TipoTarea, Editable, UsuarioAlta, FechaAlta) VALUES ('Estudiar', 'Estudiar para Seguridad.', 1, 1, true, 2, CURDATE());
INSERT INTO Tareas (Titulo, Descripcion, EstadoId, TipoTarea, Editable, UsuarioAlta, FechaAlta) VALUES ('Trabajar', 'Para conseguir dinero.', 1, 2, true, 1, CURDATE());
INSERT INTO Tareas (Titulo, Descripcion, EstadoId, TipoTarea, Editable, UsuarioAlta, FechaAlta) VALUES ('Limpiar', 'Para que no haya suciedad.', 1, 2, true, 1, CURDATE());
INSERT INTO Tareas (Titulo, Descripcion, EstadoId, TipoTarea, Editable, UsuarioAlta, FechaAlta) VALUES ('Transferencia', 'Para pagar auto', 1, 1, true, 1, CURDATE());

--COMMIT;
