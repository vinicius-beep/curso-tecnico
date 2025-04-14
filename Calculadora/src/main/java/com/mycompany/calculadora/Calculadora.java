/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        // Não é necessário inicializar nada aqui
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new Interface().setVisible(true); // Abre a interface da calculadora
        });
    }
}