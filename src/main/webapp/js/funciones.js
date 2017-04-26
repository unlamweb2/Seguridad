function validarUsuario()
{
	var doc;
	var pass;
		
		doc = document.ingreso.user.value;
		pass = document.ingreso.contrasena.value;
		
		if (doc == '' || pass== '')
		{
			alert('Debe completar los campos.');
			return false;
		}
		else
		{
			document.ingreso.submit();
		}
}