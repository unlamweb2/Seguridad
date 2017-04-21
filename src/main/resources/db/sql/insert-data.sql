INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta) VALUES ('Gonzalo', 'Ciancio', 'admin', 'admin', 1, 1, getdate());

INSERT INTO Roles (Descripcion) VALUES (Administrador);
INSERT INTO Roles (Descripcion) VALUES (Basico);

--COMMIT;