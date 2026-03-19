package Calculadora_Simples_ENUM;

public enum Operacoes {
    SOMA('+'){
        @Override
        public double executarOperacoes(double x, double y) {
            return (x + y);
        }
        @Override
        public String toString() {
            return "+";
        }
    }, SUBTRAIR('-'){
        @Override
        public double executarOperacoes(double x, double y) {
            return (x - y);
        }
        @Override
        public String toString() {
            return "-";
        }
    },MULTIPLICACAO('*'){
        @Override
        public double executarOperacoes(double x, double y) {
            return (x * y);
        }
        @Override
        public String toString() {
            return "*";
        }
    },DIVISAO('/'){
        @Override
        public double executarOperacoes(double x, double y) {
            return (x / y);
        }
        @Override
        public String toString() {
            return "/";
        }
    };

    private char operacacao;
    Operacoes(char operacacao){
        this.operacacao = operacacao;
    }
    public abstract double executarOperacoes(double x, double y);
}

