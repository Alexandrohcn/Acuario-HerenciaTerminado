
package Acuario

/* Añadir un Metodo
class Acuario {
    var ancho: Int = 20
    var alto: Int = 40
    var largo: Int = 100
    Mueve la función dentro de la clase
    La funcionimprimirTamano le dimos los valores a ancho,largo y alto.
    fun imprimirTamano() {
    println("Ancho: $ancho cm " +
    "Largo: $largo cm " +
    "Alto: $alto cm ")
}
*/

//
//class Acuario(var largo: Int = 100, var ancho: Int = 20, var alto: Int = 40) {
//        // Método para imprimir las dimensiones del acuario
//        fun imprimirTamano() {
//            println("Ancho: $ancho cm " +
//                    "Largo: $largo cm " +
//                    "Alto: $alto cm ")
//        }
//    }

//  Agregar constructores de clase y los bloques de inicializacion init.
//class Acuario(var largo: Int = 100, var ancho: Int = 20, var alto: Int = 40) {
//
//    // Primer bloque init: Indica que se está inicializando el acuario
//    init {
//        println("Inicializando acuario")
//    }
//
//    // Segundo bloque init: Calcula e imprime el volumen del acuario en litros
//    init {
//        val volumen = ancho * largo * alto / 1000 // 1 litro = 1000 cm^3
//        println("Volumen: $volumen l")
//    }
//
//    // Método para imprimir las dimensiones del acuario
//    fun imprimirTamano() {
//        println("Ancho: $ancho cm " +
//                "Largo: $largo cm " +
//                "Alto: $alto cm ")
//    }
//}



//Conocer los constructores secundarios
//
//class Acuario(var largo: Int = 100, var ancho: Int = 20, var alto: Int = 40) {
//
//    // Primer bloque init: Indica que se está inicializando el acuario
//    init {
//        println("Inicializando acuario")
//    }
//
//
//    // Constructor secundario que toma el número de peces como argumento
//    constructor(numeroDePeces: Int) : this() {
//        // 2,000 cm^3 por pez + 10% espacio extra
//        val tanque = numeroDePeces * 2000 * 1.1
//        alto = (tanque / (largo * ancho)).toInt() // Ajusta la altura según el volumen que quieres usar.
//    }
//
//    // Método para imprimir las dimensiones del acuario
//    fun imprimirTamano() {
//        println("Ancho: $ancho cm " +
//                "Largo: $largo cm " +
//                "Alto: $alto cm ")
//    }
//}

//Ejercicio punto 4

//class Acuario(var largo: Int = 100, var ancho: Int = 20, var alto: Int = 40) {
//
//    // Primer bloque init: Indica que se está inicializando el acuario
//    init {
//        println("Inicializando acuario")
//    }
//
//
//    // Constructor secundario que toma el número de peces como argumento
//    constructor(numeroDePeces: Int) : this() {
//        // 2,000 cm^3 por pez + 10% espacio extra
//        val tanque = numeroDePeces * 2000 * 1.1
//        alto = (tanque / (largo * ancho)).toInt() // Ajusta la altura según el volumen
//    }
//
//    // Getter para la propiedad volumen
//    var volumen: Int
//        get() = ancho * alto * largo / 1000  // 1000 cm^3 = 1 l
//        set(valor) {
//            alto = (valor * 1000) / (ancho * largo)
//        }
//
//    // Método para imprimir las dimensiones del acuario
//    fun imprimirTamano() {
//        println("Ancho: $ancho cm " +
//                "Largo: $largo cm " +
//                "Alto: $alto cm ")
//    }
//}

//ejercicio 5 herencia.
// Clase Acuario marcada como open para permitir herencia
//open class Acuario(open var largo: Int = 100, open var ancho: Int = 20, open var alto: Int = 40) {
//
//    // Propiedad open para el volumen del acuario
//    open var volumen: Int
//        get() = ancho * alto * largo / 1000  // 1000 cm^3 = 1 l
//        set(valor) {
//            alto = (valor * 1000) / (ancho * largo)
//        }
//
//    // Propiedad open que representa la forma del acuario
//    open val forma = "rectángulo"
//
//    // Propiedad open para calcular el agua (90% del volumen)
//    open var agua: Double = 0.0
//        get() = volumen * 0.9
//
//    // Método para imprimir las dimensiones y detalles del acuario
//    fun imprimirTamano() {
//        println(forma)  // Imprime la forma del acuario
//        println("Ancho: $ancho cm " +
//                "Largo: $largo cm " +
//                "Alto: $alto cm ")
//        println("Volumen: $volumen l Agua: $agua l (${agua / volumen * 100.0}% lleno)")
//    }
//}

