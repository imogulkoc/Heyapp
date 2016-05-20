package com.example.imogulkoc.heyelen1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends Activity implements View.OnClickListener{

    //Spinner içerisine koyacağımız verileri tanımlıyoruz.
    private String[] iller={"","Adana","Adıyaman","Afyonkarahisar","Ağrı", "Aksaray","Amasya","Ankara","Antalya","Ardahan","Artvin","Aydın", "Balıkesir","Bartın","Batman","Bayburt","Bilecik","Bingöl","Bitlis", "Bolu","Burdur","Bursa","Çanakkale","Çankırı","Çorum","Denizli","Diyarbakır","Düzce","Edirne","Elazığ","Erzincan","Erzurum","Eskişehir","Gaziantep","Giresun","Gümüşhane","Hakkari","Hatay","Iğdır","Isparta","İstanbul","İzmir","Kahramanmaraş","Karabük","Karaman","Kars","Kastamonu","Kayseri","Kırıkkale","Kırklareli","Kırşehir","Kilis","Kocaeli","Konya","Kütahya","Malatya","Manisa","Mardin","Mersin","Muğla","Muş","Nevşehir","Niğde","Ordu","Osmaniye","Rize","Sakarya","Samsun","Siirt","Sinop","Sivas","Şanlıurfa","Şırnak","Tekirdağ","Tokat","Trabzon","Tunceli","Uşak","Van","Yalova","Yozgat","Zonguldak"};
    private String[] ilceler0={""};
    private String[] ilceler1={"","Aladağ", "Ceyhan","Çukurova","Feke","İmamoğlu" ,"Karaisalı","Karataş","Kozan","Pozantı","Saimbeyli","Sarıçam" ,"Seyhan", "Tufanbeyli","Yumurtalık","Yüreğir"};
    private String[] ilceler2={"","Merkez" , "Besni", "Çelikhan" ,"Gerger" , "Gölbaşı" , "Kahta" , "Samsat" , "Sincik" , "Tut"};
    private String[] ilceler3={"","Merkez","Başmakçı","Bayat","Bolvadin","Çay","Çobanlar","Dazkırı", "Dinar","Emirdağ","Evciler","Hocalar", "İhsaniye", "İscehisar", "Kızılören", "Sandıklı", "Sinanpaşa", "Sultandağı", "Şuhut"};
    private String[] ilceler4={"","Merkez", "Diyadin", "Doğubayazıt", "Eleşkirt", "Hamur", "Patnos", "Taşlıçay", "Tutak"};
    private String[] ilceler5={"","Merkez","Ağaçören", "Eskil","Gülağaç","Güzelyurt","Ortaköy","Sarıyahşi"};
    private String[] ilceler6={"","Merkez", "Göynücek","Gümüşhacıköy","Hamamözü", "Merzifon", "Suluova", "Taşova"};
    private String[] ilceler7={"","Akyurt","Altındağ","Ayaş", "Bala", "Beypazarı", "Çamlıdere", "Çankaya", "Çubuk", "Elmadağ", "Etimesgut", "Evren", "Gölbaşı", "Güdül","Haymana", "Kalecik", "Kazan", "Keçiören", "Kızılcahamam", "Mamak", "Nallıhan", "Polatlı", "Pursaklar", "Sincan", "Şereflikoçhisar", "Yenimahalle"};
    private String[] ilceler8={"","Akseki", "Aksu", "Alanya", "Demre", "Döşemealtı", "Elmalı", "Finike", "Gazipaşa", "Gündoğmuş", "İbradı", "Kaş", "Kemer", "Kepez", "Konyaaltı", "Korkuteli", "Kumluca", "Manavgat", "Muratpaşa", "Serik"};
    private String[] ilceler9={"","Merkez","Çıldır","Damal","Göle","Hanak","Posof"};
    private String[] ilceler10={"","Merkez","Ardanuç", "Arhavi", "Borçka", "Hopa", "Murgul", "Şavşat", "Yusufeli"};
    private String[] ilceler11={"","Merkez","Bozdoğan", "Buharkent", "Çine", "Didim", "Germencik", "İncirliova", "Karacasu", "Karpuzlu", "Koçarlı", "Köşk", "Kuşadası", "Kuyucak", "Nazilli", "Söke", "Sultanhisar", "Yenipazar"};
    private String[] ilceler12={"","Merkez", "Ayvalık", "Balya", "Bandırma", "Bigadiç", "Burhaniye", "Dursunbey", "Edremit", "Erdek", "Gömeç", "Gönen", "Havran", "İvrindi", "Kepsut", "Manyas", "Marmara", "Savaştepe", "Sındırgı", "Susurluk"};
    private String[] ilceler13={"", "Merkez","Amasra", "Kurucaşile","Ulus"};
    private String[] ilceler14={"","Merkez", "Beşiri" ,"Gercüş","Hasankeyf","Kozluk","Sason"};
    private String[] ilceler15={"","Merkez","Aydıntepe","Demirözü"};
    private String[] ilceler16={"","Merkez", "Bozüyük", "Gölpazarı","İnhisar","Osmaneli", "Pazaryeri", "Söğüt", "Yenipazar"};
    private String[] ilceler17={"","Merkez","Adaklı","Genç", "Karlıova","Kiğı","Solhan", "Yayladere", "Yedisu"};
    private String[] ilceler18={"","Merkez","Adilcevaz","Ahlat","Güroymak","Hizan","Mutki","Tatvan"};
    private String[] ilceler19={"","Merkez","Dörtdivan","Gerede","Göynük","Kıbrıscık","Mengen","Mudurnu","Seben","Yeniçağa"};
    private String[] ilceler20={"","Merkez","Ağlasun","Altınyayla","Bucak","Çavdır","Çeltikçi","Gölhisar","Karamanlı","Kemer","Tefenni","Yeşilova"};
    private String[] ilceler21={"","Büyükorhan","Gemlik","Gürsu","Harmancık", "İnegöl","İznik", "Karacabey","Keles","Kestel", "Mudanya", "Mustafakemalpaşa", "Nilüfer", "Orhaneli", "Orhangazi", "Osmangazi", "Yenişehir", "Yıldırım"};
    private String[] ilceler22={"","Merkez","Ayvacık","Bayramiç","Biga","Bozcaada","Çan","Eceabat","Ezine","Gelibolu","Gökçeada", "Lapseki", "Yenice"};
    private String[] ilceler23={"","Merkez","Atkaracalar","Bayramören","Çerkeş","Eldivan","Ilgaz","Kızılırmak","Korgun","Kurşunlu", "Orta", "Şabanözü", "Yapraklı"};
    private String[] ilceler24={"","Merkez","Alaca","Bayat", "Boğazkale","Dodurga","İskilip","Kargı","Laçin","Mecitözü","Oğuzlar", "Ortaköy", "Osmancık", "Sungurlu", "Uğurludağ"};
    private String[] ilceler25={"","Merkez","Acıpayam","Akköy","Babadağ","Baklan","Bekilli","Beyağaç","Bozkurt","Buldan","Çal", "Çameli", "Çardak", "Çivril", "Güney", "Honaz", "Kale", "Sarayköy", "Serinhisar", "Tavas"};
    private String[] ilceler26={"","Bağlar", "Bismil", "Çermik", "Çınar", "Çüngüş", "Dicle", "Eğil", "Ergani", "Hani", "Hazro", "Kayapınar", "Kocaköy", "Kulp", "Lice", "Silvan", "Sur", "Yenişehir"};
    private String[] ilceler27={"", "Merkez","Akçakoca","Cumayeri","Çilimli", "Gölyaka","Gümüşova","Kaynaşlı" ,"Yığılca"};
    private String[] ilceler28={"","Merkez", "Enez", "Havsa", "İpsala", "Keşan", "Lalapaşa", "Meriç", "Süloğlu", "Uzunköprü"};
    private String[] ilceler29={"","Merkez","Ağın", "Alacakaya", "Arıcak", "Baskil", "Karakoçan", "Keban","Kovancılar", "Maden", "Palu", "Sivrice"};
    private String[] ilceler30={"","Merkez", "Çayırlı", "İliç", "Kemah", "Kemaliye", "Otlukbeli", "Refahiye", "Tercan", "Üzümlü"};
    private String[] ilceler31={"","Aşkale", "Aziziye", "Çat", "Hınıs", "Horasan", "İspir", "Karaçoban", "Karayazı", "Köprüköy", "Narman", "Oltu","Olur", "Palandöken", "Pasinler", "Pazaryolu", "Şenkaya", "Tekman", "Tortum", "Uzundere", "Yakutiye"};
    private String[] ilceler32={"","Alpu","Beylikova","Çifteler","Günyüzü", "Han", "İnönü", "Mahmudiye", "Mihalgazi","Mihalıççık","Odunpazarı", "Sarıcakaya", "Seyitgazi", "Sivrihisar", "Tepebaşı"};
    private String[] ilceler33={"","Araban","İslahiye", "Karkamış", "Nizip", "Nurdağı", "Oğuzeli", "Şahinbey", "Şehitkamil", "Yavuzeli"};
    private String[] ilceler34={"","Merkez","Alucra", "Bulancak", "Çamoluk", "Çanakçı", "Dereli", "Doğankent", "Espiye", "Eynesil", "Görele", "Güce", "Keşap", "Piraziz", "Şebinkarahisar", "Tirebolu", "Yağlıdere"};
    private String[] ilceler35={"","Merkez","Kelkit", "Köse", "Kürtün", "Şiran", "Torul"};
    private String[] ilceler36={"","Merkez","Çukurca", "Şemdinli", "Yüksekova"};
    private String[] ilceler37={"","Merkez", "Altınözü", "Belen", "Dörtyol", "Erzin", "Hassa", "İskenderun", "Kırıkhan", "Kumlu", "Reyhanlı", "Samandağ", "Yayladağı"};
    private String[] ilceler38={"","Merkez","Aralık","Karakoyunlu","Tuzluca"};
    private String[] ilceler39={"","Merkez", "Aksu", "Atabey", "Eğirdir", "Gelendost", "Gönen", "Keçiborlu", "Senirkent", "Sütçüler", "Şarkikaraağaç", "Uluborlu", "Yalvaç", "Yenişarbademli"};
    private String[] ilceler40={"","Adalar","Arnavutköy", "Ataşehir", "Avcılar", "Bağcılar", "Bahçelievler", "Bakırköy", "Başakşehir", "Bayrampaşa", "Beşiktaş","Beykoz", "Beylikdüzü", "Beyoğlu", "Büyükçekmece", "Çatalca", "Çekmeköy", "Esenler", "Esenyurt", "Eyüp", "Fatih", "Gaziosmanpaşa", "Güngören", "Kadıköy", "Kağıthane", "Kartal", "Küçükçekmece", "Maltepe", "Pendik", "Sancaktepe", "Sarıyer", "Silivri", "Sultanbeyli", "Sultangazi", "Şile", "Şişli", "Tuzla", "Ümraniye", "Üsküdar", "Zeytinburnu"};
    private String[] ilceler41={"","Aliağa","Balçova", "Bayındır", "Bayraklı", "Bergama", "Beydağ", "Bornova", "Buca", "Çeşme", "Çiğli", "Dikili", "Foça", "Gaziemir", "Güzelbahçe", "Karabağlar", "Karaburun", "Karşıyaka", "Kemalpaşa", "Kınık", "Kiraz", "Konak", "Menderes", "Menemen", "Narlıdere", "Ödemiş", "Seferihisar", "Selçuk", "Tire", "Torbalı", "Urla"};
    private String[] ilceler42={"","Merkez","Afşin","Andırın", "Çağlıyancerit","Ekinözü","Elbistan","Göksun", "Nurhak","Pazarcık", "Türkoğlu"};
    private String[] ilceler43={"","Merkez","Eflani", "Eskipazar","Karabük","Ovacık", "Safranbolu","Yenice"};
    private String[] ilceler44={"","Merkez","Ayrancı","Başyayla", "Ermenek", "Kazımkarabekir", "Sarıveliler"};
    private String[] ilceler45={"","Merkez", "Akyaka", "Arpaçay", "Digor", "Kağızman", "Sarıkamış", "Selim", "Susuz"};
    private String[] ilceler46={"","Merkez","Abana","Ağlı","Araç", "Azdavay", "Bozkurt", "Cide", "Çatalzeytin", "Daday", "Devrekani", "Doğanyurt", "Hanönü", "İhsangazi", "İnebolu", "Küre", "Pınarbaşı", "Seydiler", "Şenpazar", "Taşköprü", "Tosya"};
    private String[] ilceler47={"","Akkışla","Bünyan","Develi","Felahiye","Hacılar","İncesu", "Kocasinan", "Melikgazi", "Özvatan", "Pınarbaşı","Sarıoğlan","Sarız","Talas","Tomarza","Yahyalı","Yeşilhisar"};
    private String[] ilceler48={"","Merkez","Bahşili", "Balışeyh","Çelebi","Delice" ,"Karakeçili","Keskin","Sulakyurt", "Yahşihan"};
    private String[] ilceler49={"","Merkez","Babaeski","Demirköy","Kırklareli","Kofçaz","Lüleburgaz","Pehlivanköy","Pınarhisar","Vize"};
    private String[] ilceler50={"","Merkez","Akçakent","Akpınar","Boztepe","Çiçekdağı","Kaman","Mucur"};
    private String[] ilceler51={"","Merkez","Elbeyli","Musabeyli","Polateli"};
    private String[] ilceler52={"","Başiskele","Çayırova", "Darıca", "Derince", "Dilovası","Gebze","Gölcük", "İzmit","Kandıra", "Karamürsel", "Kartepe", "Körfez"};
    private String[] ilceler53={"","Ahırlı", "Akören", "Akşehir", "Altınekin", "Beyşehir", "Bozkır", "Cihanbeyli", "Çeltik", "Çumra", "Derbent", "Derebucak", "Doğanhisar", "Emirgazi", "Ereğli", "Güneysınır", "Hadim", "Halkapınar", "Hüyük", "Ilgın", "Kadınhanı", "Karapınar", "Karatay", "Kulu", "Meram", "Sarayönü", "Selçuklu", "Seydişehir", "Taşkent", "Tuzlukçu", "Yalıhüyük", "Yunak"};
    private String[] ilceler54={"","Merkez", "Altıntaş", "Aslanapa", "Çavdarhisar", "Domaniç", "Dumlupınar", "Emet", "Gediz", "Hisarcık", "Pazarlar", "Simav", "Şaphane", "Tavşanlı"};
    private String[] ilceler55={"","Merkez","Akçadağ", "Arapgir","Arguvan", "Battalgazi", "Darende", "Doğanşehir", "Doğanyol", "Hekimhan","Kale","Kuluncak","Pütürge","Yazıhan","Yeşilyurt"};
    private String[] ilceler56={"","Merkez","Ahmetli", "Akhisar", "Alaşehir", "Demirci", "Gölmarmara", "Gördes", "Kırkağaç", "Köprübaşı", "Kula", "Salihli", "Sarıgöl", "Saruhanlı", "Selendi", "Soma", "Turgutlu",};
    private String[] ilceler57={"","Merkez","Dargeçit", "Derik", "Kızıltepe", "Mazıdağı", "Midyat", "Nusaybin", "Ömerli", "Savur", "Yeşilli"};
    private String[] ilceler58={"","Akdeniz", "Anamur", "Aydıncık", "Bozyazı", "Çamlıyayla", "Erdemli", "Gülnar", "Mezitli", "Mut", "Silifke", "Tarsus", "Toroslar", "Yenişehir"};
    private String[] ilceler59={"","Merkez","Bodrum","Dalaman", "Datça", "Fethiye", "Kavaklıdere", "Köyceğiz", "Marmaris", "Milas", "Ortaca", "Ula", "Yatağan"};
    private String[] ilceler60={"","Merkez", "Bulanık", "Hasköy", "Korkut", "Malazgirt", "Varto"};
    private String[] ilceler61={"","Merkez","Acıgöl", "Avanos", "Derinkuyu", "Gülşehir", "Hacıbektaş", "Kozaklı", "Ürgüp"};
    private String[] ilceler62={"","Merkez","Altunhisar", "Bor", "Çamardı", "Çiftlik", "Ulukışla"};
    private String[] ilceler63={"","Merkez","Akkuş", "Aybastı", "Çamaş", "Çatalpınar", "Çaybaşı", "Fatsa", "Gölköy", "Gülyalı", "Gürgentepe", "İkizce", "Kabadüz", "Kabataş", "Korgan", "Kumru", "Mesudiye", "Perşembe", "Ulubey", "Ünye",};
    private String[] ilceler64={"","Merkez","Bahçe", "Düziçi", "Hasanbeyli", "Kadirli", "Sumbas", "Toprakkale"};
    private String[] ilceler65={"","Merkez","Ardeşen", "Çamlıhemşin", "Çayeli", "Derepazarı", "Fındıklı", "Güneysu", "Hemşin", "İkizdere", "İyidere", "Kalkandere", "Pazar"};
    private String[] ilceler66={"","Adapazarı", "Akyazı", "Arifiye", "Erenler", "Ferizli", "Geyve", "Hendek", "Karapürçek", "Karasu", "Kaynarca", "Kocaali", "Pamukova", "Sapanca", "Serdivan", "Söğütlü", "Taraklı"};
    private String[] ilceler67={"","Alaçam", "Asarcık", "Atakum", "Ayvacık", "Bafra", "Canik", "Çarşamba", "Havza", "İlkadım", "Kavak", "Ladik", "Ondokuzmayıs", "Salıpazarı", "Tekkeköy", "Terme", "Vezirköprü", "Yakakent"};
    private String[] ilceler68={"","Merkez","Aydınlar", "Baykan", "Eruh", "Kurtalan", "Pervari", "Şirvan"};
    private String[] ilceler69={"","Merkez","Ayancık","Boyabat", "Dikmen", "Durağan", "Erfelek", "Gerze", "Saraydüzü", "Türkeli",};
    private String[] ilceler70={"","Merkez","Akıncılar", "Altınyayla", "Divriği", "Doğanşar", "Gemerek", "Gölova", "Gürün", "Hafik", "İmranlı", "Kangal", "Koyulhisar", "Suşehri", "Şarkışla", "Ulaş", "Yıldızeli", "Zara"};
    private String[] ilceler71={"","Merkez","Akçakale", "Birecik", "Bozova", "Ceylanpınar", "Halfeti", "Harran", "Hilvan", "Siverek", "Suruç", "Viranşehir"};
    private String[] ilceler72={"","Merkez","Beytüşşebap", "Cizre", "Güçlükonak", "İdil", "Silopi", "Şırnak", "Uludere"};
    private String[] ilceler73={"","Merkez","Çerkezköy", "Çorlu", "Hayrabolu", "Malkara", "Marmaraereğlisi", "Muratlı", "Saray", "Şarköy"};
    private String[] ilceler74={"","Merkez","Almus", "Artova", "Başçiftlik", "Erbaa", "Niksar", "Pazar", "Reşadiye", "Sulusaray", "Turhal", "Yeşilyurt", "Zile"};
    private String[] ilceler75={"","Merkez","Akçaabat", "Araklı", "Arsin", "Beşikdüzü", "Çarşıbaşı", "Çaykara", "Dernekpazarı", "Düzköy", "Hayrat", "Köprübaşı", "Maçka", "Of", "Sürmene", "Şalpazarı", "Tonya", "Vakfıkebir", "Yomra"};
    private String[] ilceler76={"","Merkez", "Çemişgezek", "Hozat", "Mazgirt", "Nazımiye", "Ovacık", "Pertek", "Pülümür"};
    private String[] ilceler77={"","Merkez","Banaz", "Eşme", "Karahallı", "Sivaslı", "Ulubey"};
    private String[] ilceler78={"","Merkez","Bahçesaray", "Başkale", "Çaldıran", "Çatak", "Edremit", "Erciş", "Gevaş", "Gürpınar", "Muradiye", "Özalp", "Saray"};
    private String[] ilceler79={"","Merkez", "Altınova", "Armutlu", "Çınarcık", "Çiftlikköy", "Termal", "Yalova"};
    private String[] ilceler80={"","Merkez","Akdağmadeni", "Aydıncık", "Boğazlıyan", "Çandır", "Çayıralan", "Çekerek", "Kadışehri", "Saraykent", "Sarıkaya", "Sorgun", "Şefaatli", "Yenifakılı", "Yerköy"};
    private String[] ilceler81= {"", "Merkez", "Alaplı", "Çaycuma", "Devrek", "Ereğli", "Gökçebey"};


    //Spinner'ları ve Adapter'lerini tanımlıyoruz.

    private Spinner spinnerIller;
    private Spinner spinnerIlceler;
    private ArrayAdapter<String> dataAdapterForIller;
    private ArrayAdapter<String> dataAdapterForIlceler;
    private Button save;


    @Override // Bu metod uygulama açıldığında çalıştırılan metod.
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save= (Button) findViewById(R.id.button1);
        save.setOnClickListener(this);

        //xml kısmında hazırladığımğız spinnerları burda tanımladıklarımızla eşleştiriyoruz.
        spinnerIller = (Spinner) findViewById(R.id.spinner);
        spinnerIlceler = (Spinner) findViewById(R.id.spinner2);


        //Spinner'lar için adapterleri hazırlıyoruz.
        dataAdapterForIller = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, iller);
        dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,ilceler1);

        //Listelenecek verilerin görünümünü belirliyoruz.
        dataAdapterForIller.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterForIlceler.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Hazırladğımız Adapter'leri Spinner'lara ekliyoruz.
        spinnerIller.setAdapter(dataAdapterForIller);
        spinnerIlceler.setAdapter(dataAdapterForIlceler);

        // Listelerden bir eleman seçildiğinde yapılacakları tanımlıyoruz.
        spinnerIller.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                //Hangi il seçilmişse onun ilçeleri adapter'e ekleniyor.
                if (parent.getSelectedItem().toString().equals(iller[0]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler0);
                else if (parent.getSelectedItem().toString().equals(iller[1]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler1);
                else if (parent.getSelectedItem().toString().equals(iller[2]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler2);
                else if (parent.getSelectedItem().toString().equals(iller[3]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler3);
                else if (parent.getSelectedItem().toString().equals(iller[4]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler4);
                else if (parent.getSelectedItem().toString().equals(iller[5]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler5);
                else if (parent.getSelectedItem().toString().equals(iller[6]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler6);
                else if (parent.getSelectedItem().toString().equals(iller[7]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler7);
                else if (parent.getSelectedItem().toString().equals(iller[8]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler8);
                else if (parent.getSelectedItem().toString().equals(iller[9]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler9);
                else if (parent.getSelectedItem().toString().equals(iller[10]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler10);
                else if (parent.getSelectedItem().toString().equals(iller[11]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler11);
                else if (parent.getSelectedItem().toString().equals(iller[12]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler12);
                else if (parent.getSelectedItem().toString().equals(iller[13]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler13);
                else if (parent.getSelectedItem().toString().equals(iller[14]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler14);
                else if (parent.getSelectedItem().toString().equals(iller[15]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler15);
                else if (parent.getSelectedItem().toString().equals(iller[16]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler16);
                else if (parent.getSelectedItem().toString().equals(iller[17]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler17);
                else if (parent.getSelectedItem().toString().equals(iller[18]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler18);
                else if (parent.getSelectedItem().toString().equals(iller[19]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler19);
                else if (parent.getSelectedItem().toString().equals(iller[20]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler20);
                else if (parent.getSelectedItem().toString().equals(iller[21]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler21);
                else if (parent.getSelectedItem().toString().equals(iller[22]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler22);
                else if (parent.getSelectedItem().toString().equals(iller[23]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler23);
                else if (parent.getSelectedItem().toString().equals(iller[24]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler24);
                else if (parent.getSelectedItem().toString().equals(iller[25]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler25);
                else if (parent.getSelectedItem().toString().equals(iller[26]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler26);
                else if (parent.getSelectedItem().toString().equals(iller[27]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler27);
                else if (parent.getSelectedItem().toString().equals(iller[28]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler28);
                else if (parent.getSelectedItem().toString().equals(iller[29]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler29);
                else if (parent.getSelectedItem().toString().equals(iller[30]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler30);
                else if (parent.getSelectedItem().toString().equals(iller[31]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler31);
                else if (parent.getSelectedItem().toString().equals(iller[32]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler32);
                else if (parent.getSelectedItem().toString().equals(iller[33]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler33);
                else if (parent.getSelectedItem().toString().equals(iller[34]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler34);
                else if (parent.getSelectedItem().toString().equals(iller[35]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler35);
                else if (parent.getSelectedItem().toString().equals(iller[36]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler36);
                else if (parent.getSelectedItem().toString().equals(iller[37]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler37);
                else if (parent.getSelectedItem().toString().equals(iller[38]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler38);
                else if (parent.getSelectedItem().toString().equals(iller[39]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler39);
                else if (parent.getSelectedItem().toString().equals(iller[40]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler40);
                else if (parent.getSelectedItem().toString().equals(iller[41]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler41);
                else if (parent.getSelectedItem().toString().equals(iller[42]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler42);
                else if (parent.getSelectedItem().toString().equals(iller[43]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler43);
                else if (parent.getSelectedItem().toString().equals(iller[44]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler44);
                else if (parent.getSelectedItem().toString().equals(iller[45]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler45);
                else if (parent.getSelectedItem().toString().equals(iller[46]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler46);
                else if (parent.getSelectedItem().toString().equals(iller[47]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler47);
                else if (parent.getSelectedItem().toString().equals(iller[48]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler48);
                else if (parent.getSelectedItem().toString().equals(iller[49]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler49);
                else if (parent.getSelectedItem().toString().equals(iller[50]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler50);
                else if (parent.getSelectedItem().toString().equals(iller[51]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler51);
                else if (parent.getSelectedItem().toString().equals(iller[52]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler52);
                else if (parent.getSelectedItem().toString().equals(iller[53]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler53);
                else if (parent.getSelectedItem().toString().equals(iller[54]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler54);
                else if (parent.getSelectedItem().toString().equals(iller[55]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler55);
                else if (parent.getSelectedItem().toString().equals(iller[56]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler56);
                else if (parent.getSelectedItem().toString().equals(iller[57]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler57);
                else if (parent.getSelectedItem().toString().equals(iller[58]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler58);
                else if (parent.getSelectedItem().toString().equals(iller[59]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler59);
                else if (parent.getSelectedItem().toString().equals(iller[60]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler60);
                else if (parent.getSelectedItem().toString().equals(iller[61]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler61);
                else if (parent.getSelectedItem().toString().equals(iller[62]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler62);
                else if (parent.getSelectedItem().toString().equals(iller[63]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler63);
                else if (parent.getSelectedItem().toString().equals(iller[64]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler64);
                else if (parent.getSelectedItem().toString().equals(iller[65]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler65);
                else if (parent.getSelectedItem().toString().equals(iller[66]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler66);
                else if (parent.getSelectedItem().toString().equals(iller[67]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler67);
                else if (parent.getSelectedItem().toString().equals(iller[68]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler68);
                else if (parent.getSelectedItem().toString().equals(iller[69]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler69);
                else if (parent.getSelectedItem().toString().equals(iller[70]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler70);
                else if (parent.getSelectedItem().toString().equals(iller[71]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler71);
                else if (parent.getSelectedItem().toString().equals(iller[72]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler72);
                else if (parent.getSelectedItem().toString().equals(iller[73]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler73);
                else if (parent.getSelectedItem().toString().equals(iller[74]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler74);
                else if (parent.getSelectedItem().toString().equals(iller[75]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler75);
                else if (parent.getSelectedItem().toString().equals(iller[76]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler76);
                else if (parent.getSelectedItem().toString().equals(iller[77]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler77);
                else if (parent.getSelectedItem().toString().equals(iller[78]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler78);
                else if (parent.getSelectedItem().toString().equals(iller[79]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler79);
                else if (parent.getSelectedItem().toString().equals(iller[80]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler80);
                else if (parent.getSelectedItem().toString().equals(iller[81]))
                    dataAdapterForIlceler = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, ilceler81);


                dataAdapterForIlceler.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerIlceler.setAdapter(dataAdapterForIlceler);
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinnerIlceler.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                //Seçilen il ve ilçeyi ekranda gösteriyoruz.
                //Toast.makeText(getBaseContext(), "" + spinnerIller.getSelectedItem().toString() + "seçildi" + parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterView<?> parent) {


            }

        }

        );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:

                //buraya database kodlarını yazacaksın
                //database e göndereceğin bilgileri almayı unutma

                break;
        }
    }
}