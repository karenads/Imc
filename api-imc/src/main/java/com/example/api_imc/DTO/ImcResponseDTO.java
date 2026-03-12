package com.example.api_imc.DTO;

public class ImcResponseDTO {
    private double imc;
    private String classificacao;
    public ImcResponseDTO() {
    }
    public ImcResponseDTO(double imc, String classificacao) {
        this.imc = imc;
        this.classificacao = classificacao;
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
