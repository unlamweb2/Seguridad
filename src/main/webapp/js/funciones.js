function validarUsuario()
{
	var usr = document.getElementById("ingreso:mail").value.toString().length; 
	var pass= document.getElementById("ingreso:password").value.toString().length; 
			
		if (usr == 0 || pass== 0)
		{
			alert('Debe completar los campos.');
			/*document.getElementById("ingreso:mail").setAttribute("class","text-danger")
				document.getElementById("ingreso:password").setAttribute("style", "background-color: red;")*/
			return false;
		}
		else
		{	return true;		
		}
}

function validarUsuarioAlta()
{
	var nombre = document.getElementById("registro:InNombre").value.toString().length; 
	var apellido= document.getElementById("registro:InApellido").value.toString().length; 
	var email = document.getElementById("registro:InEmail").value.toString().length; 
	var pass= document.getElementById("registro:InPassword").value.toString().length; 
		
	if (nombre == 0 )
	{   alert('Debe ingresar un nombre.');	
	location.reload();
		return false;
	}
	else if (apellido == 0 )
	{	alert('Debe ingresar un apellido.');
	location.reload();
		return false;		
	}else if (email == 0 )
	{   alert('Debe ingresar un Email.');
	location.reload();
		return false;
	}
	else if (pass < 8 )
	{	alert('La clave debe contener al menos 8 caracteres');
	location.reload();
		return false;	
	}
	else
	{ return true;		
	}	
		
}

