class Esfera {
    float raio;
    final float PI = 3.1416f;
    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float calcularVolume(){

        return (4/3 * PI * raio * raio * raio);
    }

    public float calcularArea(){

        return (4 * PI * raio);
    }
}

