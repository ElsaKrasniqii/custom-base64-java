# Aplikacioni i Kodimit dhe Dekodimit (Base64)
Ky projekt implementon një aplikacion të thjeshtë në Java për kodim dhe dekodim të teksteve dhe përmbajtjeve të ruajtura në skedarë duke përdorur Base64. Aplikacioni mund të kodifikojë dhe dekodifikojë manualisht tekstin që përdoruesi e fut në aplikacion, si dhe mund të operojë me skedarë për të koduar dhe dekoduar përmbajtjen e tyre.

## Funksionalitetet Kryesore
Aplikacioni ofron opsione të ndryshme për të punuar me kodimin dhe dekodimin e Base64.
- Opsionet janë të ndara si më poshtë:
1. Shembuj të Gatshëm: Ky opsion shfaq shembuj të kodimit dhe dekodimit të një teksti të thjeshtë.
2. Kodim manual i tekstit: Ky opsion lejon përdoruesin të shkruajë tekstin që dëshiron të kodifikojë dhe aplikacioni do të bëjë kodimin me Base64.
3. Dekodim manual i tekstit: Ky opsion lejon përdoruesin të shkruajë tekstin e koduar që dëshiron të dekodifikojë.
4. Kodim nga një file: Ky opsion mundëson kodimin e përmbajtjes së një skedari dhe ruajtjen e rezultateve në një skedar të ri.
5. Dekodim nga një file: Ky opsion mundëson dekodimin e përmbajtjes së një skedari dhe ruajtjen e rezultateve në një skedar të ri.

## Struktura e Projektit
- **MainApp.java**  
  Ky është aplikacioni kryesor që menaxhon ndërfaqen e përdoruesit dhe ofron opsionet e listuara më lart.  
  - Përdor `Scanner` për të marrë input nga përdoruesi.  
  - Implementon opsionet për kodim dhe dekodim të teksteve dhe përmbajtjeve nga skedarët.
- **Encoder.java**  
  Klasa që implementon logjikën e kodimit të tekstit në formatin Base64.  
  - Përdor një array të karaktereve të Base64 dhe algoritmin për të koduar të dhënat.
- **Decoder.java**  
  Klasa që implementon logjikën e dekodimit të tekstit nga formati Base64.  
  - Merr tekstin e koduar dhe e rikthen atë në formën origjinale.
- **ShembujGatshem.java**  
  Klasa që ofron shembuj të gatshëm për kodim dhe dekodim.  
  - Përdor një tekst të thjeshtë, e kodon dhe më pas e dekodon për të demonstruar funksionalitetin.

## Metodat Kryesore te Klasave
1. MainApp.java:
main(String[] args): Kontrollon opsionet që zgjedh përdoruesi dhe kryen veprimet përkatëse.
lexoNgaFile(String fileName): Lexon përmbajtjen e një skedari dhe e kthen si një varg tekstual.
shkruajNeFile(String fileName, String content): Shkruan përmbajtjen e dhënë në një skedar të specifikuar.

2. Encoder.java:
encode(byte[] input): Kodifikon një varg bajtash në Base64.

3. Decoder.java:
decode(String input): Dekodifikon një varg të koduar në Base64 dhe e kthen atë në formatin origjinal.

4. ShembujGatshem.java:
shfaqShembuj(): Tregon një shembull të kodimit dhe dekodimit të një teksti të thjeshtë duke përdorur Base64.

## Si Përdoret Aplikacioni
Pasi të nisni aplikacionin, do të shfaqen opsionet e mëposhtme për përdoruesin:
Zgjidh opsionin:
1. Shembuj të gatshëm
2. Encode tekst (manual)
3. Decode tekst (manual)
4. Encode nga file
5. Decode nga file
   
Opsioni 1 (Shembuj të Gatshëm): Ky opsion shfaq shembuj të gatshëm të kodimit dhe dekodimit.
Opsioni 2 (Encode tekst manual): Ky opsion kërkon që përdoruesi të shkruajë tekstin për ta koduar në Base64.
Opsioni 3 (Decode tekst manual): Ky opsion kërkon që përdoruesi të shkruajë tekstin që dëshiron të dekodifikojë.
Opsioni 4 (Encode nga file): Ky opsion kërkon që përdoruesi të japë emrin e skedarit për të lexuar përmbajtjen dhe për ta koduar atë në Base64. Rezultati i koduar ruhet në një skedar tjetër.
Opsioni 5 (Decode nga file): Ky opsion kërkon që përdoruesi të japë emrin e skedarit për të lexuar përmbajtjen e koduar dhe për ta dekoduar atë. Rezultati i dekoduar ruhet në një skedar tjetër.
