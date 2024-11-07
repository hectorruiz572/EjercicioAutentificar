package com.hectorruiz.EjercicioAutentificar;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassEncrypt {
    public static void main(String[] args) {

        BCryptPasswordEncoder b = new BCryptPasswordEncoder();

        System.out.println( b.encode("contraseñaprueba"));


    }
}
