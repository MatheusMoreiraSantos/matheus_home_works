package matheus.moreira.santos.prova_03062022;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvTitulo, tvData, tvPergunta, tvResposta, tvNome01, tvNome02;
    private EditText edtNumeroQuestao;
    private ImageButton imbClear, imbCheck;
    private ProvaQuestoesRespostas prova01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    tvTitulo            = findViewById(R.id.tvTitulo);
    tvData              = findViewById(R.id.tvData);
    tvPergunta          = findViewById(R.id.tvPergunta);
    tvResposta          = findViewById(R.id.tvResposta);
    tvNome01            = findViewById(R.id.tvNome01);
    tvNome02            = findViewById(R.id.tvNome02);
    edtNumeroQuestao    = findViewById(R.id.edtNumeroQuestao);
    imbCheck            = findViewById(R.id.imbCheck);
    imbClear            = findViewById(R.id.imbClear);


    ActionBar actionBar = getSupportActionBar();
    if(actionBar != null){
        actionBar.setTitle("Desenvolvedores em TI");
    }


    prova01 = new ProvaQuestoesRespostas();

    imbCheck.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(edtNumeroQuestao.getText().toString().isEmpty()){
                int  pergunta = Integer . valueOf ( edtNumeroQuestao . getText () . toString ());

            Toast.makeText(MainActivity.this, "Por favor, insira o número da questão!", Toast.LENGTH_SHORT).show();
        }

            int info02 = 2;
            if(Integer.parseInt(edtNumeroQuestao.getText().toString()) == info02){
                tvPergunta.setText(prova01.getQuestao02());
                tvResposta.setText(prova01.getResposta02());
            }

            int info03 = 3;
            if(Integer.parseInt(edtNumeroQuestao.getText().toString()) == info03){
                tvPergunta.setText(prova01.getQuestao03());
                tvResposta.setText(prova01.getResposta03());
            }

            int info04 = 4;
            if(Integer.parseInt(edtNumeroQuestao.getText().toString()) == info04){
                tvPergunta.setText(prova01.getQuestao04());
                tvResposta.setText(prova01.getResposta04());
            }

            int info05 = 5;
            if(Integer.parseInt(edtNumeroQuestao.getText().toString()) == info05){
                tvPergunta.setText(prova01.getQuestao05());
                tvResposta.setText(prova01.getResposta05());
            }

            int info06 = 6;
            if(Integer.parseInt(edtNumeroQuestao.getText().toString()) == info06){
                tvPergunta.setText(prova01.getQuestao06());
                tvResposta.setText(prova01.getResposta06());
            }

            if(Integer.parseInt(edtNumeroQuestao.getText().toString()) != info02 + info03 + info04 + info05 + info06){
                Toast.makeText(MainActivity.this, "Por favor, insira um número válido!", Toast.LENGTH_SHORT).show();
            }

        }
    });

    imbClear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            edtNumeroQuestao.setText("");
            tvPergunta.setText("");
            tvResposta.setText("");
        }
    });

    }
}