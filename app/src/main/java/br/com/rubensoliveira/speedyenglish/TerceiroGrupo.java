package br.com.rubensoliveira.speedyenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TerceiroGrupo extends AppCompatActivity {

    ListView minhaLista;

    private String[] listaDeNomes = {

            "#201 High (hay) - ALTO, LUGAR ALTO" ,
            "#202 Every (evri) - TODO" ,
            "#203 Near (nir) - PERTO DE" ,
            "#204 Add (ed) - ADICIONAR" ,
            "#205 Food (fud) - COMIDA, ALIMENTO" ,
            "#206 Between (bitwin) - ENTRE (no meio)" ,
            "#207 Own (oun) - PRÓPRIO" ,
            "#208 Below (bilow) - EM BAIXO DE" ,
            "#209 Country (cauntri) - PAÍS" ,
            "#210 Plant (plant) - PLANTA" ,
            "#211 Last (last) - ÚLTIMO" ,
            "#212 School (skul) - ESCOLA" ,
            "#213 Father (father) - PAI" ,
            "#214 Keep (kip) - MANTER, GUARDAR" ,
            "#215 Tree (trii) - ÁRVORE" ,
            "#216 Never (never) - NUNCA" ,
            "#217 Start (start) - COMEÇAR" ,
            "#218 City (siti) - CIDADE" ,
            "#219 Earth (erth) - TERRA" ,
            "#220 Eye (ay) - OLHO" ,
            "#221 Light (layt) - LUZ ou LEVE" ,
            "#222 Thought (thowt) - PENSAMENTO" ,
            "#223 Head (hed) - CABEÇA" ,
            "#224 Under (ander) - EM BAIXO DE" ,
            "#225 Story (stori) - HISTÓRIA" ,
            "#226 Saw (sow) - VIU" ,
            "#227 Left (left) - ESQUERDA" ,
            "#228 DO (du) - FAZER" ,
            "#229 Don't (dont) - NÃO FAÇA" ,
            "#230 Few (fyu) - ALGUMAS, POUCOS" ,
            "#231 While (wayli) - ENQUANTO" ,
            "#232 Along (elong) - AO LONGO DE" ,
            "#233 Might (mai-ti) - PODERIA" ,
            "#234 Close (cloz) - FECHAR" ,
            "#235 Something (samthing) - ALGUMA COISA, ALGO" ,
            "#236 Seem (sim) - PARECE" ,
            "#237 Next (nekst) - PRÓXIMO/A" ,
            "#238 Hard (hard) - DIFÍCIL" ,
            "#239 Open (open) - ABERTO" ,
            "#240 Example (eczempou) - EXEMPLO" ,
            "#241 Begin (begin) - COMEÇAR" ,
            "#242 Life (layfi) - VIDA" ,
            "#243 Always (olweys) - SEMPRE" ,
            "#244 Those (thoz) - AQUELES" ,
            "#245 Both (both) - AMBOS" ,
            "#246 Paper (pei-per) - PAPEL" ,
            "#247 Together (tugeder) - JUNTO" ,
            "#248 Got (gat) - PEGOU" ,
            "#249 Group (grupi) - GRUPO" ,
            "#250 Often (ofen) - FREQUENTEMENTE" ,
            "#251 Run (ran) - CORRER" ,
            "#252 Important (importent) - IMPORTANTE" ,
            "#253 Until (antil) - ATÉ" ,
            "#254 Children (tchildren) - CRIANÇAS" ,
            "#255 Side (sayd) - LADO" ,
            "#256 Feet (fit) - PÉS" ,
            "#257 Car (car) - CARRO" ,
            "#258 Mile (mayl) - MILHA" ,
            "#259 Night (nayt) - NOITE" ,
            "#260 Walk (wok) - ANDAR" ,
            "#261 White (wayt) - BRANCO" ,
            "#262 Sea (si) - MAR" ,
            "#263 Began (bigen) - COMEÇOU" ,
            "#264 Grow (grow) - CRESCER" ,
            "#265 Took (tuk) - PEGOU" ,
            "#266 River (river) - RIO" ,
            "#267 Four (for) - QUATRO" ,
            "#268 Carry (cari) - CARREGAR" ,
            "#269 State (steyt) - ESTADO" ,
            "#270 Once (wans) - UMA VEZ" ,
            "#271 Book (buk) - LIVRO" ,
            "#272 Hear (hir) - OUVIR" ,
            "#273 Stop (stop) - PARAR" ,
            "#274 Without (with-aut) - SEM" ,
            "#275 Second (second) - SEGUNDO" ,
            "#276 Later (leiter) - MAIS TARDE" ,
            "#277 Miss (mis) - NÃO ACERTAR / ERRAR ou SENTIR FALTA DE" ,
            "#278 Idea (ai-dia) - IDÉIA" ,
            "#279 Enough (inaf) - BASTANTE, CHEGA" ,
            "#280 Eat (it) - COMER" ,
            "#281 Face (feys) - ENCARAR, face" ,
            "#282 Watch (watch) - ASSISTIR, RELÓGIO" ,
            "#283 Far (far) - LONGE" ,
            "#284 Really (rili) - REALMENTE" ,
            "#285 Almost (olmost) - QUASE" ,
            "#286 Let (let) - DEIXAR" ,
            "#287 Sometimes (Samtaymz) - ALGUMAS VEZES" ,
            "#288 Girl (gerl) - GAROTA, MENINA" ,
            "#289 Above (ebav) - EM CIMA DE (sem contato físico)" ,
            "#290 Mountain (mau-nteyn) - MONTANHA" ,
            "#291 Cut (cut) - CORTAR" ,
            "#292 Young (yang) - JOVEM" ,
            "#293 Talk (tok) - FALAR, CONVERSAR" ,
            "#294 Soon (sun) - LOGO" ,
            "#295 List (list) - LISTA" ,
            "#296 Song (song) - CANÇÃO" ,
            "#297 Being (bi-ing) - SER" ,
            "#298 Leave (liiv) - DEIXAR" ,
            "#299 Family (femili) - FAMÍLIA" ,
            "#300 IT'S (itis) - ISTO É"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceiro_grupo);

        minhaLista = (ListView) findViewById(R.id.lista3);

        ArrayAdapter<String> meuAdaptador = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaDeNomes);

        minhaLista.setAdapter(meuAdaptador);

    }
}
