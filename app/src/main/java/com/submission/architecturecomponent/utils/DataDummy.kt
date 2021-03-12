package com.submission.architecturecomponent.utils


import android.content.Context
import com.submission.architecturecomponent.R
import com.submission.architecturecomponent.data.local.entity.MoviesEntity
import com.submission.architecturecomponent.data.local.entity.TvShowsEntity

class DataDummy(private val context: Context){

    fun generateDummyMovies(): List<MoviesEntity> {

        val movies = ArrayList<MoviesEntity>()


        movies.add(MoviesEntity(
            "A Start Is Born",
        "Film Start Is Born",
        R.drawable.poster_a_start_is_born
        ))


        movies.add(MoviesEntity(
            "Alita",
            "Ketika Alita terbangun tanpa ingatan tentang siapa dia di dunia masa depan yang tidak dia kenal, dia ditangkap oleh Ido, seorang dokter yang penuh kasih yang menyadari bahwa di suatu tempat dalam cangkang cyborg yang ditinggalkan ini adalah hati dan jiwa seorang wanita muda dengan luar biasa. lalu.",
            R.drawable.poster_alita
        ))

        movies.add(MoviesEntity(
            "Aquaman",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            R.drawable.poster_aquaman
        ))

        movies.add(MoviesEntity(
            "Bohemian",
            "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
            R.drawable.poster_bohemian
        ))

        movies.add(MoviesEntity(
            "Cold Persuit",
            "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
            R.drawable.poster_cold_persuit
        ))

        movies.add(MoviesEntity(
            "Creed",
            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
            R.drawable.poster_creed
        ))

        movies.add(MoviesEntity(
                "Crimes",
                "Gellert Grindelwald telah melarikan diri dari penjara dan telah mulai mengumpulkan pengikut ke tujuannya — meninggikan penyihir di atas semua makhluk non-magis. Satu-satunya yang bisa menghentikannya adalah penyihir yang pernah disebutnya sebagai sahabat terdekatnya, Albus Dumbledore. Namun, Dumbledore akan perlu mencari bantuan dari penyihir yang telah menggagalkan Grindelwald sebelumnya, mantan muridnya, Newt Scamander, yang setuju untuk membantu, tidak menyadari bahaya yang ada di depan. Garis-garis digambar saat cinta dan kesetiaan diuji, bahkan di antara teman-teman dan keluarga sejati, di dunia sihir yang semakin terbagi.",
                R.drawable.poster_crimes
        ))

        movies.add(MoviesEntity(
                "Glass",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
        R.drawable.poster_glass
        ))

        movies.add(MoviesEntity(
                "How To Train Your Dragon",
                "Ketika Hiccup memenuhi mimpinya untuk menciptakan utopia naga yang damai, penemuan Toothless 'dari pasangan yang tak teruji dan sukar ditangkap membuat Night Fury menjauh. Ketika bahaya meningkat di rumah dan pemerintahan Hiccup sebagai kepala desa diuji, baik naga dan pengendara harus membuat keputusan yang mustahil untuk menyelamatkan jenis mereka.",
                R.drawable.poster_how_to_train
        ))

        movies.add(MoviesEntity(
                "Infinity War",
                "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                R.drawable.poster_infinity_war
        ))
        return movies
    }

    fun generateDummyTvShow(): List<TvShowsEntity>{
        val tvShow = ArrayList<TvShowsEntity>()

        tvShow.add(TvShowsEntity(
            "Arrow",
            "Panah adalah menceritakan kembali petualangan dari legendaris DC pahlawan Green Arrow",
            R.drawable.poster_arrow
        ))

        tvShow.add(TvShowsEntity(
                "Doom Patrol",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                R.drawable.poster_doom_patrol
        ))
        tvShow.add(TvShowsEntity(
                "Dragon Ball",
                "This movie is very different from the previous TV specials (Dragon Ball Z: Bardock - The Father of Goku and Dragon Ball Z: The History of Trunks), as it is a look back at what had happened in Dragon Ball Z in 1993. In this film, which is believed to take place some time around the 25th World Martial Arts Tournament, Gohan and Goten are having a hot bath outside in the middle of winter. Goku (who is still dead) suddenly appears in front of his sons with the help of his Instant Transmission, and joins them in the tub. While there, the three Saiyans reflect back on the events that occurred during the Cell Games. Inside the house after Chi-Chi appeared, Goku tells his sons about Pikkon and the Other World Tournament. Later, the four members of the Son family appear dressed nicely. Gohan says that the adult division of the Tournament will begin this next year (in 1994), and the special comes to an end.",
                R.drawable.poster_dragon_ball
        ))
        tvShow.add(TvShowsEntity(
                "Fairy Tail",
                "The film revolves around a mysterious girl named Éclair who appears before Fairy Tail, the world's most notorious wizard's guild. She lost all of her memories, except for the imperative that she must deliver two Phoenix Stones somewhere. The stones may spell the collapse of the magical world, and Natsu, Lucy, and the rest of the Fairy Tail guild are caught up in the intrigue.",
                R.drawable.poster_fairytail
        ))
        tvShow.add(TvShowsEntity(
                "Family Guys",
                "Seri animasi animasi Freakin 'Sweet yang sakit, terpelintir, dan salah, menampilkan petualangan keluarga Griffin yang disfungsional. Peter yang kikuk dan Lois yang sudah lama menderita memiliki tiga anak. Stewie (bayi yang brilian tetapi sadis yang bertekad membunuh ibunya dan mengambil alih dunia), Meg (yang tertua, dan merupakan gadis yang paling tidak populer di kota) dan Chris (anak tengah, dia tidak terlalu cerdas tetapi memiliki hasrat untuk film ). Anggota terakhir keluarga itu adalah Brian - anjing yang bisa bicara dan lebih dari sekadar hewan peliharaan, ia menjaga Stewie, sementara menghirup Martinis dan memilah-milah masalah hidupnya sendiri.",
                R.drawable.poster_family_guy
        ))
        tvShow.add(TvShowsEntity(
                "Flash",
                "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya \"manusia meta\" yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan. Barry bermitra dengan S.T.A.R. Lab dan mendedikasikan hidupnya untuk melindungi yang tidak bersalah. Untuk saat ini, hanya beberapa teman dekat dan rekan yang tahu bahwa Barry secara harfiah adalah manusia tercepat, tetapi tidak lama sebelum dunia mengetahui apa yang menjadi Barry Allen ... The Flash.",
                R.drawable.poster_flash
        ))
        tvShow.add(TvShowsEntity(
                "God",
                "Film God",
                R.drawable.poster_god
        ))
        tvShow.add(TvShowsEntity(
                "Gotham",
                "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker?",
                R.drawable.poster_gotham
        ))
        tvShow.add(TvShowsEntity(
                "Hanna",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                R.drawable.poster_hanna
        ))
        tvShow.add(TvShowsEntity(
                "Grey Anet Omy",
                "Ikuti kehidupan pribadi dan profesional sekelompok dokter di Rumah Sakit Gray Sloan Memorial di Seattle.",
                R.drawable.poster_grey_anatomy
        ))

        return tvShow
    }
}