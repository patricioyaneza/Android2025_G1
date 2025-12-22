Algoritmo NumeroPrimo
	// declaración de variables a utilizar
	Definir dividendo, divisor, contador  Como Entero
	
	// QUE TIPOS DE DATOS EXISTEN EN PSEiNT
	
	// solicita el numero al usuario
	Escribir "Escribir un número:"
	Leer dividendo
	
	//Inicializamos el contador
	contador <- 0
	divisor <- 1
	
	// Ciclo MIENTRAS para contar divisores
	Mientras divisor <= dividendo Hacer
		Si dividendo % divisor = 0 Entonces
			contador <- contador + 1
		FinSi
		divisor <- divisor + 1
	FinMientras
	
	// Verificamos e informa al usuario si es primo
	Si contador = 2 Entonces
		Escribir "El número es primo"
	SiNo
		Escribir "El número no es primo"
	FinSi
FinAlgoritmo