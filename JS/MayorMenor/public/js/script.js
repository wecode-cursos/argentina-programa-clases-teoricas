let mazoCartas;
let cartaActual;
let cantidadIntentos;
const contenedorMensajes = document.querySelector("#mensajes");

function comenzarJuego() {
	mazoCartas = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
	cartaActual = sacarCarta();
	cantidadIntentos = 0;
	contenedorMensajes.textContent = "";
	document.querySelector("#intentosIncorrectos").textContent = "0";
	document.querySelector("#entradaDeUsuario").value = "";
}

function sacarCarta() {
	let posicion = Math.floor(Math.random() * mazoCartas.length);
	return mazoCartas.splice(posicion, 1)[0];
}

function aumentarCantidadDeIntentos() {
	cantidadIntentos++;
	document.querySelector("#intentosIncorrectos").textContent = cantidadIntentos;
}

function adivina(numero) {
	if (numero == cartaActual) {
		contenedorMensajes.textContent = "Adivinaste correctamente. " +
			"Cartas restantes: " + mazoCartas.length;
		if (mazoCartas.length == 0) {
			finDeJuego();
		} else {
			cartaActual = sacarCarta();
		}
	} else {
		aumentarCantidadDeIntentos();
		if (numero > cartaActual) {
			contenedorMensajes.textContent = "El número de la carta buscada es menor";
		} else {
			contenedorMensajes.textContent = "El número de la carta buscada es mayor";
		}
	}
}

function finDeJuego() {
	alert("Fin de juego. Tu puntaje total es:" + cantidadIntentos);

	let respuesta = confirm("¿Desea volver a intentar?");
	if (respuesta) {
		comenzarJuego();
	}
}


const botonAdivinar = document.querySelector("#botonAdivinar");

botonAdivinar.addEventListener("click", function() {
	const entradaDeUsuario = document.querySelector("#entradaDeUsuario");
	if (entradaDeUsuario.value % 1 == 0 && entradaDeUsuario.value >= 1 && entradaDeUsuario.value <= 10) {
		adivina(entradaDeUsuario.value);
	} else {
		contenedorMensajes.textContent = "El número es incorrecto";
	}
});


comenzarJuego();
