package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTEN_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Ant-Man",
                "Ant-Man adalah sebuah film superhero Amerika Serikat yang akan dirilis pada 17 Juli 2015. Ini adalah film kedua belas di Marvel Cinematic Universe. Film ini dibintangi oleh Paul Rudd, Evangeline Lilly, Corey Stoll, Bobby Cannavale, Michael Peña, Judy Greer, Tip T.I Harris, David Dastmalchian, Wood Harris, Jordi Mollà, dan Michael Douglas"
            ),
            Superhero(
                R.drawable.captain,
                "Captain-America",
                "Captain America adalah sosok pahlawan super fiktif dari Marvel Comics. Memiliki musuh besar bernama Red Skull dan Baron Zemo, Rogers adalah tentara AS yang tidak memiliki kemampuan sama sekali. Berkat bantuan Dr. Joshef Reinstein dengan serum super soldiernya. Pahlawan yang lahir pada tahun 1920 ini menjadi pahlawan perang Amerika Serikat saat menghadapi sekutu NAZI yang dipimpin oleh Adolf Hitler."
            ),
            Superhero(
                R.drawable.doctor,
                "Doctor-Strange",
                "Doctor Stephen Vincent Strange adalah pahlawan super fiksi yang muncul di American Comic Book dipublikasikan oleh Marvel Comics. Dibuat oleh artis dan konseptualis karakter Steve Ditko dan penulis Stan Lee, Dalam Doctor Strange, ahli bedah Stephen Strange belajar seni mistik dari Ancient One setelah kecelakaan mobil mengakhiri kariernya."
            ),
            Superhero(
                R.drawable.gamora,
                "Gamora",
                "Nama Gamora sebagai anak angkat dari Thanos semakin melejit saat kehadirannya di film Guardian of The Galaxy yang pertama dengan mengambil keputusan bergabung dengan tim tersebut dan melawan ayahnya."
            ),
            Superhero(
                R.drawable.hawkeye,
                "Hawkeye",
                "Hawkeye atau nama aslinya adalah Clint Barton adalah seorang pahlawan super fiksi yang muncul di buku komik Amerika yang diterbitkan oleh Marvel Comics. Dibuat oleh penulis Stan Lee dan artis Don Heck."
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Hulk, adalah tokoh pahlawan super fiksi yang ada pada Marvel Comics. DIciptakan oleh Stan Lee dan Jack Kirby,"
            ),
            Superhero(
                R.drawable.ironman,
                "Ironman",
                "Iron Man (Anthony Edward Tony Stark) adalah pahlawan super fiksi yang muncul dalam buku komik Amerika yang diterbitkan oleh Marvel Comics, serta media yang terkait. Karakter diciptakan oleh penulis dan editor Stan Lee, yang dikembangkan oleh penulis skenario Larry Lieber, dan dirancang oleh seniman Don Heck dan Jack Kirby."
            ),
            Superhero(
                R.drawable.loki,
                "loki",
                "Loki adalah karakter fiksi yang muncul di buku komik Amerika yang diterbitkan oleh Marvel Comics. Dia adalah saudara adopsi dan sering menjadi musuh Thor. Dia didasarkan pada nama yang sama dari mitologi Nordik."
            ),
            Superhero(
                R.drawable.marvel,
                "Captain-Marvel",
                " Captain Marvel adalah salah satu karakter superhero yang disebut-sebut sangat kuat. Menurut Marvel, kekuatannya meliputi kemampuan terbang, ledakan energi, serta kekuatan dan ketanan manusia super"
            ),
            Superhero(
                R.drawable.nebula,
                "nebula",
                "Nebula adalah salah satu tokoh fiksi yang ada pada komik Marvel. Tokoh yang berwujud alien wanita ini diciptakan oleh Roger Stern, sementara ilustrasinya digambar oleh John Buscema."
            ),
            Superhero(
                R.drawable.panther,
                "Black-Panther",
                "Feige mendeskripsikan Black Panther sebagai sebuah petualangan aksi geopolitikal yang besar yang berfokus pada keluarga dan T'Challa yang belajar menjadi seorang raja, dengan Civil War yang meletakkan dasar bagi moralitas T'Challa dan membangun bentang geopolitik yang harus ia hadapi ketika kembali ke Wakanda."
            ),
            Superhero(
                R.drawable.spiderman,
                "Spiderman",
                "Spiderman adalah pahlawan super fiktif dari Marvel Comics yang diciptakan oleh penulis Stan Lee dan artis Steve Ditko."
            )
        )

        val RecyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        RecyclerView.layoutManager = LinearLayoutManager(this)
        RecyclerView.setHasFixedSize(true)
        RecyclerView.adapter = SuperheroAdapter(this,superherolist){

            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTEN_PARCELABLE, it)
            startActivity(intent)

        }
    }
}