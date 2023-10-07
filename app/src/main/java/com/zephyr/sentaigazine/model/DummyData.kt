package com.zephyr.sentaigazine.model

import com.zephyr.sentaigazine.R

class DummyData {

    companion object{
        fun getDummySentaiData(): ArrayList<Sentai>{
            return arrayListOf(
                Sentai(
                    name = "Himitsu Sentai Gorenger",
                    rating = 6.8,
                    productionYear = "1975",
                    totalMember = 5,
                    detailStory = "Himitsu Sentai Gorenger adalah serial televisi Jepang yang pertama kali ditayangkan pada tahun 1975. Ini adalah serial Super Sentai pertama yang diproduksi oleh Toei Company, dan menjadi awal dari waralaba Super Sentai yang terkenal di Jepang.\nCerita \"Himitsu Sentai Gorenger\" berpusat pada sekelompok lima agen muda yang direkrut oleh organisasi rahasia EAGLE (Earth Guard League) untuk melawan organisasi jahat yang dikenal sebagai Black Cross Army. Setiap anggota Gorenger memiliki kostum tempur yang unik dan kemampuan khusus.\nLima anggota Gorenger adalah:\n\n1. Aka Ranger (Kapten Tsuyoshi Kaijo) - Pemimpin tim, mengenakan kostum merah dan mahir dalam pertarungan jarak dekat.\n2. Ao Ranger (Akira Shinmei) - Mengenakan kostum biru dan adalah ahli dalam seni bela diri.\n3. Ki Ranger (Daita Ooiwa) - Mengenakan kostum kuning dan mahir dalam penggunaan kekuatan fisik.\n4. Momo Ranger (Peggy Matsuyama) - Mengenakan kostum merah muda dan ahli dalam penggunaan senjata yang dapat dilemparkan.\n5. Mido Ranger (Kenji Asuka) - Mengenakan kostum hijau dan adalah ahli dalam taktik survival dan penyamaran.",
                    sentaiPhoto = R.drawable.himitsusentaigorenger,
                    urlMerchandise = "https://www.tokopedia.com/search?st=&q=gorenger&srp_component_id=02.01.00.00&srp_page_id=&srp_page_title=&navsource="
                ),
            )
        }
    }

}