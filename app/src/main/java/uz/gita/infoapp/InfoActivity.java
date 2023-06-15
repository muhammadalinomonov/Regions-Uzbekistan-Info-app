package uz.gita.infoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        setTitle("Andijon");
        ImageView imageView  = findViewById(R.id.player);
        TextView name = findViewById(R.id.player_name);
        TextView info = findViewById(R.id.info_player);
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        int number = intent.getIntExtra("INFO",0);
        switch (number){
            case 2:{
                setTitle("Farg'ona");
                imageView.setImageResource(R.drawable.fergana);
                name.setText("Farg'ona");
                info.setText("Fargʻona viloyati — Oʻzbekiston Respublikasi tarkibidagi viloyat. 1938-yil 15-yanvarda tashkil etilgan. Respublikaning sharqida, Fargʻona vodiysining janubida joylashgan. Shimoldan Namangan, Andijon viloyatlari, janub va sharqdan Qirgʻiziston, gʻarbdan Tojikiston Respublikalari bilan chegaradosh. Maydoni 6,8 ming km2. Aholisi 2020-yilda 3,817,000 kishi. Tarkibida 15 tuman, 9 shahar (Beshariq, Margʻilon, Rishton, Fargʻona, Yaypan, Quva, Quvasoy, Qoʻqon, Hamza), 10 shaharcha, 164 qishloq fuqarolari yigʻini bor (2004). Markazi — Fargʻona shahri.");
//                info.setText("Diego Armando Maradona (1960.30.10, Buenos-Ayres yaqinidagi Lanus shahri-2020.25.11) — argentinalik futbolchi, jahon chempioni. 20-asrning eng yaxshi futbolchisi (Pele bilan birga) deb tan olingan. Dastlab \"Argentinos Juniors\" futbol klubida oʻynagan. \"Boka Juniors\" tarkibida Argentina chempioni (1981), \"Napoli\" jamosi tarkibida Italiyaning 2 karra chempioni (1987, 1990), Italiya kubogi (1987) va UYEFA kubogi (1989) soxibi boʻlgan. Argentina terma tarkibida jahon chempioni (1986) va vitse-chempioni (1990)");
                break;
            }
            case 3:{
                setTitle("Buxoro");
                imageView.setImageResource(R.drawable.buxoro);
                name.setText("Buxoro");
                info.setText("Buxoro viloyati — Oʻzbekiston Respublikasining 12 viloyatlaridan biri. Oʻzbekiston viloyatlari ichida chegarasining kattaligi boʻyicha Navoiydan keyin ikkinchi oʻrinda turadi. 1938-yil 15-yanvarda tashkil etilgan. Buxoro viloyati hududi asosan Qizilqum choʻlida joylashgan. Janubi-sharqini Zarafshon vodiysi egallagan. Shimoli-gʻarbda Xorazm viloyati va Qoraqalpogʻiston Respublikasi, shimol va sharqdan Navoiy viloyati, janubi-sharqda Qashqadaryo viloyati, janubi-gʻarbda Turkmaniston bilan chegaradosh. Maydoni 39,4 ming km2. Aholisi 2.000.255 kishi (2022). Buxoro viloyati tarkibida 11 qishloq tumani: Buxoro, Vobkent, Jondor, Kogon, Olot, Peshkoʻ, Romitan, Shofirkon, Qorovulbozor, Qorakoʻl, Gʻijduvon, 11 shahar (Buxoro, Galaosiyo, Vobkent, Gazli, Kogon, Olot, Romitan, Shofirkon, Qorakoʻl, Qorovulbozor, Gʻijduvon), 3 shaharcha (Jondor, Zafarobod, Yangibozor), 121 qishloq fuqarolar yigʻini bor. Buxoro viloyati aholisining etnik tarkibi asosan oʻzbek, rus, fors (eroniylar), turkman, tojik, ukrain, koreys, tatar va boshqalar tashkil etadi. Markazi - Buxoro shahri.");
                break;
            }
            case 4:{
                setTitle("Jizzax");
                imageView.setImageResource(R.drawable.jizzax);
                name.setText("Jizzax");
                info.setText("Jizzax viloyati — Oʻzbekiston Respublikasi tarkibidagi viloyat. Respublikaning markaziy qismida. 1973-yil 28-dekabrda tashkil etilgan. Shim.-sharqda Qozogʻiston Respublikasi va Sirdaryo viloyati, janubi-gʻarbda Samarqand, Navoiy viloyatlari, janubisharqda Tojikiston Respublikasi bilan chegaradosh. Maydon 21,2 ming km2. Aholisi 1 466,6 ming kishi (2022). Jizzax viloyatida 12 qishloq tumani (Arnasoy, Baxmal, Doʻstlik, Sharof Rashidov, Zarbdor, Zafarobod, Zomin, Mirzachoʻl, Paxtakor, Yangiobod, Forish, Gʻallaorol), 9 shahar (Gagarin, Dashtobod, Doʻstlik, Jizzax, Marjonbuloq, Paxtakor, Gʻallaorol,Zarbdor,Zomin), 8 shaharcha (Boʻston, Zafarobod, Oʻsmat, Uchquloch, Bogʻdon,Pishagʻar,Qoʻytosh,Sharq yulduzi), 95 qishloq fuqarolari yigʻini bor (2001). Markazi — Jizzax shahri (Jizzax viloyati tumanlari haqida tegishli maqolalarga q.)");
                break;
            }
            case 5:{
                setTitle("Xorazm");
                imageView.setImageResource(R.drawable.xorazm);
                name.setText("Xorazm");
                info.setText("Xorazm viloyati — Oʻzbekiston Respublikasi tarkibidagi viloyat. 1925-yil fevraldan 1938-yil yanvargacha Xorazm okrugi, 1938-yil 15-yanvarda viloyat maqomiga oʻtkazilgan. Umumiy maydoni — 6 300 kvadrat kilometr.\n" +
                        "\n" +
                        "Ma’muriy-hududiy tuzilishi\n" +
                        "Respublikaning shimoli-gʻarbida, Amudaryo quyi oqimining chap sohilida. Shimoliy va shimoli-sharqdan Qoraqalpogʻiston Respublikasi, janubiy va janubi-gʻarbdan Turkmaniston, janubi-sharqdan Buxoro viloyati bilan chegaradosh. Tarkibida 11 qishloq tumani (Bogʻot, Gurlan, Urganch, Xiva, Xonqa, Shovot, Yangiariq, Yangibozor, Qoʻshkoʻpir, Hazorasp va Tuproqqal’a), 3 shahar (Urganch, Xiva, Pitnak), 7 shaharcha (Gurlan, Xonqa, Chalish, Shovot, Yangibozor, Qoʻshkoʻpir, Hazorasp), 100 qishloq fuqarolari yigʻini bor. Viloyat 11 ta tumanga ajratilgan, maʼmuriy markazi - Urganch shahri. Viloyatning boshqa katta shaharlari — Xiva va Pitnak");
                break;
            }
            case 6:{
                setTitle("Namangan");
                imageView.setImageResource(R.drawable.namangan);
                name.setText("Namangan");
                info.setText("Namangan viloyati — Oʻzbekiston Respublikasi tarkibidagi viloyat. 1941-yil 11-martda tashkil etilgan (1960-yil 25-yanvarda Andijon va Fargʻona viloyatlari tarkibiga qoʻshib yuborilgan. 1967-yil 18-dekabrda qayta tashkil etildi). Namangan viloyati respublikaning sharqida, Fargʻona vodiysining shimoli-gʻarbiy qismida, Tyanshan togʻ tizmasi tarmoklari — Qurama va Chatqol togʻlarining yon bagʻrida joylashgan. Shimoliy va shimoli-sharqdan Qirgʻiziston Respublikasining Jalolobod viloyati, jan.-sharqsan Andijon, janubidan Fargʻona, shimoliy va shimoli-gʻarbdan Toshkent viloyati va Tojikistonning Sugʻd viloyati bilan chegaradosh. Maydoni 7,44 ming km². Aholisi 2931,5 ming kishi (2021). Namangan viloyatida 11 qishloq tumani (Kosonsoy, Mingbuloq, Namangan, Norin, Pop, Toʻraqoʻrgʻon, Uychi, Uchqoʻrgʻon, Chortoq, Chust, Yangiqoʻrgʻon), 8 shahar (Namangan, Kosonsoy, Pop, Toʻraqoʻrgʻon, Uchqoʻrgʻon, Chortoq, Chust, Haqqulobod), 11 shaharcha (Jomashoʻy, Toshbuloq, Navbahor, Oltinkon, Uygʻursoy, Chorkesar, Xalqobod, Uychi, Oʻnhayat, Yangiqoʻrgʻon, Oqtosh), 99 qishloq fuqarolari yigʻini bor. Markazi — Namangan shahri.");
                break;
            }
            case 7:{
                setTitle("Navoiy");
                imageView.setImageResource(R.drawable.navoiy);
                name.setText("Navoiy");
               info.setText("Navoiy viloyati — Oʻzbekiston Respublikasi tarkibidagi viloyat. 1982-yil 20-aprelda Buxoro va qisman Samarqand viloyatlari hududlaridan tashkil etilgan. 1988-yilda maʼmuriy birlik sifatida tugatilib, 1992-yil boshida qayta tiklandi. Maydoni 111,0 ming km².\n" +
                       "\n" +
                       "Geografik joylashuvi\n" +
                       "Navoiy viloyati Oʻzbekiston Respublikasi hududining oʻrta qismida joylashgan boʻlib, Qizilqum sahrosining kattagina qismini egallaydi. Uning maydoni 110,8 ming km² ga teng, bu jihatdan u eng katta viloyat hisoblanadi. Navoiy viloyati gʻarbda Qoraqalpogʻiston, shimolda Qozogʻiston, sharqda Jizzax, janubda Qashqadaryo va Buxoro viloyatlari bilan chegaralanadi.\n" +
                       "\n" +
                       "Tumanlari va shaharlari\n" +
                       "Navoiy viloyati tarkibida 8 ta tumani (Konimex, Navbahor, Karmana, Nurota, Tomdi, Uchquduq, Xatirchi, Qiziltepa, 5 shahar (Zarafshon, Qiziltepa, Navoiy, Nurota, Uchquduq), 8 shaharcha (Konimex, Langar, Malikrabot, Muruntov, Tinchlik, Shalxar, Yangirabot, Gʻozgʻon) va 53 qishloq fuqarolari yigʻini bor (2003). Markazi — Navoiy shahri.");
               break;
            }
            case 8:{
                setTitle("Qashqadaryo");
                imageView.setImageResource(R.drawable.qashqadaryo);
                name.setText("Qashqadaryo");
                info.setText("Qashqadaryo viloyati — Oʻzbekiston Respublikasi tarkibidagi viloyat. 1924-yil 1-noyabrda tashkil etilgan. Respublikaning janubi-gʻarbida, Qashqadaryo havzasida, Pomir-Oloy togʻ tizmasining gʻarbiy chekkasida, Amudaryo va Zarafshon daryolari, Hisor va Zarafshon tizma togʻlari orasida. Shimoli-gʻarbdan Buxoro va janubi-sharqdan Surxondaryo viloyatlari, janubi-gʻarb va gʻarbdan Turkmaniston Respublikasi, sharqdan Tojikiston Respublikasi hamda Samarqand viloyati bilan chegaradosh. Maydoni 28,6 ming km². Aholisi 3,408,300 kishi (3-oʻrin) (2022). Viloyat hokimi Murotjon Azimov (2021-yil 18-noyabrdan) Tarkibida 14 tumani (Dehqonobod, Kasbi, Kitob, Koson, Koʻkdala tumani), Mirishkor, Muborak, Nishon, Qamashi, Qarshi, Yakkabogʻ, Gʻuzor, Shahrisabz, Chiroqchi, 12 shahar (Beshkent, Kitob, Koson, Muborak, Tallimarjon, Chiroqchi, Shahrisabz, Yakkabogʻ, Yangi Nishon, Qamashi, Qarshi, Gʻuzor), 4 shaharcha (Yangi Mirishkor,Dehqonobod, Miroqi, Eski Yakkabogʻ, Pomuq), 147 qishloq fuqarolari yigʻini, 1064 qishloq bor (2005).\n" +
                        "\n" +
                        "Qashqadaryo viloyati tumanlari haqida alohida maqolalarga qarang: masalan, Dehqonobod tumani, Kasbi tumani va boshqalar.");
                break;
            }
            case 9:{
                setTitle("Samarqand");
                imageView.setImageResource(R.drawable.samarqand);
                name.setText("Samarqand");
                info.setText("Samarqand viloyati — Oʻzbekiston Respublikasi viloyatlaridan biri hisoblanadi. U 1938-yil 15-yanvarda tashkil topgan. Ushbu viloyat respublika hududining markaziy qismida, Zarafshon daryosining oʻrta oqimi havzasida joylashgan. Uning chegaralari gʻarb va shimoli-gʻarbda Navoiy viloyati, shimol va shimoli-sharqda Jizzax va janubda Qashqadaryo viloyatlari, janubi-sharqda Tojikiston bilan tutash.\n" +
                        "\n" +
                        "Viloyatning markaziy qismi goʻzal vohadan iborat boʻlib, bu voha uncha keng boʻlmay sharqdan-gʻarbga tomon Zarafshon va Turkiston togʻ tizmalari orasini egallagan. Viloyatning asosiy sugʻoriladigan yerlari xuddi ana shu maydonlarni egallagan.\n" +
                        "\n" +
                        "Aholi soni 2022-yil holatiga koʻra, 4 mln 077 ming 400 kishi. Bu jihatidan Samarqand viloyati respublikada birinchi oʻrinda va respublika aholisining 11.4 foizini tashkil etadi.\n" +
                        "Viloyat hududi 16,88 ming km². Samarqand viloyati qishloq tumanlari soni boʻyicha Qoraqolpogʻiston Respublikasi va viloyatlar orasida birinchi oʻrinni egalaydi. Bu viloyatda bunday tumanlar soni 16 ta. Ular quyidagilar: Bulungʻur, Jomboy, Ishtixon, Kattaqoʻrgʻon, Narpay, Nurobod, Oqdaryo, Payariq, Past Dargʻom, Paxtachi, Samarqand, Toyloq, Urgut va Qoʻshrabot tumanlari. Shaharlar soni 2 ta, bular Samarqand va Kattaqoʻrgʻon.\n" +
                        "\n" +
                        "Koʻhna, noyob tarixiy obidalarga boy boʻlgan Samarqand shahri viloyatning markaziy shahri boʻlib, u 1924—1930-yillarda Oʻzbekiston poytaxti vazifasini bajargan.");
                break;
            }
            case 10:{
                setTitle("Sirdaryo");
                imageView.setImageResource(R.drawable.sirdaryo);
                name.setText("Sirdaryo");
                info.setText("Sirdaryo viloyati — Oʻzbekiston Respublikasi tarkibidagi viloyat. 1963-yil 16 fevralda tashkil etilgan. Shimolidan Qozogʻiston Respublikasi, sharqdan Toshkent viloyati, janubidan Tojikiston Respublikasi va gʻarbdan Jizzax viloyati bilan chegaradosh. Maydoni 4.28 ming km. Aholisi 900 migga yaqin kishi (2022). Tarkibida 8tuman (Boyovut, Guliston, Mirzaobod, Oqoltin, Sayxunobod, Sirdaryo, Xovos, Sardoba) (tumanlar haqida alohida maqolalarga qarang, maye. Boyovut tumani), 5 shahar (Guliston, Baxt, Sirdaryo, Shirin, Yangiyer), 6 shaharcha (Boyovut, Dehqonobod, Doʻstlik, Paxtaobod, Sayxun, Xovos) va 75 qishloq fuqarolari yigʻini bor (2004). Markazi — Guliston shahri.");
                 break;
            }
            case 11:{
                setTitle("Surxondaryo");
                imageView.setImageResource(R.drawable.surxondaryo);
                name.setText("Surxondaryo");
                info.setText("Surxondaryo viloyati — Oʻzbekiston Respublikasi tarkibidagi viloyat. 1941-yil 6-martda tashkil etilgan (1925-yil 29-iyundan Surxondaryo okrugi boʻlgan). 1960-yil 25-yanvarda Qashqadaryo viloyati bilan qoʻshilgan. 1964-yil fevralda qaytadan tashkil qilindi. Respublikaning janubi-sharqida, Surxon-Sherobod vodiysida joylashgan. Viloyat nomi vohadan oqib oʻtuvchi „Surxon“ (fors-tojik: „qizil“) daryosi nomidan kelib chiqqan. Janubidan Amudaryo boʻylab Afgʻoniston, shimoliy, shimoli-sharq va sharqdan Tojikiston, janubi-gʻarbdan Turkmaniston, shimoli-gʻarbdan Qashqadaryo viloyati bilan chegaradosh. Maydoni 20,1 ming km². Aholisi 2612,4 ming kishi (2019-yil 1-oktabr holatiga koʻra). Tarkibida 14 tuman (Angor, Bandixon, Boysun, Denov, Jarqoʻrgʻon, Muzrabot, Oltinsoy, Sariosiyo, Termiz, Uzun, Sherobod, Shoʻrchi, Qiziriq, Qumqoʻrgʻon), 8 shahar (Boysun, Denov, Jarqoʻrgʻon, Termiz, Shargʻun, Sherobod, Shoʻrchi, Qumqoʻrgʻon), 114 ta shaharcha, 865 ta qishloq aholi punktlari mavjud (2020). Markazi — Termiz shahri.");
                break;
            }
            case 12:{
                setTitle("Toshkent");
                imageView.setImageResource(R.drawable.tashkent);
                name.setText("Toshkent");
                info.setText("Toshkent viloyati — Oʻzbekiston Respublikasi tarkibidagi viloyat. Respublikaning shimoli-sharqida. 1938-yil 15-yanvarda tashkil kilingan. Shimoliy va shimoli-gʻarbdan Qozogʻiston Respublikasi, shimoli-sharqdan Qirgʻiziston Respublikasi, sharqdan Namangan viloyati, janubidan Tojikiston Respublikasi, janubi-gʻarbdan Sirdaryo viloyati bilan chegaradosh. Maydoni (Toshkent shahri maydonisiz) 15,3 ming km². Aholisi (Toshkent shahri aholisisiz) 2.931 million kishidan ziyod (2022). Viloyat tarkibida 15 ta tuman (Bekobod, Boʻka, Boʻstonliq, Zangiota, Oqqoʻrgʻon, Ohangaron, Parkent, Piskent, Chinoz, Yuqori Chirchiq, Yangiyoʻl, Oʻrta Chirchiq, Qibray, Quyi Chirchiq), 17 shahar (Angren, Bekobod, Boʻka, Doʻstobod, Keles, Olmaliq, Oqqoʻrgʻon, Ohangaron, Parkent, Piskent, Toshkent, Toʻytepa, Chinoz, Chirchiq, Yangiyoʻl, Yangiobod, Gʻazalkent), 18 shaharcha (Alimkent, Boʻzsuv, Gulbahor, Zafar, Iskandar, Krasnogorsk, Nurobod, Olmazor, Salor, Tuyaboʻgʻiz, Chigʻiriq, Chorvoq, Eshonguzar, Yangibozor, Yangi chinoz, Yangihayot, Oʻrtaovul, Qibray), 146 qishloq fuqarolari yigʻini bor. Markazi — Nurafshon shahri.\n" +
                        "\n" +
                        "Tabiati\n" +
                        "Viloyatning shimoliy va shimoli-sharqiy qismlari Gʻarbiy Tyanshan togʻlari va uning tarmoqlari (Qurama, Piskom va Ugom togʻlari) bilan band. Eng baland joyi Piskom tizmasidagi Manas togʻi (4484 m). Chatqol va Qurama togʻlari orasida Ohangaron daryosi kesib oʻtgan, Ohangaron platosi joylashgan. Viloyat hududining katta qismi Sirdaryo tomon qiyalanib boradigan togʻ oldi tekisligi (Chirchiq-Ohangaron vodiysi)dan iborat. Ohangaron daryo vodiysi, Qurama togʻi, Angren-Olmaliq atrofida foydali qazilmalardan mis, polimetall rudalari, oltin, kumush, qoʻrgʻoshin, alyuminiy xom ashyosi, qoʻngʻir kumir, molibden konlari, plavik shpati va dala shpati, turli xil qurilish materiallari bor. Termal va mineral suv zaxiralari kup. Viloyat kuchli seysmik zonada joylashgan. Ayniqsa, Chirchiq va Ohangaron havzalarida aniq seziladigan zilzilalar buning ifodasidir. Juda kuchli zilzila 1868-yilda Toshkentda boʻlib oʻtdi va 1966-yilda takrorlandi. Turli intensivlikdagi yer osti silkinishlar vaqtvaqti bilan hozirgi kunda ham davom etmoqda.");
                break;
            }
            case 13:{
                setTitle("Qoraqalpog'iston");
                imageView.setImageResource(R.drawable.qoraqalpoq);
                name.setText("Qoraqalpog'iston");
                info.setText("Qoraqalpogʻiston— Oʻzbekiston Respublikasi tarkibidagi respublika. Maydoni 166,6 ming km². Aholisi 2 millionga yaqin (2022). Respublika poytaxti — Nukus shahri. Tarkibida 16 tuman, 12 shahar, 14 shaharcha va 124 fuqarolar yigʻini bor.\n" +
                        "\n" +
                        "Davlat tuzumi\n" +
                        "Qoraqalpogʻiston — parlament boshqaruv shakliga ega boʻlgan O'zbekiston respublikasi tarkibidagi suveren demokratik respublikadir. Qonun chiqaruvchi oliy davlat vakolatli organi — koʻp partiyaviylik asosida 5 yil muddatga saylangan deputatlardan iborat Qoraqalpogʻiston hududi Joʻqorgʻi Kengeshi (QR JK). Qoraqalpogʻiston hududi Joʻqorgʻi Kengeshi raisi respublika rahbari hisoblanib, u Joʻqorgʻi Kengesh deputatlari orasidan 5 yil muddatga saylanadi (faqat ketma-ket 2 muddatdan oshmaydi). Davlat hokimiyatining oliy ijro etuvchi-boshqaruvchi organi Qoraqalpogʻiston Respublikasi Vazirlar Kengashi, yaʼni Qoraqalpogʻiston Respublikasi hukumati hisoblanadi. Qoraqalpogʻistonda Oʻzbekiston Respublikasi Konstitutsiyasi bilan bir vaqtda Qoraqalpogʻiston Oliy kengashining 1993-yil 9-apreldagi 12-chaqiriq 12-sessiyasida qabul qilingan Qoraqalpogʻiston Hududi Konstitutsiyasiga amal qilinadi. Qoraqalpogʻiston oʻz davlat ramzlari: gerb, madhiya va bayrogʻiga ega.\n" +
                        "\n" +
                        "Tabiati\n" +
                        "Qoraqalpogʻiston Qizilqum choʻlining shimoli-gʻarbiy, Ustyurt platosining janubi-sharqiy qismi va Amudaryo deltasida joylashgan. Orol dengizining janubiy qismi Qoraqalpogʻiston hududida. Qizilqumning shimoli-gʻarbiy qismi Orol dengizi tomon pasayib boruvchi keng yassi tekislik boʻlib, qator tepa va qumli bar-xanlar (balandligi 75 m dan 100 m gacha) uchraydi. Alohida togʻ massivlari (eng, yirigi — Sulton Uvays togʻi, choʻqqilari 473 m va 485 m) bor. Sugʻoriladigan yerlar va sugʻorish kanallari, asosan, deltaning oʻng sohilida. Gʻarbida bir nechta botiqli (Borsakelmas, Asakaovdon botiqlarining balandligi 29-101 m) Ustyurt platosi joylashgan. Plato Orol dengizi va Amudaryo deltasiga tik yon bagʻirli jarlik — chinklar hosil qilib tushgan. Ustyurtdan janubi-sharqda Sariqamish soyligining shimoliy chekkasi joylashgan.");
                break;
            }


        }
    }
}