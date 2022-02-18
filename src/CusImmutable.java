public  final class CusImmutable {
    private  int i;
    CusImmutable(int i){
        this.i=i;
    }

    public CusImmutable modify(int i){
        if(this.i==i){
            return this;
        }
        else{
            return new CusImmutable(i);
        }
    }
}
