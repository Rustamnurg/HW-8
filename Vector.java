public class Vector{
    public double  x0 = 2.5 ,y0 = 3, z0 = 4, x, y ,z;
    
    public static void main(String[] args){
        Vector t1 = new Vector(1, 2, 3);
        t1.getSum();
        t1.getMultiplication(2);
        t1.getScalarProduct();
        t1.getModuleVector();
    }

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void getSum(){
        System.out.print("(" + x0 + ", " + y0 + ", " + z0 + ") + (");
        x0+= x;
        y0+= y;
        z0+= z;
        System.out.println(x + ", " + y + ", " + z + ") = (" + x0 + ", " + y0 + ", " + z0 + ")" );
    }
    public void getMultiplication(double k){
        System.out.print("(" + x + ", " + y + ", " + z + ") * " + k + " = (");
        x*= k;
        y*= k;
        z*= k;
        System.out.println(x + ", " + y + ", " + z + ")");
    }

    public void getScalarProduct(){
        System.out.print("(" + x0 + ", " + y0 + ", " + z0 + ") * (");
        x0 = x0 * x + y0 * y + z0 * z;
        System.out.println(x + ", " + y + ", " + z + ") = " + x0);
    }

    public void getModuleVector(){
        System.out.print("|(" + x + ", " + y + ", " + z + ")| = ");
        x = Math.sqrt(x * x + y * y + z * z);
        System.out.println(x);
    }
}
