package com.example.jstojava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private TextView textView;
    private Button getButton;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        getButton = findViewById(R.id.getButton);
        webView = findViewById(R.id.webView);
        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tm = "$$$ " + new Date();
                Log.d("##JS", tm);
                textView.setText(tm);
            }
        });
        WebSettings settings = webView.getSettings();
        settings.setDefaultTextEncodingName("utf-8");
        settings.setJavaScriptEnabled(true);
        webView.loadDataWithBaseURL("about:blank", generateHtml(),
                "text/html", "utf-8", null);

    }

    private String generateHtml() {
        String html = "";html+="<html><head><title>JS</title></head><body>\n";
        html+="<html><head><title>JS</title></head><body>\n";
        html+="   <div>\n";
        html+="        <hr/>\n";
        html+="    <input type='text' id='name' name='name' value='hoge' />\n";
        html+="    <input type='text' id='check' name='check' value='hoge' />\n";
        html+="   <br/><!--\n";
        html+="    <input type='button' id='exec' name='exec' value='Now!' \n";
        html+="        onclick='buttonClick();' />\n";
        html+="      --> \n";
        html+="      <input type='button' id='now' name='now' value='Now!' \n";
        html+="      onclick='buttonNowClick();' />\n";
        html+="      <input type='button' id='exec' name='exec' value='Copy' \n";
        html+="      onclick='buttonExecClick();' />\n";
        html+="\n";
        html+="    <script>\n";
        html+="        function buttonNowClick() {\n";
        html+="            // alert('#1');\n";
        html+="            document.getElementById('check').value = Date.now();\n";
        html+="            // alert('#2');\n";
        html+="        }\n";
        html+="        function buttonExecClick() {\n";
        html+="            let s = document.getElementById('check').value;\n";
        html+="            document.name = s;\n";
        html+="            document.getElementById('name').value = s;\n";
        html+="            //alert(s);\n";
        html+="            //location.href = 'file:///D:/tmp/jstest.html';\n";
        html+="            //location.reload();\n";
        html+="            return s;\n";
        html+="        }\n";
        html+="    </script>\n";
        html+="        <hr/>\n";
        html+="          <p>安全衛生に関する管理者等の設置が義務付けられる<br/>事業所ごとの人数は表のとおりです。\n";
        html+="  <div><table><tbody>\n";
        html+="  <tr><th>管理者等</th><th>事業場の労働者数</th></tr>\n";
        html+="  <tr><td>総括安全衛生管理者</td><td>300人以上</td></tr>\n";
        html+="  <tr><td>安全管理者</td><td><span class='enhanced'>50人</span>以上</td></tr>\n";
        html+="  <tr><td>衛生管理者</td><td>50人以上</td></tr>\n";
        html+="  <tr><td>安全委員会</td><td>100人以上</td></tr>\n";
        html+="  <tr><td>衛生委員会</td><td>50人以上</td></tr>\n";
        html+="  </tbody></table></div>\n";
        html+="  </p>\n";
        html+="  </div>\n";
        html+="  </body</html>\n";
        html+="    \n";
        html+="\n";
        html+="    \n";
        return html;
    }
}