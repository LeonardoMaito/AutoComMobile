package com.leonardomaito.autocommobile.controllers;

import android.util.Patterns;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class RegisterController {

    private FirebaseAuth auth;
    private String email, password;
    private FirebaseFirestore db;

    public boolean checkAllFields(EditText edEmail, EditText edPassword) {

        email = edEmail.getText().toString();
        password = edPassword.getText().toString();

        if (email.length() == 0) {
            edEmail.setError("Esse campo é obrigatório");
            return false;

        }else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            edEmail.setError("Informe um email válido");
            return false;
        }

        if (password.length() == 0) {
            edPassword.setError("Esse campo é obrigatório");
            return false;

        } else if (password.length() < 6) {
            edPassword.setError("A senha deve conter ao menos 6 caracteres");
            return false;
        }
        return true;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
