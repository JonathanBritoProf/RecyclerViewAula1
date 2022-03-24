package br.digitalhouse.recyclerviewaula.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.digitalhouse.recyclerviewaula.R
import br.digitalhouse.recyclerviewaula.adapter.HeroiAdapter
import br.digitalhouse.recyclerviewaula.data.HeroiBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inicializa a classe Heroi builder a adiciona os herois a lista através da função add
        var heroiBuilder = HeroiBuilder()
        heroiBuilder.add("Iron Man", R.drawable.iron_icon,"Este é o Iron Man","Iron Man")
        heroiBuilder.add("Hulk", R.drawable.hulk_icon,"Este é o Hulk","Hulk")
        heroiBuilder.add("Captain America", R.drawable.america_icon,"Este é o Captain America","Captain America")
        heroiBuilder.add("Thor", R.drawable.thor_icon,"Este é o Thor","Thor")

        //faz a referência ao recycler view utilizado e configura o Adapter dela como o Adapter criado
        var recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view)
        recyclerView.adapter = HeroiAdapter(this,heroiBuilder.listaDeHerois)

    }
}