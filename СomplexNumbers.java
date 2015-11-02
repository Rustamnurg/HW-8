public class СomplexNumbers{
    public double  a1, b1, a2, b2;
    public char c = 'i';

    public static void main(String[] args){
        СomplexNumbers t1 = new СomplexNumbers(10, 2, 3, 4);
        t1.getSum();
        t1.getMultiplication();
        t1.getSubtraction();
    }

    public СomplexNumbers(double a1, double a2, double b1, double b2){
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;

    }

    public void getSum(){
        if (b1 + b2 < 0 && a1 + a2 < 0) {
            System.out.println("Cумма комплексных чисел равна: (" + (a1 + a2) + ") + (" + (b1 + b2) + ")" + c);
        }
        else if(b1 + b2 < 0){
            System.out.println("Сумма комплексных чисел равна: " + (a1 + a2) + " + (" + (b1 + b2) + ")" + c);
        }
        else {
            System.out.println("Сумма комплексных чисел равна: " + (a1 + a2) + " + " + (b1 + b2) + c);
        }

    }

    public void getSubtraction() {
        if (b1 - b2 < 0 && a1 - a2 < 0) {
            System.out.println("Разность комплексных чисел равна: (" + (a1 - a2) + ") + (" + (b1 - b2) + ")" + c);
        }
        else if(b1 - b2 < 0){
            System.out.println("Разность комплексных чисел равна: " + (a1 - a2) + " + (" + (b1 - b2) + ")" + c);
        }
        else {
            System.out.println("Разность комплексных чисел равна: " + (a1 - a2) + " + " + (b1 - b2) + c);
        }

    }

    public void getMultiplication(){
        if (a1  * a2 - b1 * b2 < 0 && a1 * b2 + a2 * b1 < 0) {
            System.out.println("Произведение комплексных чисел равно: (" + (a1  * a2 - b1 * b2) + ") + (" + (a1 * b2 + a2 * b1) + ")" + c);
        }
        else if(a1  * a2 - b1 * b2  < 0){
            System.out.println("Произведение комплексных чисел равно: " + (a1  * a2 - b1 * b2) + " + (" + (a1 * b2 + a2 * b1)  + ")" + c);
        }
        else {
            System.out.println("Произведение комплексных чисел равно: " + (a1  * a2 - b1 * b2) + " + " + (a1 * b2 + a2 * b1) + c);
        }
    }

}
