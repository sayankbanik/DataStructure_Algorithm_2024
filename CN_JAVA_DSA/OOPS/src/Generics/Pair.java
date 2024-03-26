package Generics;

public class Pair<TypeFirst, TypeSecond> {
    private TypeFirst first;
    private TypeSecond second;


    public Pair(){}
    public Pair(TypeFirst first, TypeSecond second){
        super();
        this.first = first;
        this.second = second;
    }
    public TypeFirst getFirst(){
        return first;
    }
    public void setFirst(TypeFirst first){
        this.first = first;
    }
    public TypeSecond getSecond(){
        return second;
    }
    public void setSecond(TypeSecond second){
        this.second=second;
    }

}
