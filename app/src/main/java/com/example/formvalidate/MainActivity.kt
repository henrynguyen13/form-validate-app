package com.example.formvalidate

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(View.OnClickListener {
            val firstName = firstNameLayout.editText?.text.toString()
            val lastName = lastNameLayout.editText?.text.toString()
            val birthday = birthdayLayout.editText?.text.toString()
            val address = addressLayout.editText?.text.toString()
            val email = emailLayout.editText?.text.toString()

            // Kiểm tra điều kiện
            if (firstName.isEmpty() || lastName.isEmpty() || birthday.isEmpty() || address.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Email không hợp lệ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

            if (!radioButton.isChecked && !radioButton2.isChecked) {
                Toast.makeText(this, "Vui lòng chọn giới tính", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

            // Nếu tất cả điều kiện đều đúng, bạn có thể tiến hành đăng ký người dùng
            // Điều này phụ thuộc vào cách bạn xử lý đăng ký trong ứng dụng của bạn.
            // Đây chỉ là một ví dụ đơn giản về kiểm tra điều kiện.
        })
    }
}