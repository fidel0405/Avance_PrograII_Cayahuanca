//Validación del register
$().ready(function(){
    //jquery
    $("#register").validate({
        rules:{
            name:{
                required: true
            },
            
            lastname:{
                required: true
            },
            
            age:{
                required: true,
		min: 15,
		max: 99
            },
            
            email:{
                required: true,
            },
            
            user:{
                required: true,
                minlength: 5
            },
            
            password:{
                required: true,
                minlength: 5
            }
            
            
        },
        messages:{
            name: {
               required: " Completa este campo "
            },
            lastname:{
                required: " Completa este campo ",
            },
            age:{
                required: " Completa este campo ",
		min: " Debes ser mayor de 15 años",
		max: " Debes ser menor de 99 años"
            },
            email:{
                required: " Completa este campo ",
            },
            user:{
                required: " Completa este campo ",
		minlength: " Este campo necesita al menos 5 caracteres "
            },
            password:{
                required: " Completa este campo ",
		minlength: " Este campo necesita al menos 5 caracteres "
            }
        }
    });
});
