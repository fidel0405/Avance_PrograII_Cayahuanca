document.querySelector("#mandar").addEventListener("click", e => {
  e.preventDefault();

  //INGRESE UN NUMERO DE WHATSAPP VALIDO AQUI:
  let telefono = "50371503000";

  let servicio = document.querySelector("#servicio").value;
  let fecha = document.querySelector("#datepicker").value;
  let hora = document.querySelector("#timepicker").value;
  let lugar = document.querySelector("#lugar").value;
  let resp = document.querySelector("#respuesta");

  resp.classList.remove("fail");
  resp.classList.remove("send");

  let url = `https://api.whatsapp.com/send?phone=${telefono}&text=
		*_Asfa.nailedIt_*%0A
		*Nueva Reserva*%0A%0A
		*Producto:*%0A
		${servicio}%0A
		*Fecha de reservación*%0A
		${fecha}%0A8
		*Horario*%0A
		${hora}%0A
		*Lugar*%0A
		${lugar}%0A`;

  if (servicio === "" || fecha === "" || hora === "") {
    resp.classList.add("fail");
    resp.innerHTML = `Faltan algunos datos`;
    return false;
  }
  resp.classList.remove("fail");
  resp.classList.add("send");
  resp.innerHTML = `Se ha enviado tu reserva`;

  window.open(url);
});

