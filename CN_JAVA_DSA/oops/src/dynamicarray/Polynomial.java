package dynamicarray;

public class Polynomial {
    DynamicArray coeff;
    public Polynomial(){
        coeff = new DynamicArray();
    }
    public void setCoefficient(int exponent, int coefficient){
        while(exponent >= coeff.size()){
            coeff.add(0);
        }
        coeff.set(exponent,coefficient);
    }
    public void add(Polynomial p2){
        for(int i=0;i<coeff.size();i++){
            int newCoefficient = this.coeff.get(i) + p2.coeff.get(i);
            this.coeff.set(i,newCoefficient);
        }
    }
    public void multiply(Polynomial p1){
       DynamicArray temp = new DynamicArray();
//       this.coeff.print();   // 3 4 5
       for(int i=0;i<this.coeff.size();i++){
           temp.add(this.coeff.get(i));
           this.coeff.set(i,0);
       }
//       temp.print(); // 3 4 5
//       this.coeff.print(); // 0 0 0
//        p1.coeff.print(); // 6 4 7
        for(int i=0;i<temp.size();i++){
            for(int j=0;j<p1.coeff.size();j++){
                int val = temp.get(i) * p1.coeff.get(j);
                System.out.print(val+" ");
                int deg = i + j;
                if(deg < this.coeff.size()){
                    val = val + this.coeff.get(deg);
                }
                this.setCoefficient(i+j,val);
            }
            System.out.println();
        }
        this.coeff.print();
    }

    public void printl(){
        //coeff.print();
        for(int i=0;i< coeff.size();i++){
            if(coeff.get(i) !=0){
                System.out.print(coeff.get(i)+"x^"+i+" + ");
            }
        }
        System.out.println();
    }
}
