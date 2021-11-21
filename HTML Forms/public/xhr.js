function sendData(data) {
	const xhr = new XMLHttpRequest();
	const fd = new FormData();
	// const fd = new FormData( FORM );

	// Agregamos la data al objeto FormData
	for (let name in data) {
		fd.append(name, data[name]);
	}

	const funcion_error = function(event) {
		alert("ERROR");
	}

	// Definiciones de nuestro objeto de XHR
	xhr.timeout = 3000; // ms
	xhr.addEventListener("timeout", funcion_error);
	xhr.addEventListener("error", funcion_error);
	xhr.addEventListener("load", function(event) {
		console.log("Respuesta obtenida correctamente");
		const respuesta = JSON.parse(event.target.responseText);
		document.querySelector("#hora").textContent = respuesta.currentDateTime;
	});

	// Preparamos el pedido
	xhr.open('GET', 'http://worldclockapi.com/api/json/utc/now');

	// Realizamos el pedido
	xhr.send(fd);
}

setInterval(function() {
	sendData({ clave: 'valor' });
}, 5000);

sendData({ clave: 'valor' });

