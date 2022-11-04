import java.security.*
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import java.util.*
import javax.crypto.Cipher

const val ALGORITHM = "RSA"

fun main() {

    var n = generateKeys()
    var public_key = n.first
    var private_key = n.second

    println("TU LLAVE PUBLICA")
    println(public_key)

    println("Que es lo que quieres hacer? (1- ENCRIPTAR) (2- DESENCRIPTAR) [enter es la primera opcion]")
    var encriptar_desencriptar = readln().toInt() ?: 1;

    if (encriptar_desencriptar == 1){
        println("ESCRIBE LA LLAVE QUE TE HAN PASADO")
        val public_key_external = readln().toString()
        println("ESCRIBE LA FRASE QUE QUIERES ENCRIPTAR")
        val frase_random = readln().toString()
        val encriptar = encrypt(frase_random, public_key_external)
        println("CLAVE QUE HAY QUE ENVIAR A LOS DEMAS")
        println(encriptar)
        //println(decrypt(encriptar, private_key))
    }
    if (encriptar_desencriptar == 2){
        println("Cual es la frase que quieres desencriptar")
        var desencriptar = readln().toString()
        println(decrypt(desencriptar, private_key))
    }

}

fun generateKeys(): Pair<String, String> {
    val keyGen = KeyPairGenerator.getInstance(ALGORITHM).apply {
        initialize(512)
    }

    // Key generation
    val keys = keyGen.genKeyPair()

    // Transformation to String (well encoded)
    val publicKeyString = Base64.getEncoder().encodeToString(keys.public.encoded)
    val privateKeyString = Base64.getEncoder().encodeToString(keys.private.encoded)

    return Pair(publicKeyString, privateKeyString)

}

fun encrypt(message: String, publicKey: String): String {
    // From a String, we obtain the Public Key
    val publicBytes = Base64.getDecoder().decode(publicKey)
    val decodedKey = KeyFactory.getInstance(ALGORITHM).generatePublic(X509EncodedKeySpec(publicBytes))

    // With the public, we encrypt the message
    val cipher = Cipher.getInstance(ALGORITHM).apply {
        init(Cipher.ENCRYPT_MODE, decodedKey)
    }
    val bytes = cipher.doFinal(message.encodeToByteArray())
    return String(Base64.getEncoder().encode(bytes))
}

fun decrypt(encryptedMessage: String, privateKey: String): String {
    // From a String, we obtain the Private Key
    val publicBytes = Base64.getDecoder().decode(privateKey)
    val decodedKey = KeyFactory.getInstance(ALGORITHM).generatePrivate(PKCS8EncodedKeySpec(publicBytes))

    // Knowing the Private Key, we can decrypt the message
    val cipher = Cipher.getInstance(ALGORITHM).apply {
        init(Cipher.DECRYPT_MODE, decodedKey)
    }
    val bytes = cipher.doFinal(Base64.getDecoder().decode(encryptedMessage))
    return String(bytes)
}


