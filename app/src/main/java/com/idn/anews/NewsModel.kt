package com.idn.anews

data class news(var title: String, var desc: String, var photo: Int)

object NewsModel{
    val newslist = listOf<news>(
        news("Sedih! Anak digagalkan saat lompat dari rumahnya","detikcom | 30 menit Yang Lalu", R.drawable.img_news1),
        news("Robot Semakin lama Semakin Jelek","detikcom | 1 Jam Yang Lalu", R.drawable.img_news2),
        news("Trump Positif corona, Amerika Pesta","detikcom | 3 Jam Yang Lalu",R.drawable.img_news3),
        news("Terungkap!! bagaimana Character Anime Melihat anda","detikcom | 4 Jam Yang Lalu",R.drawable.img_news4),
        news("Hasil Tes IQ Fulan Terungkap ","detikcom | 5 Jam Yang Lalu",R.drawable.img_news5),
        news("Yui Menjelaskan Cara memakan burger dengan benar!","detikcom | 6 Jam Yang Lalu",R.drawable.img_news6),
        news("heh","detikcom | 7 Jam Yang Lalu",R.drawable.img_news7),
        news("Cina mencina","detikcom | 1 hari Yang Lalu",R.drawable.img_news9),
        news("Terungkap Ternyata Guru nobita Itu jahat","detikcom | 1 menit Yang Lalu",R.drawable.img_news8)

    )
}