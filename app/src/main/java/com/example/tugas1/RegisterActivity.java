package com.example.tugas1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    TextInputEditText edtNamaLengkap, edtNomorHp, edtAlamat, edtTempatLahir, edtTanggalLahir, edtPassword;
    MaterialCheckBox checkbox;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        // Inisialisasi
        edtNamaLengkap = findViewById(R.id.edt_nama);
        edtNomorHp = findViewById(R.id.edt_no_hp);
        edtAlamat = findViewById(R.id.edt_alamat);
        edtTempatLahir = findViewById(R.id.edt_tempat_lahir);
        edtTanggalLahir = findViewById(R.id.edt_tanggal_lahir);
        edtPassword = findViewById(R.id.edt_password);
        checkbox = findViewById(R.id.checkbox_agree);
        btnDaftar = findViewById(R.id.btn_daftar);

        // Event klik tombol daftar
        btnDaftar.setOnClickListener(v -> {
            String nama = edtNamaLengkap.getText().toString().trim();
            String hp = edtNomorHp.getText().toString().trim();
            String alamat = edtAlamat.getText().toString().trim();
            String tempat = edtTempatLahir.getText().toString().trim();
            String tanggal = edtTanggalLahir.getText().toString().trim();
            String password = edtPassword.getText().toString().trim();

            if (nama.isEmpty() || hp.isEmpty() || alamat.isEmpty() || tempat.isEmpty() || tanggal.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Semua data harus diisi!", Toast.LENGTH_SHORT).show();
            } else if (!checkbox.isChecked()) {
                Toast.makeText(this, "Anda harus menyetujui checkbox!", Toast.LENGTH_SHORT).show();
            } else {
                // Data bisa dikirim ke server atau disimpan
                Toast.makeText(this, "Pendaftaran Berhasil!", Toast.LENGTH_SHORT).show();
                // Bisa lanjut ke halaman lain


            }
        });
    }
}
