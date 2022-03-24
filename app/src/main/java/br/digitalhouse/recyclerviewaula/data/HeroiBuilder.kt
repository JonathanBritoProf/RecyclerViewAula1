package br.digitalhouse.recyclerviewaula.data

//Classe Responsável por contruir os Heróis e adicionalos a uma lista

class HeroiBuilder {

    var listaDeHerois = mutableListOf<Heroi>()

    //cria o objeto heroi através dos parâmetros passados na assinatura e adicona na lista de Herois
    fun add(nome : String,imagem : Int, description : String, title : String){
        val heroi = Heroi(nome,imagem,description,title)
        listaDeHerois.add(heroi)
    }

}