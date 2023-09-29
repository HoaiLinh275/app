package com.example.librarydemo;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class BookBorrowerActivity extends Activity {

    private EditText etTenNguoiMuon;
    private DatePicker dpThoiGianMuon;
    private Button btnLuu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_borrower);

        etTenNguoiMuon = findViewById(R.id.etTenNguoiMuon);
        dpThoiGianMuon = findViewById(R.id.dpThoiGianMuon);
        btnLuu = findViewById(R.id.btnLuu);

        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenNguoiMuon = etTenNguoiMuon.getText().toString();
                int ngay = dpThoiGianMuon.getDayOfMonth();
                int thang = dpThoiGianMuon.getMonth() + 1; // Tháng bắt đầu từ 0
                int nam = dpThoiGianMuon.getYear();

                String thoiGianMuon = ngay + "/" + thang + "/" + nam;

                // Thực hiện lưu thông tin người mượn và thời gian mượn ở đây

                // Hiển thị thông báo
                Toast.makeText(BookBorrowerActivity.this, "Đã lưu thông tin", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


