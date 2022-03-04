fun main{


    //Exercícios POO - Generation Brasil

    val voo = Aviao()

    voo.partida = "GRU"
    voo.destino = "LAX"
    voo.tipoDeVoo = "Noturno"
    voo.porte = "grande"

    val pc = ProdutoEletronico()

    pc.hd = "2TB"
    pc.memoriaRAM = "64gb"
    pc.placaDeVideo = "RTX3080 Super"
    pc.placaMae = "Asus ROG Maximus XII HERO"
    pc.processador = "Processador AMD Ryzen 5 3600"

    val paciente1 = Paciente()

    paciente1.idade = 27
    paciente1.nome = "Diogo"
    paciente1.quarto = 12
    paciente1.situação = "estável"

}

//  ***Classes***

/*

class Aviao {

    var partida = ""
    var destino = ""
    var tipoDeVoo = "" //internacional ou nacional
    var porte = " "

    fun informacoesAviao() {
        println("Deseja informaçoes a respeito do voo?")
        var respostaPassageiro = readLine()!!
        if (respostaPassageiro == "sim")
            print("Esse voo parte de $partida com destino $destino. Essa espaçonave somente faz voo " +
                    "$tipoDeVoo e o porte da aeronave é $porte" )
        else println("Até logo!")
    }
*/

/*

class ProdutoEletronico {

   var placaDeVideo = ""
   var processador = ""
   var placaMae = ""
   var memoriaRAM = ""
   var hd = ""

   fun pcGamer(){
       println("esse computador tem como foco jogar games atuais com o melhor desempenho possível com uma gigantesca " +
               "tava de quadros e gráficos em até 4k nativo")
   }
*/

/*

class Paciente {

   var quarto = 0
   var nome = ""
   var idade = 0
   var situação = ""

   fun pacienteInfos(){
   println("o paciente $nome de $idade anos, está no quarto $quarto e a sua situação é $situação ")}
}
*/
