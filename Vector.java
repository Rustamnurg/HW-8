public class Vector{
    public double x, y ,z;
    
    public static void main(String[] args){
        Vector t1 = new Vector(1, 2, 3);
        t1.printSum();
        t1.printMultiplication(2);
        t1.printScalarProduct();
        t1.printModuleVector();
    }

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void sum(Vector vector){
        x+= vector.x;
        y+= vector.y;
        z+= vector.z;
    }
    public void multiplication(double k){
        x*= k;
        y*= k;
        z*= k;
    }

    public double getScalarProduct(Vector vector){
        return this.x * vector.x + this.x * vector.x + this.z * vector.z;
    }

    public double getModuleVector(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public void printSum(Vector vector){
        System.out.println(this.sum(vector));
    }
    public void printMultiplication(double k){
        System.out.print("(" + x + ", " + y + ", " + z + ") * " + k + " = (");
        x*= k;
        y*= k;
        z*= k;
        System.out.println(x + ", " + y + ", " + z + ")");
    }

    public void printScalarProduct(Vector vector){
        System.out.println(getScalarProduct(vector));
    }

    public void printModuleVector(){
        System.out.println(getModuleVector(vector));
    }

    public String toString()
    {
        return "Vector " + Double.toString(x) + " " + Double.toString(y) + " " + Double.toString(z);
    }
}
