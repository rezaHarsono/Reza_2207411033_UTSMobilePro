package com.example.uts

object DataProvider {
    fun getBeritaById(beritaId: Int): Berita? {
        return beritaList.find { it.id == beritaId }
    }
    var beritaList = listOf(
        Berita(
            id = 1,
            image = R.drawable.berita1,
            headerImage = R.drawable.berita1,
            judul = "Ramainya Lebaran Depok, dari Pawai Rantang hingga Fashion Show Pakaian Zaman Dulu",
            deskripsi = "Ramainya Lebaran Depok, dari Pawai Rantang hingga Fashion Show Pakaian Zaman Dulu",
                    "\n" +
                    "\"Seperti tadi ada acara rantangan, besanan, kayak tadi sebenarnya itu bagian dari boleh dibilang ciri khas Depok,\" ujar Sekretaris Daerah Kota Depok, Supian Suri, Minggu.\n" +
                    "\n" +
                    "Ada pula kegiatan ngubek empang, nyedengin baju, potong kebo andilan, fashion show pakaian remaja zaman dulu, penampilan lenong, hingga tarian tradisional.\n" +
                    "\n" +
                    "Acara ini diramaikan dengan pawai warga sambil membawa rantang. Rantangan dibawa warga untuk makan bersama dengan warga lain sambil bertukar lauk pauk.\n" +
                    "\n" +
                    "Lauk yang dibawa warga ada ikan asin tembang, ikan perek, ikan jamblang, sayur asem, sayur besan, semur jengkol hingga pete.\n" +
                    "\n" +
                    "Saat pawai ada kegiatan rombongan besan. Menggambarkan seolah-olah warga sedang mengarak besan layaknya resepsi pernikahan.\n" +
                    "\n" +
                    "Supian Suri menjelaskan, Depok merupakan daerah heterogen dan penduduknya bukan hanya orang Depok. Karena itu, KOOD berencana pada Lebaran Depok tahun depan, akan menjadikan kegiatan untuk semua warga yang tinggal di Depok.\n" +
                    "\n" +
                    "\"Insyaallah Lebaran Depok ya lebaran semua warga Depok dengan latar belakang semua budayanya masing-masing,\" jelas Supian Suri yang juga merupakan pengurus KOOD.\n" +
                    "\n" +
                    "Nantinya, akan menampilkan kuliner dari Pulau Jawa, Sumatera, Sulawesi hingga Papua. Begitupun dengan budaya, tidak hanya menampilkan Betawi, namun turut menampilkan budaya dari berbagai suku di Indonesia.\n" +
                    "\n" +
                    "\"Budayanya juga begitu, malam pertama Betawi, besoknya budaya daerah lain, jadi budaya semua warga Depok dari berbagai suku bangsa bisa merasakan,\" ucap dia."
        ),
        Berita (
            id = 2,
            image = R.drawable.berita2,
            headerImage = R.drawable.berita2,
            judul = "Akbar Tandjung Diberi Penghargaan Kehormatan sebagai Maestro Aktivis Indonesia",
            deskripsi = "Forum Aktivis Nasional (FAN) memberikan penghormatan kepada politikus senior Partai Golkar, Akbar Tandjung sebagai Maestro Aktivis Indonesia.",
            isiKonten = "Forum Aktivis Nasional (FAN) memberikan penghargaan kehormatan kepada politikus senior Partai Golkar, Akbar Tandjung sebagai Maestro Aktivis Indonesia. FAN menilai Akbar Tandjung sebagai tokoh RI yang memiliki pengaruh dalam pemikiran demokrasi menjelang dan pasca reformasi.\n" +
                    "\n" +
                    "Acara \"Tribute to Bang Akbar Tandjung Maestro Aktivis Indonesia\" digelar di Gedung Nusantara IV DPR RI, Senayan Jakarta Pusat, Minggu (19/5/2024).\n" +
                    "\n" +
                    "Ketua Umum (Ketum) Forum Aktivis Nasional, Bursah Zarnubi menjelaskan, pertimbangan pihaknya menyematkan penghormatan kepada Akbar Tandjung. Ia bercerita bagaimana peran Akbar Tandjung mendirikan Kelompok Cipayung.\n" +
                    "\n" +
                    "\"Rekam jejak yang membuat kita bangga karena dedikasi, kontribusi, membentuk sejarah kebangsaan dalam 50 tahun terakhir,\" kata Bursah.\n" +
                    "\n" +
                    "Dia mengatakan, Akbar Tandjung menjadi aktivis yang paling muda saat organisasi Cipayung dibentuk. Adapun, kelompok ini beranggotakan HMI, GMNI, GMKI serta PMKRI.\n" +
                    "\n" +
                    "\"Bang Akbar Ketum yang paling muda, jadi Akbar Ketum HMI paling muda saat itu 27 tahun selebihnya di atas 30,\" katanya."
        ),
        Berita (
            id = 3,
            image = R.drawable.berita3,
            headerImage = R.drawable.berita3,
            judul = "Neuralink Milik Elon Musk Cari Kandidat Kedua untuk Ditanami Chip di Otaknya",
            deskripsi = "Perusahaan Neuralink milik Elon Musk tengah mencari kandidat kedua untuk ditanami benang implant dan chip di otaknya",
            isiKonten = "Startup implan otak milik Elon Musk, Neuralink, menerima lamaran untuk peserta uji coba manusia kedua untuk menguji perangkatnya.\n" +
                    "\n" +
                    "Permintaan tersebut muncul lima bulan setelah Neuralink menanamkan chip otak ke peserta uji coba manusia pertama, Noland Arbaugh yang berusia 30 tahun, dan hanya seminggu setelah perusahaan tersebut mengakui bahwa implannya mengalami masalah yang tidak terduga.\n" +
                    "\n" +
                    "BACA JUGA:\n" +
                    "Bakal Resmikan Starlink, Elon Musk Tiba di Bali\n" +
                    "Neuralink mengatakan bahwa benang yang menghubungkan chip ke otak Arbaugh telah ditarik kembali, menyebabkan masalah kinerja, meskipun perusahaan mengatakan telah melakukan penyesuaian untuk meningkatkan fungsinya.\n" +
                    "\n" +
                    "Namun, Arbaugh mengatakan implan tersebut – yang memungkinkan dia mengendalikan kursor komputer dengan otaknya – telah mengubah hidupnya. Arbaugh menderita lumpuh sejak 2016 setelah kecelakaan menyelam.\n" +
                    "\n" +
                    "“Saya tidak punya apa-apa untuk bangun di pagi hari, dan ini telah mengubah hal itu bagi saya,” kata Arbaugh kepada Good Morning America dalam sebuah wawancara yang ditayangkan pada hari Jumat. “Saya sangat senang bisa menjadi bagian dari sesuatu yang saya yakini sangat monumental. Ini adalah langkah maju selanjutnya dalam membantu orang-orang yang mengalami kelumpuhan.”\n" +
                    "\n" +
                    "Kini, Neuralink mencari lebih banyak orang seperti Arbaugh untuk menguji chip otaknya. “Jika Anda menderita quadriplegia dan ingin mencari cara baru dalam mengendalikan komputer Anda, kami mengundang Anda untuk berpartisipasi dalam uji klinis kami,” kata perusahaan itu pada X.com sebagaimana dilaporkan oleh CNN."
        ),
        Berita(
            id = 4,
            image = R.drawable.berita4,
            headerImage = R.drawable.berita4,
            judul = "Investor Korea Mau Akuisisi Bank Nobu, OJK: Belum Ada Pengajuan Tertulis",
            deskripsi = "Berita mengenai akuisisi Bank Nobu oleh Hanwha Life tersebut bergulir di tengah proses penggabungan atau merger antara Bank Nobu dan MNC Bank.",
            isiKonten = "Perusahaan asuransi asal Korea Selatan yaitu Hanwha Life berencana untuk mengakuisisi 40 persen saham Bank Nobu dari Lippo Group. Rencana aksi korporasi ini telah ditandatangani di awal Mei 2024. Namun ternyata rencana akuisisi  Bank Nobu oleh Hanwha Life belum resmi masuk ke meja Otoritas Jasa Keuangan (OJK).\n" +
                    "\n" +
                    "Kepala Eksekutif Pengawas Perbankan Otoritas Jasa Keuangan (OJK) Dian Ediana Rae mengatakan, sampai saat ini OJK belum mendapatkan pengajuan secara tertulis rencana akuisisi Bank Nobu oleh Hanwha Life Korea.\n" +
                    "\n" +
                    "\"OJK belum mendapatkan pengajuan secara tertulis atas rencana akuisisi dimaksud,\" kata Dian dikutip dari Antara, Minggu (19/5/2024).\n" +
                    "\n" +
                    "Proses akuisisi atau pengambilalihan memerlukan waktu yang tidak sebentar karena calon investor perlu mendapatkan persetujuan OJK terlebih dahulu sebagaimana POJK No.41/POJK.03/2019 tentang Penggabungan Peleburan Pengambilalihan Integrasi dan Konversi Bank Umum (POJK P3IK).\n" +
                    "\n" +
                    "Untuk mendapatkan persetujuan OJK, langkah ini dimulai dengan tahap pendahuluan yaitu melakukan fit and proper test terhadap calon pemegang saham pengendali (PSP) sebagai pihak yang akan mengambil alih bank, termasuk perizinan dan pelaksanaan pengambilalihan sebagaimana diatur dalam POJK No.27/POJK.03/2016 tentang Penilaian Kepatutan dan Kemampuan bagi Pihak Utama Lembaga Jasa Keuangan (POJK PKK) dan POJK P3IK.\n" +
                    "\n" +
                    "\"Sehubungan dengan hal tersebut, OJK mengkomunikasikan hal-hal yang perlu ditindaklanjuti oleh Manajemen Bank Nobu terkait dengan kebijakan OJK mengenai perubahan kepemilikan bank umum yang mengubah pemegang saham pengendali Bank,\" kata Dian."
        ),
        Berita(
            id = 5,
            image = R.drawable.berita5,
            headerImage = R.drawable.berita5,
            judul = "Erik ten Hag Dapat Angin Surga dari Bos Manchester United, Berpeluang Dipertahankan Musim Depan",
            deskripsi = "Erik ten Hag mendapat angin segar dari pemilik saham minoritas Manchester United Sir Jim Ratcliffe. Miliarder asal Inggris itu membuka peluang pihaknya mungkin mempertahankan juru taktik MU musim depan.",
            isiKonten = "Pemilik saham minoritas Manchester United Sir Jim Ratcliffe baru-baru ini memberi angin segar buat pelatih Setan Merah Erik ten Hag. CEO INEOS itu mengeluarkan pernyataan yang memberi sinyal sang juru taktik masih berpeluang lanjut menukangi MU musim depan.\n" +
                    "\n" +
                    "Seperti diketahui, masa depan Ten Hag belakangan ramai menjadi perbincangan. Juru taktik asal Belanda diyakini bakal didepak tak lama lagi, menyusul kinerjanya yang anjlok sepanjang kampanye 2023/2024.\n" +
                    "\n" +
                    "BACA JUGA:\n" +
                    "Pemain Manchester United Tak Sengaja Bocorkan Nasib Erik ten Hag kepada Tetangganya\n" +
                    "Erik ten Hag gagal mengantar anak-anak asuhnya mempertahankan gelar Carabao Cup. Mereka juga tersingkir dari Liga Champions sejak fase grup, dan dipastikan tak lolos ke ajang serupa musim depan lantaran masih terkunci di urutan 8 klasemen hingga mendekati pekan terakhir Liga Inggris.\n" +
                    "\n" +
                    "Situasi tersebut membuat sejumlah nama sempat santer dikaitkan dengan jabatan juru taktik baru Manchester United. Thomas Tuchel, Graham Potter, Thomas Frank, hingga Gareth Southgate jadi deretan sosok pelatih yang dianggap cocok menduduki kursi panas Old Trafford.\n" +
                    "\n" +
                    "Walau begitu, bos MU belum lama ini justru mengirim sinyal dirinya kemungkinan bakal mempertahankan Erik ten Hag hingga setelah musim panas. Pasalnya, mantan pelatih Ajax dinilai bukan satu-satunya pihak yang bertanggung jawab atas situasi buruk Setan Merah saat ini.\n" +
                    "\n" +
                    "\"Ini bukan soal manajer. Jika Anda lihat Manchester United dalam 11 tahun terakhir, kinerjanya tidak terlalu buruk. Akan tetapi, belum ada pula manajer yang berhasil menjalankan tugasnya dengan begitu baik,\" ucap Ratcliffe.\n" +
                    "\n" +
                    "\"Padahal ada beberapa pelatih bagus yang didatangkan ke Manchester United (namun hasilnya tetap sama). Jadi Anda tahu, kesimpulannya yang belum bagus (dari MU) adalah lingkungan di sekitar pelatih, karena tak satu pun dari pelatih-pelatih tersebut mampu sukses (bersama Setan Merah),\" tandas dia, dikutip dari Football Transfers."
        ),
        Berita(
            id = 6,
            image = R.drawable.berita6,
            headerImage = R.drawable.berita6,
            judul = "Olahraga Cuma di Akhir Pekan, Ini 3 Tips buat Weekend Warrior Supaya Tidak Rentan Cedera",
            deskripsi = "Tips bagi Anda yang biasa berolahraga di akhir pekan alias weekend warrior, agar meminimalisasi risiko cedera.",
            isiKonten = "Ada sebagian orang yang hanya sempat untuk berolahraga di akhir pekan yakni Sabtu dan Minggu. Biasanya di hari-hari libur itulah si weekend warrior akan menghabiskan waktu untuk melakukan olahraga.\n" +
                    "\n" +
                    "Nyatanya, orang-orang yang jarang berolahraga lalu ketika berolahraga jadi punya risiko lebih besar untuk cedera dibandingkan yang rutin berolahraga. Terutama mereka si weekend warrior yang memilih olahraga intensitas tinggi.\n" +
                    "\n" +
                    "\"Biasanya orang yang jarang berolahraga, pas olahraga memilih melakukan olahraga dengan intensitas sangat tinggi atau memaksa. Nah itu risiko cedera lebih tinggi,\" kata dokter spesialis ortopedi dan traumatologi konsultan Yohannes Toban Layuk Allo.\n" +
                    "\n" +
                    "Terkait hal tersebut, Toban berbagi tips bagi Anda yang biasa berolahraga di akhir pekan agar meminimalisasi risiko cedera.\n" +
                    "\n" +
                    "1. Olahraga Lebih Dipersering\n" +
                    "\n" +
                    "Toban menyarankan untuk tidak cuma berolahraga di Sabtu dan Minggu tapi lebih rutin. Idealnya olahraga dilakukan 30 menit per hari yang ditotal bisa 150 menit per minggu sesuai anjuran World Health Organization (WHO).\n" +
                    "\n" +
                    "2. Jika Tidak Bisa Rutin, Saat Olahraga Akhir Pekan Lakukan Olahraga Refreshing\n" +
                    "\n" +
                    "\"Jika tidak bisa, oke kalau begitu saat berolahraga di weekend sifatnya berolahraga refreshing untuk mengembalikan kebugaran,\" saran dokter yang sehari-hari praktik di Rumah Sakit Pondok Indah - Bintaro Jaya, Tangerang Selatan menjawab pertanyaan Health Liputan6.com beberapa waktu lalu. \n" +
                    "\n" +
                    "\"Jadi, kan sudah capek tuh kerja Senin sampai Jumat, ya pas akhir pekan berolahraga yang menyegarkan bukan yang ngoyo,\" sarannya."
        ),
        Berita(
            id = 7,
            image = R.drawable.berita7,
            headerImage = R.drawable.berita7,
            judul = "Polemik Pencopotan Spanduk Sekda Depok Supian Suri, Ini Penjelasan Satpol PP",
            deskripsi = "Kasatpol PP Kota Depok, Dede Hidayat mengatakan, penurunan spanduk Supian Suri atau SS merupakan kebijakan panitia KOOD saat penyelenggaraan kegiatan ngubek Empang.",
            isiKonten = "Polemik penurunan spanduk Sekretaris Daerah (Sekda) Kota Depok, Supian Suri yang akan mencalonkan diri sebagai calon wali kota  dalam kegiatan ngubek empang Lebaran Depok 2024, pada Kamis (16/5/2024), mendapat tanggapan Satpol PP Kota Depok. Penurunan spanduk diseput karana kegiatan ngubek Empang yang diselenggarakan Kumpulan Orang-orang Depok (KOOD), tidak boleh ada unsur politik.\n" +
                    "\n" +
                    "Kasatpol PP Kota Depok, Dede Hidayat mengatakan, penurunan spanduk Supian Suri atau SS merupakan kebijakan panitia KOOD saat penyelenggaraan kegiatan ngubek Empang. Dede yang merupakan ketua pelaksana Lebaran Depok, menilai banyak pendukung dari calon Wali kota lain selain SS yang datang pada ngubek empang.\n" +
                    "\n" +
                    "\"Dasarnya itu panitia lebaran Depok, jadi di situ yang hadir bukan hanya pendukung SS tapi ada pendukung lainnya, jadi untuk suasana kondusif saja,\" ujar Dede saat ditemui pada Lebaran Depok di Alun-Alun Kota Depok, Minggu (19/5/2024).\n" +
                    "\n" +
                    "Dede menjelaskan, KOOD berkomitmen untuk menjaga suasana kondusifitas pada kegiatan KOOD meskipun, Pilkada Kota Depok masih menghitung beberapa bulan kedepan. KOOD berusaha menjaga marwah KOOD yang tidak terlibat politik.\n" +
                    "\n" +
                    "\"Jadi panitia dalam hal ini kood adalah berbudaya dan tidak terlibat dalam politik,\" jelas Dede.\n" +
                    "\n" +
                    "Dede menegaskan, penurunan spanduk SS tidak ada indikasi pesanan politik di Kota Depok menjelang Pilkada Depok. Bahkan Satpol PP Kota Depok maupun KOOD akan bersikap netral dan Satpol PP Kota Depok akan bekerja sesuai penegakan Perda Kota Depok.\n" +
                    "\n" +
                    "\"Tidak ada indikasi pesanan (politik), nggak ada,\" tegas Dede.\n" +
                    "\n" +
                    "Dede mengungkapkan, disatu sisi Satpol PP Kota Depok menghargai SS sebagai Pimpinan Kota Depok yang menjabat sebagai Sekretaris Daerah Kota Depok. Satpol PP Kota Depok berusaha melindungi SS yang merupakan PNS Kota Depok terlibat pada politik sebelum mengundurkan diri.\n" +
                    "\n" +
                    "\"Kalau nanti SS sudah ditetapkan bakal calon, silakan saja tapi kan saat ini kondisinya kan masih sebagai ASN, kita juga menjaga beliau sebagai pimpinan saya,\" ungkap Dede."
        ),
        Berita(
            id = 8,
            image = R.drawable.berita8,
            headerImage = R.drawable.berita8,
            judul = "Dewan Pers: Pemikiran Salim Said Memajukan Kemerdekaan Pers di Indonesia",
            deskripsi = "Ketua Dewan Pers mengatakan, Salim Said merupakan sosok wartawan senior dan juga sahabat bagi semua wartawan di Tanah Air.",
            isiKonten = "Ketua Dewan Pers Ninik Rahayu mengucapkan bela sungkawa atas meninggalnya wartawan senior Prof Salim Said di Rumah Sakit Cipto Mangunkusumo (RSCM) Jakarta.\n" +
                    "\n" +
                    "\"Innalillahi Wainnailaihi Rojiun. Saya dan Dewan Pers menyampaikan duka cita mendalam. Allahumagjfirlahu Warhamhu Waafihi Wa’fuanhu. Insya Allah beliau husnul khotimah. Aamiin,” kata Dr. Ninik Rahayu melalui pesan tertulis di Jakarta, Sabtu 18 Mei 2024.\n" +
                    "\n" +
                    "Dia mengatakan, Salim Said merupakan sosok wartawan senior dan juga sahabat bagi semua wartawan di Tanah Air. Tidak hanya aktif di dunia pemberitaan, Salim Said juga merupakan sosok yang aktif dalam industri perfilman tanah air.\n" +
                    "\n" +
                    "\"Prof Salim Said, adalah sahabat kita bagi kita semua, wartawan senior, tokoh pers dan perfilman nasional,\" ucap dia seperti dikutip dari Antara.\n" +
                    "\n" +
                    "Ninik Rahayu juga menjelaskan bahwa Salim Said merupakan sosok pemikir dengan daya yang kritis dan juga gigih. Hal tersebut membuat berbagai kemajuan di dunia pers nasional.\n" +
                    "\n" +
                    "\"Kegigihan, pemikiran dan daya kritisnya telah memajukan kemerdekaan pers di Indonesia,\" ucap dia.\n" +
                    "\n" +
                    "Salim Said juga dikenal seorang yang aktif dalam menuliskan buku yang banyak menghasilkan berbagai judul yang bertemakan, film, politik dan juga militer semasa hidupnya. Tidak hanya itu saja, Salim Said juga dikenal sebagai seorang yang giat dalam menimba ilmu.\n" +
                    "\n" +
                    "Tidak hanya di Indonesia, Salim Said juga sempat menimba ilmu di Ohio State University. Tidak tanggung-tanggung, dia meraih tiga gelar sekaligus di sana, yakni magister Hubungan Internasional, Ilmu Politik, dan doktor Ilmu Politik."
        ),
        Berita(
            id = 9,
            image = R.drawable.berita9,
            headerImage = R.drawable.berita9,
            judul = "Cuaca Besok Senin 20 Mei 2024: Jabodetabek Pagi Cerah, Siang dan Malam Hujan",
            deskripsi = "Langit pagi di hampir seluruh wilayah Jakarta, Bogor, Depok, Tangerang, dan Bekasi (Jabodetabek) pada besok, Senin 20 Mei 2024 cenderung cerah berawan. Namun pada siang dan malam, sebagian wilayah diprediksi turun hujan.",
            isiKonten = "Langit pagi wilayah Jakarta, Bogor, Depok, Tangerang, dan Bekasi (Jabodetabek) pada awal pekan, Senin 20 Mei 2024 diprediksi cenderung cerah berawan. Begitulah prakiraan cuaca besok.\n" +
                    "\n" +
                    "Untuk siang hari, cuaca hujan dengan intensitas ringan diprediksi akan mengguyur wilayah Jakarta Selatan dan Jakarta Timur, sisanya berawan serta Kepulauan Seribu cerah berawan, demikian seperti laporan Badan Meteorologi, Klimatologi, dan Geofisika (BMKG).\n" +
                    "\n" +
                    "BACA JUGA:\n" +
                    "Pemprov Bakal Beri Bansos ke Warga Pendatang, Ada Syaratnya\n" +
                    "Sedangkan di malam hari, cuaca Jakarta sebagian wilayahnya diprakirakan berawan dan cerah berawan.\n" +
                    "\n" +
                    "Sementara itu, wilayah penyangga Jakarta yaitu Bekasi dan Depok, Jawa Barat diprediksi siang hari berawan, namun malamnya diguyur hujan berintensitas ringan. Sedangkan di Kota Bogor, Jawa Barat pada siang hingga malam hari diprakirakan hujan ringan.\n" +
                    "\n" +
                    "\"Waspada potensi hujan yang dapat disertai kilat/petir dan angin kencang pada skala lokal dan durasi relatif singkat antara menjelang siang hingga menjelang malam hari di sebagian wilayah Kabupaten dan Kota Bogor, Kabupaten Cianjur, Kabupaten dan Kota Sukabumi, Kabupaten dan Kota Bandung, Kota Cimahi, Kabupaten Bandung Barat,\" terang BMKG melalui laman resminya www.bmkg.go.id.\n" +
                    "\n" +
                    "Sementara itu di Kota Tangerang, Banten langitnya diprediksi berawan di siang hingga malam hari."
        ),
        Berita(
            id = 10,
            image = R.drawable.berita10,
            headerImage = R.drawable.berita10,
            judul = "Yusril Ihza Mahendra Mundur dari Ketum PBB, Digantikan Fahri Bachmid",
            deskripsi = "Ketum PBB Yusril Ihza Mahendra mundur dari jabatannya di partai. Yusril mengaku akan tetap berpolitik, namun di luar partai.\n" +
                    "\n",
            isiKonten = "Yusril Ihza Mahendra resmi mengundurkan diri dari jabatannya sebagai Ketua Umum (Ketum) Partai Bulan Bintang (PBB). Hal itu disampaikan Yusril dalam sidang Musyawarah Dewan Partai (MDP) PBB yang digelar di kantor Dewan Pimpinan Pusat (DPP) PBB, Jakarta, Sabtu (18/5/2024) malam.\n" +
                    "\n" +
                    "Diketahui, MDP adalah lembaga tertinggi di dalam Struktur organisasi PBB yang berwenang mengambil keputusan-keputusan penting seperti melakukan perubahan terbatas Anggaran Dasar, Anggaran Rumah Tangga (AD/ART).\n" +
                    "\n" +
                    "BACA JUGA:\n" +
                    "Yusril Ihza Mahendra dan Istri Liburan ke Jepang, Cak Imin Mau Ikut\n" +
                    "Selain itu, forum ini juga memilih seorang Penjabat (Pj) Ketua Umum jika Ketum yang dipilih dalam Muktamar berhalangan tetap.\n" +
                    "\n" +
                    "Permintaan Yusril Ihza Mahendra mengundurkan diri diterima oleh peserta MDP yang terdiri atas DPP PBB, Dewan Pimpinan Wilayah (DPW), serta badan-badan khusus dan otonom partainya yang seluruhnya berjumlah 49 suara dalam pengambilan keputusan.\n" +
                    "\n" +
                    "Dalam pemungutan suara untuk memilih Pj Ketum, Ketua Mahkamah Partai PBB Fahri Bachmid mendapat dukungan 29 suara, sementara Sekjen DPP PBB Afriansyah Noor memperoleh dukungan 20 suara.\n" +
                    "\n" +
                    "\"Dengan demikian, sesuai ART PBB, MDP mensahkan Fahri Bachmid menjadi Penjabat Ketua Umum PBB sampai terpilihnya Ketua Umum PBB defenitif hasil Muktamar PBB yang akan datang, yang disepakati MDP akan dilaksanakan selambat-lambatnya akhir Januari 2025,\" kata Yusril, dalam keterangan resmi, Minggu (19/5/2024)."
        )
    )
}