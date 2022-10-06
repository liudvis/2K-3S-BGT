# Blokų grandinių technologijos
## 1-oji užduotis: Hash generatoriaus kūrimas.
#### Liudvikas Radvilavičius MIF ISI 2 kursas, 3 semestras, 2022. 

### Programos aprašymas ir paleidimo instrukcijos
Programa sukurta naudojant Java programavimo kalbą, yra sukurti unit testai, kurie užtikrina rezultatų validumą. Paleidžiama per komandinę eilutę, į kurią **būtina** įvesti parametrus:
- teksto įvedimui ranka, naudojamas *-h* flag'as, pvz.: "*-h lorem ipsum*"
- teksto skaitymui iš failų, naudojamas *-f* flag'as, pvz.: "*-f failas1.txt failas2.txt failas3.txt*"
- atskiram žodžių hashavimui naudojamas *-hs* flag'as, pvz.: "*-hs failas1.txt*"

### Eksperimentinio tyrimo-analizės užduotys
1. Testinių įvedimo failų pavyzdžių rezultatai. Tenkinamos visos sąlygos, failų "path'uose" matosi kurioje eilutė kas analizuojama: <br />
   - `Hash from file files-for-testing/1-Only-one-char-difference/test.txt:
   1182435518162778431297457031850184734525921578572905451850031820
   Hash from file files-for-testing/1-Only-one-char-difference/test2.txt:
   0999662971402152666628079610031401812233251890908678006862868971`
   - `Hash from file files-for-testing/2-1000-char-files/test.txt:
   0922457577751845695326758843000366371843423138447530622609064733
   Hash from file files-for-testing/2-1000-char-files/test2.txt:
   7772003437519645093826219678960868215750215932705389817517921153`
   - `Hash from file files-for-testing/3-1000-char-files-1-char-difference/test.txt:
   4603463886790716350891387738415691478268544420632038471098845891
   Hash from file files-for-testing/3-1000-char-files-1-char-difference/test2.txt:
   0922457577751845695326758843000366371843423138447530622609064733`
   - `Hash from file files-for-testing/4-Empty-file/test.txt:
   0084846527055259214725091158109980736160493570301660439414668851`
2. Hash'ai visuomet vienodo ilgio, to paties failo hash'as visuomet toks pats.
3. Hash funkcijos evektyvumas. [Konstitucijos](https://www.dropbox.com/s/ce83ry9a4d9642z/konstitucija.txt?dl=0) hash'avimo grafikas:<br />
![img.png](img.png)<br />
Horizantalioje ašyje - Konstitucijos skirsniai, vertikalioje - laikas milisekundėmis. Praleisti 9-15 skirsniai, bet grafikas matomas. Panašu į aritmetinę progresiją, menką parabolę. Visą konstituciją užhash'uoti apie 20 sekundžių. 
4. Sugenerevau ne poras, bet panašius stringus (iš viso 174757), kurie padidėja per vieną simbolį, t.y.: "_aaaaaa_", "_aaaaab_", "_aaaaac_", ...., "_ajynp_" , ir kiekvieno stringo hashą tikrinau su _visais kitais_ sugeneruotais hashais (174757*174757). Vienodų hash'ų sugeneruota nebuvo.



<br /><br /><br />
*Programai paleisti skirtos copy-paste instrukcijos <br />

>1 užduočiai<br />
-f files-for-testing/1-Only-one-char-difference/test.txt
files-for-testing/1-Only-one-char-difference/test2.txt
files-for-testing/2-1000-char-files/test.txt
files-for-testing/2-1000-char-files/test2.txt
files-for-testing/3-1000-char-files-1-char-difference/test.txt
files-for-testing/3-1000-char-files-1-char-difference/test2.txt
>files-for-testing/4-Empty-file/test.txt
<br /><br />
3 užduočiai<br />
> -h Lietuvos valstybė yra nepriklausoma demokratinė respublika....
<br /><br />
4-6 užduočiai<br />
> -hs files-for-testing/5-bunch-of-similiar-strings/test.txt