//ejercicio 6
//import kotlin.math.PI  // Importar la constante PI
//
//// Clase Acuario
//open class Acuario(open var largo: Int = 100, open var ancho: Int = 20, open var alto: Int = 40) {
//    open var volumen: Int
//        get() = ancho * alto * largo / 1000
//        set(valor) {
//            alto = (valor * 1000) / (ancho * largo)
//        }
//
//    open var agua: Double = 0.0
//        get() = volumen * 0.9
//
//    open val forma = "rectángulo"
//
//    fun imprimirTamano() {
//        println(forma)
//        println("Ancho: $ancho cm " +
//                "Largo: $largo cm " +
//                "Alto: $alto cm ")
//        println("Volumen: $volumen l Agua: $agua l (${agua/volumen*100.0}% lleno)")
//    }
//}
//
//// Subclase TanqueTorre que hereda de Acuario
//class TanqueTorre(override var alto: Int, var diametro: Int) : Acuario(alto = alto, ancho = diametro, largo = diametro) {
//
//    override var volumen: Int
//        get() = (ancho / 2 * largo / 2 * alto / 1000 * PI).toInt()
//        set(valor) {
//            alto = ((valor * 1000 / PI) / (ancho / 2 * largo / 2)).toInt()
//        }
//
//    override var agua = volumen * 0.8
//
//    override val forma = "cilindro"
//}

// Implementación de clases abstractas depez dorado y tibruon
//abstract class Pez {
//    abstract val color: String
//}
//
//class Tiburon : Pez() {
//    override val color = "gris"
//}
//
//class PezPayaso : Pez() {
//    override val color = "dorado"
//}

//Implementacion de interfaces
//abstract class Pez {
//    abstract val color: String
//}
//interface AccionPez {
//    fun comer()
//}
//
//class Tiburon : Pez(), AccionPez {
//    override val color = "gris"
//
//    override fun comer() {
//        println("Tiburón: cazar y comer peces")
//    }
//}
//
//class PezPayaso : Pez(), AccionPez {
//    override val color = "dorado"
//
//    override fun comer() {
//        println("Pez Payaso: comer algas")
//    }
//}

// Clase abstracta Pez declarar el valor
//abstract class Pez {
//    abstract val color: String
//    abstract val peso: Double // Peso en kg
//    abstract val dieta: String
//    abstract val habitat: String
//}
//
//// Tiburón, agregar caracteristicas de cada "pez".
//
//class Tiburon : Pez() {
//    override val color = "Gris"
//    override val peso = 500.0 // Peso en kg
//    override val dieta = "Carnívoro"
//    override val habitat = "Océano"
//
//    fun comer() {
//        println("Tiburón: cazar y comer peces")
//    }
//}

// Pez Payaso
//class PezPayaso : Pez() {
//    override val color = "Naranja"
//    override val peso = 0.25 // Peso en kg
//    override val dieta = "Omnívoro"
//    override val habitat = "Arrecifes de coral"
//
//    fun comer() {
//        println("Pez Payaso: comer algas")
//    }
//}
//// Pez Espada
//class PezEspada : Pez() {
//    override val color = "Plateado"
//    override val peso = 200.0 // Peso en kg
//    override val dieta = "Carnívoro"
//    override val habitat = "Océano"
//
//    fun comer() {
//        println("Pez Espada: cazar peces pequeños")
//    }
//}
////Anguila Electrica
//class AnguilaElectrica : Pez() {
//    override val color = "Marrón oscuro"
//    override val peso = 20.0 // Peso en kg
//    override val dieta = "Carnívoro"
//    override val habitat = "Ríos y lagos de agua dulce"
//
//    fun comer() {
//        println("Anguila Eléctrica: comer peces y anfibios")
//    }
//}