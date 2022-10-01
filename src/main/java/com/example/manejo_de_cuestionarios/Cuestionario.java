package com.example.manejo_de_cuestionarios;

public class Cuestionario {
    private String titulo;

    private String descripcion;
    private String pregunta;
    private String pregunta2;
    private String pregunta3;

    private String respuesta;
    private String respuesta2;
    private String respuesta3;
    private String respuesta4;
    private String respuesta5;
    private String respuesta6;
    private String respuesta7;
    private String respuesta8;
    private String respuesta9;

    private int puntos;
    private int puntos2;
    private int puntos3;
    private int no;
    private static int correlativo=1;


    public Cuestionario(String titulo, String descripcion, String pregunta, String pregunta2, String pregunta3, String respuesta, String respuesta2, String respuesta3, String respuesta4, String respuesta5, String respuesta6, String respuesta7, String respuesta8, String respuesta9, int puntos, int puntos2, int puntos3) {
        this.no =  this.correlativo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.pregunta = pregunta;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
        this.respuesta = respuesta;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.respuesta5 = respuesta5;
        this.respuesta6 = respuesta6;
        this.respuesta7 = respuesta7;
        this.respuesta8 = respuesta8;
        this.respuesta9 = respuesta9;
        this.puntos = puntos;
        this.puntos2 = puntos2;
        this.puntos3 = puntos3;
        correlativo=correlativo+1;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public String getRespuesta5() {
        return respuesta5;
    }

    public void setRespuesta5(String respuesta5) {
        this.respuesta5 = respuesta5;
    }

    public String getRespuesta6() {
        return respuesta6;
    }

    public void setRespuesta6(String respuesta6) {
        this.respuesta6 = respuesta6;
    }

    public String getRespuesta7() {
        return respuesta7;
    }

    public void setRespuesta7(String respuesta7) {
        this.respuesta7 = respuesta7;
    }

    public String getRespuesta8() {
        return respuesta8;
    }

    public void setRespuesta8(String respuesta8) {
        this.respuesta8 = respuesta8;
    }

    public String getRespuesta9() {
        return respuesta9;
    }

    public void setRespuesta9(String respuesta9) {
        this.respuesta9 = respuesta9;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(String pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public String getPregunta3() {
        return pregunta3;
    }

    public void setPregunta3(String pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos2() {
        return puntos2;
    }

    public void setPuntos2(int puntos2) {
        this.puntos2 = puntos2;
    }

    public int getPuntos3() {
        return puntos3;
    }

    public void setPuntos3(int puntos3) {
        this.puntos3 = puntos3;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
