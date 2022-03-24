package br.digitalhouse.recyclerviewaula.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.digitalhouse.recyclerviewaula.R
import br.digitalhouse.recyclerviewaula.data.Heroi

class HeroiAdapter(val context : Context, val listaDeHeroi : List<Heroi>) : RecyclerView.Adapter<HeroiAdapter.HeroiViewHolder>(){

    //cria e inicializa o ViewHolder e a View associada
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroiViewHolder {
        //from pega o contexto da activity
        val layoutInflater = LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false)
        return HeroiViewHolder(layoutInflater)
    }

    // Busca os dados apropriados e usa esses dados para preencher o layout do fixador de visualização.
    // Por exemplo, se a RecyclerView exibir uma lista de nomes, o método poderá encontrar o nome apropriado
    // na lista e preencher o widget TextView do fixador de visualização.
    override fun onBindViewHolder(holder: HeroiViewHolder, position: Int) {
       holder.icon.setImageResource(listaDeHeroi[position].imagem)
       holder.name.text = listaDeHeroi[position].nome
       holder.description.text = listaDeHeroi[position].description
       holder.title.text = listaDeHeroi[position].title
    }

    //Retorna a quantidade de items presentes na lista
    override fun getItemCount(): Int {
        return listaDeHeroi.size
    }

    //View Holder é um Fixador de visualização responsável por segurar os itens da view para poder
    //ser imlementados posteriormente
    inner class HeroiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val icon = itemView.findViewById<ImageView>(R.id.thoricon)
        val name = itemView.findViewById<TextView>(R.id.nameTxt)
        val title = itemView.findViewById<TextView>(R.id.titleTxt)
        val description = itemView.findViewById<TextView>(R.id.descriptionTxt)
    }


}