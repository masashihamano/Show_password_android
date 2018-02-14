package misao.edu.show_password;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    EditText editText1, editText2;
    CheckBox checkBox1, checkBox2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        editText1 = findViewById( R.id.etPass );
        editText2 = findViewById( R.id.etLog );
        checkBox1 = findViewById( R.id.checkbox1 );
        checkBox2 = findViewById( R.id.checkbox2 );

        checkBox1.setOnCheckedChangeListener( this );
        checkBox2.setOnCheckedChangeListener( this );

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if (isChecked) {
            editText1.setInputType( InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD );//144でも可
        } else {
            editText1.setInputType( InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD );
        }

    }

}

/*
main.xmlにEditText(inputType="textPassword")とCheckBoxを作成
mainActivity.javaでEditText,CheckBoxを宣言、初期化
checkBoxをsetOnしthisで継承、@overrideさせる
if文でチェックされてる状態とそうでない場合を作る
TYPE_TEXT_VARIATION_VISIBLE_PASSWORD → inputTypeを可視状態にする
TYPE_CLASS_TEXT　→　文字列の入力
TYPE_TEXT_VARIATION_PASSWORD　→　パスワードの入力

 */