package br.com.rubensoliveira.speedyenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SegundoGrupo extends AppCompatActivity {

    ListView minhaLista;

    private String[] listaDeNomes = {
            "#101 Over (over) - SOBRE, POR CIMA, ACIMA DE" ,
            "#102 New (niu) - NOVO, NOVA" ,
            "#103 Sound (saund) - SOM" ,
            "#104 Take (teik) - PEGAR" ,
            "#105 Only (onli) - SÓ" ,
            "#106 Little (litl) - POUCO" ,
            "#107 Work (work) - TRABALHO, EMPREGO" ,
            "#108 Know (nou) - SABER" ,
            "#109 Place (Pleys) - LUGAR, LOCAL" ,
            "#110 Year (yir) - ANO" ,
            "#111 Live (liv) - VIVER, MORAR" ,
            "#112 Me (mi) - EU" ,
            "#113 Back (bek) - VOLTAR" ,
            "#114 Give (giv) - DAR" ,
            "#115 Most (most) - MAIORIA" ,
            "#116 Very (veri) - MUITO" ,
            "#117 After (after) - DEPOIS" ,
            "#118 Thing (thing) - COISA" ,
            "#119 Our (awer) - NOSSO" ,
            "#120 Just (djast) - SÓ, APENAS" ,
            "#121 Name (neym) - NOME" ,
            "#122 Good (gud) - BOM" ,
            "#123 Sentence (sentens) - FRASE" ,
            "#124 Man (men) - HOMEM" ,
            "#125 Think (think) - PENSAR" ,
            "#126 Say (sey) - DIZER, FALAR" ,
            "#127 Great (greit) - GRANDE, ÓTIMO, IMPORTANTE" ,
            "#128 Where (wer) - ONDE" ,
            "#129 Help (help) - AJUDA" ,
            "#130 Through (thru) - ATRAVÉS DE, PELO" ,
            "#131 Much (match) - MUITO (coisa incontável)" ,
            "#132 Before (bifor) - ANTES" ,
            "#133 Line (layn) - LINHA" ,
            "#134 Right (rayt) - DIREITO, DIREITA" ,
            "#135 Too (tu) - TAMBÉM" ,
            "#136 Mean (min) - SIGNIFICAR" ,
            "#137 Old (old) - VELHO" ,
            "#138 Came (queim) - VEIO" ,
            "#139 Same (seym) - MESMO, MESMA" ,
            "#140 Tell (tel) - CONTAR, DIZER" ,
            "#141 Boy (bói) - MENINO, GAROTO" ,
            "#142 Follow (falow) - SEGUIR, ACOMPANHAR" ,
            "#143 Any (eni) - QUALQUER" ,
            "#144 Want (wont) - QUER" ,
            "#145 Show (show) - MOSTRAR, APRESENTAR" ,
            "#146 Also (olso) - ALÉM DISSO, TAMBÉM, IGUALMENTE" ,
            "#147 Around (eraund) - A VOLTA DE, A REDOR DE" ,
            "#148 From (from) - DE" ,
            "#149 Three (thri) - TRÊS" ,
            "#150 Small (smol) - PEQUENO" ,
            "#151 Set (set) - CONJUNTO, JOGO" ,
            "#152 Put (put) - POSICIONAR, COLOCAR" ,
            "#153 End (end) - TERMINAR, FIM" ,
            "#154 Does (daz) - FAZER (para ele, ela e isto)" ,
            "#155 Another (enather) - OUTRO, DIFERENTE" ,
            "#156 Well (wel) - BEM" ,
            "#157 Large (Lardj) - GRANDE, AMPLO" ,
            "#158 Must (mast) - DEVE, DEVO (obrigação)" ,
            "#159 Big (big) - GRANDE" ,
            "#160 Even (iven) - ATÉ MESMO" ,
            "#161 Such (satch) - TAL" ,
            "#162 Because (bicoz) - PORQUE" ,
            "#163 Turn (tern) - VIRAR, TORNAR A" ,
            "#164 Here (hir) - AQUI" ,
            "#165 Why (way) - POR QUÊ?" ,
            "#166 Ask (ask) - PEDIR, PERGUNTAR" ,
            "#167 Went (went) - FUI" ,
            "#168 Men (men) - HOMENS" ,
            "#169 Read (rid) - LER" ,
            "#170 Need (nid) - NECESSIDADE, PRECISAR" ,
            "#171 Land (lend) - TERRA, TERRENO" ,
            "#172 Different (difrent) - DIFERENTE" ,
            "#173 Home (hom) - CASA, LAR" ,
            "#174 Us (as) - NOS" ,
            "#175 Move (muv) - MOVER" ,
            "#176 Try (trai) - TENTAR" ,
            "#177 Kind (kaind) - TIPO, ESPÉCIE" ,
            "#178 Hand (hend) - MÃO" ,
            "#179 Picture (pic-tchur) - IMAGEM, QUADRO, FOTO" ,
            "#180 Again (eguein) - NOVAMENTE" ,
            "#181 Change (tcheynj) - MUDAR, TROCAR" ,
            "#182 OFF (ofi) - DESLIGADO, FORA DE" ,
            "#183 Play (pley) - JOGAR" ,
            "#184 Spell (spel) - SOLETRAR" ,
            "#185 Air (eyr) - AR" ,
            "#186 Away (ewey) - LONGE DE" ,
            "#187 Animal (animal) - ANIMAL" ,
            "#188 House (hauz) - CASA" ,
            "#189 Point (poynt) - PONTO, APONTAR" ,
            "#190 Page (peydj) - PÁGINA" ,
            "#191 Letter (leter) - CARTA" ,
            "#192 Mother (mather) - MÃE" ,
            "#193 Answer (anser) - RESPOSTA, RESPONDER" ,
            "#194 Found (fawnd) - ACHOU" ,
            "#195 Study (stadj) - ESTUDAR, ESTUDO" ,
            "#196 Still (stil) - AINDA" ,
            "#197 Learn (lern) - APRENDER" ,
            "#198 Should (shud) - DEVERIA" ,
            "#199 World (world) - MUNDO" ,
            "#200 Would (would) - FARIA, SERIA"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_grupo);

        minhaLista = (ListView) findViewById(R.id.lista2);

        ArrayAdapter<String> meuAdaptador = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaDeNomes);

        minhaLista.setAdapter(meuAdaptador);
    }
}
