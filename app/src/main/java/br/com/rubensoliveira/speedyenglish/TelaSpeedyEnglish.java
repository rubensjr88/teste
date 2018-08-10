package br.com.rubensoliveira.speedyenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TelaSpeedyEnglish extends AppCompatActivity {

    ListView minhaLista;

    private String[] listaDeNomes = {
            "#1 The (dze) - O, A, OS, AS" ,
            "#2 Of (ofi) - De, DO, DOS, DAS" ,
            "#3 And (end) - E" ,
            "#4 A (ei) - UM, UMA" ,
            "#5 To (tu) - PARA" ,
            "#6 In (in) - EM, DENTRO DE" ,
            "#7 Is (iz) - É, ESTÁ" ,
            "#8 You (yo) - VOCÊ" ,
            "#9 That (dzat) - AQUELE, AQUELA" ,
            "#10 It (it) - ISTO, ISSO" ,
            "#11 He (hi) - ELE" ,
            "#12 Was (woz) - ERA" ,
            "#13 For (for) - PARA" ,
            "#14 On (on) - EM CIMA DE, SOBRE" ,
            "#15 Are (ar) - SÂO, ESTÂO" ,
            "#16 As (ez) - COMO" ,
            "#17 With (uifi) - COM" ,
            "#18 His (hiz) - DELE" ,
            "#19 They (dzey) - ELES" ,
            "#20 I (ay) - EU" ,
            "#21 At (eti) - NO, NA" ,
            "#22 Be (bi) - SER" ,
            "#23 This (dsis) - ISTO, ISSO" ,
            "#24 Have (hev) - TER" ,
            "#25 From (from) - DE" ,
            "#26 Or (or) - OU" ,
            "#27 One (u-an) - UM" ,
            "#28 Had (hed) - TINHA" ,
            "#29 By (bay) - POR, PELO" ,
            "#30 Word (uord) - PALAVRA" ,
            "#31 But (bat) - MAS" ,
            "#32 Not (nat) - NÃO É" ,
            "#33 What (wat) - O QUE" ,
            "#34 All (ol) - TODOS" ,
            "#35 Were (wer) - ERAM" ,
            "#36 We (wi) - NÓS" ,
            "#37 When (wen) - QUANDO" ,
            "#38 Your (yor) - SEU" ,
            "#39 Can (ken) - PODE" ,
            "#40 Said (sed) - DISSE" ,
            "#41 There (dzer) - ALI" ,
            "#42 Use (yuzi) - USE, USAR" ,
            "#43 An (en) - UM/UMA (antes das palavras que iniciam com vogal)" ,
            "#44 Each (itch) - CADA" ,
            "#45 Which (Witch) - QUAL" ,
            "#46 She (shi) - ELA" ,
            "#47 Do (du) - Fazer" ,
            "#48 How (haw) - COMO" ,
            "#49 Their (dzeyr) - DELES, DELAS" ,
            "#50 IF (ifi) - SE" ,
            "#51 Will (wil) - VAI" ,
            "#52 Up (ap) - PARA CIMA, EM CIMA" ,
            "#53 Other (ather) - OUTRO" ,
            "#54 About (ebaut) - SOBRE" ,
            "#55 Out (aut) - FORA" ,
            "#56 Many (meni) - MUITO, MUITOS" ,
            "#57 Then (then) - ENTÃO" ,
            "#58 Them (dzem) - ELES" ,
            "#59 These (dzi) - ESSES, ESSAS" ,
            "#60 So (so) - ENTÃO" ,
            "#61 Some (sam) - ALGUNS, ALGUMAS" ,
            "#62 Her (her) - DELA" ,
            "#63 Would (wud) - IRIA" ,
            "#64 Make (meik) - FAZER" ,
            "#65 Like (layk) - GOSTAR, SEMELHANTE" ,
            "#66 Him (him) - ELE" ,
            "#67 Into (intu) - PARA DENTRO" ,
            "#68 Time (taym) - TEMPO" ,
            "#69 Has (hez) - TER" ,
            "#70 Look (luk) - OLHE, OLHAR, VEJA" ,
            "#71 Two (tu) - DOIS" ,
            "#72 More (mor) - MAIS" ,
            "#73 Write (rayt) - ESCREVER" ,
            "#74 Go (go) - VAI" ,
            "#75 See (si) - VER, VEJA" ,
            "#76 Number (namber) - NÚMERO" ,
            "#77 No (no) - NÃO" ,
            "#78 Way (wey) - CAMINHO" ,
            "#79 Could (could) - PODERIA" ,
            "#80 People (pipou) - GENTE, PESSOAS" ,
            "#81 My (mai) - MEU" ,
            "#82 Than (dsen) - MAIS DO QUE" ,
            "#83 First (ferst) - PRIMEIRO" ,
            "#84 Water (woter) - ÁGUA" ,
            "#85 Been (bin) - SENDO" ,
            "#86 Call (kol) - CHAMAR" ,
            "#87 Who (hu) - QUEM" ,
            "#88 Oil (oyl) - ÓLEO" ,
            "#89 Its (its) - DELE (usado para algo ou animal)" ,
            "#90 Now (naw) - AGORA" ,
            "#91 Find (faynd) - ACHAR" ,
            "#92 Long (long) - LONGO" ,
            "#93 Down (daun) - PARA BAIXO" ,
            "#94 Day (dey) - DIA" ,
            "#95 Did (did) - FEZ" ,
            "#96 Get (get) - PEGAR" ,
            "#97 Come (cam) - VIR" ,
            "#98 Made (meyd) - FEITO, FEZ" ,
            "#99 May (mey) - MAIO, PODERIA" ,
            "#100 Part (part) - PARTE"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_speedy_english);

        minhaLista = (ListView) findViewById(R.id.lista);

        ArrayAdapter<String> meuAdaptador = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaDeNomes);

        minhaLista.setAdapter(meuAdaptador);

    }




}
