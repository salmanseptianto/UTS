package com.salmanbrebes.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.persiapanuts.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(
            DataModel(
                R.drawable.srimulyani,
            "BERITA 1",
            "Sri Mulyani: Penguatan SDM Ekonomi dan Keuangan Syariah Dimulai Lewat Pendidikan",
            "Menteri Keuangan (Menkeu) Sri Mulyani Indrawati mengatakan, untuk menciptakan SDM unggul di sektor ekonomi dan keuangan syariah harus dimulai dari pendidikan. Perbaikan pendidikan SDM dilakukan lewat rancangan kurikulum yang bisa menjawab berbagai tantangan.\n" +
                    "\n" +
                    "\"Salah satu area yang perlu ditingkatkan ini dari sisi kurikulum karena menentukan konten dan pendidikan itu sendiri. Ini membutuhkan kurikulum yang sejalan dengan perubahan zaman, perkembangan ilmu pengetahuan, teknologi dan kebutuhan industrinya,\" kata Sri Mulyani di Jakarta, Kamis, (28/10/2021).\n" +
                    "\n" +
                    "Tantangan perekonomian semakin rumit. Bukan hanya sektor kesehatan tetapi juga dari sisi sosial, ekonomi dan keuangan karena dampak Covid-19. Tantangan menjadi tidak mudah bagi semua aspek tak terkecuali komposisi ekonomi dan keuangan syariah.\n" +
                    "\n" +
                    "Dia menilai kurikulum merupakan bidang kajian yang menggabungkan berbagai mata kuliah yang saling berhubungan untuk menghasilkan kompetensi dari setiap lulusannya. Artinya sikap dan tata nilai, aspek pengetahuan dan ketermpilan harus bisa mengacu pada nilai-nilai keislamanan yang terus diadaptasi.\n" +
                    "\n" +
                    "\"Sejalan dengan standar pendidikan, kurikulum dikembangkan dengan perspektif kekinian dan juga reformasi di sektor pendidikan seperti yang dijalankan pada program kampus merdeka,\" kata dia.")
        )

        data?.add(
            DataModel(
                R.drawable.pelajar,
            "BERITA 2",
            "1.000 Pelajar Kota Tarakan Peroleh Beasiswa Transisi\n",
            "Pemerintah Kota Tarakan akan terus berkomitmen dalam meningkatkan pembangunan di bidang pendidikan. Tidak hanya diwujudkan dalam peningkatan pembangunan fasilitas pendidikan, pemerintah kota juga berkomitmen untuk terus mengalokasikan anggaran untuk secara langsung memberikan beasiswa bagi para pelajar baik yang diberikan atas apresiasi terhadap prestasi maupun untuk menjadi stimulus pelajar yang berasal dari keluarga ekonomi lemah.\n" +
                    "\n" +
                    "Melalui proses seleksi oleh tim yang telah dibentuk, sebanyak 1.000 siswa SD/MI dan SMP/MTS mendapatkan bantuan pendidikan beasiswa transisi. Bertempat di Auditorium SMP N 1 Tarakan, Rabu (27/10).\n" +
                    "\n" +
                    "Wali Kota Tarakan, dr.H.Khairul, M.Kes, menyerahkan secara simbolis bantuan tersebut kepada perwakilan siswa yang mendapatkannya. Wali kota berharap para penerima beasiswa ini untuk dapat memanfaatkan bantuan yang diberikan untuk menunjang kegiatan belajar. Sebagai informasi, beasiswa transisi ini telah diberikan pemerintah kota semenjak tahun 2020.\n" +
                    "\n" +
                    "Selain beasiswa transisi, Pemerintah Kota Tarakan telah memberikan beasiswa prestasi peringkat kelas semenjak tahun 2019 dan telah diterima oleh 3.000 peserta didik.\n" +
                    "\n" +
                    "“Program ini akan diteruskan, tidak boleh ada anak yang tidak bersekolah di Tarakan karena faktor ekonomi,” tegas wali kota.")
        )

        data?.add(
            DataModel(
                R.drawable.tips,
            "BERITA 3",
            "5 Tips Jaga Kesehatan Mental Pelajar di Luar Negeri",
            "Pandemi COVID-19 yang mulai membaik membuat industri pendidikan kembali dibuka. Bagi mahasiswa yang menempuh pendidikan di luar negeri bisa kembali melakukan pembelajaran secara offline di kampus.\n" +
                    "\n" +
                    "Tak jarang, mahasiswa internasional akan kembali merindukan rumah. Pandemi yang juga mengubah kebiasaan mahasiswa untuk belajar secara online berpotensi menimbulkan stres.\n" +
                    "\n" +
                    "Oleh karena itu, menjadi penting bagi mahasiswa yang kembali belajar di luar negeri untuk menjaga kesehatan mental mulai dari sekarang.\n" +
                    "\n" +
                    "Melansir dari India Today, Rabu (27/10/2021), berikut adalah beberapa tips yang bisa dilakukan untuk menjaga kesehatan mental saat kembali berkuliah di luar negeri.\n" +
                    "\n" +
                    "2 dari 4 halaman\n" +
                    "1. Meditasi\n" +
                    "[Fimela] Meditasi\n" +
                    "Perbesar\n" +
                    "Ilustrasi Meditasi | unsplash.com\n" +
                    "Kesehatan mental menjadi penting untuk diperhatikan agar mahasiswa bisa menyelesaikan pendidikan dengan lancar.\n" +
                    "\n" +
                    "Terkadang, menjaga pikiran untuk tetap tenang di bawah tekanan kerja dan tenggat waktu menjadi tugas yang menakutkan.\n" +
                    "\n" +
                    "Akan tetapi, coba lakukan meditasi yang bermanfaat untuk membantu mengurangi stres dan kecemasan.\n" +
                    "\n" +
                    "Pikiran yang tenang memungkinkan Anda lebih berkonsentrasi dan produktif sepanjang hari. Jadi, semua tugas yang diberikan oleh dosen menjadi lebih mudah untuk dikerjakan.\n" +
                    "\n" +
                    "2. Menulis Jurnal\n" +
                    "\n" +
                    "Menulis menjadi kegiatan yang direkomendasikan untuk menjernihkan dan menenangkan pikiran. Mencatat semua pikiran dan perasaan membantu mengurangi intensitas kecemasan, emosi yang terpendam, dan frustrasi.\n" +
                    "\n" +
                    "Prinsip dasar dari menulis adalah membiarkan pikiran dan emosi muncul ke permukaan sehingga membersihkan pikiran yang tertekan. Anda bisa menggunakan jurnal untuk mengatasi frustrasi dan kecemasan tersebut.\n" +
                    "\n")
        )

        data?.add(
            DataModel(
                R.drawable.simak,
            "BERITA 4",
            "Simak Upaya Pemerintah Cetak Generasi Bangsa yang Produktif ",
            "Dalam mendukung pendidikan di Indonesia, Kementerian Keuangan (Kemenkeu) telah mengalokasikan anggaran sekitar Rp 56,2 triliun melalui Kementerian Pendidikan, Kebudayaan, riset, dan Teknologi, untuk program Merdeka Belajar di 2021.\n" +
                    "\n" +
                    "Sekretaris Jenderal Kementerian Keuangan Heru Pambudi mengatakan, dana tersebut harus dimanfaatkan sebaik mungkin agar mampu mencetak generasi bangsa yang produktif pada tahun 2045.\n" +
                    "\n" +
                    "“Di tahun 2045 bonus demografi kita adalah yang puncak-puncaknya, itu prediksi dimana generasi yang sekarang ini akan produktif di tahun 2045,” kata Heru dalam sambutan di acara CERDIK (Cerita di Kemenkeu Mengajar) secara virtual, Senin (25/10/2021).\n" +
                    "\n" +
                    "Menurutnya, jika bonus demografi ini tidak disertai edukasi yang baik, maksimal, berkualitas, dan menciptakan manusia yang maju, mandiri, dan modern, maka bonus demografi ini tidak akan maksimal.\n" +
                    "\n" +
                    "Oleh karena itu menjadi sebuah kewajiban untuk mempersiapkan generasi muda dan sehingga bisa memanfaatkan bonus demografi ini secara maksimal.\n" +
                    "\n" +
                    "“Bagaimana pendukungnya dalam bentuk penganggaran yang semaksimal mungkin ada program Merdeka belajar, yang ini sudah kita dengar dan kita sudah mulai lihat implementasinya di dalam APBN kita untuk program Merdeka belajar pada tahun 2021 kita siapkan dana yang luar biasa lumayan besar yaitu Rp 56,2 triliun,” ujarnya.\n" +
                    "\n" +
                    "Sehingga, kita harus bisa memanfaatkan dana ini, supaya betul-betul bisa menghasilkan suatu generasi yang mampu memanfaatkan bonus demografi yang maksimal.\n" +
                    "\n" +
                    "Selanjutnya Kemenkeu tidak hanya terbatas pada menyiapkan anggaran, pihaknya juga ingin berkontribusi lebih lagi khususnya dalam bagaimana kita bisa mengedukasi masyarakat berkaitan dengan tugas dan fungsi dan peran daripada Kementerian Keuangan, khususnya dalam rangka bagaimana mencerdaskan kehidupan berbangsa dan negara.\n" +
                    "\n" +
                    "“Khususnya lagi ini berkaitan bagaimana pembangunan human capital bisa kita kuatkan untuk mendorong kemajuan teknologi, pengetahuan, keterampilan dan keahlian bangsa kita Indonesia yang kita cintai ini,” katanya.\n" +
                    "\n" +
                    " ")
        )

        data?.add(
            DataModel(
                R.drawable.kampus,
            "BERITA 5",
            "12 Kampus Pencetak Orang Terkaya Terbanyak",
            "Sebagian besar orang terkaya di Amerika Serikat yang masuk dalam daftar Forbes 400 ternyata pernah menempuh pendidikan di universitas Ivy League, kumpulan 8 universitas bergengsi di AS.\n" +
                    "\n" +
                    "Namun, beberapa di antara orang terkaya tersebut juga pernah menempuh pendidikan di universitas negeri terkemuka AS.\n" +
                    "\n" +
                    "Miliarder sekaligus CEO perusahaan televisi kabel Mediacom di AS Rocco Commisso, misalnya. Dia pernah berkuliah di Columbia University sebagai pemain sepak bola dengan beasiswa penuh pada akhir tahun 60-an sampai 70-an.\n" +
                    "\n" +
                    "Commisso adalah imigran Italia. Ia merasa harus tinggal di New York untuk menghidupi keluarganya ketika ayahnya sedang sakit.\n" +
                    "\n" +
                    "Selama berkuliah, Commisso mendapatkan kepercayaan diri dan motivasi sehingga mendorongnya menjadi orang terkaya AS versi Forbes.\n" +
                    "\n" +
                    "Melansir dari Forbes, Jumat (22/10/2021), Commisso berkata, “Saya memiliki perasaan bahwa jika bisa berhasil di sini, Anda bisa melakukannya di mana saja.”\n" +
                    "\n" +
                    "Ia melanjutkan, “Ketika seseorang memberi Anda kesempatan seperti yang dilakukan Columbia untuk saya, bilang kepada diri Anda bahwa saya akan melakukan yang terbaik untuk membuat Anda percaya bahwa saya sepadan dengan uang yang dikeluarkan.”\n" +
                    "\n" +
                    "Columbia adalah salah satu dari 12 universitas yang menjadi tempat 112 miliarder AS pernah berkuliah. Sebanyak 71 dari miliarder tersebut berkuliah di Ivy League, yaitu Columbia, Cornell, Dartmouth, Harvard, Pennsylvania, Princeton, dan Yale.\n" +
                    "\n" +
                    "Brown University adalah satu-satunya anggota Ivy League yang tidak masuk dalam universitas tempat miliarder AS dalam daftar Forbes 400 menempuh pendidikan.\n" +
                    "\n" +
                    "Universitas yang menempati peringkat teratas dengan alumni miliarder terbanyak adalah Harvard. Sebanyak 15 miliarder AS pernah berkuliah di universitas tersebut.\n" +
                    "\n" +
                    "Selanjutnya, peringkat kedua diikuti oleh Pennsylvania sebanyak 14 orang. Selain itu, peringkat selanjutnya ditempati oleh Yale dan Stanford dengan 12 orang alumni.")
        )

        data?.add(
            DataModel(
                R.drawable.kominfo,
            "BERITA 6",
            "Kemkominfo dan MUI Dorong Inovasi Pembelajaran agar Bangkit dari Pandemi",
            "Pandemi Covid-19 yang telah melanda selama lebih dari satu setengah tahun ini memberikan dampak yang luar biasa pada dunia, tak terkecuali di bidang pendidikan.\n" +
                    "\n" +
                    "Proses belajar mengajar terkendala baik bagi siswa maupun pendidik mulai dari terbatasnya infrastruktur, keterbatasan gawai serta tantangan psikologis yang dapat melanda siswa, pendidik maupun juga orang tua di masa pandemi.\n" +
                    "\n" +
                    "Menindaklanjuti hal tersebut, Direktorat Jenderal Informasi dan Komunikasi Publik (Ditjen IKP) Kementerian Komunikasi dan Informatika (Kominfo) bekerjasama dengan Majelis Ulama Indonesia (MUI) Pusat, MUI Provinsi Kalimantan Barat dan Komisi Pendidikan dan Kaderisasi, menyelenggarakan kegiatan Literasi Bangkit dari Covid-19 dengan Nalar dan Aksi Bersama Berlandaskan Fatwa MUI dengan tema “Strategi dan Inovasi Pembelajaran di Masa Pandemi Covid-19”.\n" +
                    "\n" +
                    "Acara ini diselenggarakan secara daring. Narasumber yang hadir secara virtual memberikan paparannya antara lain Sekretaris Jenderal MUI, Amirsyah Tambunan; Sub Koordinator Media Online Kominfo, Annisaa Bonita PP; Wakil Sekjen MUI, Muhammad Ziyad; serta Ketua MUI Pusat Armai Arief.\n" +
                    "\n" +
                    "Acara dibuka dengan sambutan dari Ketua Umum MUI Kalimantan Barat, Basri yang menyambut baik penyelenggaraan kegiatan ini, dengan harapan dapat menjadi rujukan positif sehingga dapat mengurangi kendala yang dialami dalam proses belajar mengajar selama pandemi.\n" +
                    "\n" +
                    "Dunia pendidikan tidak hanya menghadapi tantangan dalam hal teknologi tetapi juga bagaimana caranya agar kegiatan belajar mengajar dapat tetap berjalan serta tetap menjaga protokol kesehatan.\n" +
                    "\n" +
                    "“Diharapkan pendidik mampu memberikan pemahaman terhadap pelajar bahwa belajar dirumah adalah salah satu ikhtiar untuk mencegah penularan Covid-19,” ujarnya.\n" +
                    "\n" +
                    "Amirsyah Tambunan menjelaskan peran MUI dalam penanggulangan Covid-19 khususnya fatwa-fatwa yang dikeluarkan MUI terkait penyelenggaraan ibadah saat terjadinya Covid-19.\n" +
                    "\n" +
                    "Disampaikan Amirsyah bahwa MUI turun tangan di hampir semua kegiatan terkait pandemi Covid-19 ini, mulai dari pembagian sembako, penyembelihan hewan kurban, hingga membimbing petugas medis dalam pengurusan jenazah, semua ada fatwanya.\n" +
                    "\n" +
                    "“Majelis Ulama juga mengeluarkan fatwa kepada petugas medis dimana ditengah kesibukannya diberikan rukhsah untuk bertayamum termasuk juga untuk shalat jamak qasar”, kata Amirsyah\n" +
                    "\n" +
                    "Namun menurut Amirsyah fatwa saja belum cukup, karena MUI juga harus mensosialisasikan melalui pendidikan baik lewat daring maupun luring, dan penyampaian sosialisasi ini banyak mendapatkan hambatan dengan maraknya hoax yang beredar dan berita-berita tidak benar yang menyudutkan MUI.")
        )

        data?.add(
            DataModel(
                R.drawable.menuju,
            "BERITA 7",
            "Menuju Madrasah dan Pesantren Ramah Disabilitas, Ini yang Perlu Diperhatikan",
            "Direktur Pendidikan Diniyah dan Pondok Pesantren Kementerian Agama (Kemenag) Waryono mengatakan, lingkungan asrama pesantren secara representatif sudah bersih, nyaman, sehat, dan ramah disabilitas.\n" +
                    "\n" +
                    "Begitu juga dengan masjid yang sudah dilengkapi fasilitas ramah disabilitas seperti ketersediaan kursi roda dan sebagainya.\n" +
                    "\n" +
                    "\"Al-Quran sudah ada yang braille, tapi kitab kuning ini yang belum ada. Kalau kita ingin benar-benar menerapkan pendidikan untuk semua maka ini seharusnya bisa terpenuhi,\" katanya mengutip keterangan pers ditulis Selasa (19/10/2021).\n" +
                    "\n" +
                    "Seperti diketahui, jumlah pesantren di Indonesia mencapai 33.980 sedangkan satuan pendidikan madrasah sebanyak 83.468. Akan tetapi, dari total madrasah tersebut hanya 5 persen milik pemerintah atau negeri, sementara sisanya 95 persen adalah swasta.\n" +
                    "\n" +
                    "\"Jadi kalau ada bantuan infrastruktur itu ya lebih banyak di negeri padahal mayoritas madrasah kita itu milik dan dikelola  swasta,\" imbuhnya.\n" +
                    "\n")
        )


        data?.add(
            DataModel(
                R.drawable.dukung,
            "BERITA 8",
            "Di Pulau Sebatik, BRI Berikan Mobil Penunjang ke MTs As'adiyah",
            " PT Bank Rakyat Indonesia Tbk (BRI) mendukung upaya pemerintah dalam perbaikan kualitas pendidikan di Indonesia melalui penyaluran bantuan dalam program Tanggung Jawab Sosial (Corporate Social Responsibility) #BRIPeduli.\n" +
                    "\n" +
                    "Salah satunya, BRI memberikan bantuan sarana penunjang mobil sekolah di Madrasah Tsanawiyah (Mts) As'adiyah, yang terletak di Pulau Sebatik, Nunukan, Kalimantan Utara.\n" +
                    "\n" +
                    "Madrasah Tsanawiyah As'adiyah berdiri pada 1930 dan merupakan madrasah tertua di Pulau Sebatik. Pulau ini merupakan wilayah terluar Indonesia dan berbatasan langsung dengan negara Malaysia.\n" +
                    "\n" +
                    "Pemimpin Cabang BRI Nunukan Rizky Fadillah menjelaskan, melalui program Tanggung Jawab Sosial Perusahaan, BRI mengambil peran mendukung kemajuan dan kualitas pendidikan di Indonesia untuk menciptakan SDM yang berkualitas.\n" +
                    "\n" +
                    "\"Penyaluran bantuan ini merupakan wujud dan komitmen BRI dalam mendukung kemajuan Pendidikan di Indonesia khususnya untuk di wilayah 3T (Terluar, Terdepan, Tertinggal),\" jelas dia, Senin (18/10/2021).\n" +
                    "\n" +
                    "Keberadaan mobil ini dinilai sangat membantu para santri. Apresisasi disampaikan Kepala Sekolah Madrasah Tsanawiyah As'adiyah Kamal Suryanto.\n" +
                    "\n" +
                    "Dia mengucapkan terima kasih kepada BRI yang telah memberikan bantuan mobil penunjang bagi santri dan santriwati dan komunitas di Madrasah Tsanawiyah As'adiyah.\n" +
                    "\n" +
                    "“Sebelum ada bantuan ini, kami hanya menggunakan mobil pick up sebagai transportasi bagi para santri dan santriwati, yang mana resikonya cukup tinggi. Sebanyak 400 santri dan santriwati dari asrama harus kami mobilisasi setiap hari dari asrama ke sekolah. Bantuan ini tentu sangat membantu mobilitas para santri/santriwati yang lebih aman dan nyaman dari sebelumnya” tutur Kamal.")
        )

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener {
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("berita", item?.berita)
                intent.putExtra("desc", item?.desc)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}