//Validación del log in
$().ready(function(){
    //jquery
    $("#logIn").validate({
        rules:{
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
            user: {
               required: " Completa este campo ",
               minlength: " El usuario tiene al menos 5 caracteres "
            },
            password:{
                required: " Completa este campo ",
                minlength: " La contraseña tiene al menos 5 caracteres"
            }
        }
    });
});
