//fun main(args: Array<String>) {
//    /*println("Bem vindo ao  ByteBank!")
//    val titular = "Joao"
//    //dois tipos de concatenação
//    println("titular "+titular)//apertando  alt+enter  ele mostra a forma abaixo como uma alternativa "limpa" para o kotlin
//    println("titular $titular")
//    println("Program arguments: ${args.joinToString()}")*/
//
//    /*println("Bem vindo ao ByteBank, seu banco digital!")
//    val contaAlex = Conta()//Objeto Conta do Alex(como espaço reservado na memoria)
//    contaAlex.titular = "Alex"
//    println(contaAlex.titular)*/
//
//    /*val contaFran = Conta()//Objeto Conta da fran(como espaço reservado na memoria)
//    contaFran.titular = "Fran"
//    println(contaFran.titular)*/
//    //Cópias e referências
//
//    val contaJoao = Conta()
//    contaJoao.titular = "João"
//    val contaMaria = contaJoao
//    contaMaria.titular = "Maria"
//    println("nome do titular ${contaJoao.titular}")
//    println("nome do titular ${contaMaria.titular}")
//
//    //formas de escrever as estruturas condicionais if e when(tbm muito similar ao switch case)
////    if (saldo>0.0)
////        print("\nSaldo Positivo😊")
////    else if(saldo==0.0)
////        println("\nSaldo Neutro")
////    else
////        print("\nSaldo Negativo😒")
//
////    when {
////        saldo>0.0 -> print("\nSaldo Positivo😊")
////        saldo==0.0 -> println("\nSaldo Neutro")drrrr
////        else -> print("\nSaldo Negativo😒")
////    }
//
//}
//
//class Conta{
//    var titular = ""
//    var numero = 0
//    var saldo = 0.0
//
//    testaCopiaEReferencias()
//}
//
//fun testaCopiaEReferencias(){
//
//}
//
///*fun testLacos(){
//    for(i in 10 downTo 1 step 2) {
//        val titular: String = "Lucas $i"
//        val numeroDaConta = 19003 + i
//        var saldo = 19.03 + i
//
//        println("titular: $titular")
//        println("informações da conta:\nSaldo:$saldo" + "\nNumero da Conta:$numeroDaConta")
//        testaCondicoes(saldo)
//        println("\n")
//    }
//}
//fun testaCondicoes(saldo: Double) {
//    if (saldo>0.0)
//        print("saldo Positivo😊\n")
//    else if(saldo==0.0)
//        println("saldo Neutro\n")
//    else
//        print("saldo Negativo😒\n")
//}
//*/