package tdc.edu.doancanhan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class chinhsuaactivity  extends Activity {
    EditText edtKhachhang ,edtSanpham,edtHotenKh,edtDiachi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chinhsua);
        setControll();
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        edtKhachhang.setText("MaKH : "+bundle.getString("KH"));
        edtSanpham.setText("MaSP: "+bundle.getString("SP"));
        edtHotenKh.setText("Họ Tên : "+bundle.getString("HoTen"));
        edtDiachi.setText("Địa Chỉ : "+bundle.getString("DiaChi")+"");

        setEvent();
    }

    private void setEvent() {
    }

    private void setControll() {
        edtKhachhang = findViewById(R.id.edtKhachhang);
        edtSanpham = findViewById(R.id.edtSanpham);
        edtHotenKh = findViewById(R.id.edtHotenKh);
        edtDiachi = findViewById(R.id.edtDiachi);

    }
}
