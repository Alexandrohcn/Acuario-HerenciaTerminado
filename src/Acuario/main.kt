package Acuario
/*Añadir un metodo

fun construirAcuario() {
    val miAcuario = Acuario()
    miAcuario.imprimirTamano()
    //Se agregarle un valor nuevo a miAcuario, nos permitira tener como 2 acuarios
    miAcuario.alto = 60
    //pero se imprimira 2 veces por que le agregamos miAcuario.imprimirTamano() de la linea 10 sin ese codigo no habria 2 acuarios.

    miAcuario.imprimirTamano()
}

*/
//  Agregar constructores de clase
//fun construirAcuario() {
//    val acuario1 = Acuario()
//    acuario1.imprimirTamano()
//    // Ancho personalizado, altura y largo por defecto
//    val acuario2 = Acuario(ancho = 25)
//    acuario2.imprimirTamano()
//    // Largo y alto personalizados, ancho por defecto
//    val acuario3 = Acuario(alto = 35, largo = 110)
//    acuario3.imprimirTamano()
//    // Todo personalizado
//    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
//    acuario4.imprimirTamano()
//}



//  Agregar constructores de clase
//fun construirAcuario() {
//    val acuario1 = Acuario()
//    acuario1.imprimirTamano()  // Usa todos los valores predeterminados
//
//    val acuario2 = Acuario(ancho = 25)
//    acuario2.imprimirTamano()  // Modifica solo el ancho
//
//    val acuario3 = Acuario(alto = 35, largo = 110)
//    acuario3.imprimirTamano()  // Modifica el alto y el largo
//
//    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
//    acuario4.imprimirTamano()  // Personaliza todas las dimensiones
//}
//
//fun main() {
//    construirAcuario()
//}

//  Agregar constructores de clase y los bloques de inicializacion init.
//package Acuario
//
//fun construirAcuario() {
//    val acuario1 = Acuario()
//    acuario1.imprimirTamano()
//
//    val acuario2 = Acuario(ancho = 25)
//    acuario2.imprimirTamano()
//
//    val acuario3 = Acuario(alto = 35, largo = 110)
//    acuario3.imprimirTamano()
//
//    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
//    acuario4.imprimirTamano()
//}



////Conocer los constructores secundarios
//fun construirAcuario() {
//    val acuario1 = Acuario()
//    acuario1.imprimirTamano()
//
//    val acuario2 = Acuario(ancho = 25)
//    acuario2.imprimirTamano()
//
//    val acuario3 = Acuario(alto = 35, largo = 110)
//    acuario3.imprimirTamano()
//
//    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
//    acuario4.imprimirTamano()
//
//    // Crear un acuario usando el constructor secundario
//    val acuario6 = Acuario(numeroDePeces = 29)
//    acuario6.imprimirTamano()
//    println("Volumen: ${acuario6.ancho * acuario6.largo * acuario6.alto / 1000} l")
//}
//

//ejercicio 4
//fun construirAcuario() {
//    val acuario1 = Acuario()
//    acuario1.imprimirTamano()
//
//    val acuario2 = Acuario(ancho = 25)
//    acuario2.imprimirTamano()
//
//    val acuario3 = Acuario(alto = 35, largo = 110)
//    acuario3.imprimirTamano()
//
//    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
//    acuario4.imprimirTamano()
//
//    // Crear un acuario usando el constructor secundario
//    val acuario6 = Acuario(numeroDePeces = 29)
//    acuario6.imprimirTamano()
//    println("Volumen: ${acuario6.volumen} l")
//
//    // Ajustar el volumen del acuario a 70 litros
//    acuario6.volumen = 70
//    acuario6.imprimirTamano()
//    println("Volumen: ${acuario6.volumen} l")
//}
//
//
//fun main() {
//    construirAcuario()
//}

//ejercicio 5 herencia
//fun construirAcuario() {
//    // Crear un acuario con dimensiones específicas
//    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
//    acuario8.imprimirTamano()  // Imprimir las dimensiones y detalles del acuario
//}
//
//fun main() {
//    construirAcuario()
//}


//ejercicio 6
//fun construirAcuario() {
//    // Crear un acuario rectangular
//    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
//    miAcuario.imprimirTamano()
//
//    // Crear un tanque en forma de torre
//    val miTorre = TanqueTorre(diametro = 25, alto = 45)
//    miTorre.imprimirTamano()  // Imprimir las dimensiones y detalles del tanque cilíndrico
//}
//
//fun main() {
//    construirAcuario()
//}



// implementacion de clases abstractas de pez dorado y tiburon.
//fun crearPeces() {
//    val tiburon = Tiburon()
//    val pezPayaso = PezPayaso()
//
//    println("El tiburón es de color: ${tiburon.color}")
//    println("El pez payaso es de color: ${pezPayaso.color}")
//}
//
//fun main() {
//    crearPeces()
//}

// Implementacion de interfaces

//fun crearPeces() {
//    val tiburon = Tiburon()
//    val pezPayaso = PezPayaso()
//
//    println("El tiburón es de color: ${tiburon.color}")
//    tiburon.comer()
//
//    println("El pez payaso es de color: ${pezPayaso.color}")
//    pezPayaso.comer()
//}
//
//fun main() {
//    crearPeces()
//}


// Agregando mas datos a los peces
//fun crearPeces() {
//    val tiburon = Tiburon()
//    val pezPayaso = PezPayaso()
//    val pezEspada = PezEspada()
//    val anguilaElectrica = AnguilaElectrica()
//
//    // Imprimir detalles de los peces
//    println("Tiburón: Color: ${tiburon.color}, Peso: ${tiburon.peso} kg, Dieta: ${tiburon.dieta}, Hábitat: ${tiburon.habitat}")
//    tiburon.comer()
//
//    println("Pez Payaso: Color: ${pezPayaso.color}, Peso: ${pezPayaso.peso} kg, Dieta: ${pezPayaso.dieta}, Hábitat: ${pezPayaso.habitat}")
//    pezPayaso.comer()
//
//    println("Pez Espada: Color: ${pezEspada.color}, Peso: ${pezEspada.peso} kg, Dieta: ${pezEspada.dieta}, Hábitat: ${pezEspada.habitat}")
//    pezEspada.comer()
//
//    println("Anguila Eléctrica: Color: ${anguilaElectrica.color}, Peso: ${anguilaElectrica.peso} kg, Dieta: ${anguilaElectrica.dieta}, Hábitat: ${anguilaElectrica.habitat}")
//    anguilaElectrica.comer()
//}
//
//fun main() {
//    crearPeces()
//}
