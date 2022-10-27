package com.crud.Clientes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author neidi
 */
public class Clientes {
    private String nome;
    private String Email;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return Email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String salvar(){
        try {
            FileWriter fw = new FileWriter("clientes.txt",true); // escreve no arquivo txt
            PrintWriter pw = new PrintWriter(fw); // saida de texto pula linhas 
            pw.println("Nome: " +this.nome);
            pw.println("Cpf:" +this.cpf);
            pw.println("Email:"+this.Email);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Cadastrado com Sucesso";
    }
    
    
}
